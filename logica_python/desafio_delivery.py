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
print(f'olá,seja muito bem vind0(a) ao nosso Delivery!')
print('-=-'*16)
nome = str(input('Qual nome gostaria de colocar no seu pedido?'))
print(f'Bom...vamos ao seu pedido {nome}!')
print('-=-'*16)
opcao = 0
while opcao != 4:
    print('''
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    [1]Ver Cardápio e Avaliações
    [2]Adicionar Item ao Pedido
    [3]Finalizar Pedido
    [4]Sair do Sistema
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=''')
    opcao = int(input('Digite a opção que você gostaria de consultar:'''))
    print('-=-' * 16)
    if opcao == 1:
        for item in cardapio:
            print(f'Id: {item['id']}')
            print(f'Nome: {item['nome']}')
            print(f'Preço: {item['preco']}')
            #travei na parte do for para calcular as avaliações,e n deu tempo de fzr a opçao 2
    elif opcao == 2:
        print()
    elif opcao == 3:
        print('Mandando seu pedido pra cozinha...')
        sleep(2)
        print('Finalizando seu pedido...')
        sleep(2)
        print('Pedido finalizado,Obrigada(o) pela compra!')
        sleep(2)
    elif opcao == 4:
        print('~~Fim do atendimendo! Volte sempre.~~')