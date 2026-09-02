const resultado= document.getElementById("resultado")
const carregando=document.getElementById("carregando")

const endpoint = "https://hp-api.onrender.com/api/characters"; // criei um endpoint
fetch(endpoint) // pegou todas as informações do endpoint
.then((res) => res.json()) // .then recebeu as informacoes q o fetch mandou e com o json transformou em object
.then((dados) => {
    console.log('dados---> ', dados);
    dados.forEach( persona => {
        
        resultado.innerHTML += `
            <div  id="persona_${persona.id}" class="quadro-persona">
                <a href="http://localhost:5500/apiHP/personagem.html?id=${persona.id}">
                    <p class="nome-persona" >Nome: ${persona.name}</p>
                </a>
                <p class="especie-persona" >Especie: ${persona.species}</p>
                <p class="genero-persona" >Genero: ${persona.gender}</p>
            </div>
        `
    })    

    carregando.style.display = "none"



});




