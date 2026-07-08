//BREAK e CONTINUE
// Break para e continua o programa 
// Continue para somente a interaçao com problema e parte pra outra

/*BREAK
let n=0
let max=1000

while(n<max){
    console.log("CFB Cursos - " + n)
    if(n>10){
        break
    }
    n++
}
console.log('Fim do programa')
*/


/*(PARES)
let n=0
let max=1000
let pares=0

for(let i=n;i<max;i++){
    console.log("CFB Cursos - " + i)
    if(i%2==0){
        pares++
    }
}
console.log("Quantidade de pares: " + pares)
console.log("Fim do programa")
*/

//Usando o CONTINUE para achar os pares
let n=0
let max=1000
let pares=0

for(let i=n;i<max;i++){
    if(i%2!=0){    
        continue
    }
    pares++
}
console.log("Quantidade de pares: " + pares)
console.log("Fim do programa")