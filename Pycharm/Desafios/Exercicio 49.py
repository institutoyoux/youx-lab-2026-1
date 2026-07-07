numero = int(input('Digite a tabuada que você quer: '))
for cont in range(1, 11):
    print('{} x {:2} = {} '.format(numero, cont, numero*cont))
