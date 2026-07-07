from random import randint
def sort(l):
    print(f"Sorteando 5 valores para a lista: ", end="")
    for i in range(0,5):
        r = randint(0, 10)
        l.append(r)
        print(r, end=" ")
    print("PRONTO!")
def som(l):
    so = 0
    for i in l:
        if i % 2 == 0:
            so += i
    print(f"Somando os valores pares de {l}, temos o resultado de {so}")
l = []
sort(l)
som(l)