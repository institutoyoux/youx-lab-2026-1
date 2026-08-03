//Aula 29 - Usando o operador THIS dentro de funçoes 

// function aluno(nome,nota){
//     this.nome=nome
//     this.nota=nota

//     console.log(nome)
//     console.log(nota)
// }

// aluno("Bruno",100)




//FUNÇAO ANONIMA TRADICIONAL 
// function aluno(nome,nota){
//     this.nome=nome
//     this.nota=nota

//     this.dados_anonimos=function(){
//         setTimeout(function(){  // -> setTimeout ele chama dnv
//             this.nome="x"
//             this.nota=5
//             console.log(this.nome)
//             console.log(this.nota)
//         },2000)
//     }
// }

// const al1=new aluno("Bruno, 100")
// al1.dados_anonimos()


//FUNÇAO COM ARROW FUNCTION
function aluno(nome,nota){
    this.nome=nome
    this.nota=nota

    this.dados_anonimo=function(){
        setTimeout(function(){
            console.log(this.nome)
            console.log(this.nota)
        },2000)
    }
    this.dados_arrow=function(){
        setTimeout(()=>{
            console.log(this.nome)
            console.log(this.nota)
        },2000)
    }
}

const al1=new aluno("Bruno,100")
al1.dados_anonimo()
al1.dados_arrow()