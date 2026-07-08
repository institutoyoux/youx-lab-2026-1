
const somar=val=>{
    let res=0
    for(v of val)
        res += v
    return res
}
const soma=(...valores)=>{
    return somar(valores)
}
console.log(soma(1,5,7))
valor=[10,5,7]
console.log(soma(...valor))
