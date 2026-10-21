import { useState } from "react";
import styles from './Home.module.css'
import Input from './components/inputs/Input'
import Mapa from './components/Mapa'
import axios from "axios";

export default function Home() {
    const [email, setEmail] = useState('')
    const [pesquisa, setPesquisa] = useState('')
    const setMail = (e) => {
        setEmail(e.target.value)
    }
    const setPesq = (e) => {
        setPesquisa(e.target.value)
    }
    const valid = email.includes("@") && email.includes(".") && email.length > 5
    const classBtn = valid ? styles.button : `${styles.button} ${styles.disabled}`
    const [passo, setPasso] = useState(0)
    const [cordenadas, setCordenadas] = useState([])
    const proximoPasso = () => {
        if (passo < 1) {
            setPasso(passo => passo + 1)
        } else {
            axios.get(`https://nominatim.openstreetmap.org/search?q=${pesquisa}&format=jsonv2`)
                .then(response => {
                    const primeira = response.data[0]
                    if (!primeira) {
                        alert("Endereço não encontrado!")

                    }
                    console.log(primeira)
                    setCordenadas([primeira.lat, primeira.lon])
                    console.log(cordenadas)
                    setPasso(passo => passo + 1)
                })
        }

        console.log(passo)
    }
    return (
        <>
            <header className={styles.header}>
                <span className={styles.logo}>Mapas</span>
            </header>
            <main className={styles.main}>
                <h1>Primeiro, qual seu email?</h1>
                {passo >= 0 && (<Input label="Email" className={styles.input} value={email} onChange={setMail} />)}
                {passo >= 1 && (<>
                    <h1>Segundo, qual seu endereço?</h1> <Input label="Endereço" className={styles.input} value={pesquisa} onChange={setPesq} /></>)}
                {passo >= 2 && (<Mapa center={cordenadas} ponto={cordenadas} />)}
                <button onClick={proximoPasso} className={classBtn} disabled={false}>Continue</button>
                <button className={styles.login}>Já possui conta? Entre aqui</button>
            </main>
        </>
    )
}