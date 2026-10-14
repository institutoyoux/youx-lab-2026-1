const p_tempo=document.getElementById("p_tempo")
const p_nivel=document.getElementById("p_nivel")
const p_press=document.getElementById("p_press")

const obterDados=()=>{
    //const endpoint="https://cfbcursos.repl.co/" link que vc vai puxar 
    fetch(endpoint)
    .then(res=>res.json())
    .then(dados=>{
        console.log(dados)
        p_tempo.innerHTML="Temperatura:" + dados.temperatura
        p_nivel.innerHTML="Nivel:" + dados.nivel
        p_press.innerHTML="Pressao:" + dados.pressao
    })
}


let intervalo=setInterval(obterDados,10000)


let dados={
    nome:"Ana",
    canal:"CFBCursos",
    curso:"Javascript"
}

let cabecalho={
    method="POST",
    body:JSON.stringify(dados)
}

const gravarDados=()=>{
    const endpoint=//link
    fetch(endpoint,cabecalho)
    .then(res=>res.json())
    .then(ret=>{
        console.log(ret)
    })
}

btn_texto.addEventLisstener("click",(evt)=>{
    gravarDados()
})