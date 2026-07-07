num1 = float(input('primeiro valor:'))
num2 = float(input('Segundo valor:'))
resultado = 0
maior = 0
menor = 0
opcao = 0
while opcao != 5:
    print('''
    [ 1 ] Somar
    [ 2 ] Multiplicar
    [ 3 ] Maior 
    [ 4 ] Novos números
    [ 5 ] Sair do menu 
    ''')

    opcao = int(input('Escolha uma opção:'))
    if opcao == 1:
        resultado = num1 + num2
        print('A soma entre o {:.2f} e o {num2} e {resultado}'.format)
    elif opcao == 2:
        resultado = num1 * num2
        print(f'A multplicação entre {num1} e o {num2} e {resultado}')
    elif opcao == 3:
        if num1 > num2:
            print(f'O número {num1} e maior')
        elif num2 > num1:
            print(f'O número {num2} e maior')
        else:
            print('Os números são iguais')
    elif opcao == 4:
        print('Digite novos valores')
        num1 = float(input('primeiro valor:'))
        num2 = float(input('Segundo valor:'))
    elif opcao == 5:
        print('Finalizando programa...')

print("Programa finalizado")
