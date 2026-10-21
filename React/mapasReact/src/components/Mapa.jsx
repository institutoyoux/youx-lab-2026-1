
import { MapContainer, TileLayer } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';

export default function Mapa({children}) {
  return (
    <MapContainer
      center={[-21.241392, -44.997984]}
      zoom={18}
      minZoom={4}
      maxZoom={18}
      style={{ height: '500px', width: '100%' }}
    >
      <TileLayer
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        attribution="&copy; OpenStreetMap contributors"
      />
    </MapContainer>
  );
}
