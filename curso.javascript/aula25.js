//Arrow Function 

//const soma=function(v1,v2){return v1+v2} > Jeito comum

// Jeito de Arrow Function
const soma=(v1,v2)=>{
    let res=v1+v2
    return res
}
console.log(soma(10,5))

const nome=n=>{return n}
console.log(nome("Bruno"))

const add=n=>n+10
console.log(add(10))

