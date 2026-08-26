class Carro{
    constructor(nome,portas) {
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
        this.ligado=false
    }
    setCor=function(cor){
        this.cor=cor
    }
}

class Militar extends Carro{
    constructor(nome,portas,blindagem,municao){
        super(nome,portas)
        this.blindagem=blindagem
        this.municao=municao
        this.setCor("Verde")
    }
    atirar=function (){
        if(this.municao>0){
            this.municao--
        }
    }
}

const c1=new Carro("Normal",4)
c1.ligar()
c1.setCor("Preto")

const c2=new Militar("Lutador",1,100,50)
c2.atirar()
c2.atirar()
c2.atirar()
c2.atirar()


console.log(`Nome: ${c1.nome}`)
console.log(`Portas: ${c1.portas}`)
console.log(`ligado: ${(c1.ligado?"Sim":"Não")}`)
console.log(`velocidade: ${c1.vel}`)
console.log(`cor: ${c1.cor}`)
console.log(`--------------------------------------`)

console.log(`Nome: ${c2.nome}`)
console.log(`Portas: ${c2.portas}`)
console.log(`ligado: ${(c2.ligado?"Sim":"Não")}`)
console.log(`velocidade: ${c2.vel}`)
console.log(`Blindagem ${c2.blindagem}`)
console.log(`Munição ${c2.municao}`)
console.log(`cor: ${c2.cor}`)
console.log(`--------------------------------------`)

