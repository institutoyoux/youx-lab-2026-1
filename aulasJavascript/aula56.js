const caixa=document.querySelector("#caixa")

const carros=["polo","golf","t-cross","hrv"]


// const curso="Javascript"
// const canal="CFB Cursos"
//const frase="Este é o curso de " + curso + "do canal " + canal

let ul=`<ol>`

carros.map(()=>{
    ul+=`<li>${el}</li>`
})
ul+`</ol>`


// const frase=`este é o<br/> curso de ${curso} do<br/> canal ${canal}`

// console.log(frase)

caixa.innerHTML=ul