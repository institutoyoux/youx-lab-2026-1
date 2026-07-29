console.log("==↓===========================↓=")
console.log("==↓==-Y-=O-=U-=X-==L-=A-=B-===↓=")
console.log("==↓===========================↓=")

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
    { nome: "Arwen", classe: "Curandeira", nivel: 14, experiencia: 11000 },
    { nome: "João Marcelo", classe: "Mago", nivel: 16, experiencia: 15000}
];
function Rank(experiencia) {
    if (experiencia < 5000) {
        return "iniciante";
    }else if (experiencia < 15000) {
        return "veterano";
    }else{
        return "lendario"
    }
}
console.log("=↓==↓==P=E=R=O=N=A=G=E=N=S==↓===↓=")

for (let personagem of personagens) {
    console.log("Nome:" + personagem.nome);
    console.log("classe:" + personagem.classe)
    console.log("nivel:" + personagem.nivel);
    console.log("experiencia: " + personagem.experiencia)
    console.log("Rank:" + personagem.experiencia);
    console.log("==↓=========↓==========↓=========↓")
}
const nomes = personagens.map(function (personagem) {
    return personagem.nome;
});
console.log(nomes);

let maiorNivel = personagens[0];

for (let personagem of personagens) {

    if(personagem.nivel > maiorNivel.nivel){
        maiorNivel = personagem;
    }
}

console.log("Maior nivel:");
console.log(maiorNivel);
console.log("=====================================================================")

let classes = {};
for (let personagem of personagens) {

    if(classes[personagem.classe]){
        if(classes[personagem.classe]){
            classes[personagem.classe]++;
        }else{
            classes[personagem.classe] = 1;
        }
    }
}

console.log(classes)

let soma = 0;

for (let personagem of personagens) {
    soma += personagem.nivel;
}

let media = soma / personagens.length;

console.log("media dos niveis:" + media);