import { useEffect, useState } from "react"
import { getPersonagemById } from "../../api/api"
import NaoPng from '../../assets/nao.png'

export default function PersonagemModal({ setVisualizando, personagemid }) {
    const [personagem, setPersonagem] = useState(null)
    useEffect(() => {
        getPersonagemById(personagemid)
            .then(data => {
                setPersonagem(data[0])
            })
            .catch(erro => console.error(erro))
    }, [])
    const gerarIdade = (data) => {
        if (data) {
            const nascimento = new Date(data.split("-").reverse()).getFullYear()
            return 1991 - nascimento + " anos"
        }
    }
    return (
        <>
            {personagem !== null && <div className="backModal" onClick={() => setVisualizando(false)}>
                <div>
                    <div className="img"><img src={personagem?.image || NaoPng} alt="" /></div>
                    <span>{personagem.name}</span>
                    <span>{gerarIdade(personagem?.dateOfBirth) ?? 'Idade não encontrada'}</span>
                    <span>{personagem.hogwartsStudent ? 'Estuda em hogwarts' : 'Não estuda em hogwarts'}</span>
                </div>
            </div>}
        </>
    )
}