const response = await fetch("https://jsonplaceholder.typicode.com/users/1")
const data = await response.json()
const dados = {nome: data.name, email: data.email}
console.log(dados)