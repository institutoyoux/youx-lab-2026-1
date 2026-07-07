def leiaInt(msg):
    valor = input(msg)
    while not valor.isnumeric():
        print('\033[ERRO! Digite um número inteiro válido.\033[m')
        valor = input(msg)
    return int(valor)
n = leiaInt('Digite um n: ')
print(f'Você acabou de digitar o número {n}')