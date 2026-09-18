import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import Graficos from './pages/Graficos'
import './css/index.css'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Graficos />
  </StrictMode>,
)
