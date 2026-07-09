// Você está criando um sistema para controlar personagens de um jogo de RPG. Dados iniciais:
const personagens = [{
    nome: "Aragorn", classe: "Guerreiro", nivel: 12,
    experiencia: 8500
}, {
    nome: "Gandalf", classe: "Mago", nivel: 20, experiencia:
        20000
}, { nome: "Legolas", classe: "Arqueiro", nivel: 15, experiencia: 12000 }, {
    nome: "Gimli", classe: "Guerreiro", nivel: 13, experiencia: 9500
}, {
    nome: "Frodo",
    classe: "Ladino", nivel: 8, experiencia: 3500
}, {
    nome: "Sam", classe: "Ladino",
    nivel: 8, experiencia: 3400
}, {
    nome: "Boromir", classe: "Guerreiro", nivel: 11,
    experiencia: 7000
}, {
    nome: "Saruman", classe: "Mago", nivel: 19, experiencia:
        18500
}, { nome: "Elrond", classe: "Mago", nivel: 18, experiencia: 17000 }, {
    nome:
        "Galadriel", classe: "Maga", nivel: 21, experiencia: 22000
}, {
    nome: "Eowyn",
    classe: "Guerreira", nivel: 10, experiencia: 6000
}, {
    nome: "Faramir", classe:
        "Arqueiro", nivel: 12, experiencia: 8000
}, {
    nome: "Thranduil", classe: "Arqueiro",
    nivel: 17, experiencia: 15000
}, {
    nome: "Bilbo", classe: "Ladino", nivel: 9,
    experiencia: 4500
}, {
    nome: "Arwen", classe: "Curandeira", nivel: 14, experiencia:
        11000
}];
/* Requisitos
1. Criar uma função que determine o rank de um personagem: Iniciante se experiência < 5000
Veterano se experiência >= 5000 e < 15000 Lendário se experiência >= 15000 ok

2. Exibir um relatório completo de todos os personagens. ok

3. Utilizar map() para criar uma lista contendo apenas os nomes dos personagens. ok

4. Encontrar o personagem com maior nível. ok

5. Contar quantos personagens existem em cada classe. 

6. Calcular a média dos níveis do grupo. ok

Bônus 1: Implementar uma função adicionarPersonagem(nome, classe, nivel, experiencia). 
Bônus 2: Criar uma função buscarPorClasse(classe). 
Bônus 3: Criar uma função ganharExperiencia(nome, quantidade) que atualize a experiência de um
personagem e exiba seu   */

function rankin(listaPersonagens) {
    for (p of listaPersonagens) {
        if (p.experiencia < 5000) {
            console.log("Nome: " + p.nome + " // Nível de experiência: Iniciante")
        } else if (p.experiencia >= 5000 && p.experiencia < 15000) {
            console.log("Nome: " + p.nome + " // Nível de experiência: Veterano")
        } else {
            console.log("Nome: " + p.nome + " // Nível de experiência: Lendário")
        }
    }
}

const ranking = rankin(personagens)
console.log(ranking)

for (dados of personagens) {
    console.log('Nome: ' + dados.nome + ' Classe: ' + dados.classe + ' Nivel: ' + dados.nivel + ' Experiencia: ' + dados.experiencia)
}

let listaNomes = personagens.map((dados) => {
    return dados.nome
})
console.log(listaNomes);



let maiorNivel = personagens[0].nivel
let nomeMaiorNivel = personagens[0].nome
for (let i = 1; i < personagens.length; i++){
    if (personagens[i].nivel > maiorNivel){
        nomeMaiorNivel = personagens[i].nome
        maiorNivel = personagens[i].nivel
    }
}
console.log("O personagem de maior nível é " + nomeMaiorNivel + " com nível igual a " + maiorNivel);

const contagemClasses = {}
for ( let i = 0; i < personagens.length; i++){
    const classe = personagens[i].classe
    contagemClasses[classe]=(contagemClasses[classe] || 0) + 1
}
console.log("A contagem de classes é: ");
for (classe in contagemClasses){
    console.log(`${classe}: ${contagemClasses[classe]}`);
}


let valor = 0
let quantidade = 0
for(personagem of personagens){
    valor += personagem.nivel
    quantidade++
}
let media = valor / quantidade
console.log('A media dos niveis dos personagens é: ');
console.log(media) 