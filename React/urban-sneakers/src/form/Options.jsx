import Radio from '@mui/material/Radio';
import RadioGroup from '@mui/material/RadioGroup';
import FormControlLabel from '@mui/material/FormControlLabel';
import FormControl from '@mui/material/FormControl';
import FormLabel from '@mui/material/FormLabel';
import React from 'react';

export default function Options({setCategoria, setValor}) {


  const id = React.useId();
  return (
    <FormControl>
      <FormLabel id={`${id}-label`}>Categoria</FormLabel>
      <RadioGroup
        aria-labelledby={`${id}-label`}
        defaultValue="casual"
        name="radio-buttons-group"
        onChange={(e) => setCategoria(e.target.value)}
      >
        <FormControlLabel value="Casual" control={<Radio />} label="Casual" />
        <FormControlLabel value="Corrida" control={<Radio />} label="Corrida" />
        <FormControlLabel value="Basquete" control={<Radio />} label="Basquete" />
        <FormControlLabel value="Skate" control={<Radio />} label="Skate" />
        <FormControlLabel value="Lifestyle" control={<Radio />} label="Lifestyle" />
      </RadioGroup>

      <FormLabel id={`${id}-label`}>Preço</FormLabel>
      <RadioGroup
        aria-labelledby={`${id}-label`}
        defaultValue="todos"
        name="radio-buttons-group"

        onChange={(e) => setValor(e.target.value)}
      >
        <FormControlLabel value="0" control={<Radio />} label="R$ 100 - R$ 200" />
        <FormControlLabel value="1" control={<Radio />} label="R$ 200 - R$ 300"/>
        <FormControlLabel value="2" control={<Radio />} label="R$ 300 - R$500"/>
        <FormControlLabel value="3" control={<Radio />} label="Acima de R$ 500" />
      </RadioGroup>
    </FormControl>
  );
}
