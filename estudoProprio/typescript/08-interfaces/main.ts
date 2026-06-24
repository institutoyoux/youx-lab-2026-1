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

function mostrarProduto(id: number) {
    console.log(`Nome: ${produtos[id].nome}\nPreço: ${produtos[id].preco}\nEstoque: ${produtos[id].estoque}`)
}
mostrarProduto(0);
mostrarProduto(1);
mostrarProduto(2);