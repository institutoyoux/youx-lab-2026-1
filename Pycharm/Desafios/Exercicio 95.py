print("-"*24)
print("  CADASTRO JOGADORES")
print("-"*24)
d = {}
l = []
while True:
    n = input("Nome: ").strip()
    p = int(input(f"Quantas partidas {n} jogou?: "))
    gols = []
    total = 0
    for i in range(0, p):
        gi = int(input(f"  Quantos gols {n} fez na partida {i+1}?: "))
        gols.append(gi)
        total += gi
    o = input(f"Deseja continuar? [S/N]: ").strip()[0]
    while o not in "SsNn":
        print("Opção invalida! use S ou N")
        o = input(f"Deseja continuar? [S/N]: ")
    d["nome"] = n
    d["gols"] = gols
    d["total"] = total
    l.append(d.copy())
    d.clear()
    if o in "Nn":
        print("-="*25)
        break
    print("-"*25)
print(f"{'Cod':<4} {'Nome':<10} {'Total':<15} {'Gols'}")
print('-'*40)
for i in l:
    print(f"{l.index(i)+1:<4} {i['nome']:<10} {i['total']:<15} {i['gols']}", end="")
    print()
while True:
    o = int(input("Mostrar dados de qual jogador? (999 para sair): "))
    if o == 999:
        break
    else:
        if o <= len(l) and o >= 1:
            print(f"-- LEVANTAMENTO DO JOGADOR {l[o-1]['nome']}: --")
            for n, v in enumerate(l[o-1]["gols"]):
                print(f"  No jogo {n+1} fez {v} gols.")
        else:
            print(f"Jogador invalido, digite um jogador com o cod de 0 a {len(l)}")