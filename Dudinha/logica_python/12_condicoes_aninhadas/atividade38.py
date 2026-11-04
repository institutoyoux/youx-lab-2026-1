n1 = int(input('Digite um número:'))
n2 = int(input('Digite outro número:'))
if n1 > n2:
    print('o PRIMEIRO valor é maior.')
elif n2 > n1:
    print('o SEGUNDO valor é maior.')
elif n1 == n2:
    print('os DOIS valores são iguais.')
else:
    print('NÃO existe valor maior,os dois  são iguais.')