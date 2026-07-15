function personagem(nome,nivel){
    this.nome=nome
    this.nivel=nivel

    this.dados_arrow=function(){
        setTimeout(()=>{
            console.log(this.nome)
            console.log(this.nivel)
        },500)
    }
}

const perso1=new personagem("Léo",50)
perso1.dados_arrow()
