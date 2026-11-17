import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";

import MenuLateral from "../Components/MenuLateral";

function Perfil() {

  return (

    <Box>

      <Box sx={{ backgroundColor: "green", padding: 2 }}>
        <Typography variant="h5" color="white">
          App Teste
        </Typography>
      </Box>

      <Box sx={{ display: "flex" }}>

        <MenuLateral />

        <Box sx={{textAlign: "center", color: "black", padding: 3 }}>
          <Typography variant="h4">
            Meu Perfil
          </Typography>

          <Typography>
            Bem-vindo a página de perfil!
          </Typography>
        </Box>

      </Box>

    </Box>
  );
}

export default Perfil;