numeros = list()
r = 's'
while r not in 'N':
    numero = int(input('Digite um valor:'))
    if numero not in numeros:
        numeros.append(numero)
        print('Valor adicionado com sucesso...')
    else:
        print('Valor duplicado não adicionado!')
    r = str(input('Deseja continuar? [S/N]:')).upper()

print(f'O valores digitados foram: {numeros}')