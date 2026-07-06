function soma(...valores){
    let tamanho=valores.length
    let resultado=0
    // for(let i=0; i<tam; i++){
    //     resultado+=valores[i]
    // }
    for(let v of valores){
        resultado+=v
    }
    return resultado
}

console.log(soma(10,5,2,6))