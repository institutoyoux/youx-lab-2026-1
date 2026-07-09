// Lista inicial de personagens
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


//=======================================================
// 1. FUNÇÃO PARA DETERMINAR O RANK DO PERSONAGEM
//=======================================================

// Recebe a experiência do personagem e retorna seu rank.
function determinarRank(experiencia) {

    // Se tiver menos de 5000 de experiência
    if (experiencia < 5000) {
        return "Iniciante";

        // Se tiver entre 5000 e 14999
    } else if (experiencia < 15000) {
        return "Veterano";

        // Se tiver 15000 ou mais
    } else {
        return "Lendário";
    }
}


//=======================================================
// 2. RELATÓRIO COMPLETO DOS PERSONAGENS
//=======================================================

console.log("===== RELATÓRIO DOS PERSONAGENS =====");

// forEach percorre cada elemento do vetor.
personagens.forEach(personagem => {

    console.log(`
Nome: ${personagem.nome}
Classe: ${personagem.classe}
Nível: ${personagem.nivel}
Experiência: ${personagem.experiencia}
Rank: ${determinarRank(personagem.experiencia)}
-------------------------------------
`);
});


//=======================================================
// 3. MAP() - CRIAR UMA LISTA APENAS COM OS NOMES
//=======================================================

// map() cria um novo vetor.
// Nesse caso ele pega somente o nome de cada personagem.

const nomes = personagens.map(personagem => personagem.nome);

console.log("Lista de nomes:");
console.log(nomes);


//=======================================================
// 4. ENCONTRAR O PERSONAGEM COM MAIOR NÍVEL
//=======================================================

// reduce() percorre todo o vetor comparando os níveis.
// Se encontrar um nível maior, ele passa a ser o maior.

const maiorNivel = personagens.reduce((maior, atual) => {

    return atual.nivel > maior.nivel ? atual : maior;

});

console.log("Personagem com maior nível:");
console.log(maiorNivel);


//=======================================================
// 5. CONTAR QUANTOS PERSONAGENS EXISTEM EM CADA CLASSE
//=======================================================

// reduce() também pode ser usado para contar informações.

const classes = personagens.reduce((contador, personagem) => {

    // Se a classe ainda não existir no objeto,
    // ela recebe 0 e depois soma 1.

    contador[personagem.classe] =
        (contador[personagem.classe] || 0) + 1;

    return contador;

}, {});

console.log("Quantidade por classe:");
console.log(classes);

/*
Resultado:

{
 Guerreiro: 3,
 Mago: 3,
 Arqueiro: 3,
 Ladino: 3,
 Maga: 1,
 Guerreira: 1,
 Curandeira: 1
}
*/


//=======================================================
// 6. CALCULAR A MÉDIA DOS NÍVEIS
//=======================================================

// Primeiro soma todos os níveis.

const somaNiveis = personagens.reduce((soma, personagem) => {

    return soma + personagem.nivel;

}, 0);

// Depois divide pela quantidade de personagens.

const media = somaNiveis / personagens.length;

console.log("Média dos níveis:");
console.log(media.toFixed(2));


//=======================================================
// BÔNUS 1 - ADICIONAR PERSONAGEM
//=======================================================

// push() adiciona um novo objeto ao final do vetor.

function adicionarPersonagem(nome, classe, nivel, experiencia) {

    personagens.push({
        nome,
        classe,
        nivel,
        experiencia
    });

    console.log(`${nome} foi adicionado com sucesso!`);
}

// Exemplo
adicionarPersonagem("Sauron", "Necromante", 30, 50000);


//=======================================================
// BÔNUS 2 - BUSCAR PERSONAGENS POR CLASSE
//=======================================================

// filter() retorna apenas os elementos que atendem
// à condição informada.

function buscarPorClasse(classe) {

    return personagens.filter(personagem => {

        return personagem.classe === classe;

    });

}

// Exemplo
console.log(buscarPorClasse("Mago"));


//=======================================================
// BÔNUS 3 - GANHAR EXPERIÊNCIA
//=======================================================

// find() procura um único personagem pelo nome.

function ganharExperiencia(nome, quantidade) {

    const personagem = personagens.find(p => p.nome === nome);

    // Caso não encontre o personagem.
    if (!personagem) {
        console.log("Personagem não encontrado.");
        return;
    }

    // Soma a experiência recebida.
    personagem.experiencia += quantidade;

    // Mostra o novo rank.
    console.log(`${personagem.nome} ganhou ${quantidade} de experiência.`);
    console.log(`Nova experiência: ${personagem.experiencia}`);
    console.log(`Novo Rank: ${determinarRank(personagem.experiencia)}`);
}

// Exemplo
ganharExperiencia("Frodo", 3000);