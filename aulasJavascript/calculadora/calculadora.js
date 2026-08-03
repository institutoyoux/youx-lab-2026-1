const operacao1 = document.getElementById("operacao1")
const operacao2 = document.getElementById("operacao2")
const resultado = document.getElementById("resultado")
const btn_soma = document.getElementById("btn_soma")
const btn_multiplicacao = document.getElementById("btn_multiplicacao")
const btn_divisao = document.getElementById("btn_divisao")
const btn_subtracao = document.getElementById("btn_subtracao")
const btn_potencializacao = document.getElementById("btn_potencializacao")

btn_soma.addEventListener("click", function () {
    let numero1 = Number(operacao1.value)
    let numero2 = Number(operacao2.value)
    resultado.value = numero1 + numero2
})
btn_multiplicacao.addEventListener("click", function () {
    let numero1 = Number(operacao1.value)
    let numero2 = Number(operacao2.value)

    resultado.value = numero1 * numero2
})
btn_divisao.addEventListener("click", function () {
    let numero1 = Number(operacao1.value)
    let numero2 = Number(operacao2.value)

    resultado.value = numero1 / numero2
})
btn_subtracao.addEventListener("click", function () {
    let numero1 = Number(operacao1.value)
    let numero2 = Number(operacao2.value)

    resultado.value = numero1 - numero2
})

btn_potencializacao.addEventListener("click", function () {
    let numero1 = Number(operacao1.value)
    let numero2 = Number(operacao2.value)
    let potencia= 1
    for (let c = 1; c <= numero2; c++ ){
        potencia = potencia * numero1
    }
    resultado.value = potencia
})        