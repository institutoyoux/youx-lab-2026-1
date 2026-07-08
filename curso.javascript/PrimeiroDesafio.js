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


// 1. Criar uma função que determine o rank de um personagem: Iniciante se experiência < 5000
// Veterano se experiência >= 5000 e < 15000 Lendário se experiência >= 15000


function Rankpersonagens(){
    for (p of personagens){
        if(p.experiencia > 5000){
            return("Iniciante se experiência ")
    
        }else if(p.experiencia >= 5000 && p.experiencia < 15000){
            return("Veterano se experiência")
    
        }else(p.experiencia >= 15000)
            return("Lendário se experiência")
    }
}







// const personagem=[nomes]
// personagem.map((el,i)=>{
//     console.log("Personagem:" + el + " - Experiencia + i")

// })
