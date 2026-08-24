const caixa=document.querySelector("#caixa")

let musicas=new Set(["babydoll","chicago"])

musicas.add("P(jme)")

musicas.delete("babydoll")//dele o escolhido
musicas.clear()//deleta tudo

console.log(musicas)

// musicas.forEach((el)=>{
//     caixa.innerHTML+=el + "<br/>"
// })

for(let m of musicas){
    caixa.innerHTML+=m + "<br/>"
}