from random import choice
print('''Suas opções:
[1]PEDRA
[2]PAPEL
[3]TESOURA''')
jogador = float(input('Qual vai ser sua jogada?'))
lista = (1, 2, 3)
resultado = choice(lista)
if resultado == jogador:
    print('Empate')
elif resultado == 1 and jogador == 2 or jogador == 2 and jogador == 3 or resultado == 3 and jogador == 1:
    print('Você ganhou!!')
else:
    print('Você perdeu!!')