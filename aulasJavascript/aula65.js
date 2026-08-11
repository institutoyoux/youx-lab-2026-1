const pessoa={
    nome:"Bruno",
    canal:"CFB Cursos",
    curso:"Javascript",
    aulas:{
        aula01:"Introdução",
        aula02:"Variaveis",
        aula03:"Condicional"
    }
}

// console.log(pessoa)
// console.log(pessoa.nome)
// console.log(pessoa.aulas.aula01)


const string_pessoa= `{"nome":"Bruno","canal":"CFB Cursos","curso":"Javascript","aulas":{"aula01":"Introdução","aula02":"Variaveis","aula03":"Condicional"}}`   

​

const s_json_pessoa=JSON.stringify(pessoa)      // converte objeto em string JSON
const o_json_pessoa=JSON.parse(string_pessoa)   //converte string JSON em objeto 


console.log(pessoa)
console.log(s_json_pessoa);
console.log(o_json_pessoa)