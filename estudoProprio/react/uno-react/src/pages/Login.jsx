import { useEffect, useState } from 'react'
import styles from '../css/Login.module.css'
import {normalAPi} from '../api'
export default function Login() {
    const [username, setUsername] = useState()
    const [senha, setSenha] = useState()

    const logar = (e) => {
        e.preventDefault()
        normalAPi.post("/auth/login", {username: username, senha: senha})
        .then(response => {
            localStorage.setItem("token", response.data.token)
            navigation.navigate("/")
        })
        .catch(erro => console.error(erro))
    }
    return (
        <>
            <div className={styles.background}></div>
            <form className={styles.form} onSubmit={logar}>
                <h1>Entre para jogar</h1>
                <label htmlFor="username">Nome de usuario:</label>
                <input type="text" id='username' value={username} onChange={(e) => setUsername(e.target.value)} />
                <label htmlFor="senha">Senha:</label>
                <input type="text" id='senha' value={senha} onChange={(e) => setSenha(e.target.value)} />
                <button>Entrar</button>
            </form>
        </>
    )
}