from datetime import date
ano = date.today().year
maiores = 0
menores = 0
for c in range(1, 8):
    nascimento = int(input(f'Digite o ano que a {c}ª pessoa nasceu:'))
    if nascimento >= ano or nascimento <= 1920:
        pass
    else:
        idade = ano - nascimento
        if idade >= 18:
            maiores += 1
        else:
            menores += 1
print(f'Ao todo tivemos {maiores} maiores de idade')
print(f'E tivemos {menores} menores de idade')