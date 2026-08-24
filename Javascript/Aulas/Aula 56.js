const caixa=document.querySelector("#caixa")

const carros=["Polo","GTI","T-Cross"]

let ul= `<ul>`
carros.map((el)=>{
    ul+=`<li>${el}</li>`
})
ul+`</ul>`

caixa.innerHTML=ul