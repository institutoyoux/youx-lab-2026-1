interface Usuario {
    nome: string,
    idade: number
}

Deno.serve(async (req) => {
    const body: Usuario = await req.json()
    if (!body.nome || body.idade < 18) {
        return Response.json({erro: 'Não foi possível fazer seu cadastro!'})
    } else {
        return Response.json(
            {
                response: `Cadastro realizado ${body.nome}, Bem vindo!`
            }
        )
    }
})