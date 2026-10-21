const mapa = L.map('mapa', {
 center: [-21.241392, -44.997984],
 zoom: 7,
 minZoom: 4,
 maxZoom: 18
});

mapa.fitBounds([
 [-21.241392, -44.997984] 
]);

const limites = L.latLngBounds(
 [-21.241392, -44.997984]
);
mapa.setMaxBounds(limites);
mapa.setMinZoom(1);

const empreendimentos = [
 { nome: 'Projeto Alfa', lat: -19.4, lng: -40.1, status: 'Ativo' },
 { nome: 'Projeto Beta', lat: -19.7, lng: -40.4, status: 'Em análise' }
];
empreendimentos.forEach(item => {
 L.marker([item.lat, item.lng])
 .addTo(mapa)
 .bindPopup(`
 <b>${item.nome}</b><br>
 Status: ${item.status}
 `);
});

L.circle([-19.4, -40.1], {
 radius: 1500, // metros
 color: '#1d70a2',
 weight: 2,
 fillColor: '#4ba3c7',
 fillOpacity: 0.25
}).addTo(mapa); 

const rota = [
 [-19.4, -40.1],
 [-19.5, -40.2],
 [-19.6, -40.35]
];
L.polyline(rota, {
 color: '#e67e22',
 weight: 4,
 opacity: 0.9
}).addTo(mapa);

const areaEstudo = [
 [-19.3, -40.2],
 [-19.3, -40.0],
 [-19.5, -40.0],
 [-19.5, -40.2]
];
L.polygon(areaEstudo, {
 color: '#277a4b',
 fillColor: '#60b879',
 fillOpacity: 0.3
}).addTo(mapa).bindPopup('Área de estudo');

const ruas = L.tileLayer(
 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
 { attribution: '&copy; OpenStreetMap contributors' }
);
const imagem = L.tileLayer(
 'https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}',
 { attribution: 'Tiles &copy; Esri' }
);
ruas.addTo(mapa);
L.control.layers({
 'Ruas': ruas,
 'Imagem de satélite': imagem
}).addTo(mapa);

const baseRuas = L.tileLayer(
 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
 { attribution: '&copy; OpenStreetMap contributors' }
).addTo(mapa);
const baseImagem = L.tileLayer(
 'https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}',
 { attribution: 'Tiles &copy; Esri' }
);
const pontos = L.layerGroup([
 L.marker([-19.4, -40.1]).bindPopup('Ponto A'),
 L.marker([-19.6, -40.3]).bindPopup('Ponto B')
]);
const area = L.polygon([
 [-19.3, -40.2], [-19.3, -40.0], [-19.5, -40.0]
], { color: 'purple' });
L.control.layers(
 { 'Ruas': baseRuas, 'Satélite': baseImagem },
 { 'Pontos': pontos, 'Área de interesse': area },
 { collapsed: false }
).addTo(mapa);
pontos.addTo(mapa);

fetch('dados/microbacias.geojson')
 .then(resposta => {
 if (!resposta.ok) throw new Error('Falha ao carregar GeoJSON');
 return resposta.json();
 })
 .then(dados => {
 const camada = L.geoJSON(dados, {
 style: feature => {
 const risco = feature.properties?.risco;
 if (risco === 'Alto') return { color: 'red', weight: 2 };
 if (risco === 'Médio') return { color: 'orange', weight: 2 };
 return { color: 'green', weight: 2 };
 },
 onEachFeature: (feature, layer) => {
 const nome = feature.properties?.nome_rio ?? 'Sem nome';
 const municipio = feature.properties?.nm_mun ?? 'Sem município'
 layer.bindPopup(`<b>${nome}</b>
    <br>${municipio}</br>`);
 }
 }).addTo(mapa);
 mapa.fitBounds(camada.getBounds());
 })
 .catch(erro => console.error(erro));

const legenda = L.control({ position: 'bottomright' });
legenda.onAdd = function () {
 const div = L.DomUtil.create('div', 'legenda');
 div.innerHTML = `
 <strong>Classificação de risco</strong>
 <div><span class="cor baixo"></span> Baixo</div>
 <div><span class="cor medio"></span> Médio</div>
 <div><span class="cor alto"></span> Alto</div>
 `;
 return div;
};
legenda.addTo(mapa);

mapa.on('click', evento => {
 console.log('Latitude:', evento.latlng.lat);
 console.log('Longitude:', evento.latlng.lng);
});
mapa.on('zoomend', () => {
 console.log('Zoom atual:', mapa.getZoom());
});
mapa.on('moveend', () => {
 console.log('Centro atual:', mapa.getCenter());
});

mapa.on('click', e => {
 L.popup()
 .setLatLng(e.latlng)
 .setContent(
 `Lat: ${e.latlng.lat.toFixed(5)}<br>` +
 `Lng: ${e.latlng.lng.toFixed(5)}`
 )
 .openOn(mapa);
});

const dados = [
 { id: 1, nome: 'Projeto Alfa', municipio: 'Linhares', tipo: 'Solar', risco: 'Baixo', lat: -19.4, lng: -40.1 },
 { id: 2, nome: 'Projeto Beta', municipio: 'Aracruz', tipo: 'Eólico', risco: 'Alto', lat: -19.8, lng: -40.2 },
 { id: 3, nome: 'Projeto Gama', municipio: 'Linhares', tipo: 'Eólico', risco: 'Médio', lat: -19.5, lng: -40.3 }
];
let camadaPontos = L.layerGroup().addTo(mapa);
function renderizar(lista) {
 camadaPontos.clearLayers();
 lista.forEach(item => {
 L.marker([item.lat, item.lng])
 .bindPopup(`<b>${item.nome}</b><br>${item.municipio}<br>Risco: ${item.risco}`)
 .addTo(camadaPontos);
 });
 document.querySelector('#resultado').textContent =
 `${lista.length} registro(s) encontrado(s)`;
}
function filtrar() {
 const municipio = document.querySelector('#municipio').value;
 const risco = document.querySelector('#risco').value;
 const filtrados = dados.filter(item =>
 (!municipio || item.municipio === municipio) &&
 (!risco || item.risco === risco)
 );
 renderizar(filtrados);
}
renderizar(dados);
document.querySelector('#municipio').addEventListener('change', filtrar);
document.querySelector('#risco').addEventListener('change', filtrar);

mapa.locate({ setView: true, maxZoom: 14 });
mapa.on('locationfound', e => {
 L.marker(e.latlng)
 .addTo(mapa)
 .bindPopup('Sua localização aproximada')
 .openPopup();
});
mapa.on('locationerror', e => {
 alert('Não foi possível obter a localização: ' + e.message);
}); 
