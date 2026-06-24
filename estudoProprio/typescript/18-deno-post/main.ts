interface Usuario {
    nome: string,
    idade: number
}

Deno.serve(async (req) => {
    const body: Usuario = await req.json()
    console.log(body)
    return Response.json(
        {
            mensagem: `${body.nome} tem ${body.idade} anos`
        }
    )
})