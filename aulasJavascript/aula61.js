const Pessoa={
    nome,
    idade,
    getNome:function(){
        return this.nome
    },
    getIdade:function(){
        return this.idade
    },
    setNome:function(nome){
        this.nome=nome   
    },    
    setIdade:function(idade){
        this.nome=idade   
    },    
}

const p2=pessoa
const p3=pessoa

p3.nome="cladisvarson"
p2["nome"]="bridgertrudismelda"
Pessoa.setnome("Patricscrerdison")

console.log(pessoa.nome)
console.log(p2.nome)
console.log(p3.nome)

