class CarroPadrao{
    constructor() {
        if(this.constructor===CarroPadrao){
            throw new TypeError("Está classe nao pode ser intánciada")
        }
        if(this.ligar===undefined){
            throw new TypeError("É obrigatório implementar o métado ligar")
        }
        if(this.desligar===undefined){
            throw new TypeError("É obrigatório implementar o métado desligar")
        }
        this.rodas=4
        this.portas=4
        this.ligado=false
    }
}

class Carro {
    constructor(tipo, estagioTurbo) {
        this.turbo = new Turbo(1)
        if (tipo == 1) {
            this.velMax = 120
            this.nome = "Normal"
        } else if (tipo == 2) {
            this.velMax = 180
            this.nome = "esportivo"
        } else if (tipo == 3) {
            this.velMax = 200
            this.nome = "formula 1"
        }
        this.velMax += this.turbo.pot
    }

    info() {
        console.log(this.nome)
        console.log(this.velMax)
        console.log(this.turbo)
        console.log(this.rodas)
        console.log(this.portas)
        console.log(this.ligado)
    }
    ligar() {
        this.ligado=true
    }
    desligar() {
        this.ligado=false
    }
}

class Turbo{
    constructor(e) {
        if(e==0) {
            this.pot=0
        }else if (e==1) {
            this.pot = 50
        }else if (e==2) {
            this.pot = 75
        }else if (e==3) {
            this.pot = 100
        }
    }
}

class CarroEspecial extends Carro{
    constructor(estagioTurbo) {
        super(4,estagioTurbo)
        this.tipoInfo=1
        this.velMax=300+this.turbo.pot
        this.nome="Carro especial"
    }
    info(){
        if (this.tipoInfo==1){
            super.info()
        }else{
            console.log(`Nome.: ${this.nome}`)
            console.log(`V.Max: ${this.velMax}`)
            console.log(`Turbo: ${this.turbo}`)
            console.log(`Rodas: ${this.rodas}`)
            console.log(`Portas:${this.portas}`)
            console.log(`Status:${this.ligado}`)
            console.log("--------------------")
        }
    }
}

const c1=new Carro(1,0)
const c2=new Carro(1,3)
const c3=new CarroEspecial(4)

c1.info()
c2.info()
c3.info()