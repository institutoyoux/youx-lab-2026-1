matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
soma_pares = soma_terceira_coluna = maior_segunda_linha = 0
for l in range(0, 3):
    for c in range(0, 3):
        matriz[l][c] = int(input(f"Digite um valor para [{l}, {c}]: "))
        if matriz[l][c] % 2 == 0:
            soma_pares += matriz[l][c]
        if c == 2:
            soma_terceira_coluna += matriz[l][c]
        if l == 1:
            if c == 0:
                maior_segunda_linha = matriz[l][c]
            elif matriz[l][c] > maior_segunda_linha:
                maior_segunda_linha = matriz[l][c]
print("-=" * 30)
print("Matriz final:")
print("-=" * 30)
for l in range(0, 3):
    for c in range(0, 3):
        print(f"[{matriz[l][c]:^5}]", end="")
    print()
print("-=" * 30)
print(f"A soma de todos os valores pares digitados é {soma_pares}.")
print(f"A soma dos valores da terceira coluna é {soma_terceira_coluna}.")
print(f"O maior valor da segunda linha é {maior_segunda_linha}.")
