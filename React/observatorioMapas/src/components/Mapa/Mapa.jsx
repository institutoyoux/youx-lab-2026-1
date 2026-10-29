import {
  Circle,
  CircleMarker,
  LayerGroup,
  LayersControl,
  MapContainer,
  Popup,
  TileLayer,
  Tooltip,
} from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
import { corEnum } from '../../utils/enums';

export default function Mapa({ posicao, center, focos, municipios }) {
  const padrao = center[0] == -13.30793;

  const colors = { 
    color: '#000',
    fillColor: '#fff',
    fillOpacity: 0.6,
    weight: 2
  };

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
        
        <LayersControl.Overlay checked name="Cidades">
          <LayerGroup>
            {municipios?.length > 0 && municipios.map(municipio => (
               <CircleMarker
        center={[municipio.latitude, municipio.longitude]} 
        pathOptions={colors} 
        radius={5} 
      >
        <Tooltip permanent>{municipio.nome}</Tooltip>
      </CircleMarker>
            ))}
          </LayerGroup>
      </LayersControl.Overlay>
        <LayersControl.Overlay checked name="Focos">
          <LayerGroup>
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
          </LayerGroup>
      </LayersControl.Overlay>
      </LayersControl>

      <CircleMarker
        center={posicao ?? [0, 0]} 
        pathOptions={colors} 
        radius={5} 
      >
        <Tooltip permanent>Sua localização</Tooltip>
      </CircleMarker>
    </MapContainer>
  );
}   