def v(i):
    if i.isnumeric():
        return True
    else:
        return False
while True:
    a = input("Digite o número: ")
    if v(a):
        print(f"Você acabou de digitar o número {a}")
    else: print("Erro! digite um número valido.")