const caixa=document.querySelector("#caixa")

let mapa=new Map()

mapa.set("curso","Javascript")
mapa.set(10,"Leo")
mapa.set(1,1000)
mapa.set("Leo",100)

mapa.delete(1)

console.log(mapa)

let pes="teste"
let res=""
if(mapa.has(pes)){
    res="A chave existe na coleção com o valor:" + mapa.get(pes)
}else{
    res="A chave não está na coleção"
}
res+="<br/> O tamanho da coleção é " + mapa.size
caixa.innerHTML=res

mapa.forEach((el)=>{
    console.log(el)
})
