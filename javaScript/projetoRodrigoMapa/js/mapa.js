const mapa = L.map('mapa', {
 center: [-21.241392, -44.997984],
 zoom: 7,
 minZoom: 1,
 maxZoom: 18
});
const baseOSM = L.tileLayer(
 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
 { attribution: '&copy; OpenStreetMap contributors' }
);
baseOSM.addTo(mapa);

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