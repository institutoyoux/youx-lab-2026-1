class Animal{
    constructor(nome,especie){
        this.nome=nome
        this.especie=especie
    }
    qualquer(){
        console.log(`Nome: ${this.nome}`)
    }
    coisa(){
        console.log(`Espécie: ${this.especie}`)
    }
}

class Gato extends Animal{
    constructor(nome,especie,cor){
        super(nome,especie)
        this.cor=cor
    }
    getCor(){
        // console.log(`Nome: ${this.nome}`)
        // console.log(`Espécie: ${this.especie}`)
        console.log(`A cor do gato é ${this.cor}`);
    }
}

const animal1=new Animal('Zebra', 'Herbívoro')
const gato1=new Gato('Luiz','Cascavel','Preta')
// console.log(animal1.nome);
// console.log(animal1.especie);

// console.log(animal1.qualquer());

gato1.getCor()
gato1.coisa()

