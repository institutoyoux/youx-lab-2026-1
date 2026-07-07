print('{:=^40}'.format('LOJA DO PAIM'))
preco = float(input('Preço das comprar: R$'))
print('''Formas de pagamento
[ 1 ] á vista dinheiro/cheque com 10% de desconto
[ 2 ] á vista no cartão com 5% de desconto
[ 3 ] em até 2x no cartão sem juros 
[ 4 ] 3x ou mais no cartão com 20% de desconto''')
opcao = int(input('Informe sua opção de pagamento:'))
if opcao == 1:
    total = preco - (preco * 10 / 100)
elif opcao == 2:
    total = preco - (preco * 5 / 100)
elif opcao == 3:
    total = preco
    parcela = total / 2
    print('Sua compra será parcelada em 2x de R${:.2f}'.format(parcela))
elif opcao == 4:
    total = preco + (preco * 20 / 100)
    tparcelas = int(input('Quantas parcelas?'))
    parcela = total / tparcelas
    print('Sua compra parcelada em {}x ira custar R${:.2f} com juros!'.format(tparcelas, parcela))
else:
    total = preco
    print('Opção de pagamento invalida, tente novamente')
print('Sua compra de R${:.2f} vai custar {:.2f}'. format(preco, total))