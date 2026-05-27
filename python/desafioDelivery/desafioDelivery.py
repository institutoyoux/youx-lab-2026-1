def buscar(id):
    for busca in cardapio:
        if busca['id'] == id:
            busca['quantidade'] = qtd
            carrinho.append(busca)
            print('-='*41)
            print(f'Seu carrinho: Quantidade = {qtd} |ID={busca["id"]} |{busca["nome"]} |R${busca["preco"]:.2f} |{busca["avaliacoes"]}')
    else:
        print('Digite um ID válido! Por favor, tente novamente!')

cardapio = [
    {
        "id": 1,
        "nome": "Hambúrguer Clássico",
        "preco": 25.50,
        "avaliacoes": [5, 4, 5]
    },
    {
        "id": 2,
        "nome": "Pizza Margherita",
        "preco": 45.00,
        "avaliacoes": [5, 5, 4, 4, 5, 4]
    },
    {
        "id": 3,
        "nome": "Batata Frita",
        "preco": 15.00,
        "avaliacoes": [3, 4]
    },
    {
        "id": 4,
        "nome": "Refrigerante Lata",
        "preco": 8.00,
        "avaliacoes": [5, 5, 5, 4]
    },
    {
        "id": 5,
        "nome": "Cachorro Quente Prensado",
        "preco": 18.90,
        "avaliacoes": [4, 4, 5, 3]
    },
    {
        "id": 6,
        "nome": "Suco de Laranja Natural",
        "preco": 12.00,
        "avaliacoes": [5, 5, 5]
    },
    {
        "id": 7,
        "nome": "Sorvete de Baunilha",
        "preco": 14.50,
        "avaliacoes": [5, 4, 5, 5]
    },
    {
        "id": 8,
        "nome": "Porção de Onion Rings",
        "preco": 22.00,
        "avaliacoes": [4, 3, 4, 4, 5]
    },
    {
        "id": 9,
        "nome": "Salada Caesar",
        "preco": 28.00,
        "avaliacoes": [5, 5, 4]
    },
    {
        "id": 10,
        "nome": "Brownie de Chocolate",
        "preco": 16.00,
        "avaliacoes": [5, 5, 5, 5, 4]
    }
]
nome = str(input('Qual seu nome? '))
print(f'Seja bem vindo(a) {nome}!')
opcao = 0
carrinho = list()
while opcao != 4:
    print('''    [ 1 ] Ver Cardápio e Avaliações
    [ 2 ] Adicionar Item ao Pedido
    [ 3 ] Finalizar Pedido
    [ 4 ] Sair do Sistema''')
    opcao = int(input('→ Oque você deseja fazer? '))
    if opcao == 1:
        for itens in cardapio:
            itens['mediaAvaliacoes'] = 0
            for nota in itens['avaliacoes']:
                itens['mediaAvaliacoes'] += nota
            itens['mediaAvaliacoes'] /= len(itens['avaliacoes'])
            print(f'Id: {itens["id"]} | Nome: {itens["nome"]} | Preço: R${itens["preco"]:.2f} | Avaliações: {itens["mediaAvaliacoes"]:.2f}')
    if opcao == 2:
        id = int(input('Digite o ID do produto desejado: '))
        qtd = int(input('Quantos itens você deseja? '))
        buscar(id)

#Opcão 3 está incompleta! Falta terminar
    if opcao == 3:
        pass
        '''for itens in carrinho:
            soma = float(0)
            for preco in itens['preco']:
                soma += preco
            print(f'R${soma:.2f}')'''

    if opcao == 4:
        print('-=' * 41)
        print('Finalizando programa, volte sempre!!!')
    if opcao == 5:
        print(carrinho)

    print('-='*41)