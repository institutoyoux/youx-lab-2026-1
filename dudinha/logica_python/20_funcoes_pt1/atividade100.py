from random import randint
def sorteia(lista):
    print("Sorteando 5 valores para a lista: ", end="")
    for i in range(5):
        numero = randint(1, 10)
        lista.append(numero)
        print(f"{numero} ", end="", flush=True)
    print("PRONTO!")
def somaPar(lista):
    soma = 0
    for valor in lista:
        if valor % 2 == 0:
            soma += valor
    print(f"Somando os valores pares de {lista}, temos {soma}.")
numeros = []
sorteia(numeros)
somaPar(numeros)