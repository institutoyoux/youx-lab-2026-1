numeros = []
pares = []
impares = []
while True:
    numeros.append(int(input('Digite um número: ')))
    resposta = str(input('Quer continuar? [S/N] ')).strip().upper()[0]
    while resposta not in 'SN':
        resposta = str(input('Opção inválida. Quer continuar? [S/N] ')).strip().upper()[0]
    if resposta == 'N':
        break
for num in numeros:
    if num % 2 == 0:
        pares.append(num)
    else:
        impares.append(num)
print('-=' * 20)
print(f'A lista completa de números é: {numeros}')
print(f'A lista de números pares é: {pares}')
print(f'A lista de números ímpares é: {impares}')