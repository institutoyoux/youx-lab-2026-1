const caixa=document.querySelector("#caixa")

let cores=["azul","verde","vermelho",["claro","escuro","medio"]]
let cursos=["HTML","CSS","Javascript",cores]

// cursos[0]=2023 

// cursos.push("c++")
// cursos.unshift("Python")
// cursos.shift()

// console.log(cursos[0])

console.log(cursos[3][3])

cursos.map((el)=>{
    let p=document.createElement("p")
    p.innerHTML=el
    caixa.appendChild(p)
})
