const personagens = document.querySelector("main")

const ui = {
    listar(array) {
        array.forEach(personagem => {
            const personagemDiv = document.createElement("a")
            personagemDiv.href = `personagem/?p=${personagem.id}`
            personagemDiv.innerHTML = `
                <div class="personagem">
                    <img src="${personagem.image}">
                    <span>${personagem.name}</span>
                </div>
            `
            personagens.appendChild(personagemDiv)
        });
    }
}

axios.get("https://hp-api.onrender.com/api/characters")
    .then(response => ui.listar(response.data))
    .catch(error => console.error(error))