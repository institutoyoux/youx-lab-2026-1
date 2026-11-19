import "./App.css";
import Button from "@mui/material/Button";
import { TextField } from "@mui/material";
import Avatar from "@mui/material/Avatar";
import { useNavigate } from "react-router";
import { useState } from "react";
function Login() {

    const [emailTexto, setEmailTexto] = useState()
    const navigate = useNavigate()
    const [senhaTexto, setSenhaTexto] =  useState()

    // const irParaCadastro = () => {
    //     navigate('/cadastro')

    // }

    // const valorEmail = (e) => {
    //     setEmailTexto(e.target.value)
    // }

    // const valorSenha = (e) => {
    //     setSenhaTexto(e.target.value)
    // }

    return (

            <div className="container">
             <div className="imagem">
               <img src="https://static.nationalgeographicbrasil.com/files/styles/image_3200/public/o_patricarca_04.webp?w=1600&h=2134" alt="Imagem" />
             </div>
          
             <div className="App">
               <form className="form">
                 <Avatar
                   alt="Logo do aplicativo"
                   src="https://play-lh.googleusercontent.com/vnhuONWj1eQRuFt0nNYINChFzh2hbUvFnAkrgwAEmU5wXfufbsuWIrjZyVtuw_pYEDhJGPMxuCncZfpQyyvdhg"
                   sx={{width: 60, height: 40}}
                   > 
                 </Avatar>

                   <h1>App Test</h1>
                   <h4>Bem Vindo(a)!</h4>

                 <TextField  
                  label='Email'
                  onChange={(e) => setEmailTexto(e.target.value)}
                  value={emailTexto}
                 />
                 <TextField 
                   label='Senha' type='password required'
                   onChange={(e) => setSenhaTexto(e.target.value)}
                   value={senhaTexto}
                 />
                 <Button 
                   color="primary"
                   variant="contained"
                   size="large"
                //    onClick={irParaCadastro}
                   onClick={() => navigate('/cadastro', {
                    state: {
                       nome: {emailTexto},
                       senha: {senhaTexto}
                    }
                   }) }
                   >
                     Adicionar
                 </Button>
               </form>
             </div>
             </div>
    )
}

// console.log(Login)
export default Login;