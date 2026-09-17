preco = float(input('Qual o valor da compra?'))
print('''qual vai ser a forma de pagamento?
[1] A vista dinheiro/cheque
[2] A vista no cartão 
[3] Em até 2x no cartão 
[4] 3x ou mais no cartão''')
opcao = int(input('Qual vai ser a forma de pagamento?'''))
if opcao == 1:
    total = preco - ( preco * 10 / 100 )
elif opcao == 2:
    total = preco - (preco * 5 / 100)
elif opcao == 3:
    total = preco
elif opcao == 4:
    total = (preco * 0.20)
print(f'Sua compra de {(preco):.2f} no final vai custar {(total):.2f}.')