from time import sleep
def con(i, f, t):
    print(f"Contagem de {i} a {f} de {abs(t)} em {abs(t)}")
    for i in range(i, f, t):
        print(f"{i} ", end="")
        sleep(0.35)
    print("FIM!")
    sleep(0.35)
    print("-="*20)
print("-="*20)
con(0,11,1)
con(10, 0, -1)
print("Agora é sua vez de personalizar a contagem!")
con(int(input("Início: ")), int(input("Fim: ")), int(input("Passo:")))