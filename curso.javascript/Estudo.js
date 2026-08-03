/* VARIAVEIS

     const 
     let
     var (NAO e recomendado USAR)
*/


// EXEMPLO de CONST

// const ana = "oi ana"
// const numero = 30

// console.log(ana)
// console.log(numero)



// // EXEMPLO de LET

// let abacate = "oi ana"

// abacate = 30 

// console.log(abacate)


// let n=10

// n++//(aumenta 1)

// console.log(n)


//Eu posso mudar a variavel no let.


// let n1=10
// let n2=20

// console.log(n1+n2)


// APRENDENDO SOBRE OPERADOR TERNARIO 
// EXEMPLO:

// let num=10

// res=(num%2 ? "PAR" : "IMPAR")

// console.log(res)




// AULA 11 - OPERADOR TYPEOF, RETORNANDO O TIPO DA VARIAVEL

// let v1=10
// let v2="10"
// let v3=v1===v2
// let v4={nome:"Bruno"}

// console.log("Valor: " + v1 + " - Tipo: " + typeof(v1))
// console.log("Valor: " + v2 + " - Tipo: " + typeof(v2))
// console.log("Valor: " + v3 + " - Tipo: " + typeof(v3))
// console.log("Valor: " + v4 + " - Tipo: " + typeof(v4))


// AULA 12 - OPERADOR SPREAD, APRENDENDO SOBRE O ESPALHADOR 

// let n1=[10,20,30]
// let n2=[11,22,33,44,55]
// let n3=[...n1] //-> OPERADOR SPREAD

// console.log("n1: " + n1)
// console.log("n2: " + n2)
// console.log("n3: " + n3)


//OUTRA FORMA:

// let n1=[10,20,30]
// let n2=[11,22,33,44,55]
// let n3=[...n1,...n2] // -> imprimir todos os valores 

// // console.log("n1: " + n1)
// // console.log("n2: " + n2)
// console.log("n3: " + n3)


// const jogador1={nome: "Bruno",energia:100,vidas:3,magia:150}
// const jogador2={nome: "Bruce",energia:100,vidas:5,velocidade:80}
// const jogador3={...jogador1,...jogador2}

// console.log(jogador3)

 

//EXEMPLO 

// const soma=(v1,v2,v3)=>{
//       return v1+v2+v3
// }

// let valores=[1,5,4]

// console.log(soma(...valores)) 	



// AULA 13 - COMANDO CONSDICIONAL IF E IF ELSE 


//EXEMPLO:

// let num=100

// if(num > 10){
//        console.log("Numeral maior que 10")
//        if(num > 50){
//               console.log("Numeral maior que 50")
//        }
// }else if(num > 5){
//        console.log("Numeral esta entre 6 e 10")
// }else{
//        console.log("Numeral menor ou igual a 5")
// }
// console.log("Fim do programa")




//EXEMPLO:
//  let energia=100
//  let clima="sol"
 
//  if(energia > 70 && clima=="sol"){
//          console.log("vou a praia")
// }else{
//       console.log("vou ao cinema")
// }
// console.log("Fim do programa")

//EXEMPLO:
// let energia=100
//  let clima="chovendo"
 
//  if(energia > 70 && clima=="sol"){
//          console.log("vou a praia")
// }else{
//       console.log("vou ao cinema")
// }
// console.log("Fim do programa")




// AULA 14 - COMANDO SWITCH CASE 

// EXEMPLO:
// let colocaçao=1                                                             

// switch(colocaçao){
//     case 1:
//         console.log("Primeiro Lugar")
//             break 
//     case 2:
//         console.log("Segundo Lugar")
//             break  
//     case 3:
//         console.log("Terceiro Lugar")
//             break 
//     case 4:  case 5:  case 6:
//         console.log("Premio de participaçao")
//             break 
//     default: 
//         console.log("Nao subiu ao podio")
//         break
// }


// AULA 15 - LOOP FOR 

// O loop for em JavaScript é uma estrutura de controle de repetição que executa um bloco de código repetidas vezes 
// até que uma condição específica seja falsa. Ele é ideal quando você 
// sabe exatamente quantas vezes deseja repetir uma ação.

// EXEMPLO
// for(let i=0; i < 10; i++){
//     console.log("CFB CURSOS")
// }

// console.log("Fim do programa")


// AULA 16 - LOOPS FOR E FOR OF
// O loop for tradicional usa contadores numéricos para controlar o número de repetições. O loop
// for...of simplifica a leitura ao extrair diretamente os valores de coleções, como arrays e strings.


//EXEMPLO
//FOR IN
// let num=[10,20,30,40,50]

// for(n in num){
//     console.log(num[n])
// }

// for(let i=0;i<num.length;i++){
//     console.log(num[i])
// }



//EXEMPLO
//FOR OF
// for(n of num){
//     console.log(num[n])
// }

// for(let i=0;i<num.length;i++){
//     console.log(num[i])
// }



// //AULA 17 - LOOP WHILE


//EXEMPLO
// let n=0

// while(n<10){
//     console.log(n)
//     n++
// }



//EXEMPLO
// let n=5
// let fat=1

// while(n>=1){
//     fat*=n
//     n--
// }
// console.log(fat)




// AULA 18 - WHILE E DO WHILE

// EXEMPLO DE WHILE
// while(expressao){
//     blocos de comando 
// }


// EXEMPLO DO WHILE
// do{
//     bloco de coamandos
// }while(expressao)

// let n=10
// do{
//     console.log("CFB CRURSOS")
//     n++
// }while(n<10)
// console.log("fim do programa")



