import { TextField, Box } from "@mui/material"; // importando do material ui 

function Input({ email, setEmail, senha, setSenha }) { //criando a função com props 

  return (
    <Box
      sx={{
        display: "flex",
        flexDirection: "column", //meio q o "css"
        gap: 2,
        width: "100%",
      }}
    >

      <TextField
        label="E-mail" // 
        type="email" //definindo o tipo 
        value={email} //o valor q sera recebido 
        onChange={(e) => setEmail(e.target.value)} //consegue ver quando o usuario digita algo no input, pega oq foi digitado e atualiza o email
        fullWidth
      />

      <TextField
        label="Senha"
        type="password"
        value={senha}
        onChange={(e) => setSenha(e.target.value)} 
        fullWidth
      />

    </Box>
  );
}

export default Input;