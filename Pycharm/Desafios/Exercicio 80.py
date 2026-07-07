lista = []
con = 0
while con <= 5:
    con += 1
    valor = int(input(f"Digite um valor: "))
    if valor not in lista:
        lista.append(valor)
        lista.sort()
        lu = lista.index(valor)
        if con == 1:
            print("Valor adicionado a lista!")
        else:
            print(f"O número {valor} foi adicionado na posição {lu} da lista")
    else:
        print(f"o número {valor} já foi adicionado!")
        con -= 1
print(f"Os valores em ordem foram: {lista}")