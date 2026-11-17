import { useLocation } from "react-router-dom";

import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";
import Paper from "@mui/material/Paper";
import MenuLateral from "../Components/MenuLateral";


function Cadastro() {

  const location = useLocation();

  const email = location.state?.email;
  const senha = location.state?.senha;

  console.log("Botão foi clicado");
  console.log("E-mail:", email);
  console.log("Senha:", senha);

  return (

    <Box>

      {/* BARRA SUPERIOR */}
      <Box
        sx={{
          backgroundColor: "green",
          padding: 2,
        }}
      >
        <Typography variant="h5" color="white">
          App Teste
        </Typography>
      </Box>


      {/* MENU E CONTEÚDO */}
      <Box sx={{ display: "flex" }}>

        <MenuLateral/>
        <Box sx={{padding: 3, }}>
            <Typography variant="h5">
                Faça um novo cadastro aqui! 
            </Typography>
        </Box>
       
    
      </Box>


        {/* QUADRADO CENTRAL */}
        <Box
          sx={{
            flex: 1,
            display: "flex",
            justifyContent: "center",
            alignItems: "center",
          }}
        >

          <Paper
            sx={{
              padding: 4,
              width: 350,
            }}
          >

            <Typography variant="h5">
              Informações do usuário
            </Typography>

          </Paper>

        </Box>

      </Box>

  );
}

export default Cadastro;