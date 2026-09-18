import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import Personagens from './pages/Personagens.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Personagens />
  </StrictMode>,
)
