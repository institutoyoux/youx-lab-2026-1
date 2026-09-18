import { useEffect, useState } from "react"
import Carta from "../components/Carta"
import Jogador from "../components/Jogador"
import Me from "../components/Me"
import Baralho from "../components/Baralho"
import styles from '../css/Home.module.css'
import api from "../api"
export default function Home() {
    let meuUser = null;
    

    const code = window.location.search.replace("?sala=", "")

    const [me, setMe] = useState(null)
    const [atual, setAtual] = useState(null)
    const [baralho, setBaralho] = useState(null)
    const [jogador, setJogador] = useState(null)

    const obterDados = () => {
        api.get("/sala/" + code)
            .then(req => atualizarStates(req.data))
            .catch(erro => console.error(erro))
    }

    const atualizarStates = (resposta) => {
        if (resposta.jogador1.username == meuUser) {
            setJogador(resposta.jogador2)
            setMe(resposta.jogador1)
        } else if (resposta.jogador2?.username == meuUser) {
            setJogador(resposta.jogador1)
            setMe(resposta.jogador2)
        } else {
            alert("Você não está jogando!")
        }
        setAtual(resposta.carta_atual)
        setBaralho(resposta.baralho.cartas.slice(0, 8))
    }
    useEffect(() => {
        obterDados();
        api.get("/auth")
        .then(response => meuUser = response.data.username)
        .catch(erro => console.log(erro))

        const interval = setInterval(() => {
            obterDados();
        }, 1000);

        return () => clearInterval(interval);
    }, []);
    const jogarCarta = (id) => {
        api.post("/sala/jogar", { cartas: [id] })
            .catch(erro => console.error(erro))
    }
    const comprar = () => {
        api.post("/sala/comprar")
            .catch(erro => console.error(erro))
    }
    const [loading, setLoading] = useState(true)
    useEffect(() => {
        if  (me != null && atual != null && baralho != null && jogador != null) {
            setLoading(false)
        }
        
        
    }, [me, atual, baralho, jogador])
    return (
        <>
            {loading ? "Carregando sala..." :
                <>
                    {jogador?.username && <Jogador jogador={jogador} />}
                    <section className={styles.meio}>
                        <Baralho baralho={baralho} click={comprar} />
                        <Carta numero={atual.numero} cor={atual.cor} verso={false} />
                    </section>
                    {me && <Me me={me} click={jogarCarta} />}
                </>}
        </>
    )
}