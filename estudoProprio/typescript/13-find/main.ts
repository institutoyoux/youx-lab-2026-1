interface Usuario {
  nome: string
  idade: number
}

const usuarios: Usuario[] = [
  { nome: "João", idade: 17 },
  { nome: "Maria", idade: 22 },
  { nome: "Pedro", idade: 30 }
]


const maria = usuarios.find((usuario) => usuario.nome == 'Maria')
if (maria) {
    console.log(`${maria.nome} tem ${maria.idade} anos`) // aplicavel apenas para uma maria
} else {
    console.log('Nenhuma maria cadastrada')
}