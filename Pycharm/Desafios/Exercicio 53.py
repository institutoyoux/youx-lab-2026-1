palavra = str(input("Digite uma palavra/frase: ")).upper().strip().replace(' ', '')
if palavra == palavra[::-1]:
    print("E políndromo")
else:
    print("Não e políndromo")