#Exercício Python 078: Faça um programa que leia 5 valores numéricos e guarde-os em uma lista.
# No final, mostre qual foi o maior e o menor valor digitado e as suas respectivas posições na lista.lista
lista = []
max = 0
min = 0
for c in range (0, 5):
    lista.append(int(input(f'Digite um valor para a {c}ª posição:')))
    if c == 0:
        max = lista[c]
        min = lista[c]
    else:
        if lista[c] > max:
            max = lista[c]
        elif lista[c] < min:
            min = lista[c]
print(f'Sua lista e {lista}')
print(f'O maior valor digitado foi:{max}')
print(f'O menor valor digitado foi:{min} ')