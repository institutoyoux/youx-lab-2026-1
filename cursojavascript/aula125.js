const p_temp=document.getElementById("p_temp")
const p_nivel=document.getElementById("p_temp")
const p_press=document.getElementById("p_temp")
const btn_texto=document.getElementById("btn_texto")

const obterDados=()=>{
    const endpoint="https://127.0.0.1:1880/cfbcursos"//link da api
    fetch(endpoint)  
  .then((res) => res.json()) //res é a resposta(response)que veio do servidor.
  .then((dados) => {
    console.log(dados);
        p_temp.innerHTML="Temperatura: " + dados.temperatura
        p_nivel.innerHTML="Nível: " + dados.nivel
        p_press.innerHTML="Pressão: " + dados.pressao
  }) //os dados ficam disponíveis aqui
}

//let intervalo=setInterval(obterDados,3000)//pra não precisar ficar atualizando(intervalo de segundos)

let dados={
    nome:"Bruno",
    canal:"CFBCursos",
    curso:"Javascript"
}//dados que vao ser guardados no banco de dados

let cabecalho={
    method: "POST",
    body:JSON.stringify(dados)//transformando o body pra json
}//facilitar o uso do fetch, em vez de ir pra funcao

const gravarDados=()=>{
    const endpoint="https://127.0.0.1:1880/gravar"//link da api
    fetch(endpoint,cabecalho)
    .then((res)=>res.json()) //res é a resposta(response)que veio do servidor.
    .then(ret=>{//resultado do servidor depois que converteu pra json
        console.log(ret)
    })
}

btn_texto.addEventListener("click",(evt)=>{
    gravarDados()
})//quando clicar vai chamar a api e vai guardar e mostrar as informações