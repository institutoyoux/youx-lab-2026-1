import { useEffect, useState } from "react"
import { getPersonagens } from "../api/api"
import Loading from "../components/Loading"
import Musica from "../components/Musica"
import Personagem from "../components/Personagem"
import PersonagemModal from "../components/modals/PersonagemModal"

export default function Personagens() {
    const [personagens, setPersonagens] = useState()
    const [loading, setLoading] = useState(true)
    const [visualizando, setVisualizando] = useState()
    useEffect(() => {
        getPersonagens()
        .then(data => {
            setPersonagens(data)
            setLoading(false)
        })
        .catch(erro => console.error(erro))
    }, [])
    return (
        <main>
            <img src="/back.png" className="back"/>
            <Musica />
            {loading ? <Loading /> : (
                <>
                    <h1>Harry potter</h1>
                    <section className="personagensSection">
                        {personagens.map(personagem => <Personagem key={personagem.id} personagem={personagem} onclick={() => setVisualizando(personagem.id)} />)}
                    </section>
                    {visualizando && <PersonagemModal personagemid={visualizando} setVisualizando={setVisualizando}/>}
                </>
            )}
        </main>
    )
}