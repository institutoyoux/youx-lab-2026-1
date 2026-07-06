const personagens = [ { nome: "Aragorn", classe: "Guerreiro", nivel: 12,
experiencia: 8500 }, { nome: "Gandalf", classe: "Mago", nivel: 20, experiencia:
20000 }, { nome: "Legolas", classe: "Arqueiro", nivel: 15, experiencia: 12000 }, {
nome: "Gimli", classe: "Guerreiro", nivel: 13, experiencia: 9500 }, { nome: "Frodo",
classe: "Ladino", nivel: 8, experiencia: 3500 }, { nome: "Sam", classe: "Ladino",
nivel: 8, experiencia: 3400 }, { nome: "Boromir", classe: "Guerreiro", nivel: 11,
experiencia: 7000 }, { nome: "Saruman", classe: "Mago", nivel: 19, experiencia:
18500 }, { nome: "Elrond", classe: "Mago", nivel: 18, experiencia: 17000 }, { nome:
"Galadriel", classe: "Maga", nivel: 21, experiencia: 22000 }, { nome: "Eowyn",
classe: "Guerreira", nivel: 10, experiencia: 6000 }, { nome: "Faramir", classe:
"Arqueiro", nivel: 12, experiencia: 8000 }, { nome: "Thranduil", classe: "Arqueiro",
nivel: 17, experiencia: 15000 }, { nome: "Bilbo", classe: "Ladino", nivel: 9,
experiencia: 4500 }, { nome: "Arwen", classe: "Curandeira", nivel: 14, experiencia:
11000 } ];



function experiencia(exp) {
    if (exp < 5000) {
        return 'Iniciante'
    } else if (exp < 15000) {
        return 'Veterano'
    } else if (exp >= 15000) {
        return 'Lendario'
    }
}
const relatorio = (personagem) => {
    const rank = experiencia(personagem.experiencia)
    console.log(
`
Nome: ${personagem.nome}
Tipo: ${personagem.classe}
Nivel: ${personagem.nivel}
Experiencia: ${rank}
`
    )
}
const nomes = personagens.map((personagem) => personagem.nome)
const maiorNivel = (personagens) => {
    let maior = false
    personagens.forEach((personagem) => {
        !maior ? maior = personagem : personagem.nivel >= maior.nivel ? maior = personagem : null
    })
    return maior
}


let classes = [];
const buscarClasse = (clas) => {
    for (cl of classes) {
        if (cl === clas) {
            return true
        }
    }
    return false
}
personagens.forEach((personagem) => !buscarClasse(personagem.classe) ? classes[classes.length]=personagem.classe : null);
for (classe of classes) {
    const filtro = personagens.filter((personagem) => personagem.classe === classe)
    console.log(`A classe ${classe} tem ${filtro.length} personagens`)
}
let niveis = 0;

personagens.forEach((personagem) => {
    niveis += personagem.nivel
})

const adicionarPersonagem = (nome, cl, ni, exp) => {
    const newp = {nome: nome, classe: cl, nivel: ni, experiencia: exp}
    personagens[personagens.length] = newp
}

const buscarPorClasse = (classe) => {
    const resp = []
    personagens.forEach((personagem) => personagem.classe === classe ? resp[resp.length] = personagem : null)
    return resp
}
const ganharExperiencia = (nome, quantidade) => {
    personagens.forEach((personagem) => {
        personagem.nome === nome ? personagem.experiencia += quantidade && console.log(personagem) : null;
    })
}   

ganharExperiencia('Bilbo', 150)