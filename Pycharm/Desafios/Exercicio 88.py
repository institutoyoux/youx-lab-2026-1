from random import randint
from time import sleep
lista = list()
jogo = list()
print('-=' * 20)
print('-----------Jogo da Mega Sena------------')
print('-=' * 20)
quantia = int(input('Quantos jogos vc quer fazer:'))
total = 1
while total <= quantia:
    cont = 0
    while True:
        numero = randint(1, 60)
        if numero not in lista:
            lista.append(numero)
            cont += 1
        if cont >= 6:
            break
    lista.sort()
    jogo.append(lista[:])
    lista.clear()
    total += 1
print('-=' * 5, f'Sorteando {quantia} Jogos', '-=' * 5)
for i, l in enumerate(jogo):
    print(f'Jogo {i+1}: {l}')
    sleep(1)
print('-=' * 5, '< BOA SORTE >', '-=' * 5)