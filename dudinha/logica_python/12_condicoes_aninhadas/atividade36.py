salário = int(input('Qual é o seu salario R$?'))
casa = int(input('Qual é o valor da casa R$?'))
anos = int(input('Em quantos anos você vai pagar?'))
prestacao =casa / (anos * 12)
quantidades_prestacoes = anos * 12
minimo = salário * 30/100
print('Para pagar uma casa de R${} em {} anos'.format(casa, anos))
print('O valor da prestação será R${:.2f}'.format(prestacao))
if prestacao < (salário * 30/100):
    print('O empréstimo foi ACEITO!Você irá pagar {} parcelas de R${:.2f}'.format(quantidades_prestacoes, prestacao))