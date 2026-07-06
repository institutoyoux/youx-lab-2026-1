from time import sleep
carrinho = []
id_novo_item = ()
pedido = 0
resposta = 'Ss'
print('=+' * 20)
print('---------------Bem Vindo----------------')
print('+=' * 20)
sleep (1)
name = str(input('Qual e seu nome? '))
sleep (1)
opcao = 0
print(f'Seja bem vindo ao cardapio {name}!')
sleep(1)
print(f'Por favor {name} poderia escolher umas das opçoẽs abaixo')
sleep(1)
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

while opcao != 4:
    print('''
    [ 1 ] Ver Cardápio e Avaliações
    [ 2 ] Adicionar Item ao Pedido
    [ 3 ] Finalizar Pedido
    [ 4 ] Sair do Sistema
    ''')
    opcao = int(input('Escolha uma opção:'))
    if opcao == 1:
        for l in cardapio:
            print('''
            id: {}
            nome: {}
            preço: R${}
            avaliaçao: {} '''.format(l['id'], l['nome'], l['preco'], l['avaliacoes']))
    elif opcao == 2:
        id_novo_item = int(input('Adicione o id do produto:'))
        for item in cardapio:
            if item['id'] == id_novo_item:
                carrinho.append(item)
                print(f'{item['nome']} adiocionado ao carrinho')
            elif item not in cardapio:
                print('Id não encontrado')
    elif opcao == 3:

        sleep(1)
        print('Finalizando compra...')
        sleep(1)

    elif opcao == 4:
        print('Finalizando programa...')
sleep(1)
print("Programa finalizado")
#Dificuldade na numero 2 inteira