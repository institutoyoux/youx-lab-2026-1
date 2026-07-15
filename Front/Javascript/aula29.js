function aluno(nome,nota){
    this.nome=nome
    this.nota=nota

    this.dados_amonimo=function(){
        setTimeout(function(){
            this.nome="x"
            this.nota="5"
            
        })
    }













}