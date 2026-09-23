const caixa=document.querySelector("#caixa")

let mapa=new Map()

mapa.set("curso","Javascript")
mapa.set(10,"CFB Cursos")
mapa.set(1,100)
mapa.set("canal",100)

mapa.delete(1)

console.log(mapa)

let pes=10
let res=""
if(mapa.has(pes)){
    res="A chave existe na coleçao com o valor: " + mapa.get(pes)
}else{
    res="A chave NÃO esta na coleçao"
}
res +="<br/> O tamanho da coleçao é " + mapa.size
caixa.innerHTML=res

mapa.forEach((el)=>{
    console.log(el)
})