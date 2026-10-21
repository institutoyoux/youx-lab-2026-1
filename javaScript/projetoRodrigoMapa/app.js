const ponto = []
const buscar = () => {
  const input = document.getElementById("search").value;
  axios
    .get(`https://nominatim.openstreetmap.org/search?q=${input}&format=jsonv2`)
    .then((res) => {
      res.data.forEach((loc) => {
        document.getElementById("lat").value = loc.lat;
        document.getElementById("long").value = loc.lon;
        ponto.push(L.marker([loc.lat, loc.lon]).addTo(mapa)) 
        ;
        ponto.forEach(k => k.bindTooltip(loc.display_name))
    });
    
});
ponto.forEach(k => k.remove())
};
