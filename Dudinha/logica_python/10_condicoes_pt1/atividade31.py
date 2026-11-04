distancia = float(input('Qual é a distância da sua viajem?'))
print('Vocẽ está prestes a começar uma viajem de {:.0f}km.'.format(distancia))
if distancia <= 200:
    preço = distancia * 0.50
else:
    preço = distancia * 0.45
print('E o preço da sua passagem será R${:.2f}'.format(preço))