l = [[0,0,0], [0,0,0], [0,0,0]]
sp = 0
st = 0
ms = 0
for i in range(0,3):
    for e in range(0,3):
        l[i][e] = int(input(f"digite o valor da posição [{i}, {e}]: "))
        if l[i][e] % 2 == 0:
            sp += l[i][e]
for i in l:
    for e in i:
        print(f"[{e:^4}]  ", end="")
    print()
for i in range(0, 3):
    st += l[i][2]
for i in l[1]:
    if i == l[1][0]:
        ms = i
    elif i > ms:
        ms = i
print(f"A soma dos valores pares é {sp}")
print(f"A soma dos valores da terceira coluna é: {st}")
print(f"O maior valor da segunda linha é: {ms}")