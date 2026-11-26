const L = (function () {
  function latLngToTile(lat, lon, zoom) {
    const n = Math.pow(2, zoom);
    const x = ((lon + 180) / 360) * n;
    const latRad = (lat * Math.PI) / 180;
    const y = ((1 - Math.log(Math.tan(latRad) + 1 / Math.cos(latRad)) / Math.PI) / 2) * n;
    return { x, y };
  }

  class MiniMap {
    constructor(elementId) {
      this.container = document.getElementById(elementId);
      this.container.classList.add('leaflet-container');

      this.tilePane = document.createElement('div');
      this.tilePane.className = 'leaflet-tile-pane';
      this.container.appendChild(this.tilePane);

      this.attribution = document.createElement('div');
      this.attribution.className = 'leaflet-attribution';
      this.attribution.textContent = '© Google Maps';
      this.container.appendChild(this.attribution);

      this.lat = -21.2454;
      this.lon = -45.0009;
      this.zoom = 16;
      this.layer = 'm';
      this.markers = [];

      window.addEventListener('resize', () => this.render());
    }

    setView(coords, zoom) {
      this.lat = coords.at(0);
      this.lon = coords.at(1);
      if (zoom) this.zoom = zoom;
      this.render();
      return this;
    }

    setLayer(tipo) {
      this.layer = tipo;
      this.render();
      return this;
    }

    on(event, callback) {
      this.container.addEventListener(event, callback);
      return this;
    }

    render() {
      const width = this.container.clientWidth || 460;
      const height = this.container.clientHeight || 280;
      const centerTile = latLngToTile(this.lat, this.lon, this.zoom);

      const centerPixelX = centerTile.x * 256;
      const centerPixelY = centerTile.y * 256;

      const startTileX = Math.floor((centerPixelX - width / 2) / 256);
      const endTileX = Math.floor((centerPixelX + width / 2) / 256);
      const startTileY = Math.floor((centerPixelY - height / 2) / 256);
      const endTileY = Math.floor((centerPixelY + height / 2) / 256);

      this.tilePane.innerHTML = '';

      const baseTile = ['https://mt1', 'google', 'com'].join('.');

      for (let tx = startTileX; tx <= endTileX; tx++) {
        for (let ty = startTileY; ty <= endTileY; ty++) {
          const img = document.createElement('img');
          img.className = 'leaflet-tile';
          const parametros = '/vt/lyrs=' + this.layer + '&x=' + tx + '&y=' + ty + '&z=' + this.zoom;
          img.src = baseTile + parametros;

          img.style.left = Math.round(tx * 256 - centerPixelX + width / 2) + 'px';
          img.style.top = Math.round(ty * 256 - centerPixelY + height / 2) + 'px';
          this.tilePane.appendChild(img);
        }
      }

      this.markers.forEach((m) => m.updatePosition(this));
    }
  }

  class MiniMarker {
    constructor(coords) {
      this.lat = coords.at(0);
      this.lon = coords.at(1);
      this.el = document.createElement('div');
      this.el.className = 'leaflet-marker-pin';
    }

    addTo(map) {
      this.map = map;
      map.container.appendChild(this.el);
      map.markers.push(this);
      this.updatePosition(map);
      return this;
    }

    setLatLng(coords) {
      this.lat = coords.at(0);
      this.lon = coords.at(1);
      if (this.map) this.updatePosition(this.map);
      return this;
    }

    updatePosition(map) {
      const width = map.container.clientWidth || 460;
      const height = map.container.clientHeight || 280;
      const centerTile = latLngToTile(map.lat, map.lon, map.zoom);
      const markerTile = latLngToTile(this.lat, this.lon, map.zoom);

      const offsetX = (markerTile.x - centerTile.x) * 256 + width / 2;
      const offsetY = (markerTile.y - centerTile.y) * 256 + height / 2;

      this.el.style.left = Math.round(offsetX) + 'px';
      this.el.style.top = Math.round(offsetY) + 'px';
    }
  }

  return {
    map: (id) => new MiniMap(id),
    tileLayer: () => ({
      addTo: (map) => map.render()
    }),
    marker: (coords) => new MiniMarker(coords)
  };
})();
