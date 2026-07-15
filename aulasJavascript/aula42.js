// OQUE É O FILTER ? ele percorre o elemento de um array, permitindo que realize uma filtragem
//atraves de uma programacao como if, e retorna apenas um elemento filtrado

const filtroMaior18=(valor)=>{
    if(valor >= 18)
    return valor
}

const idades=[15,21,30,17,18,44,12,50]
const maior=idades.filter((val,ind,arr)=>{
    if(val >= 18)
    return val
})
const menor=idades.filter((val,ind,arr)=>{
    if(val < 18)
    return val
})

console.log(idades)
console.log(maior)
console.log(menor)