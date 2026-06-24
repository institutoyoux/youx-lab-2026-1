const idade: number = 15

function verificarIdade(idade: number): string {
    if (idade >= 18) {
    return 'Você é maior de idade'
} else {
    return 'Você é menor de idade'
}
}

console.log(verificarIdade(idade))