// function canal(){
//    let n1=10
//    let n2=2
//    let res=n1*n2
//    return res
// }

// console.log(canal())
// console.log(canal())
// console.log(canal())

function canal(){
    let n1=10
    let n2=2
    let res=n1*n2
    if(res%2 == 0)
        return "PAR!"
    else
        return "ÌMPAR!"
}

let num=canal()

console.log(num)