const usuarios: string[] = [{nome: 'joao', idade: 22}, {nome: 'lucas', idade: 17}]

function mostrarUsuario(id: number) {
    console.log(`${usuarios[id].nome} tem ${usuarios[id].idade} anos`)
}

mostrarUsuario(0)
mostrarUsuario(1)