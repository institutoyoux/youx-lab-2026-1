const btnProcurar = document.getElementById("procurar")

btnProcurar.addEventListener("click", async () => {
    btnProcurar.innerHTML='Procurando...'
    const pesquisa = document.getElementById("pokemon").value
    try {
        const resposta = await fetch(`https://pokeapi.co/api/v2/pokemon/${pesquisa}`)
        const pokemon = await resposta.json()
        document.getElementById("nome").value = pokemon.name
        document.getElementById("tipo").value = pokemon.types.map(tipo => tipo.type.name).join(', ')
        document.getElementById("vida").value = pokemon.stats[0].base_stat
        document.getElementById("habilidade").value = pokemon.abilities.map(habilidade => habilidade.ability.name).join(', ')
        document.querySelector(".imagemPokemon").innerHTML = `<img id="imgPokemon"
                src="${pokemon.sprites.other.dream_world.front_default}"
                alt="Pokémon">`
        btnProcurar.innerHTML='Procurar'

    } catch (erro) {
        alert("Pokémon não encontrado!")
    }
})