import styles from "./Input.module.css";

import Box from "@mui/material/Box";
import TextField from "@mui/material/TextField";

export default function Input({
  type,
  text,
  name,
  placeholder,
  handleOnChange,
  value,
}) {
  return (
    <Box className={styles.form_control}>
      <label htmlFor={name}>{text}:</label>
      <TextField
        variant="outlined"
        type={type}
        name={name}
        id={name}
        placeholder={placeholder}
        onChange={handleOnChange}
        value={value}
      />
    </Box>

    // <div className={styles.form_control}>
    //   <label htmlFor={name}>{text}:</label>
    //   <input
    //     type={type}
    //     name={name}
    //     id={name}
    //     placeholder={placeholder}
    //     onChange={handleOnChange}
    //     value={value}
    //   />
    // </div>
  );
}
