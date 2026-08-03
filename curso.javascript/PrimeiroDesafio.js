const personagens = [
    { nome: "Aragorn", classe: "Guerreiro", nivel: 12, experiencia: 8500 },
    { nome: "Gandalf", classe: "Mago", nivel: 20, experiencia: 20000 },
    { nome: "Legolas", classe: "Arqueiro", nivel: 15, experiencia: 12000 },
    { nome: "Gimli", classe: "Guerreiro", nivel: 13, experiencia: 9500 },
    { nome: "Frodo", classe: "Ladino", nivel: 8, experiencia: 3500 },
    { nome: "Sam", classe: "Ladino", nivel: 8, experiencia: 3400 },
    { nome: "Boromir", classe: "Guerreiro", nivel: 11, experiencia: 7000 },
    { nome: "Saruman", classe: "Mago", nivel: 19, experiencia: 18500 },
    { nome: "Elrond", classe: "Mago", nivel: 18, experiencia: 17000 },
    { nome: "Galadriel", classe: "Maga", nivel: 21, experiencia: 22000 },
    { nome: "Eowyn", classe: "Guerreira", nivel: 10, experiencia: 6000 },
    { nome: "Faramir", classe: "Arqueiro", nivel: 12, experiencia: 8000 },
    { nome: "Thranduil", classe: "Arqueiro", nivel: 17, experiencia: 15000 },
    { nome: "Bilbo", classe: "Ladino", nivel: 9, experiencia: 4500 },
    { nome: "Arwen", classe: "Curandeira", nivel: 14, experiencia: 11000 }
];

const lista1 = [1,2,3,4,5,6,6]

contagem = {
    "Guerreiro": 2,
    "Mago": 1,
    "Arqueiro": 1
}
// 1. Criar uma função que determine o rank de um personagem: Iniciante se experiência < 5000
// Veterano se experiência >= 5000 e < 15000 Lendário se experiência >= 15000

function rankPersonagens(personagem) {
    if (personagem.experiencia < 5000) {
        return "Iniciante"
    } else if (personagem.experiencia < 15000) {
        return "Veterano"
    } else {
        return "Lendário"
    }

}

for (p of personagens) {
    let rank = rankPersonagens(p)
    console.log(rank)
}


// // // // 2. Exibir um relatório completo de todos os personagens. 
function relatorio(listaPersonagens) {
    for (p of personagens) {
        console.log("Nome: " + p.nome)
        console.log("Classe: " + p.classe)
        console.log("Nivel: " + p.nivel)
        console.log("Experiencia: " + p.experiencia)
        console.log("RankPersonagem: " + rankPersonagens(p))
    }

}

relatorio(personagens)


// //  3. Utilizar map() para criar uma lista contendo apenas os nomes dos personagens.

relatorio(personagens)

function pegarListaNomes(listaPersonagens){
    const nomes=listaPersonagens.map(personagem => personagem.nome)
}

listaPersonagens = pegarListaNomes(personagens)
console.log(listaPersonagens)



// 4. Encontrar o personagem com maior nível.

let maiorNivel = personagens[0].nivel
let nomeMaiorNivel = personagens[0].nome
for (personagem of personagens) {
    if (personagem.nivel > maiorNivel) {
        maiorNivel = personagem.nivel
        nomeMaiorNivel = personagem.nome
    }
}
console.log(`O maior nível é de ${nomeMaiorNivel}: ${maiorNivel}xp`);


//for numero fixo 
// exemplo de length: const a = [1,2,8].length


//  5. Contar quantos personagens existem em cada classe.
function contagemDeClasses(lista){
    const contagem = {}
    for (p of lista){
        if (p.classe in contagem){
            contagem[p.classe]++
        }
        else {
            contagem[p.classe] = 1
        }
    }
    return contagem
}

const contagemPersonagensClasse = contagemDeClasses(personagens)
console.log(contagemPersonagensClasse)


// 6. Calcular a média dos níveis do grupo.
function media(lista) {
    let soma = 0
    let quantidade = 0
    for (personagem of lista) {
        soma = soma + personagem.nivel
        quantidade++
    }
    media = soma / quantidade
    return media
}

const mediaNiveis = media(personagens)
console.log(`A media dos niveis é ${mediaNiveis}`);


// //  Bônus 1 : Implementar uma função, adicionar Personagem(nome, classe, nivel, experiencia).
// // chamar afunçao para oq ela vai recebr

function adicionarPersonagem(nome, classe, nivel, experiencia) {
    const NovoPersonagem = { nome: nome, classe: classe, nivel: nivel, experiencia: experiencia }
    personagens.push(NovoPersonagem)
}
adicionarPersonagem("Joao", "Trabalhador", 2 , 13000)
adicionarPersonagem("Ana" , "estudante" , 2 , 13000)

console.log(personagens)


// Bônus 2: Criar uma função buscar PorClasse(classe). 
// criar uma funçao 
// receber um parametro nome da classe
// dentro da funçao console.log
// chamar a funçao 

// pegar todos os personagens
// de alguma forma pegar o parametro e utilizalo e utilizar para fazer o filtro 
// o meu filtro tem que retornar so os personagens(console.log).


function ClasseSeparadas(mago,guerreiro,Arqueiro,Ladino,Curandeira){
    const PorClasse = {classe: mago, classe: guerreiro, classe:Arqueiro, classe:Ladino, classe: Curandeira}
    personagens.push(PorClasse)
console.log(PorClasse)
}
console.log(personagens)
ClasseSeparadas("mago", "guerreiro", "Arqueiro","Ladino","Curandeira")



// Bônus 3: Criar uma função ganharExperiencia(nome, quantidade) que atualize a experiência de um personagem e exiba seu novo rank.

