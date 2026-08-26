const Pessoa={
    nome,
    idade,
    getNome:function (){
        return this.nome
    },
    setNome:function (nome){
        this.nome=nome
    },
    getIdade:function (){
        return this.idade
    },
    setIdade:function (idade){
        this.nome=idade
    },
}

const p2=Pessoa
const p3=Pessoa

p2["nome"]="alele"
p3.nome="Leo"
Pessoa.setNome("papa")

console.log(Pessoa.nome)
console.log(p2.getNome())
console.log(p3.nome)