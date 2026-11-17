import { Routes, Route, } from "react-router-dom";
import Cadastro from "./Cadastro";
import Inicio from "./Inicio";
import Perfil from "./Perfil";
import Login from "./Login";

  <Login />

function App() {

  return (
  <Routes>
    <Route path="/" element={<Login />} />
    <Route path="/Inicio" element={<Inicio />} />
    <Route path="/Perfil" element={<Perfil />} />
    <Route path="/Cadastro" element={<Cadastro />} />
  </Routes>
  );
}
    

export default App;