class Carro{
    constructor(pnome,ptipo) {
        this.nome=pnome
        if (ptipo==1){
            this.tipo="Esportivo"
            this.velmax=300
        }else if(ptipo==2){
            this.tipo="Utilitário"
            this.velmax=100
        }else if(ptipo==3){
            this.tipo="Passeio"
            this.velmax=120
        }else{
            this.tipo="Militar"
            this.velmax=180
        }
    }
    getNome(){
        return this.nome
    }
    getTipo(){
        return this.tipo
    }
    getVelMax(){
        return this.velmax
    }
    getInfo(){
        return [this.nome,this.tipo,this.velmax]
    }
    setNome(nome){
        this.nome=nome
    }
    setTipo(tipo){
        this.tipo=tipo
    }
    setVelMax(velmax){
        this.velmax=velmax
    }

    info(){
        console.log(`Nome.: ${this.nome}`)
        console.log(`Tipo.: ${this.tipo}`)
        console.log(`V.Max: ${this.velmax}`)
        console.log("-----------------------")
    }
}

let c1=new Carro("Golf GTI",2)
let c2=new Carro("Lambo Uracan",1)
let c3=new Carro("Tank De Guerra",4)
let c4=new Carro("MT-03",3)

// c1.info()

c1.setNome("Bugatti")
c1.setTipo("Esportivo")
c1.setVelMax(500)

c1.info()