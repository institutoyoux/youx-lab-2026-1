lista = []
pares = 0
impares = 0
r = 's'
while r not in 'N':
    numero = int(input('Digite um número inteiro:'))
    if numero not in lista:
        lista.append(numero)
    else:
        print('Valor duplicado não adicionado!')
    r = str(input('Deseja continuar? [S/N]:')).upper()
print(f'A lista completa é {lista}')
