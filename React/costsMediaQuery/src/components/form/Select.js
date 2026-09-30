import { MenuItem } from "@mui/material";
import styles from "./Select.module.css";
import TextField from '@mui/material/TextField';

function Select({ text, name, options, handleOnChange, value }) {
  return (
    <div className={styles.form_control}>
      <label htmlFor={name}>{text}:</label>
      <TextField select name={name} id={name} onChange={handleOnChange} defaultValue={value || ''}>
        <option>Selecione uma opção</option>
        {options.map((option) => (
          <MenuItem value={option.name} key={option.id}>
            {option.name}
          </MenuItem>
        ))}
      </TextField>
    </div>
  );
}

export default Select;
