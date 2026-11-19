import { Route, BrowserRouter, Routes } from 'react-router-dom'

import Cadastro from "./Cadastro.js";
import Login from './Login';
import Inicio from './Inicio.js'
import CadastroPagina from './CadastroPagina.js'
import Perfil from './Perfil.js'

function App() {
  return (
          <BrowserRouter>
            <Routes>
              <Route path="/" element={<Login />} />
              <Route path="/cadastro" element={<Cadastro />} />
              <Route path="/inicio" element={<Inicio />} />
              <Route  path='/cadastroPagina' element={<CadastroPagina />} />
              <Route  path='/perfil' element={<Perfil />} />

            </Routes>
          </BrowserRouter>
  );
}

export default App;