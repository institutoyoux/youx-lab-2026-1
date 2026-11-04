frase = str(input('Digite uma frase:').strip().lower().replace(' ',' '))
frase_2 = (frase[:: - 1])
print(frase_2)
if frase == frase_2:
    print('palíndromo')
else:
    print('Não é palíndromo')