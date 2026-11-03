import Button from "./Button"

function Evento() {
    function meuEvento (){
        console.log(`Ativando o primeiro evento`)
    }

    function segundoEvento() {
        console.log("Ativando o segundo evento")
    }


    return (
        <div>
            <p>Clique para disparar os eventos</p>
            <Button event={meuEvento} text="Primeiro Evendo"/>
            <Button event={segundoEvento} text="Segundo Evento"/>  
        </div>
    )
}

export default Evento