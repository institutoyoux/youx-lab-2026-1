const caixa=document.querySelector("#caixa")

let cores=["Azul", "Vermelho", "preto",["Claro", "Escuro","medio"]]
let cursos= ["HTML", "CSS", "Javascript",cores]

//.push()//Adiciona no final do Array
//.pop()//Apaga o Ultimo item do Array
//.unshift("PHP")//Adiciona no inicio do Array
//.shift()//Retira o primeira posição do Array


console.log(cursos[3][3][2])

cursos.map((el)=>{
    let p=document.createElement("p")
    p.innerHTML=el
    caixa.appendChild(p)
})


