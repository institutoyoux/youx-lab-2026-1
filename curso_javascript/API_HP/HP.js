// async function buscarDados() {
//   try {
//     const resposta = await fetch("https://hp-api.onrender.com/api/characters");

//     const r = await resposta.json();

//     return r;
//   } catch (e) {
//     alert("Erro na requisição da API");
//     console.log(e);
//     return null;
//   }
// }   

// ==============================================================================================

// let dados = buscarDados();

// const d = fetch('https://hp-api.onrender.com/api/characters').then(r=>r.json())

// console.log(d)

// ===========================================================================================================



// -----------------------------------------------------------------------------------------------------------------------------------------------------------

// async function buscarPersonagens() {
//     try{
//         const resposta = await fetch('https://hp-api.onrender.com/api/characters');
        
//         return await resposta.json();

//     }catch (erro) {
//         console.error("Erro ao buscar os dados:", erro);
//         return []; //RETORNA UM ARRAY VAZIO EM CASO DE ALGUM ERRO, E ASSIM MANTEM UM PADRÃO
//     }
// }

// const dadosHarryPotter = await buscarPersonagens();

// console.log(dadosHarryPotter);

// ==========================================================================================


function buscarPersonagem() {
    fetch("https://hp-api.onrender.com/api/characters")
        .then(promisse => promisse.json())
        .then(personagens => console.log(personagens))
        .catch(erro => console.error(erro))
}

buscarPersonagem()
