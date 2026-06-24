interface Usuario {
  nome: string
  idade: number
}

const usuarios: Usuario[] = [
  { nome: "João", idade: 17 },
  { nome: "Maria", idade: 22 },
  { nome: "Pedro", idade: 30 }
]


const maioresDeIdade = usuarios.filter((usuario) => usuario.idade >= 18)
console.log(maioresDeIdade)