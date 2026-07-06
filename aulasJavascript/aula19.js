//break ----> interrupcao na execucao
//continue ----> ele para somente uma execucao e dps continue normalmente

let n=0
let max=1000
let pares=0

//while(n<max){
//    console.log("cfb cursos -" + n)
//    if(n>10){
//        break
//    }
//    n++
//}
//console.log("fim do programa")

for(let i=n;i<max;i++){
    console.log("cfb cursos - " + i)
    if(i%2!=0){
       continue
    }
     pares++
}

console.log("quantidade de pares " + pares)
console.log("fim do programa")