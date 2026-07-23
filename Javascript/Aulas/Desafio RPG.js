console.log('   '.repeat(40));
console.log('                 Sistema de Aventuras de RPG ')
console.log('   '.repeat(40));

console.log('   '.repeat(40));
console.log("=== Lista Inicial De Personagens ===")
separadora()
const personagens = [
    {nome: "Aragorn", classe: "Guerreiro", nivel: 12, experiencia: 8500},
    {nome: "Gandalf", classe: "Mago", nivel: 20, experiencia: 20000},
    {nome: "Legolas", classe: "Arqueiro", nivel: 15, experiencia: 12000},
    {nome: "Gimli", classe: "Guerreiro", nivel: 13, experiencia: 9500},
    {nome: "Paim", classe: "Ladino", nivel: 8, experiencia: 3500},
    {nome: "Sam", classe: "Ladino", nivel: 8, experiencia: 3400},
    {nome: "Boromir", classe: "Guerreiro", nivel: 11, experiencia: 7000},
    {nome: "Saruman", classe: "Mago", nivel: 19, experiencia: 18500},
    {nome: "Elrond", classe: "Mago", nivel: 18, experiencia: 17000},
    {nome: "Galadriel", classe: "Maga", nivel: 21, experiencia: 22000},
    {nome: "Eowyn", classe: "Guerreira", nivel: 10, experiencia: 6000},
    {nome: "Faramir", classe: "Arqueiro", nivel: 12, experiencia: 8000},
    {nome: "Thranduil", classe: "Arqueiro", nivel: 17, experiencia: 15000},
    {nome: "Bildo", classe: "Ladino", nivel: 9, experiencia: 4500},
    {nome: "Arwen", classe: "Curandeira", nivel: 14, experiencia: 11000}
];

function separadora() {
    console.log('=+'.repeat(40));
}


// Comece dando os personagens
function relatorio(listaPersonagens) {
    for (personagem of personagens) {

        console.log(`                     Nome: ${personagem.nome} 
                     Classe: ${personagem.classe} 
                     Nível: ${personagem.nivel} 
                     Experiência: ${personagem.experiencia} `)

        separadora()
    }
}

relatorio(personagens)

function pegarListaDeNomes(){
    const listaNomes = []
    for (personagem of personagens) {

        listaNomes.push(personagem.nome)
    }

    return listaNomes
}



nomes = pegarListaDeNomes()

console.log("=== Lista Dos Nomes ===")

console.log(nomes)

separadora()


// Iniciante se experiência < 5000
// Veterano se experiência >= 5000 e < 15000
// Lendário se experiência >= 15000

console.log("=== Rank De Cada Aventureiro ===")


function rank(listaPersonagens) {

    for (personagem of listaPersonagens)

        if (personagem.experiencia < 5000) {

            console.log(`${personagem.nome}: Iniciante`)

        } else if (personagem.experiencia >= 5000 && personagem.experiencia < 15000) {

            console.log(`${personagem.nome}: Veterano`)

        } else {

            console.log(`${personagem.nome}: Lendário`)
        }
}

rank(personagens)

console.log('   '.repeat(40));

//Pegando o personaguem com o maior nivel
let maiorNivel = personagens[0];

for (personagem of personagens) {
    if (personagem.nivel > maiorNivel.nivel) {
        maiorNivel = personagem;
    }
}

separadora()

console.log("=== Personagem de Maior Nível ===");
console.log(`Nome: ${maiorNivel.nome}`);
console.log(`Classe: ${maiorNivel.classe}`);
console.log(`Nível: ${maiorNivel.nivel}`);
console.log(`Experiência: ${maiorNivel.experiencia}`);

separadora()

function contagemPorClasse(listaDePersonagens) {
    const contagem = {}
    for (personagem of listaDePersonagens) {
        if (personagem.classe in contagem) {

            contagem[personagem.classe] += 1;

        } else {

            contagem[personagem.classe] = 1;
        }
    }
    return contagem
}

//console.log(contagemPorClasse(personagens))

console.log("=== Contagem De Classe ===")
// *** como pegar a chave e o valor de um Object no JS ***
const teste1 = contagemPorClasse(personagens)
for (key in teste1){
    console.log(key + ': ' + teste1[key])
}

separadora()

let soma = 0
let quantidade = 0
for (personagem of personagens) {

    soma = soma + personagem.nivel

    quantidade = quantidade + 1
}

media = soma / quantidade
console.log(media)
quantidade = 0

separadora()

function addPersonagem(){
    const adicionado = {}


}