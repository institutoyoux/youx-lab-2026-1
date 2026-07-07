peso = float(input('Qual e o seu peso? '))
altura = float(input('Qual sua altura? '))
imc = peso / (altura ** 2)
print('O IMC dessa pessoa e de {:.2f}'.format(imc))
if imc < 18.5:
    print('Vocé está abaixo do peso normal')
elif 18.5 <= imc < 25:
    print('PARABENS! Vocé está no peso ideal')
elif 25 <= imc < 30:
    print('Vocé está com sobrepeso')
elif 30 <= imc < 40:
    print('Vocé está com obesidade')
else:
    print('Vocé está com obesidade mórbida')
