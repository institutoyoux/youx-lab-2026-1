console.log("oi");

const urlParams = new URLSearchParams(window.location.search);

const charId = urlParams.get('id')


async function getCharacter() {
    try {
        const response = await fetch(`https://hp-api.onrender.com/api/character/${charId}`);
        const characters = await response.json();
        return characters;
    } catch(error) {
        console.log("Erro ao encontrar personagem!", error);
        return [];
    }
}

async function main() {
    const character = await getCharacter()
    console.log(character);

      const personagemGeral=document.getElementById("personagens_geral")

    character.forEach((character) => {
        
        
        const personagem=document.createElement("a")
        personagem.href = `HP.html?id=${character.id}`
        personagem.classList.add("classe-personagem")

        const imgFoto=document.createElement("img")
        imgFoto.setAttribute("src",character.image)
        personagem.appendChild(imgFoto)
        
        const pNome=document.createElement("p") 
        pNome.innerText="Nome: " + character.name
        personagem.appendChild(pNome)


        const pGenero=document.createElement("p")
        pGenero.innerText="Genero: " + character.gender
        personagem.appendChild(pGenero)

        const pEspecie=document.createElement("p")
        pEspecie.innerText="Especie: " + character.species
        personagem.appendChild(pEspecie)

        const pCasa=document.createElement("p")
        pCasa.innerText="Casa: " + character.house
        personagem.appendChild(pCasa)

        const pSangue=document.createElement("p")
        pSangue.innerText="Tipo: " + character.ancestry
        personagem.appendChild(pSangue)

        const pPatrono=document.createElement("p")
        pPatrono.innerText="Patrono: " + character.patronus
        personagem.appendChild(pPatrono)


        const pEstudante=document.createElement("p")
        pEstudante.innerText="Estudante de Hogwarts: " + character.hogwartsStudent
        personagem.appendChild(pEstudante)


        personagemGeral.appendChild(personagem);
    })

}

main()
