def j(n="desconhecido", g=0):
    print(f"O jogador {n} fez {g} gols.")

n = input("Nome jogador: ")
g = input("Número de gols: ")
if g.isnumeric():
    g = int(g)
else:
    g = 0
if n.strip()[:] == '':
    j(g=g)
else:
    j(n, g)