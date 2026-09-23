const btnSoma = document.getElementById("positivo")
const btnSubtracao=document.getElementById("negativo")
const btnMultiplicacao=document.getElementById("multiplicaçao")
const btnDivisao=document.getElementById("divisao")
const botao=document.getElementsByClassName("botao")
const valorFinal = document.getElementById("resultado")

const op =[
    (valor1, valor2)=>{ return valor1 + valor2},
    (valor1, valor2)=>{ return valor1 - valor2},
    (valor1, valor2)=>{ return valor1 * valor2},
    (valor1, valor2)=>{ return valor1 / valor2},
] 


positivo.addEventListener('click', ()=>{
    let primeiroValor = Number(document.getElementById("valor1").value)
    let segundoValor = Number(document.getElementById("valor2").value)
    let resultado = op[0](primeiroValor,segundoValor)
    valorFinal.value = resultado
    console.log(primeiroValor)
    console.log(segundoValor)
    console.log(resultado)


})


negativo.addEventListener('click', ()=>{
    let primeiroValor = Number(document.getElementById("valor1").value)
    let segundoValor = Number(document.getElementById("valor2").value)
    let resultado = op[1](primeiroValor,segundoValor)
    valorFinal.value = resultado
})



multiplicaçao.addEventListener('click', ()=>{
    let primeiroValor = Number(document.getElementById("valor1").value)
    let segundoValor = Number(document.getElementById("valor2").value)
    let resultado = op[2](primeiroValor,segundoValor)
    valorFinal.value = resultado
})



divisao.addEventListener('click', ()=>{
    let primeiroValor = Number(document.getElementById("valor1").value)
    let segundoValor = Number(document.getElementById("valor2").value)
    let resultado = op[3](primeiroValor,segundoValor)
    valorFinal.value = resultado
})



