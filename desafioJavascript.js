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
];


// 1. Criar uma função que determine o rank de um personagem: Iniciante se experiência < 5000
// Veterano se experiência >= 5000 e < 15000 Lendário se experiência >= 15000.
function rank(personagem) {
  let experiencia = personagem.experiencia;
  if (experiencia < 5000) {
    return "Iniciante";
  } else if (experiencia < 15000) {
    return "Veterano";
  } else {
    return "Lendário";
  }
}

console.log("*********************")
console.log()

// p0 = { nome: "Galadriel", classe: "Maga", nivel: 21, experiencia: 22000 }

// p2 = personagens[2]

// console.log(p2)
// rankDeP = rank(p2)
// console.log(rankDeP)

// 2.Exibir um relatório completo de todos os personagens.

function relatorioPersonagem(personagem){
  console.log("-----------");
  console.log("Nome: " + personagem.nome);
  console.log("Classe: " + personagem.classe);
  console.log("Nivel: " + personagem.nivel);
  console.log("Experiencia: " + personagem.experiencia);
  console.log("Ranking: " + rank(personagem));
  console.log("-----------");
}


function relatorioPersonagens(listaDePersonagens) {
  for (person of listaDePersonagens) {
    relatorioPersonagem(person)
  }
}


// 3. Utilizar map() para criar uma lista contendo apenas os nomes dos personagens.

relatorioPersonagens(personagens);

function pegarListaNomes(listaDePersonagens){
  const nomes=listaDePersonagens.map(personagem => personagem.nome)
  return nomes
}

listaDeNomes = pegarListaNomes(personagens)
console.log(listaDeNomes)

console.log("*********************************")

// 4. Encontrar o personagem com maior nível. 

const outraListaPersonagens = [
  { nome: "Boromir", classe: "Guerreiro", nivel: 11, experiencia: 7000 },
  { nome: "Saruman", classe: "Mago", nivel: 19, experiencia: 18500 },
  { nome: "Elrond", classe: "Mago", nivel: 18, experiencia: 17000 }
]

function pegarPersonagemMaiorNivel(personagens){
  let maiorNivel = personagens[0]
  for (personagem of personagens){
    if (personagem.nivel > maiorNivel.nivel){
      maiorNivel = personagem;
    }
  }
  return maiorNivel
}

persMaiorNivel = pegarPersonagemMaiorNivel(personagens)
console.log(persMaiorNivel)

relatorioPersonagem(persMaiorNivel)


console.log('%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%');;

// 5. Contar quantos personagens existem em cada classe.

function mediaDosNiveis(personagens){
  let soma = 0
  let quantidade = 0
  for (personagem of personagens) {
    soma = soma + personagem.nivel
    quantidade = quantidade + 1
  }
  media = soma/quantidade 
  return media
}

// 6. Calcular a média dos níveis do grupo.

let mediaNiveisPersonagens = mediaDosNiveis(personagens)
console.log(mediaNiveisPersonagens)


function classesDosPersonagens(personagens){ 
  contPersonagensPorClasse = {}
  for (personagem of personagens){
    if (contPersonagensPorClasse[personagem.classe]){
      contPersonagensPorClasse[personagem.classe]++
    }
    else {
      contPersonagensPorClasse[personagem.classe]=1
    }
  }
  return contPersonagensPorClasse
}

console.log(classesDosPersonagens(personagens));

// Bônus 1: Implementar uma função adicionarPersonagem(nome, classe, nivel, experiencia).

function adicionarPersonagem(nome, classe, nivel, experiencia){//criei uma função
  let NovoPersonagem = {nome:nome,classe:classe,nivel: nivel,experiencia: experiencia}//fechando a array para ser colocado dentro dela o novo personagem que será adicionado
  personagens.push(NovoPersonagem)//push para adicionar um elemento ao final de um array e retorna o novo comprimento da lista
}

adicionarPersonagem("Lindof","Mago",8,28000)

console.log(personagens)//console pra executar a funcao que acabei de criar

//Bônus 2:Criar uma função buscarPorClasse(classe).

function buscarPorClasse(classe){
  let lista = []//criei uma lista vazia
  for (personagem of personagens){//for pra percorrer todos personagens da lista
    if (personagem.classe === classe){//pra ver se a classe do personagem é igual à classe que eu quero passar
    lista.push(personagem)
    }
  }
  return lista
}

console.log("Filtrando por classe", buscarPorClasse("Mago"))

//teste
function buscarPorNome(nome){
  let lista = []//criei uma lista vazia
  for (personagem of personagens){//for pra percorrer todos personagens da lista
    if (personagem.nome === nome){//pra ver se a classe do personagem é igual à classe que eu quero passar
    lista.push(personagem)
    }
  }
  return lista
}

console.log("Filtrando por nome", buscarPorNome("Arwen"))


function buscarNomeEClasse(nome,classe){
  let lista = []//criei uma lista vazia
  for (personagem of personagens){//for pra percorrer todos personagens da lista
    if (personagem.nome === nome && personagem.classe === classe){//pra ver se a classe do personagem é igual à classe que eu quero passar
      lista.push(personagem)
  }
  }
  return lista
}

function buscarPorClasseComNivelMaiorQue(classe,nivel){
  let lista = []//criei uma lista vazia
  for (personagem of personagens){//for pra percorrer todos personagens da lista
    if (personagem.classe === classe && personagem.nivel > nivel){//pra ver se a classe do personagem é igual à classe que eu quero passar
      lista.push(personagem)
  }
  }
  return lista
}
console.log("Classe com nível maior que 10", buscarPorClasseComNivelMaiorQue("Guerreiro",11))

//Bônus 3: Criar uma função ganharExperiencia(nome, quantidade) que atualize a experiência de um personagem e exiba seu novo rank.

function ganharExperiencia(nome,quantidade){
  for(personagem of personagens){
    if (personagem.nome === nome) {
      personagem.experiencia = personagem.experiencia + quantidade
      console.log(rank(personagem))
      return true //se encontrar o personagem, vai atualizar a experiência e vai retornar true
    }
  } 
  return false //se não encontrar ninguém com aquele nome, retorna false;.
}


if (ganharExperiencia("Faramir",8000)){
  console.log("Personagem ganhou experiência");
}else{
  console.log("Personagem não encontrado");
}

console.log(personagens);