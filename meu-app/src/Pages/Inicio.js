import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";

import MenuLateral from "../Components/MenuLateral";

function Inicio() {

  return (

    <Box>

      <Box sx={{ backgroundColor: "green", padding: 2 }}>
        <Typography variant="h5" color="white">
          App Teste
        </Typography>
      </Box>

      <Box sx={{ display: "flex" }}>

        <MenuLateral />

        <Box sx={{ padding: 3 }}>
          <Typography variant="h4">
            Página Inicial
          </Typography>

          <Typography>
            Bem-vindo ao App Teste!
          </Typography>
        </Box>

      </Box>

    </Box>
  );
}

export default Inicio;