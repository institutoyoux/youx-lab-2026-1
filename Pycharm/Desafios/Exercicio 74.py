from random import randint
maior = 0
menor = 0
contador = 0

numeros = (randint(1, 10), randint(1, 10), randint(1, 10),randint(1, 10), randint(1, 10))
print('Os valores sorteados foram: ', end='')
for n in numeros:
    print(f'{n} ', end='')
for c in numeros:
    if contador == 0:
        maior = c
        menor = c
    else:
        if c > maior:
            maior = c
        elif c < menor:
            menor = c
    contador += 1

print(f'\nO maior valor sorteado foi {maior}')
print(f'O menor valor sorteado foi {menor}')