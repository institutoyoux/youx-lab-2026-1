function aluno(nome,nota){
    this.nome=nome
    this.nota=nota

    this.dados_anonimos=function(){
        setTimeout(function(){
            //this.nome="x"
            //this.nota=5
            console.log(this.nome)
            console.log(this.nota)
        },2000)
    }
    
    this.dados_arrow=function(){
        setTimeout(()=>{
            console.log(this.nome)
            console.log(this.nota)
        },2000)
    }
}
const al1=new aluno("bruno",100)
al1.dados_anonimos()
al1.dados_arrow()

//this---> indica que a variavel recebe o parametro/valor q colocou