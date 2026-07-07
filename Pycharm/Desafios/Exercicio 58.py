from random import randint
computador = randint(0, 10)
print('Sou seu computador... Acabei de pensar em um número entre 0 a 10.')
print('Tente adivinhar qual o número')
acertou = False
while not acertou:
    palpite = int(input("Qual seu palpite: "))
    if palpite == computador:
        acertou = True
        print('Você acertou')
