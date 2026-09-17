from random import randint
computador = randint(0, 10)
acertou = False
tentativas = 0
print('Sou seu computador...')
print('Acabei de pensar em um número entre 0 e 10.')
print('Será que você consegue adivinhar qual foi?')
while not acertou:
    palpite = int(input('Qual é o seu palpite?'))
    tentativas += 1
    if palpite == computador:
       acertou = True
    else:
     if palpite < computador:
         print('Mais...tente novamente')
     else:
         print('Menos...tente novamente')
print(f'ACERTOU com {tentativas} tentativas.Parabéns!')