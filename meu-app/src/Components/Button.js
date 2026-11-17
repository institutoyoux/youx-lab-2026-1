import Button from "@mui/material/Button";

function ButtonApp({ onClick }) {

  return (
    <Button
      variant="contained"
      onClick={onClick} // funcao de clique pro botão 
      fullWidth
    >
      ENTRAR
    </Button>
  );
}

export default ButtonApp;