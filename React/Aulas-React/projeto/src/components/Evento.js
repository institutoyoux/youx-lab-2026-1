function Evento({numero}) {
    function meuEvento (){
        console.log(`Opa, fui clicado ${numero}`)
    }
    return (
        <div>
            <p>Clique aqui a baixo</p>
            <button onClick={meuEvento}>Aqui</button>
        </div>
    )
}

export default Evento