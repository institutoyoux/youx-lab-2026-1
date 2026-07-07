j = {
    "nome": input("Nome do jogador: "),
    "gols": [],
    "total": 0
}
for i in range(0, int(input(f"Quantas partidas {j['nome']} jogou?: "))):
    inp = int(input(f"   Quantos gols {j['nome']} fez na partida {i+1}: "))
    j["gols"].append(inp)
    j["total"] += inp
print("--"*25)
print(j)
print("--"*25)
for n, v in j.items():
    print(f"O campo {n} tem o valor {v}")
print("--"*25)
print(f"O jogador {j['nome']} jogou {len(j['gols'])} partidas!")
for i, e in enumerate(j["gols"]):
    print(f"   => Na partida {i+1}, fez {e} gols.")
print(f"Foi um total de {j['total']} gols.")