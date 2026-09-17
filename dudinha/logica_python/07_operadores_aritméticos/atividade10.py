real = float(input('quanto dinheiro você tem na carteira?R$'))
dolar = real / 3.27
print('com R${:.2f} você pode comprar US${:.2f}'.format(real, dolar))
