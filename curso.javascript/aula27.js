//Funçao geradoras. Pode retornar coisas ao longo do processo.
/*
function* cores(){
    yield 'Vermelho'
    yield 'Verde'
    yield 'Azul'
}

const itc=cores()
console.log(itc.next().value)
console.log(itc.next().value)
console.log(itc.next().value)
*/

/*
function* perguntas(){
    const nome=yield 'Qual seu nome?'
    const esportes=yield 'Qual seu esporte favorito?'
    return 'Seu nome é ' + nome + ',seu esporte favorito é ' + esportes
}

const itp=perguntas()
console.log(itp.next().value)
console.log(itp.next('Bruno').value)
console.log(itp.next('nataçao').value)
*/

//retornar 0 1 ...
/*
function* contator(){
    let i=0
    while(true){
        yield i++
    }
}
const itc=contator()
console.log(itc.next().value)
console.log(itc.next().value)
*/


//rodando de 0 a 9
/*
function* contator(){
    let i=0
    while(true){
        yield i++
    }
}
const itc=contator()
for(let i=0; i<10; i++){
    console.log(itc.next().value)
}
*/



//rodar ate um certo numero
/*
function* contator(){
    let i=0
    while(true){
        yield i++
        if(i>5)
            break
    }
}
const itc=contator()
for(let c of itc){
    console.log(c)
}
*/