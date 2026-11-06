function Pessoa({nome, idade, profissao, foto}) {
    // ao ultilizar esse recurso dispenso o uso de props com repetição

    return(
        <div>
            <img src={foto} alt={nome} />
            <h2>Nome: {nome}</h2>
            <p>Idade: {idade}</p>
            <p>Profissao: {profissao}</p>
        </div>
    )
}

export default Pessoa