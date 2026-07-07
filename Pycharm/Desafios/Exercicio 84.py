dados = []
lista = []
ma = me = 0
continuar = True

while continuar:
    dados.append(input("Nome: "))
    dados.append(int(input("Peso: ")))

    if len(lista) == 0:
        ma = me = dados[1]
    else:
        if dados[1] > ma:
            ma = dados[1]
        if dados[1] < me:
            me = dados[1]

    lista.append(dados[:])
    dados.clear()

    o = input("Deseja continuar? [S/N]: ").strip().upper()[0]

    if o == "N":
        continuar = False

print(f"\nAo todo você cadastrou {len(lista)} pessoas.")

# Maior peso
maiores = []
for p in lista:
    if p[1] == ma:
        maiores.append(p[0])

print(f"O maior peso registrado foi {ma}Kg. Peso de {', '.join(maiores)}")

# Menor peso
menores = []
for p in lista:
    if p[1] == me:
        menores.append(p[0])

print(f"O menor peso registrado foi {me}Kg. Peso de {', '.join(menores)}")