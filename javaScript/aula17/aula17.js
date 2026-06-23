// html
// const obj = document.getElementById('number')

// function contar() {
//     let i = 0
//     while(i <= obj.value) {
//         console.log(i)
//         i++
//     }
// }


// 5! = 5*4*3*2*1 = 120
let n=5
let fat=1

while(n>=1){
    console.log(n + 'x' + fat)
    fat*=n
    n--
}

console.log(fat)