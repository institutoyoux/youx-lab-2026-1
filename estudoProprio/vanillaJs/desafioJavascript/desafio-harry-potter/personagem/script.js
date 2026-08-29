const id = window.location.search.replace("?p=", "")

const ui = {
    exibir(personagem) {
        document.body.innerHTML = `
            <div class="img"><img src="${personagem.image}"></div>
            <h1>${personagem.name}</h1>
            <p>Outros nomes: ${personagem.alternate_names.length > 0 ? personagem.alternate_names.join(", ") : "Não possui"}</p>
            <p>Nascimento: ${personagem.dateOfBirth ? personagem.dateOfBirth.split("-").join("/") : "Não informado"}</p>
            <p>${personagem.species === "human" ? "É humano" : "Não é humano"} </p>
        `
    }
}

axios.get("https://hp-api.onrender.com/api/character/" + id)
    .then(response => ui.exibir(response.data[0]))
    .catch(error => console.error(error))