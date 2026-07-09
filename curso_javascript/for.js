// funcionários = [{ nome: 'Ana', idade: 21, salario: 3789 },
// { nome: 'Léo', idade: 12, salario: 914 },
// { nome: 'Luiz', idade: 75, salario: 2290 },
// { nome: 'João', idade: 22, salario: 2300 }
// ]

// function relatorio() {
//     for (dados in funcionários) {
//         console.log('Nome: ' + dados.nome + '  Idade: ' + dados.idade + '  Salário: ' + dados.salario)
//     }
// }
// relatorio()

const frutas=['Maçã', 'Banana', 'Laranja']

 for(i in frutas){
    console.log(i + ' - ' + frutas[i])
 }

 for(nome of frutas){
    console.log('Fruta: ' + nome)
 }
