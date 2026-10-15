fetch()
.then(res=>res.json())//res é a resposta(response)que veio do servidor.
.then(dados=>{
    console.log(dados)
})//os dados ficam disponíveis aqui