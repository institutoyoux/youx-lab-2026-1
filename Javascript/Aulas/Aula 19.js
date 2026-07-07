let n=0
let max=100
let pares=0

for(let i=n;i<max;i++){
    console.log("Numero -  " + i)
    if(i%2!=0){
        continue
    }
    pares++
}
console.log(pares + " Numeros pares ")
console.log("Fim")