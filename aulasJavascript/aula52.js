const caixa=document.querySelector("#caixa")

let cursos=["HTML","Css","Javascript"]

//cursos[0]=2023

cursos.push("C++") // a cada push é adicionado um elemento no final do array
cursos.pop("Python")   // a cada pop um elemento é retirado no final do array

console.log(cursos[2])

cursos.map(()=>{
   let p=document.createElement("p")
   p.innerHTML=el
   caixa.appendChild(p)
})
