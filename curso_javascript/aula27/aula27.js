/* function* cores(){
    yield 'Vermelho'
    yield 'Verde'
    yield 'Azul'
}

let itc=cores()
console.log(itc.next().value)
console.log(itc.next().value)
console.log(itc.next().value)
console.log(itc.next().value) */

function* perguntas(){
    const nome=yield 'Qual seu nome?'
    const esporte=yield 'Qual seu esporte favorido?'
    return 'Seu nome é ' + nome + ', seu esporte favorito é ' + esporte

}

/* const itp=perguntas()
console.log(itp.next().value)
console.log(itp.next('Bruno').value)
console.log(itp.next('Natação').value) */

function* contador(){
    let i=0
    while(true){
        yield i++
        if(i>5)
            break
    }
}
/* const itc=contador()
for(let i=0; i<10; i++){
    console.log(itc.next().value)
}

console.log(itc.next().value)
console.log(itc.next().value) */

const itc=contador()
for(let c of itc){
    console.log(c)
}