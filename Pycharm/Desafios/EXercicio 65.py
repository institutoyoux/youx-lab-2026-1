resposta = 'S'
soma = quantia = media = maior = menor = 0
while resposta in 'Ss':
    numero = int(input('Digite um número:'))
    soma += numero
    quantia += 1
    if quantia == 1:
        maior = menor = numero
    else:
        if numero > maior:
            maior = numero
        if numero < menor :
            menor = numero
    resposta = str(input('Quer continuar? [S/N] ')).upper().strip()[0]
media = soma / quantia
print(f'Você digitou {quantia} número e a média foi {media}')
print(f'O maior valor e {maior} e o menor e {menor}. ')