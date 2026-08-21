const api = axios.create({
    baseURL: 'https://pokeapi.co/api/v2'
})
const pokemons = [];
api.get('/pokemon/?offset=20&limit=1351')
    .then(resp => {
        resp.data?.results.forEach(pokemon => {
            pokemons.push(`${pokemon.name}`)
        });
    });

const input = document.querySelector("input")
input.addEventListener("input", () => {
    buscarSug(input.value)
})

const buscarSug = (atual) => {
    const divSug = document.querySelector(".sugestao")
    if (atual === '') {
        divSug.innerHTML = ''
        divSug.style.display = 'none'
        return
    }
    const temAtual = pokemons.filter(pokemon =>
        pokemon.toLowerCase().includes(atual.toLowerCase())
    );
    divSug.style.display = 'flex'
    divSug.innerHTML = ''
    temAtual.forEach(pokemon => {
        const spanPokemon = document.createElement('span')
        spanPokemon.innerText = pokemon
        spanPokemon.addEventListener('click', () => {
            input.value = pokemon
            divSug.innerHTML = ''
            divSug.style.display = 'none'
        })
        divSug.appendChild(spanPokemon)
    })
}
const form = document.querySelector("form")
form.addEventListener("submit", (event) => {
    event.preventDefault()
    const pokemon = form.nome.value
    buscar(pokemon)
})
const buscar = async (pokemon) => {
    if (pokemon === '') {
        return
    }
    api.get(`/pokemon/${pokemon}/`)
    .then(response => gerarCard(response.data))
    .catch(error => {
        if (error.response?.status === 404) {
            alert('Digite um pokemon valido')
        } else {
            console.error(error);
        }
    })
}
const gerarCard = (data) => {
    document.querySelector("main").style.display = 'flex'


    document.querySelector(".name").innerText = data.name


    const hp = data.stats.find(status => status.stat.name === 'hp')
    document.querySelector(".hp").innerHTML = `<span>HP</span> ${hp.base_stat}`

    document.querySelector(".foto img").src = data.sprites.other.dream_world.front_default


    const habilidade = data.abilities.find(habilidade => !habilidade.is_hidden)
    document.querySelector(".habilidade").innerHTML = `<span class="tipo">Ability</span>${habilidade.ability.name}`
    
    document.querySelector(".last").innerText = data.moves[0].move.name
    
}