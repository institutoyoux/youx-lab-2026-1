 const pessoa={
    nome:"Bruno",
    canal:"CFB Cursos",
    curso:"Javascript",
    aulas:{
        aula01:"Introduçao",
        aula02:"Variavel",
        aula03:"Condicional"
    }
}

const string_pessoa='{"nome":"Bruno","canal":"CFB Cursos","curso":"Javascript","aulas":{"aula01":"Introduçao","aula02":"Variavel","aula03":"Condicional"}}'

const s_json_pessoa=JSON.stringify(pessoa) //converte objetos em string JSON
const o_json_pessoa=JSON.stringify(string_pessoa) //Converte String JSON em objetos

console.log(pessoa)
console.log(s_json_pessoa)
console.log(o_json_pessoa)