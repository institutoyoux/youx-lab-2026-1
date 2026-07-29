const p_array = document.querySelector('#array')
const btnReduzir = document.querySelector('#btnReduzir')
const resultado = document.querySelector('#resultado')

const elementos_array = [1, 2, 3, 4, 5]



p_array.innerHTML = '[' + elementos_array + ']'

let atu=[]
let ant=[]
let dobro=[]

btnReduzir.addEventListener('click', (evt) => {
    dobro.push(elementos_array[0] * 2)
    resultado.innerHTML = elementos_array.reduce((anterior, atual, pos) => {
        ant.push(anterior)
        atu.push(atual)
        dobro.push(atual * 2)
        return atual + anterior
    })

    // let atu = 0
    // let ant = 0
    // let dobro = 0
    // let result=0
    // for(valor of elementos_array){
    //     ant = valor
    //     atual = ant+=valor
    //     result = atual+=valor
    // }
    // resultado.innerHTML=result
    resultado.innerHTML += '<br/>V.anterior: ' + ant + '<br/>V.atual: ' + atu + '<br/>Dobro: ' + dobro
})