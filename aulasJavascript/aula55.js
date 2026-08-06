const caixa=document.querySelector("#caixa")

let musicas=new Set(["musica1","musica boa", "musica10"])

musicas.add("musica muito legal")
musicas.add('musica1')
musicas.add("musica1")
musicas.add("musica10")

musica. delete("musica1")
musica.clear()

console.log(musicas)

// musicas.forEach((el)=>{
//     caixa.innerHTML += el + "</br> "
// })

for(let m of musica){
 caixa.innerHTML +=m + "</br> "}