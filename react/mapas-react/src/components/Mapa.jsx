
import { MapContainer, Marker, TileLayer } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';

export default function Mapa({center, ponto, children}) {
  return (
    <MapContainer
      center={center}
      zoom={18}
      minZoom={4}
      maxZoom={18}
      style={{ height: '500px', width: '100%' }}
    >
      <TileLayer
        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        attribution="&copy; OpenStreetMap contributors"
      />
      {ponto && (<Marker position={ponto} />)}
    </MapContainer>
  );
}
