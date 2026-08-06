class Carro{
    canal="CFB Cursos"
    constructor(pnome,ptipo){
        this.nome=pnome
        if(ptipo == 1){
            thi(s.tipo="Esportivo")
            this.velmax=300
        }else if(ptipo == 2){
            this.tipo="Utillitario"
            this.velmax=100
        }else if(ptipo == 3){
            this.tipo="Passeio"
            this.velmax=160
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
    getVelmax(){
        return this.velmax
    }
    getInfo(){
        return(this.nome, this.tipo, this.velmax)
    }
    setNome(nome){
        this.nome=nome
    }
    set velMax(velmax){
        this.velMax=velmax

    }
    info(){
        console.log(`Nome : ${this.nome}`)
        console.log(`Tipo :  ${this.tipo}`)
        console.log(`Velmax : ${this.velmax}`)
        console.log("-----------")
    }
}

let c1=new Carro("rapidao",1)
let c2=new Carro("Super luxo",2)
let c3=new Carro("bombadao,4")
let c4=new Carro("Carrego tudo", 3)

// console.log(c1.nome)
// console.l
// og(c2.tipo)
// console.log(c3.velmax)

c1.setNome("Super veloz")
c1.velMax(500)

c1.info()
// c2.info()

// console.log(c1.getInfo())

