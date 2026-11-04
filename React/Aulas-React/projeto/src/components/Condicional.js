import { useState } from 'react'

function Condicional(){

    const [email, setEmail] = useState()
    const [userEmail, setUserEmail] = useState()

    function enviarEmail(e){
        e.preventDefault()
        console.log("testando")
        setUserEmail(email)
    }

    return (
        <div>
            <h2>
                Cadastre o deu e-mail:
            </h2>
            <form>
                <input type='email' placeholder='Digite o seu email...' 
                onChange={(e) => setEmail(e.target.value)}/>
                <button type='submit' onClick={enviarEmail}>
                    Enviar
                </button>
                {userEmail && (
                    <div>
                        <p>O e-mail do usuário é: {userEmail}</p>
                    </div>
                )}
            </form>
        </div>
    )


}

export default Condicional