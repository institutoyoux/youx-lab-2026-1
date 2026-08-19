//const filtroMaior18=(valor,indice,array)={
const filtroMaior18=(valor)=>{
    if(valor >= 18)//se idade for maior ou igual a 18
        return valor//retorna minha idade
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