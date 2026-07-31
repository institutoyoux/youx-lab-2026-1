const caixa=document.querySelector("#caixa")

let cores=["azul","verde","vermelho"["claro","escuro","medio"]]
let cursos=["HTML","Css","Javascript",cores]

//cursos[0]=2023

// cursos.push("C++") // a cada push é adicionado um elemento no final do array
// cursos.pop("Python")   // a cada pop um elemento é retirado no final do array
// cursos.unshift("python")  // permite que um elemento seja add no inicio do array 
// cursos.shift("Python") // remove um elemento no inicio do array


console.log(cursos[3][3][2])


cursos.map((el)=>{
   let p=document.createElement("p")
   p.innerHTML=el
   caixa.appendChild(p)
})
