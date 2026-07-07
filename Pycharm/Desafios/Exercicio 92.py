from datetime import date
t = {}
h = date.today().year
t["nome"] = input("Nome: ").strip()
t["idade"] = h - int(input("Ano de nascimento: "))
t["ctps"] = int(input("Carteira de trabalho (use 0 para não tem): "))
if t["ctps"] != 0:
    t["contratação"] = int(input("Ano de contratação: "))
    t["salario"] = float(input("Salario: "))
    t["aposentadoria"] = (t["contratação"] + 35) - h + t["idade"]
print("-"*25)
for n, v in t.items():
    print(f"  - {n} tem o valor {v}")