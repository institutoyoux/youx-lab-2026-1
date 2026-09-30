import { use, useState } from "react"

function Condicional(){
    const[email, setEmail] = useState()
    const[userEmail, setUserEmail] =useState()

    function EnviarEmail(e){    
        e.preventDefault()
        setUserEmail(email)
       
    }

    function limparEmail(e){    
     
        setUserEmail("")
      
    }






    return(
        <div>
            <h2>Cadastre seu email: </h2>
            <form>
                <input type="email" placeholder="Digite seu e-mail" onChange={(e) => setEmail(e.target.value)}></input>
                <button type="submit" onClick={EnviarEmail}>Enviar-email</button>

                {userEmail && (
                    <div>
                        <p>o email do Usuario é: {userEmail}</p>
                        <button onClick={limparEmail}> Limpar e-mail</button>
                    </div>
                )}
            </form>          
        </div>
    )
}

export default Condicional