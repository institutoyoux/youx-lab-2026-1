document.addEventListener('DOMContentLoaded', function () {
  const latInicial = -21.2454;
  const lonInicial = -45.0009;

  const mapa = L.map('mapa').setView([latInicial, lonInicial], 16);

  L.tileLayer().addTo(mapa);

  let marcador = L.marker([latInicial, lonInicial]).addTo(mapa);

  const baseGoogle = ['https://www', 'google', 'com'].join('.') + '/maps/search/?api=1&query=';
  let urlGoogleMaps = baseGoogle + latInicial + ',' + lonInicial;
  document.getElementById('linkMaps').href = urlGoogleMaps;

  mapa.on('click', () => window.open(urlGoogleMaps, '_blank'));

  document.getElementById('selectCamada').addEventListener('change', function (e) {
    mapa.setLayer(e.target.value);
  });

  async function buscarEndereco() {
    const endereco = document.getElementById('inputEndereco').value.trim();
    if (!endereco) return;

    const enderecoCodificado = encodeURIComponent(endereco);
    urlGoogleMaps = baseGoogle + enderecoCodificado;
    document.getElementById('linkMaps').href = urlGoogleMaps;

    const dominioBusca = ['https://nominatim', 'openstreetmap', 'org'].join('.');
    const urlBusca = dominioBusca + '/search?format=json&q=' + enderecoCodificado;

    try {
      const resposta = await fetch(urlBusca);
      const dados = await resposta.json();

      if (dados && dados.length > 0) {
        const primeiro = dados.at(0);
        const lat = parseFloat(primeiro.lat);
        const lon = parseFloat(primeiro.lon);
        mapa.setView([lat, lon], 16);
        marcador.setLatLng([lat, lon]);
      } else {
        alert('Endereço não encontrado na prévia, mas o botão verde abrirá no Google Maps.');
      }
    } catch (erro) {
      console.error('Erro na busca:', erro);
    }
  }

  document.getElementById('btnBuscar').addEventListener('click', buscarEndereco);

  document.getElementById('inputEndereco').addEventListener('keypress', function (e) {
    if (e.key === 'Enter') buscarEndereco();
  });
});
