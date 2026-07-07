real = float(input('Quanto dinheiro voce tem na carteira? R$'))
dolar = real / 4.99
euro = real / 5.86
print('Com R${:.2f} voce pode comprar US${:.2f} EU${:.2f}' .format(real, dolar, euro))
