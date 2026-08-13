const caixa=document.querySelector("#caixa")

const carros=["Polo","Golf","T-Cross","HRV"]
//const frase="Este é o curso de " + curso + " do canal " + canal 

let ul= `<ul>`
carros.map((el)=>{
    ul+=`<li>${el}</li>`
})
ul+`</ul>`

// const frase=`Este é<br/> curso de ${curso} do<br/> canal ${canal}`


caixa.innerHTML=ul
