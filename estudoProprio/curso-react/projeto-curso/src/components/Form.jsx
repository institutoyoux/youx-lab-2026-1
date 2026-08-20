import { useState } from "react";


function Form() {
    const cadastrarUsuario = (e) => {
        e.preventDefault();
        console.log("Cadastrou o usuario");
        console.log(name);
        
    }
    const [name, setName] = useState()
    return (
        <div>
            <h1>Meu cadastro:</h1>
            <form onSubmit={cadastrarUsuario}>
                <div><input type="text" placeholder="Digite seu nome" onChange={(e) => setName(e.target.value)} /></div>
                <div><input type="password" placeholder="Digite sua senha" /></div>
                <div><input type="submit" value="Cadastrar" /></div>
            </form>
        </div>
    )
}
export default Form;