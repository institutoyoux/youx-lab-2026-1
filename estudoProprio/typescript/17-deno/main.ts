Deno.serve(() => {
    return Response.json(
        {
            nome: 'João',
            idade: 17,
            cidade: 'Lavras'
        }
    )
})