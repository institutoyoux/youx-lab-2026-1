from time import sleep

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
print('------=------=------< Loja virtual >------=------=------')
print('      =------          Bem vindo!          ------=')
nome = str(input('Digite seu nome: '))
produto = []
quebrarCodigo1 = 0
while quebrarCodigo1 == 0:
    print('[1] Ver cardapio e avaliações')
    print('[2] Adicionar item ao pedido')
    print('[3] Finalizar pedido')
    print('[4] Sair do sistema')
    resposta1 = input('Escolha uma opção: ')




    if resposta1 == '1':
        print('------=------=------< Cardapio >------=------=------')
        print('      =------     Veja os produtos     ------=')
        print('------=------=------=----------=------=------=------')
        for a in cardapio:
            print(f'ID: {a['id']} Nome: {a['nome']}')
            print(f'Preço: {a['preco']}')
            totalAvaliacoes = sum(a['avaliacoes'])
            numAvaliacoes = 0
            for b in a['avaliacoes']:
                numAvaliacoes += 1
            mediaAvaliacoes = totalAvaliacoes / numAvaliacoes
            print(f'Avaliação: {mediaAvaliacoes:.1f}')
            print('------=------=------=----------=------=------=------')




    elif resposta1 == '2':
        print('------=------=------< Carrinho >------=------=------')
        print('      =------    Escolha o produto     ------=')
        produto.clear()
        itens = dict()
        quebrarCodigo2 = 0
        quebrarCodigo3 = 0
        quebrarCodigo4 = 0
        while quebrarCodigo2 == 0:
            quebrarCodigo3 = 0
            while quebrarCodigo4 == 0:
                escolha = int(input('Digite o ID do produto: [Digite -1 para nenhuma escolha] '))
                if escolha <= 10 and escolha > 0:
                    for a in cardapio:
                        if a['id'] == escolha:
                            itens['id'] = a['id']
                            itens['nome'] = a['nome']
                            itens['quantidade'] = int(input('Digite a quantidade deste produto: '))
                            itens['preco'] = a['preco']
                            produto.append(itens.copy())
                            quebrarCodigo4 += 1
                elif escolha == -1:
                    quebrarCodigo4 += 1
                else:
                    print('Produto não encontrado!')
            quebrarCodigo4 = 0
            while quebrarCodigo3 == 0:
                continuar1 = str(input('Quer continuar comprando? [S|N] ').upper().strip())
                if continuar1 in 'Ss':
                    print('Continuando...')
                    sleep(0.5)
                    quebrarCodigo3 += 1
                elif continuar1 in 'Nn':
                    quebrarCodigo3 += 1
                    quebrarCodigo2 += 1
                else:
                    print('-------------------')
                    print('ERRO! Escolha [S|N]')
                    print('-------------------')
        print('------=------=------=----------=------=------=------')




    elif resposta1 == '3':
        print('------=------=------< Pagamento >------=------=------')
        print('      =------ Hora de pagar pelo pedido ------=')
        print('Resumo dos produtos:')
        print('------=------=------=----------=------=------=------')
        dinheiro = 0
        totalDinheiro = 0
        totalPagar = 0
        for a in produto:
            dinheiro = a['quantidade'] * a['preco']
            totalDinheiro += dinheiro
        quebrarCodigo5 = 0
        if totalDinheiro <= 0:
            print('Nenhum produto escolhido!')
            print('------=------=------=----------=------=------=------')
            quebrarCodigo5 += 1
        else:
            for a in produto:
                print(f'Nome: {a['nome']} Quantidade: {a['quantidade']} Preço: {a['preco']}')
            print('------=------=------=----------=------=------=------')
        while quebrarCodigo5 == 0:
            resposta2 = str(input('Quer finalizar o pedido? [S|N] '))
            if resposta2 in 'Nn':
                quebrarCodigo5 += 1
                print('------=------=------=----------=------=------=------')
            elif resposta2 in 'Ss':System.out.println("[ID: 2] - [Nome: ] - []");
                print('[Preço do produto] + [Quantidade] + [R$ 6,0 de entrega]')
                print('Calculando o preço a se pagar...')
                sleep(0.5)
                print('Calculado! O preço a se pagar é: ', end='')
                if totalDinheiro > 75:
                    totalPagar = totalDinheiro + 6 + (totalDinheiro * 15 / 100)
                    print(totalPagar)
                    produto.clear()
                    quebrarCodigo5 += 1
                elif totalDinheiro > 50:
                    totalPagar = totalDinheiro + 6 + (totalDinheiro * 10 / 100)
                    print(totalPagar)
                    produto.clear()
                    quebrarCodigo5 += 1
                else:
                    totalPagar = totalDinheiro + 6
                    print(totalPagar)
                    produto.clear()
                    quebrarCodigo5 += 1
            else:
                print('ERRO! Resposta invalida.')
            print('------=------=------=----------=------=------=------')
    elif resposta1 == '4':
        print(f'------=------=------< Saindo >------=------=------')
        print(f'      =------ Volte sempre {nome}!   ------=')
        quebrarCodigo1 += 1
    else:
        print()
        print('ERRO! escolha um numero valido.')
        print()