interface CadastrarUsuario {
    nome: string,
    email: string,
    idade: number
}

const body: CadastrarUsuario = {
    nome: 'João',
    email: 'eujoao@gmail.com',
    idade: 17
}

console.log(
    `${body.nome} - ${body.email}`
)
if (body.idade >= 18) {
    console.log('Cadastro permitido')
} else {
    console.log('Cadastro negado')
}