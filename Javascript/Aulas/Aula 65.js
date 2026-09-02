const pessoa={
    nome:"Leo",
    Canal:"leleo",
    curso:"cfb cursos",
    aulas:{
        aula01:"Introduçoes",
        aula02:"variaveis"
    }
}

const string_pessoa={"nome":"Leo","Canal":"leleo","curso":"cfb cursos","aulas":{"aula01":"Introduçoes","aula02":"variaveis"}}

const s_json_pessoa=JSON.stringify(pessoa)
const o_json_pessoa=JSON.parse(s_json_pessoa)

console.log(pessoa)
console.log(s_json_pessoa)
console.log(o_json_pessoa)