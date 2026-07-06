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

function rank(experiencia) {
    if (experiencia < 5000)
        return 'Iniciante'
    else if (experiencia >= 5000 && experiencia < 15000)
        return 'Veterano'
    else if (experiencia >= 15000)
        return 'Lendário'
}

function relatorio(lista) {
    console.log('LISTA DE PERSONAGENS')
    lista.forEach(personagem => {
        console.log('Nome: ' + personagem.nome + ' - Classe: ' + personagem.classe + ' - Nível: ' + personagem.nivel + ' - Experiência: '
            + personagem.experiencia + ' - Rank: ' + rank(personagem.experiencia)
        )
    });
}

relatorio(personagens)

console.log('\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=')
console.log('            NOMES')
console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=')

const nomes = personagens.map((personagem) => personagem.nome)
for (v of nomes) {
    console.log('\nNome: ' + v)
}

const maior = (personagens) => {
    let atual = false
    for (personagem of personagens) {
        if (!atual) {
            atual = personagem
        } else if (personagem.nivel >= atual.nivel) {
            atual = personagem
        }
    } return atual
}
console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=')
console.log('\nO personagem com maior nível é ' + maior(personagens).nome + ' com o nível ' + maior(personagens).nivel)


function contarClasse() {
    let contagem = {}
    for (personagem of personagens) {
        if (contagem[personagem.classe]) {

            contagem[personagem.classe]++
        } else {
            contagem[personagem.classe] = 1
        }
    }
    return contagem
}

console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=')
console.log('\nQuantidade por Classe: ', contarClasse())


console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=')
let somaNiveis = 0
personagens.forEach(personagem => somaNiveis += personagem.nivel)
let media = (somaNiveis / personagens.length).toFixed(2)
console.log('\nMédia de Nível do Grupo: ' + media)

function adicionarPersonagem(nome, classe1, nivel1, experiencia1) {
    const novoP = { nome: nome, classe: classe1, nivel: nivel1, experiencia: experiencia1 }
    personagens.push(novoP)
}
adicionarPersonagem('Luiz', 'Mago', 999, 30000000)

console.log(personagens)

console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-==-')
console.log('     BUSCAR POR CLASSE')
console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-==-')

function buscarPorClasse(classe) {
    let definido = []
    for (personagem of personagens) {
        if (personagem.classe === classe) {
            definido.push(personagem)
        } else {
            null
        }
    }
    console.log(definido)
}
buscarPorClasse('Mago')

function ganharXP(nome, experiencia) {
    for (personagem of personagens) {
        if (personagem.nome === nome) {
            personagem.experiencia += experiencia
            console.log(personagem)

        }
    }
}
console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-==-')
console.log('     GANHAR EXPEROÊNCIA')
console.log('-=-=-=-=-=-=-=-=-=-=-=-=-=-==-')
ganharXP('Galadriel', 3000)