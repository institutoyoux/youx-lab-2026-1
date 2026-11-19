import { Stack, Box, Button } from "@mui/material";
// import Button from "@mui/material/Button";
import "./cadastro.module.css";
import { useLocation } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import { useState } from "react";
import Inicio from "./Inicio";
import CadastroPagina from "./CadastroPagina";
import Perfil from "./Perfil";

function Cadastro() {
  const navigate = useNavigate();

  const location = useLocation();
  console.log(location.state.nome);
  console.log(location.state.senha);

  const [pagina, setPagina] = useState();

  return (
    <div className="container">
      <div className="cadastro">
        <form>
          <h1>App Test - Veja sua conta. </h1>

          <Box
            sx={{
              width: "100%",
              backgroundColor: "lightblue",
              boxSixing: "border-box",
              padding: 2,
            }}
          >
            App Test - Bem Vindo(a)!
          </Box>

          <Box sx={{ display: "flex" }}>
            <Box
              sx={{
                width: 175,
                height: "90vh",
                backgroundColor: "#d2ccf0",
                padding: 2,
              }}
            >
              <Stack spacing={2}>
                <Button // substituir por NavLink
                  color="black"
                  onClick={() => setPagina("inicio")}
                >
                  Inicio
                </Button>

                <Button
                  color="black"
                  onClick={() => setPagina("cadastroPagina")}
                >
                  Cadastro
                </Button>

                <Button color="black" onClick={() => setPagina("perfil")}>
                  Perfil
                </Button>
              </Stack>
            </Box>
            <Box sx={{ flex: 1 }}>
              {pagina === "inicio" && <Inicio />}
              {pagina === "cadastroPagina" && <CadastroPagina />}
              {pagina === "perfil" && <Perfil />}
            </Box>
          </Box>
        </form>
      </div>
    </div>
  );
}

export default Cadastro;
