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

for (const produto of produtos) {
    console.log(`Produto: ${produto.nome}\nPreço: ${produto.preco}`)
    if (produto.estoque > 0) {
        console.log(`Possuem ${produto.estoque} em estoque\n\n`)
    } else {
        console.log('Não temos estoque desse produto!\n\n')
    }
}