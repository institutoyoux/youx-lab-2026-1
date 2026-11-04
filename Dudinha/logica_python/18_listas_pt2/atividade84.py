nome = []
peso = []
while True:
    nome.append(str(input('Nome: ')))
    peso.append(float(input('Peso: ')))
    resposta = str(input('Quer continuar? [S/N]: ')).upper().strip()
    while resposta not in 'NS':
        resposta = str(input('Quer continuar? Digite S ou N: ')).upper().strip()
    if resposta in 'N':
        break
print('*='*30)
print(f'Ao todo foram {len(nome)} pessoas cadastradas.')
print(f'O maior peso foi {max(peso)} kg, peso de ', end='')
for c in range(0, len(nome)):
    if peso[c] == max(peso):
        print(f'"{nome[c]}"', end=' ')
print(f'\nO menor peso foi  {min(peso)} kg, peso de ', end='')
for c in range(0,len(nome)):
    if peso[c] == min(peso):
        print(f'"{nome[c]}"', end='')