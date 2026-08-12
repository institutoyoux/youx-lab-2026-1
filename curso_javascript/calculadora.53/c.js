
const somar=document.getElementById("somar")
const subtrair=document.getElementById("subtrair")
const multiplicar=document.getElementById("multiplicar")
const dividir=document.getElementById("dividir")

somar.addEventListener("click",(evt) => {
    let valor1=document.getElementById("v1").value
    let valor2=document.getElementById("v2").value
    const resultado=document.getElementById("resultado")

    valor1 = Number(valor1)
    valor2 = Number(valor2)

    let resposta = valor1 + valor2
    resultado.innerText = resposta

})

subtrair.addEventListener("click",(evt) => {
    let valor1=document.getElementById("v1").value
    let valor2=document.getElementById("v2").value
    const resultado=document.getElementById("resultado")

    valor1 = Number(valor1)
    valor2 = Number(valor2)

    let resposta = valor1 - valor2
    resultado.innerText = resposta

    
    // let valorResultado;
    // let  = Number(valorResultado) 
    
    /*console.log(resultado.innerText)
    resultado.innerText = "10" */
})

multiplicar.addEventListener("click",(evt) => {
    let valor1=document.getElementById("v1").value
    let valor2=document.getElementById("v2").value
    const resultado=document.getElementById("resultado")

    valor1 = Number(valor1)
    valor2 = Number(valor2)

    let resposta = valor1 * valor2
    resultado.innerText = resposta
})

dividir.addEventListener("click",(evt) => {
    let valor1=document.getElementById("v1").value
    let valor2=document.getElementById("v2").value
    const resultado=document.getElementById("resultado")

    valor1 = Number(valor1)
    valor2 = Number(valor2)

    let resposta = valor1 / valor2
    resultado.innerText = resposta
})
