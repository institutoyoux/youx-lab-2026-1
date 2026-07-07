distancia = float(input('Qual a distância da sua viagem? '))
print('Vocé está prestes a começar uma viajem de {}km'.format(distancia))
preço = distancia * 0.50 if distancia <=200 else distancia * 0.45
print('É o preço da sua passaguem será de R${:.2f}'.format(preço))