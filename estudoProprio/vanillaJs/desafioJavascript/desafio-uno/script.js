class Jogador {
    constructor(cartas) {
        this.id = crypto.randomUUID();
        this.cartas = cartas
    }

    jogar(idCarta, mesa) {
        const carta = this.cartas.find(carta => carta.id === idCarta)
        if (!carta) {
            throw new Error("Carta invalida");
        }
        if (!mesa.cartaAtual.equals(carta)) {
            throw new Error("As cartas não coincidem")
        }
        mesa.adicionarCarta(carta)
        this.cartas = this.cartas.filter(cartaFilter => cartaFilter != carta)
    }

    adicionarCarta(carta) {
        this.cartas.push(carta)
    }

    comprar(baralho) {
        this.cartas.push(baralho.removerCarta())
    }
}

const enumCor = ["verde", "amarelo", "vermelho", "azul"]


const enumUrlCores = {
    verde: "Green",
    amarelo: "Yellow",
    vermelho: "Red",
    azul: "Blue"
}

class Carta {
    constructor(idCor, numero) {
        if (idCor > enumCor.length - 1 || idCor < 0) {
            throw new Error("Cor invalida!");
        }
        if (numero > 9 || numero < 0) {
            throw new Error("Numero invalido!")
        }
        this.id = crypto.randomUUID();
        this.cor = enumCor[idCor]
        this.numero = numero
        this.image = `https://cdn.jsdelivr.net/gh/john-costanzo/uno-card-images@master/${enumUrlCores[this.cor]}_${numero}.png`
    }
    equals(cartaComparar) {
        if (cartaComparar.cor != this.cor && cartaComparar.numero != this.numero) {
            return false
        }
        return true
    }
}

const gerarCartas = (quantidade = 1) => {
    const cartas = []
    for (let i = 0; i < quantidade; i++) {
        const corGerada = Math.floor(Math.random() * enumCor.length)
        const numeroGerado = Math.floor(Math.random() * 10)
        cartas.push(new Carta(corGerada, numeroGerado))
    }
    return cartas
}

class Mesa {
    constructor(carta) {
        this.cartas = [carta]
        this.cartaAtual = carta
    }
    adicionarCarta(carta) {
        this.cartas.push(carta)
        this.cartaAtual = carta
    }
}

class Baralho {
    constructor(cartas) {
        this.cartas = cartas
    }
    removerCarta() {
        try {
            const carta = this.cartas[this.cartas.length - 1]
        if (!carta) {
            throw new Error("Baralho vazio!")
        }
        this.cartas = this.cartas.filter(cartaFilter => cartaFilter != carta)
        return carta
        } catch (error) {
            alert(error);
        }
    }
}
class Jogo {
    constructor(jogadores =[], baralho) {
        this.jogadores = jogadores,
        this.baralho = baralho
    }
}