def leiaInt(mensagem):
    while True:
        try:
            n = int(input(mensagem))
        except (ValueError, TypeError):
            print('\033[31mERRO! Digite um número inteiro que seja válido!\033[m')
            continue
        else:
            return n

numero = leiaInt('Digite um valor: ')
print(f'O valor digitado foi {numero}')