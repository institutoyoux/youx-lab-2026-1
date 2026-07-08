#=========================================|==============================|===============================================
#=========================================|======DESAFIO CARDAPIO =======|===============================================
#=========================================|==============================|===============================================
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
#=============================================COMANDOS DE LISTAS DE DICIONARIO E LISTA==================================
dicionario = {}
lista = []
#=======================================================================================================================

print('\033[031m===' * 25)
print('\033[034m\033[031SSEJA- \033[034mBEM-VINDO A \033[031mLANCHONETE\033[031m============')
print('\033[034m===' * 25 )
nome = str(input("\033[033mPOR-FAVOR DIGITE SEU NOME POR GENTILIZA A FRENTE POR GENTILIZA -> "))
print("OLA,{} ,ESCOLHA UM ITEM DO CARDAPIO POR GENTILEZA !!! ".format(nome,))
opcao = ""
while opcao != 1:
    print(f""
    "[1]VER CARDAPIO OU AVALIAÇÕOES \n"
    "[2]ADICIONAR ITEM AO PEDIDO \n"
    "[3]FINALIZAR PEDIDO. \n"
    "[4]FINALIZAR PROGRAMA \n"
          )
    opcao = int(input("QUAL SUA ESCOLHA: "))
    if opcao == 1:
        for item in cardapio:
            print(f'id {item['id']}, {item['nome']}, R$ {item['preco']} avaliacoes do produto{item['avaliacoes']} ')
        break
    if opcao == 2:
        for opcao in cardapio:
            produto = str(input('ESCOLHA O ID DO PRODUTO E QUE DESEJAS [1, 10]: '))
        print(cardapio)
    if opcao == 3:
        print()
    if opcao == 4:
        print("¨¨¨" * 60)
        print("                                                            |¨¨¨¨PROGRAMA FINALIZADO, AGRADEÇEMOS A PREFERENCIA¨¨¨¨|")
        print('¨¨¨' * 60)
        break
    if opcao >= 5:
     print('***' * 60)
     print('                                                    >>> NAO TEMOS ESSA OPÇAO POR FAVOR ESCOLHA ALGUMA OPÇAO LISTADA NO MENU <<<')
     print('***' * 60)
#  >>>>>> FALTOUUUUU MUITA COISAS PERDI TEMPO DEIXANDO BUNITINHO CREIO QUE ISSO ME QUEBROU MAIS FIZ OQ TAVA NA CABEÇA O RESTO DEU BRANCO DO CARAMBA ESPERO MELHORAR NA PROXIMA <<<<