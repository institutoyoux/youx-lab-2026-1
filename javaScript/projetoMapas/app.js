const mapa = L.map('mapa').setView([-19.6, -40.2], 8);
const ruas = L.tileLayer(
 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
 { attribution: '&copy; OpenStreetMap contributors' }
).addTo(mapa);
const satelite = L.tileLayer(
 'https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}',
 { attribution: 'Tiles &copy; Esri' }
);
const dados = [
 { id: 1, nome: 'Projeto Alfa', municipio: 'Linhares', risco: 'Baixo', lat: -19.4, lng: -40.1 },
 { id: 2, nome: 'Projeto Beta', municipio: 'Aracruz', risco: 'Alto', lat: -19.8, lng: -40.2 },
 { id: 3, nome: 'Projeto Gama', municipio: 'Linhares', risco: 'Médio', lat: -19.5, lng: -40.3 }
];
const grupoPontos = L.layerGroup().addTo(mapa);
function corRisco(risco) {
 if (risco === 'Alto') return '#c62828';
 if (risco === 'Médio') return '#ef8f00';
 return '#238636';
}
function renderizar(lista) {
 grupoPontos.clearLayers();
 lista.forEach(item => {
 L.circleMarker([item.lat, item.lng], {
 radius: 8,
 color: corRisco(item.risco),
 fillColor: corRisco(item.risco),
 fillOpacity: 0.8,
 weight: 2
 })
 .bindPopup(
 `<b>${item.nome}</b><br>` +
 `Município: ${item.municipio}<br>` +
 `Risco: ${item.risco}`
 )
 .addTo(grupoPontos);
 });
 document.querySelector('#resultado').textContent =
 `${lista.length} empreendimento(s)`;
}
function filtrar() {
 const municipio = document.querySelector('#municipio').value;
 const risco = document.querySelector('#risco').value;
 const resultado = dados.filter(item =>
 (!municipio || item.municipio === municipio) &&
 (!risco || item.risco === risco)
 );
 renderizar(resultado);
}
document.querySelector('#municipio').addEventListener('change', filtrar);
document.querySelector('#risco').addEventListener('change', filtrar);
L.control.layers(
 { 'Ruas': ruas, 'Satélite': satelite },
 { 'Empreendimentos': grupoPontos },
 { collapsed: false }
).addTo(mapa);
const legenda = L.control({ position: 'bottomright' });
legenda.onAdd = function () {
 const div = L.DomUtil.create('div', 'legenda');
 div.style.background = 'white';
 div.style.padding = '8px 10px';
 div.style.borderRadius = '5px';
 div.style.boxShadow = '0 1px 5px #777';
 div.innerHTML = '<b>Risco</b><br>' +
 '<span style="color:#238636">●</span> Baixo<br>' +
 '<span style="color:#ef8f00">●</span> Médio<br>' +
 '<span style="color:#c62828">●</span> Alto';
 return div;
};
legenda.addTo(mapa);
renderizar(dados);