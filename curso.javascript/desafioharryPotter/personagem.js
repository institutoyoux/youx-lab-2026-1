const divPersonagem = document.getElementById('idPersonagem');

const params = new URLSearchParams(window.location.search);
const id = params.get('id');



fetch('https://hp-api.onrender.com/api/character/' + id)
    .then(r => r.json())
    .then((dados) => {
        console.log('dados', dados)
        

        const card = document.createElement("div")
        card.className = "card"
        const nome = document.createElement("div")
        const nascimento = document.createElement("div")
        const especie = document.createElement("div")
        const imagem = document.createElement("img")
        const ator = document.createElement("div")
        const corDoCabelo = document.createElement("div")
        const vivo = document.createElement("div")
        const estudante = document.createElement("div")
        const ancestralidade = document.createElement("div")

        nome.innerHTML = "Nome: " + dados[0].name
        nascimento.innerHTML = "Nascimento: " + dados[0].dateOfBirth,
        especie.innerHTML = "Especie: " + dados[0].species
        imagem.src = dados[0].image
        // n_diferente.innerHTML = "Nome alternativo: " + dados.alternate_names
        ator.innerHTML = "Ator: " + dados[0].actor
        corDoCabelo.innerHTML = "Ator: " + dados[0].hairColour
        vivo.innerHTML = "Vivo: " + dados[0].alive
        estudante.innerHTML = "Estudante: " + dados[0].hogwartsStudent
        ancestralidade.innerHTML = "Vivo: " + dados[0].ancestry

        card.appendChild(imagem)
        card.appendChild(nome)
        card.appendChild(nascimento)
        card.appendChild(especie)
        // card.appendChild(n_diferente)
        card.appendChild(ator)
        card.appendChild(vivo)
        card.appendChild(estudante)
        card.appendChild(ancestralidade)
        // p_personagens.appendChild(card)
        divPersonagem.appendChild(card)

    }
    )

