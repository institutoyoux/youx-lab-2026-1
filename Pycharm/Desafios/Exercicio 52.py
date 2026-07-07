numero = int(input('Digite um número: '))
tot = 0
for c in range(1, numero + 1):
    if numero % c == 0:
        print('\033[33m', end=' ')
        tot += 1
    else:
        print('\33[31m', end=' ')
    print(f'{c}', end='')
print(f'\n\033[mO número {numero} foi divisível {tot}')
if tot == 2:
    print('E por isso e primo')
else:
    print('E por isso ele não e primo!')