//  AULA 19 - ENTENDA AS DECLARAÇOES BREAK E CONTINUE

//COM BREAK 
// let n=0 
// let max=1000

// while(n<max){
//     console.log("CFB Cursos - " + n)
//     if(n>10){
//         break
//     }
//     n++
// }
// console.log('Fim do programa')



//COM CONTINUE
// let n=0 
// let max=1000
// let pares=0

// for(let i=n;i<max;i++){
//     if(i%2==0){
//         continue
//     }
//     pares++
// }
// console.log("Quantidade de pares: " + pares)
// console.log("Fim do programa")


//AULA 20 - APRENDENDO SOBRE FUNÇOES 

//EXEMPLO
// function nome(//DECLARAÇAO DA FUNÇAO){
//     console.log("CFB Cursos")
// }
// nome()//-> CHAMADA DA FUNÇAO 

//EXEMPLO
// function soma2_10(){
//     let n1=2
//     let n2=10
//     let soma=n1+n2
//     console.log(soma)
// }
// for(let i=0;i<1;i++){
//     soma2_10()
// }


//AULA 21 - FUNÇAO COM RETORNO 
// function canal(){
//     let n1=10
//     let n2=2 
//     let res=n1*n2
//     return res
// }

// let num=canal()

// console.log(num)


//AULA 22 - FUNÇÕES PARAMETRIZADAS 

//EXEMPLO

// function soma(p1){
//       console.log(p1)
// }
// soma("ANA VALÉRIO")
// soma(2008)
// soma("CRUZEIRO É O MAIOR")



//EXEMPLO
// const VALOR_PADRAO=0

// let valor=0

// console.log(valor)

// function add(v){
//     return valor+v

// }
// valor=add(10)

// console.log(valor)



//EXEMPLO 
// function soma(n1=VALOR_PADRAO,n2=VALOR_PADRAO){
//     let res
//     res=n1+n2
//     return res

// }

// let resultado_soma=soma(5)
// console.log(resultado_soma)


//EXEMPLO
// const VALOR_PADRAO=0

// function add(v){
//     valor+=v
// }

// let valor=0
// console.log(valor)

// add(10)
// console.log(valor)

// add(5)
// console.log(valor)



// AULA 23 - PARAMETROS REST EM FUNÇÕES:

//percorrer vetores
// function soma(...valores){
//     let tam=valores.length
//     let res=0 
//     for(let i=0;i<tam;i++){
//         res+=valores[i]
//     }
//     return res
// }

// console.log(soma(10,5,2))


//FAZER COM FOR OF
// function soma(...valores){//-> parametros usando rest
//     let res=0
//     for(let v of valores){
//         res+=v
//     }
//     return res
// }
// console.log(soma(10,5,2,5))


// AULA 24 - FUNÇOES ANONIMAS 

// const f=function(...valores){
//     let res=0
//     for(v of valores){
//         res+=v
//     } 
//     return res
// }

// console.log(f(10,5))


//TODAS AS VEZES QUE FALAR DE CLASSE USAR NEW

// const f=new Function("v1","v2","return v1+v2")//Funçao Construtor Anonima

// console.log(f(10,5))




//AULA 25 ARROW FUNCTION

//const soma=function(v1,v2){return v1+v2} -> nao é arrow function

//ARROW FUNCTION
// const soma=(v1,v2)=>{return v1+v2}

// const nome=n=>{return n}

// console.log(soma(10,5))

// console.log(nome("Bruno"))



//AULA 26 - FUNÇAO DENTRO DE FUNÇAO

//Funçao dentro de funçoes.
/*
const soma=(...valores)=>{
     const somar=val=>{
        let res=0
        for(v of val)
            res+=v
        return res
     }
    return somar(valores)
}

console.log(soma(10,5,15))
*/



// const somar=val=>{
//     let res=0
//     for(v of val)
//         res+=v
//     return res
// }
// const soma=(...valores)=>{
//     return somar(valores)
// }

// console.log(soma(10,5,15))
// valor=[10,5,15]
// console.log(soma(...valor))





//AULA 27 - FUNÇAO GERADORAS 

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





//AULA 28 - APRENDENDO SOBRE O METODO MAP


// MAP vai interar toda a coleçao.
//map se usa pra percorrer valores


/*
const cursos=['HTML, CSS', 'Javascript', 'PHP', 'React']
cursos.map((el,i)=>{
    console.log("Curso:" + el + " - Posiçao do curso:" + i)
})
*/

/*
const cursos=['HTML','CSS','Javascript','PHP','React']
let c=cursos.map((el,i)=>{
    return "<div>"+el+"</div>"
})

console.log(c)
*/


// let elemento=document.getElementsByTagName('div')
// elemento=[...elemento]
// elemento.map((e, i)=>{
//     console.log(e.innerHTML)
// })



//const cursos=['HTML','CSS','Javascript','PHP','React']
//let c=cursos.map((el,i)=>{
//    return el
//})
//console.log(c)


// let elemento=document.getElementsByTagName("div")
// elemento=[...elemento]
// console.log(elemento)
// elemento.map((e,i)=>{
//     e.innerHTML="CFB Cursos"
// })


// const elemento=document.getElementsByTagName("div")
// const valores=Array.prototype.map.call(el,({innerHTML})=>innerHTML)
// console.log(valores)

const converterInt=(elemento)=>parseInt(elemento)
const dobrar=(elemento)=>elemento*2
let num=['1','2','3','4','5'].map(dobrar)
console.log(num)

