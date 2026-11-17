import Box from "@mui/material/Box";
import Button from "@mui/material/Button";

import { Link } from "react-router-dom";

function MenuLateral() {

  return (

    <Box
      sx={{
        width: 200,
        height: "90vh",
        backgroundColor: "#eeeeee",
        padding: 2,
      }}
    >

      <Button
        component={Link}
        to="/Inicio"
        fullWidth
      >
        Início
      </Button>

      <Button
        component={Link}
        to="/Perfil"
        fullWidth
      >
        Perfil
      </Button>

      <Button
        component={Link}
        to="/Cadastro"
        fullWidth
      >
        Cadastro
      </Button>

    </Box>
  );
}

export default MenuLateral;