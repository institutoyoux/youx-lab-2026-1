salário = float(input('qual é o salário do funcionário?R$'))
aumento = salário + (salário * 15/100)
print('Um funcionário que ganhava R${},com 15% de aumento passa a receber R${:.2f}.'.format(salário, aumento))