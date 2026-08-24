const pessoa={
    nome: "Bruno",
    canal: "CFB Cursos",
    curso: "Javascript",
    aulas:{
        aula01:"Introdução",
        aula02:"Variáveis",
        aula03:"Condicional"


    }
}

const string_pessoa='{"nome":"Bruno","canal":"CFB Cursos","curso":"Javascript","aulas":{"aula01":"Introdução","aula02":"Variáveis","aula03":"Condicional"}}'

const s_json_pessoa=JSON.stringify(pessoa) // CONVERTE OBJETO EM STRING JSON
const s_json_pessoa=JSON.parse(s_json_pessoa) // CONVERTE STRING JSON EM OBJETO

console.log(pessoa)
console.log(s_json_pessoa)
console.log(s_json_pessoa)