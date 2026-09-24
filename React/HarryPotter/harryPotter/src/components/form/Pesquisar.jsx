import Box from "@mui/material/Box";
import TextField from "@mui/material/TextField";
import styles from "./Pesquisar.module.css";

export default function Pesuisar({ handleChange, valor }) {
  return (
    <Box
      component="form"
      sx={{
        '& .MuiInputLabel-root': { color: '#D4AF37' }, // Cor do rótulo (Label)
        "& > :not(style)": { m: 0, width: "30ch" },
        bgcolor: " rgba(212, 175, 55, 0.1)", // Cor de fundo (ex: cinza claro do MUI)
        p: 3, // Padding (espaçamento interno de 24px)
        borderRadius: 2,
      }}
      noValidate
      autoComplete="off"
      className={styles.boxPesquisar}
    >
      <TextField
        className={styles.pesquisarInput}
        onChange={handleChange}
        valor={valor}
        label="Enter the character's name"
        variant="filled"
      />
    </Box>
    // <div>
    //   <input
    //     id="inputPesquisar"
    //     className={className}
    //     onChange={handleChange}
    //     value={valor}
    //     type="text"
    //     placeholder="Enter the character's name"
    //   />
    // </div>
  );
}
