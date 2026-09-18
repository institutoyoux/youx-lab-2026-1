import { useEffect, useState } from "react"
import { getPersonagemById } from "../../api/api"
import NaoPng from '../../assets/nao.png'

export default function PersonagemModal({setVisualizando, personagemid}) {
    const [personagem, setPersonagem] = useState(null)
    useEffect(() => {
        getPersonagemById(personagemid)
        .then(data => {
            setPersonagem(data[0])
        })
        .catch(erro => console.error(erro))
    }, [])
    return (
        <>
            {personagem !== null && <div className="backModal" onClick={() => setVisualizando(false)}>
                <div>
                    <div className="img"><img src={personagem?.image || NaoPng} alt="" /></div>
                    <span>{personagem.name}</span>
                </div>
            </div>}
        </>
    )
}