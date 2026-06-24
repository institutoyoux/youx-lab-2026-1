interface Produto {
    nome: string,
    preco: number,
    estoque: number
}

const produtos: Produto[] = [
    {
        nome: 'Coca cola',
        preco: 8.50,
        estoque: 7
    },
    {
        nome: 'Pão de queijo',
        preco: 27,
        estoque: 100
    },
    {
        nome: 'Toddy',
        preco: 9,
        estoque: 9
    }
]

for (let i = 0; i < produtos.length; i++) {
    console.log(`${i+1} - Produto ${produtos[i].nome} custa R$ ${produtos[i].preco}`)
}