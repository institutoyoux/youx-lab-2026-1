from random import randint
computador = randint(0, 2)
print('''Suas opções
[ 0 ] Pedra
[ 1 ] Papel 
[ 2 ] Tesoura''')
jogador = int(input('Qual sua jogada:'))
print('-=-' * 10)
print('Computador jogou: {}'.format(computador))
print('Jogador jogou: {}'.format(jogador))
print('-=-' * 10)
if jogador  > 2:
    print('Jogada invalida')
else:

    if jogador == 1 and computador == 0:
        print('Você ganhou')
    elif jogador == 2 and computador == 1:
        print('Você ganhou')
    elif jogador == 0 and computador == 2:
        print('Você ganhou')
    elif jogador == computador:
        print('Vocês empataram')
    else:
        print('Você perdeu')
    