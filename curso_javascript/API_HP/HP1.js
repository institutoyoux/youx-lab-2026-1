
async function getCharacters() {
    try {
        const response = await fetch("https://hp-api.onrender.com/api/characters");
        const characters = await response.json();
        return characters;
    } catch(error) {
        console.log("Erro ao encontrar personagens!", error);
        return [];
    }
}

async function main() {
    const characters = await getCharacters()
    console.log(characters);

    const conteinerPersonagens=document.getElementById("conteiner_personagens")

    characters.forEach((character) => {

        const personagem=document.createElement("a")
        personagem.href = `HP2.html?id=${character.id}`
        personagem.classList.add("classe-personagem")

        const pNome=document.createElement("p") 
        pNome.innerText="Nome: " + character.name
        personagem.appendChild(pNome)

        const pCasa=document.createElement("p")
        pCasa.innerText="Casa: " + character.house
        personagem.appendChild(pCasa)

        conteinerPersonagens.appendChild(personagem);
    })
}
main()
