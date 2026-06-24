interface produto {
    nome: string,
    preco: number
}
const produtos: produto[] = [
    {
        nome: 'Coca cola',
        preco: 8.5
    },
    {
        nome: 'Pão',
        preco: 0.5
    }
]

async function buscarProduto(nome: string) {
    const busca = produtos.find((produto) => produto.nome === nome)
    return busca
}


const res = await buscarProduto('Coca cola')
console.log(res)