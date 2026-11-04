peso = float(input('Qual é o seu peso?'))
altura = float(input('Qual é a sua altura?'))
imc = peso / (altura ** 2)
print('O imc dessa pessoa é de {:.2f}.'.format(imc))
if imc < 18.5:
    print('Você está ABAIXO DO PESO normal!')
elif imc > 18.5 and imc < 25:
    print('PARABÉNS!Você está na faixa de PESO NORMAL.')
elif imc > 25 and imc < 30:
    print('Cuidado!Você está com SOBREPESO.')
elif imc > 30 and imc < 40:
    print('Você está com OBESSIDADE!')
elif imc > 40:
    print('CUIDADO!Você está com OBESSIDADE MÓRBIDA.')
