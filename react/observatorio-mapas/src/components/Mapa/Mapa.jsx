import {
  Circle,
  LayersControl,
  MapContainer,
  Popup,
  TileLayer,
} from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
import { corEnum } from '../../utils/enums';

export default function Mapa({ center, focos, municipios }) {
  const padrao = center[0] == -13.30793;

  return (
    <MapContainer
      key={focos[0]?.properties.id}
      center={center}
      zoom={padrao ? 7 : 10}
      minZoom={4}
      maxZoom={18}
      style={{ height: '100vh', width: '100%' }}
    >
      <LayersControl position="topright">
        <LayersControl.BaseLayer checked name="Ruas">
          <TileLayer
            url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
            attribution="&copy; OpenStreetMap contributors"
          />
        </LayersControl.BaseLayer>

        <LayersControl.BaseLayer name="Satélite">
          <TileLayer
            url="https://server.arcgisonline.com/ArcGIS/rest/services/World_Imagery/MapServer/tile/{z}/{y}/{x}"
            attribution="&copy; Esri"
          />
        </LayersControl.BaseLayer>
          {focos.map(foco => (
  <Circle
    key={foco.properties.id}
    center={foco.geometry.coordinates.toReversed()}
    radius={200}
    color={corEnum[foco.properties.bioma]}
  >
    <Popup>
      <strong>{foco.properties.municipio}</strong>
      <br />
      Data: {foco.properties.data_hora}
      <br />
      Bioma: {foco.properties.bioma}
      <br />
      Satélite: {foco.properties.satelite}
      <br />
      FRP: {foco.properties.frp}
      <br />
      Risco: {foco.properties.risco}
    </Popup>
  </Circle>
))}   
      </LayersControl>
    </MapContainer>
  );
}   