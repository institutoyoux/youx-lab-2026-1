document.querySelector("button").addEventListener("click", () => {
    iniciarJogo()
})

const jogador = new Jogador(gerarCartas(7))
const baralho = new Baralho(gerarCartas(79))
const mesa = new Mesa(gerarCartas(1)[0])
const iniciarJogo = () => {
    const jogadorCartas = jogador.cartas
    document.body.innerHTML = `
<img src="${mesa.cartaAtual.image}">
k
<div class="cartasJogador">${jogadorCartas.map(carta => `<img id="${carta.id}" src="${carta.image}">`).join("")}</div>
<div class="baralho"><img src="https://raw.githubusercontent.com/eperezcosano/Uno/master/public/images/uno.svg"></div>
`
    jogadorCartas.forEach(carta => {
        document.getElementById(carta.id).addEventListener("click", () => {
            jogador.jogar(carta.id, mesa)
            iniciarJogo()
        })
    });
    document.querySelector(".baralho").addEventListener("click", () => {
        jogador.comprar(baralho)
        iniciarJogo()
    })
}
console.log(mesa.cartaAtual);