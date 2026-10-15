import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import GraficoLinha from './components/GraficoLinha'
import PizzaDoisNiveis from './components/PizzaDoisNiveis'
import GraficoBarrasRadiais from './components/GraficoBarrasRadiais'
import GraficoRadar from './components/GraficoRadar'
import GraficoLinhaBarraArea from './components/GraficoLinhaBarraArea'
import GraficoEixos from './components/GraficoEixos'
import GraficoBarraEmpilhada from './components/GraficoBarraEmpilhada'
import GraficoLinhaTempo from './components/GraficoLinhaTempo'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <GraficoLinha />
    <PizzaDoisNiveis />
    <GraficoBarrasRadiais />
    <GraficoRadar />
    <GraficoLinhaBarraArea />
    <GraficoEixos />
    <GraficoBarraEmpilhada />
    <GraficoLinhaTempo />
  </StrictMode>,
)
