d = {}
l = []
co = 0
mi = 0
while True:
    co += 1
    d["nome"] = input("Nome: ").strip()
    sx = input("Sexo [M/F]: ").strip()[0]
    while True:
        if sx in "MmFf":
            d["sexo"] = sx
            break
        else:
            print("Sexo invalido! Use apenas M ou F")
            sx = input("Sexo [M/F]: ").strip()[0]
    d["idade"] = int(input("Idade: "))
    mi += d["idade"]
    o = input("Quer continuar? [S/N]: ").strip()[0]
    while o not in "SsNn":
            print("Opção invalida use apenas S ou N")
            o = input("Quer continuar? [S/N]: ").strip()[0]
    l.append(d.copy())
    if o in "Nn":
        break
    d.clear()
    print("-"*20)
print("-="*25)
print(f"A) Ao todo temos {len(l)} pessoas cadastradas.")
print(f"B) A média de idade é de {mi / len(l)} anos.")
com = []
for i, e in enumerate(l):
    if e["sexo"] in "Ff":
        com.append(e["nome"])
if com:
    print("C) As mulheres registradas foram: ", end="")
    for i, e in enumerate(com):
        if i+1 == len(com):
            print(e)
        else:
            print(f"{e}, ", end="")
else:
    print("C) Não tivemos mulheres cadastradas")
print(f"D) Lista das pessoas com idade acima da média:")
for i in l:
    for n, v in enumerate(i):
        if i['idade'] > (mi / len(l)):
            print(f" {v} = {i[v]}; ", end="")
    print()
print("<< ENCERRADO >>")