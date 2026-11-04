lista_numero = []
maior = 0
menor = 0
for c in range(0, 5):
    lista_numero.append(int(input(f'Digite um valor para a posição {c}:')))
    if c == 0:
        maior = menor = lista_numero[c]
    else:
        if lista_numero[c] > maior:
            maior = lista_numero[c]
        if lista_numero[c] < menor:
            menor = lista_numero[c]
print('_'*40)
print(f'Vocẽ digitou os valores: {lista_numero}')
print(f'O maior valor digitado foi {maior} nas posições ', end='')
for i,v in enumerate(lista_numero):
    if v == maior:
        print(f'{i}...', end='')
print()
print(f'O menor valor digitado foi {menor} nas posições ', end='')
for i,v in enumerate(lista_numero):
    if v == menor:
        print(f'{i}...', end='')
print()
print('_'*40)