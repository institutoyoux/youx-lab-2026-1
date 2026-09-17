from random import randint
numeros = (randint(1,100),  randint(1,100),  randint(1,100),
            randint(1,100), randint(1,100))
print('os valores sorteados foram:', end='')
for n in numeros:
    print(f'{n} ', end='')
print(f'\nO maior valor sorteado foi:{max(numeros)}')
print(f'O menor valor sorteado foi:{min(numeros)}')
