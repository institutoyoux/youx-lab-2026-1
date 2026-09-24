const Pessoas={
    nome,
    idade,
    getNome:function(){
        return this.nome
    },
    getIdade:function(){
        return this.idade
    },
    setNome:function(nome){
        return this.nome
    },
    setIdade:function(idade){
        return this.idade
    }
}

const p2=Pessoas
const p3=Pessoas

p3.nome="Mau-Mau"
p2["nome"]="Brigite"
Pessoas.setNome("Pilar")

const addPessoa=()=>{
    res.innerHTML=""
    pessoas.map((p)=>{
        const div=document.createElement("div")
        div.setAttribute("class","pessoas")
        div.innerHTML=`Nome:${p.getNome()}<br/>Idade:${p.getIdade()}`
        res.appendChild(div)
    })
}


console.log(Pessoas.nome)
console.log(p2.getNome)
console.log(p3.nome)