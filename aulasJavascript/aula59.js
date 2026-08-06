class Carro{
    canal="CFB Cursos"
    constructor(pnome,ptipo){
        this.nome=pnome
        this.idade=pidade


    }
    getNome(){
        return this.nome
    }
    getIdade(){
        return this.idade
    }
    setNome(nome){
        this.nome=nome
    }
    setIdade(idade){
        this.idade=idade
    }
    set velMax(velmax){
        this.velMax=velmax

    }
    info(){
        console.log(`Nome : ${this.nome}`)
        console.log(`Idade :  ${this.idade}`)
        
        console.log("-----------")
    }
}

let pessoas[]
const btn_add=document.querySelector("#btn_add")
const res=document.querySelector(".res")

btn_add.addEventListener("click",(evt)=>{

})
