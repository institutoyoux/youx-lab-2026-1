from random import randint
from time import sleep
computador = randint(0, 5) #faz o computador pensar
print('-==-' * 20)
print('Vou pensar em um número entre 0 a 5. tente adivinhar...')
print('-==-' * 20)
jogador = int(input('Em que número eu pensei? '))
print('PROCESSANDO...')
sleep(2)
if jogador == computador:
    print('Parabéns! Vocé conseguiu vencer!')
else:
    print('GANHEI! Eu pensei no número {} e nao no {}!'.format(computador, jogador))
