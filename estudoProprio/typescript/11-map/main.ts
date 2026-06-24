interface Usuario {
  nome: string
  idade: number
}

const usuarios: Usuario[] = [
  { nome: "João", idade: 17 },
  { nome: "Maria", idade: 22 },
  { nome: "Pedro", idade: 30 }
]

const nomes = usuarios.map((usuario) => usuario.nome)

console.log(nomes)
const mensagens = usuarios.map((usuario) => console.log(`${usuario.nome} tem ${usuario.idade} anos`))