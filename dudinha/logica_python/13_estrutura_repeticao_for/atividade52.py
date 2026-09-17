numero = int(input('Digite um número: '))
cont = 0
for c in range(1, numero + 1):
    if numero % c == 0:
         print('', end='')
         cont += 1
if cont == 2:
    print(f'{numero} é um número Primo')
else:
    print(f'{numero} não é um número Primo')