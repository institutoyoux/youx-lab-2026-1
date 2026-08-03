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



// 1. Criar uma função que determine o rank de um personagem: Iniciante se experiência < 5000
// Veterano se experiência >= 5000 e < 15000 Lendário se experiência >= 15000 
function rankPersonagens(personagem) {
    if (personagem.experiencia < 5000)
        return "Iniciante"
    else if (personagem.experiencia <= 15000)
        return "Veterano"
    else {
        return "Lendario"
    }
}

for (p of personagens) {
    let rank = rankPersonagens(p)
    console.log(rank)
}


//2. Exibir um relatório completo de todos os personagens.

function relatorio(personagens) {
    for (p of personagens)
        console.log("nome:" + nome)
    console.log("experiencia:" + experiencia)
    console.log("classe:" + classe)
    console.log("nivel:" + nivel)
}

console.log(personagens)


// 3. Utilizar map() para criar uma lista contendo apenas os nomes dos personagens.

function nomesPersonagens() {

    const nomesPersonagensA = personagens.map((personagem) => {
        return personagem.nome
    })

    return nomesPersonagensA;
}

console.log(nomesPersonagens())

//===================


function classePersonagens() {

    const classePersonagensA = personagens.map((personagem) => {
        return personagem.classe
    })

    return classePersonagensA;
}

console.log(classePersonagens())

//==================

function NomeEclasse() {
    const NomeEclasse = personagens.map((personagem) => {
        return [personagem.classe, personagem.nome]
    })
    return NomeEclasse;
}
console.log(NomeEclasse())



// 4. Encontrar o personagem com maior nível. 
function nomeMaiorNivel(personagens) {
    let personagemMaiorNivel = personagens[0]
    for (personagem of personagens) {
        if (personagem.nivel > personagemMaiorNivel.nivel) {
            personagemMaiorNivel = personagem
        }
    }
    return personagemMaiorNivel
}
console.log(nomeMaiorNivel(personagens))


// 5. Contar quantos personagens existem em cada classe. 
function contagemDeClasses() {
    let contagem = {} //-> objeto vazio para depois descobrir
    for (personagem of personagens) {

        if (personagem.classe == "Mago") {
            if (contagem[personagem.classe] === undefined) {
                contagem[personagem.classe] = 1
            }
        } else if (contagem[personagem.classe]++)


        if (personagem.classe == "Ladino") {
            if (contagem[personagem.classe] === undefined) {
                contagem[personagem.classe] = 1
            }
        } else if (contagem[personagem.classe]++)


        if (personagem.classe == "Guerreiro") {
            if (contagem[personagem.classe] === undefined) {
                contagem[personagem.classe] = 1
            }
        } else if (contagem[personagem.classe]++)

        if (personagem.classe == "Arqueiro") {
            if (contagem[personagem.classe] === undefined) {
                contagem[personagem.classe] = 1
            }
        } else if (contagem[personagem.classe]++)
        

        if (personagem.classe == "Curandeira") {
            if (contagem[personagem.classe] === undefined) {
                contagem[personagem.classe] = 1
            }
        } else if (contagem[personagem.classe]++)

        if (personagem.classe == "Maga"){
            if (contagem[personagem.classe] === undefined){
                contagem[personagem.classe] = 1
            } 
        } else if (contagem[personagem.classe]++)
    
        return contagem
}
console.log(contagemDeClasses())








// 6. Calcular a média dos níveis do grupo.
function mediaNiveis(grupos) {
    let soma = 0
    let quantidade = 0
    for (personagem of grupos) { //-> percorre diretamente os valores dos elementos.
        soma = soma + personagem.nivel
        quantidade++ //++ incremento 
    }
    media = soma / quantidade
    return media
}
console.log(mediaNiveis(personagens))
