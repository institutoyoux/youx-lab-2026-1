interface Usuario {
    nome: string,
    idade: number
}

Deno.serve(async(req) => {
    const type = req.method
    if (type === "GET") {
        return Response.json(
            {message: 'Api funcionando'}
        )
    } else if (type === "POST") {
        const body: Usuario = await req.json()
        if (!body.nome) {
            return Response.json(
                {erro: 'O nome não foi enviado', body}
            )
        } else if (body.idade < 18) {
            return Response.json(
                {erro: 'Não é permitido menores de idade se cadastrar'}
            )
        }
        return Response.json(
            {message: `Cadastro realizado com sucesso, Bem vindo ${body.nome}`}
        )
    } else if (type === "DELETE") {
        return Response.json(
            {message: `Usuário deletado com sucesso!`}
        )
    }
    else {
        return Response.json(
            {message: 'Requisição não permitida!'}
        )
    }
})