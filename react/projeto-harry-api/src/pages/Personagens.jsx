import { useEffect, useState } from "react"
import { getPersonagens } from "../api/api"
import Loading from "../components/Loading"
import Musica from "../components/Musica"
import Personagem from "../components/Personagem"
import PersonagemModal from "../components/modals/PersonagemModal"

export default function Personagens() {
    const [personagens, setPersonagens] = useState([])
    const [loading, setLoading] = useState(true)
    const [visualizando, setVisualizando] = useState()
    const [pagina, setPagina] = useState(1)
    const atuais = personagens.length != null && personagens.slice(pagina * 9, (pagina * 9) + 9)
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
            <img src="/back.png" className="back" />
            <Musica />
            {loading ? <Loading /> : (
                <>
                    <h1>Harry potter</h1>
                    <section className="personagensSection">
                        {atuais.map(personagem => <Personagem key={personagem.id} personagem={personagem} onclick={() => setVisualizando(personagem.id)} />)}
                    </section>
                    <div>
                        <button onClick={() => setPagina(pagina > 1 ? pagina - 1 : pagina)}>Pagina anterior</button>
                        <button onClick={() => setPagina(pagina + 1 < personagens.length / 8 ? pagina + 1 : pagina)}>Próxima pagina</button>
                    </div>
                    {visualizando && <PersonagemModal personagemid={visualizando} setVisualizando={setVisualizando} />}
                </>
            )}
        </main>
    )
}