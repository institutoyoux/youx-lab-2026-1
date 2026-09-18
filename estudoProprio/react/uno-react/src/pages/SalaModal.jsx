import { useState } from "react"
import api from "../api"

export default function SalaModal() {
    const [codigo, setCodigo] = useState()
    const enviar = (e) => {
        e.preventDefault()
        api.post("/sala/entrar", {codigo: codigo})
        .then(response => navigation.navigate("./?sala="+codigo))
        .catch(erro => console.error(erro))
        
    }
    return (
        <>
            <form onSubmit={enviar}>
                <h1>Digite o código da sala</h1>
                <input type="number" id="sala" value={codigo} onChange={(e) => setCodigo(e.target.value)}/>
                <button>Entrar</button>
            </form>
        </>
    )
}