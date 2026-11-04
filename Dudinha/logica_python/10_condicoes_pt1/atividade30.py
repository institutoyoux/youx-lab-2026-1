numero = int(input('me diga um número qualquer:'))
resultado = numero % 2
if resultado == 0:
    print('O número {} é PAR'.format(numero))
else:
    print('O número {} é Impar'.format(numero))