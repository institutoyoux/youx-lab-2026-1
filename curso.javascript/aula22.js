//Funçao parametrizadas(entrar com valores dentro da funçao)

//soma de formas diferentes
/*
function soma(n1,n2){
     console.log(n1+n2)
}

soma(10,5)
*/

/*
function soma(n1=0,n2=0){
    console.log(n1+n2)
}

console.log(soma(10,10))
*/



/*
function soma(n1=0,n2=0){
    let res
    res=n1+n2
    return res
}


let resultado_soma=soma(5,5)
console.log(resultado_soma)
*/


/*
const VALOR_PADRAO=0

function soma(n1=VALOR_PADRAO,n2=VALOR_PADRAO){
    let res
    res=n1+n2
    return res
}


let resultado_soma=soma(5,5)
console.log(resultado_soma)
*/


const VALOR_PADRAO=0

function add(v){
    return valor+=v
}

let valor=0
console.log(valor)

add(10)
console.log(valor)

add(5)
console.log(valor)


function soma(n1=VALOR_PADRAO,n2=VALOR_PADRAO){
    let res
    res=n1+n2
    return res
}


let resultado_soma=soma(5,5)
//console.log(resultado_soma)