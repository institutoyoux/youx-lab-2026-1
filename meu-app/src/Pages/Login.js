import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { Box, Avatar, Typography,  } from "@mui/material";

import ButtonApp from "../Components/Button";
import Input from "../Components/Input";




function Login() {

  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");

  const navigate = useNavigate();

  function entrar() {

   
    navigate("/Cadastro", {
      state: {
        email: email,
        senha: senha
      }
    });

  }

  return (

    <Box
      sx={{
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        gap: 4,
        minHeight: "100vh",
        padding: 2,
      }}
    >

      {/* IMAGEM LATERAL */}
      <Box
        component="img"
        src="https://img.magnific.com/vetores-gratis/vetor-de-design-de-gradiente-de-fundo-colorido_677411-3508.jpg?semt=ais_hybrid&w=740&q=80"
        sx={{
          width: 640,
          height: 640,
          objectFit: "cover",
          maxWidth: "50%",
        }}
      />

      {/* BOX DOS INPUTS */}
      <Box
        sx={{
          display: "flex",
          flexDirection: "column",
          alignItems: "center",
          gap: 2,
          width: 400,
        }}
      >

        {/* LOGO E TITULO */}
        <Box
          sx={{
            display: "flex",
            alignItems: "center",
            justifyContent: "center",
            gap: 2,
          }}
        >

          <Avatar
            alt="Logo do aplicativo"
            src="https://i.pinimg.com/236x/91/bd/05/91bd05bcbbd663364954637e16a7a95c.jpg"
            sx={{
              width: 40,
              height: 40,
            }}
          />

          <Typography
            variant="h4"
            sx={{
              color: "black",
              whiteSpace: "nowrap",
            }}
          >
            App Teste
          </Typography>

        </Box>

        {/* INPUTS */}
        <Input
          email={email}
          setEmail={setEmail}
          senha={senha}
          setSenha={setSenha}
        />

        {/* BOTÃO */}
        <ButtonApp onClick={entrar} />

      </Box>

    </Box>
  );
}

export default Login