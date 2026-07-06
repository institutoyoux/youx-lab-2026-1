function*  contator(){  //perguntas(){  //cores(){
    //yield 'vermelho'
    //yield 'verde'
    //yield 'azul'

    //const nome=yield 'qual seu nome ?'
    //const esporte=yield 'qual seu esporte favorito ?'
    //return 'seu nome é ' + nome + ', seu esporte favorito é ' + esporte

    let i=0
    while(true){
        yield i++
        if(i>5)
            break
    }

}

//const itc=cores()
//console.log(itc.next().value)
//console.log(itc.next().value)
//console.log(itc.next().value)
//console.log(itc.next().value)

//const itp=perguntas()
//console.log(itp.next().value)
//console.log(itp.next('bruno').value)
//console.log(itp.next('natação').value)

const itc=contador()
for (c of itc){//for(let i=0; i>10; i++){
    console.log(c)//console.log(itc.next().value)
}
