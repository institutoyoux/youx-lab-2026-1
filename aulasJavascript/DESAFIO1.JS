

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

// rank dos personagens
function rankPersonagem(personagem) {
    let experiencia = personagem.experiencia
    if (experiencia < 5000) {
        return "inciante"
    } else if (experiencia >= 5000 && experiencia < 15000) {
        return "veterano"
    } else {
        return "lendario"
    }
}

//relatorio completo dos personagens
function relatorio() {
    for (p in personagens) {
        console.log("*******")
        console.log("O rank do personagem é: " + rankPersonagem(personagens[p]))
        console.log("Nome: " + personagens[p].nome)
        console.log("classe: " + personagens[p].classe)
        console.log("nivel: " + personagens[p].nivel)
        console.log("experiencia: " + personagens[p].experiencia)

    }
}
relatorio()



        // nome dos personagens 
const apenasNome = personagens.map(personagem => personagem.nome)
console.log("*****")
console.log("os nomes dos personagens são: " + apenasNome)




        // personagem com o maior nivel 
function Altonivel() {
    let nivelAlto = personagens[0]
    for (let i = 0; i < personagens.length; i++) {
        if (personagens[i].nivel > nivelAlto.nivel) {
            nivelAlto = personagens[i]
        }
    }
    return nivelAlto
}
console.log("o personagem com o nivel mais alto é o:", Altonivel())




    // contar classe
function contar(classe){
    let contador= 0 
    for (let i = 0; i < personagens.length; i++) {
        if (personagens[i].classe === classe){
            contador++ 
        }
    }
    return contador
}
console.log(contar("Mago")) 
console.log(contar("Guerreiro")) 
console.log(contar("Ladino")) 
console.log(contar("Curandeira")) 
console.log(contar("Maga")) 





        // soma media dos niveis
function somaNiveis(){
    let total = 0 
    for (let i=0; i< personagens.length; i++){
    total += personagens[i].nivel 
    } 
    let media = total / personagens.length
    return media
}    
console.log("a soma media dos niveis é " + somaNiveis())