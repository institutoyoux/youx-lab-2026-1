lista = list()
r = 's'
while r not in 'N':
    numero = int(input('Digite um valor:'))
    if numero not in lista:
        lista.append(numero)
        print('Valor adicionado com sucesso...')
    else:
        print('Valor duplicado não adicionado!')
    r = str(input('Deseja continuar? [S/N]:')).upper()
print(f'Você digitou {len(lista)} valores.')
lista.sort(reverse=True)
print(f'O valores digitados {lista} em forma decrescente são:.')
if 5 in lista:
    print(f'O valor 5 está na lista.')
else:
    print(f'O valor 5 não está na lista.')
