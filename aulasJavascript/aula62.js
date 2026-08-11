class Carro{        // CLASSE PAI ou BASE
    constructor(nome,portas){
        this.nome=nome
        this.portas=portas
        this.ligado=false
        this.vel=0
        this.cor=undefined
    }
    ligar=function(){
        this.ligado=true
    }
    desligar=function(){
        trhis.ligado=false
    }   
    setCor=function(cor){
        this.cor=cor
    } 
}

class Militar extends Carro{        // classe filho
    constructor(Nome,portas, blindagem, municao){
        super(this.nome,portas)
        this.blindagem=blindagem
        this.municao=municacao
        this.setCor("Verde")
    }
    atirar=function(){
        if(this.municacao>0){
            this.municacao--
        }
    }
}

class Utilitario extends Carro{
        constructor(Nome,portas, lugares, municao){
        super(this.nome,portas) 
        this.lugares=lugares   
        }        
}

const c1=new Carro ("Normal", 4)
c1.ligar()
c1.setCor("Preto")

const c2=new Militar("Lutador", 1, 100, 50)
//c2.setCor("Azul")
c2.atirar()
c2.atirar()
c2.atirar()
c2.atirar()
c2.atirar()
c2.atirar()
c2.atirar()
c2.atirar()


console.log(`Nome: ${c1.nome}`)
console.log(`Portas: ${c1.portas}`)
console.log(`Ligado: ${(c1.ligado?"Sim":"Não")}`)
console.log(`Velocidade: ${c1.vel}`)
console.log(`Cor: ${c1.cor}`)
console.log(`Lugares: ${c1.lugares}`)

console.log("--------------------")

console.log(`Nome: ${c1.nome}`)
console.log(`Portas: ${c1.portas}`)
console.log(`Ligado: ${(c1.ligado?"Sim":"Não")}`)
console.log(`Velocidade: ${c1.vel}`)
console.log(`Blindagem: ${c1.blindagem}`)
console.log(`Munição: ${c1.municacao}`)

console.log(`Cor: ${c1.cor}`)

