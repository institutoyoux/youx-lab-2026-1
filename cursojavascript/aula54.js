const caixa=document.querySelector("#caixa")

let mapa=new Map()

mapa.set("curso","javascript")
mapa.set(10,"CBF Cursos")
mapa.set(1,100)
mapa.set("canal",100)

console.log(mapa)

let pes=10
if(mapa.has(pes)){
    caixa.innerHTML="A chave existe na coleção com o valor:"+ mapa.get(pes)
}else{
    "A chave não está na coleção"
}
//caixa.innerHTML=mapa.get("curso")//relaciona com a chave