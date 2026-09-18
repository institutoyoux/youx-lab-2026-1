import NaoPng from '../assets/nao.png'

export default function Personagem({ personagem, onclick}) {
    const casasEnum = {
        Gryffindor: "Grifinoria",
        Hufflepuff: "Lufa lufa",
        Ravenclaw: "Corvinal",
        Slytherin: "Sonserina"
    }
    return (
        <div className="personagem" onClick={onclick}>
            <div className="img"><img src={personagem.image || NaoPng} alt="" /></div>
            <div className="dados">
                <span>{personagem.name}</span>
                <span>{casasEnum[personagem.house] ?? 'Não possui casa'}</span>
            </div>
        </div>
    )
}