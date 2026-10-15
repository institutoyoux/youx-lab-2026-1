const p_temp=document.getElementById("p_temp")
const p_nivel=document.getElementById("p_temp")
const p_press=document.getElementById("p_temp")

const obterDados=()=>{
    const endpoint="https://cfbcursos.repl.co/"//link da api
    fetch(endpoint)  
  .then((res) => res.json()) //res é a resposta(response)que veio do servidor.
  .then((dados) => {
    console.log(dados);
        p_temp.innerHTML="Temperatura: " + dados.temperatura
        p_nivel.innerHTML="Nível: " + dados.nivel
        p_press.innerHTML="Pressão: " + dados.pressao
  }) //os dados ficam disponíveis aqui
}

let intervalo=setInterval(obterDados,3000)//pra não precisar ficar atualizando(intervalo de segundos)