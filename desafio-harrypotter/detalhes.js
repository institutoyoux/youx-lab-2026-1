const detalhesContainer = document.getElementById("idDetalhes");

const parametros = new URLSearchParams(window.location.search); //pega os parâmetros da url
const id = parametros.get("id"); // pega o ID passado pela URL

console.log(id);

const endpoint = `https://hp-api.onrender.com/api/character/${id}`;
fetch(endpoint)
  .then((resposta) => resposta.json())
  .then((dados) => {
    console.log(dados[0]);

    const personagem = dados[0];

    const name = document.createElement("p");
    name.setAttribute("id", "nome");
    name.setAttribute("class", "detalhes");
    name.innerText = `Nome:${personagem.name}`;
    detalhesContainer.appendChild(name);

    const species = document.createElement("p");
    species.setAttribute("id", "species");
    species.setAttribute("class", "detalhes");
    species.innerText = `Species:${personagem.species}`;
    detalhesContainer.appendChild(species);

    const date = document.createElement("p");
    date.setAttribute("id", "dateBirth");
    date.setAttribute("class", "detalhes");
    date.innerText = `DateBirth:${personagem.dateOfBirth}`;
    detalhesContainer.appendChild(date);

    const ancestry = document.createElement("p");
    ancestry.setAttribute("id", "ancestry");
    ancestry.setAttribute("class", "detalhes");
    ancestry.innerText = `Ancestry:${personagem.ancestry}`;
    detalhesContainer.appendChild(ancestry);

    const hairColour = document.createElement("p");
    hairColour.setAttribute("id", "hairColour");
    hairColour.setAttribute("class", "detalhes");
    hairColour.innerText = `HairColour:${personagem.hairColour}`;
    detalhesContainer.appendChild(hairColour);

    const eyeColour = document.createElement("p");
    eyeColour.setAttribute("id", "eyeColour");
    eyeColour.setAttribute("class", "detalhes");
    eyeColour.innerText = `HairColour:${personagem.eyeColour}`;
    detalhesContainer.appendChild(eyeColour);

    for (let chave in personagem.wand) {
      let wand = document.createElement("p");
      wand.setAttribute("id", `${chave}${personagem.wand[chave]}`);
      wand.setAttribute("class", "wand");
      wand.innerText = `${chave}: ${personagem.wand[chave]}`;
      detalhesContainer.appendChild(wand);

      const element = personagem.wand[chave];
      console.log(`${chave}: ${element}`);
    }
  });
