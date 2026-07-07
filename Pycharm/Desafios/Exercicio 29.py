velocidade = float(input('Qual a velocidade do vaiculo? '))
if velocidade > 80:
    print('MULTADO! vocé excedeu o limite permitido que é de 80km/h')
    multa = (velocidade-80) * 7
    print('Vocé deve pagar uma multa de R${:.2f}'.format(multa))
print('Tenha um bom dia! Dirija com segurança! ')