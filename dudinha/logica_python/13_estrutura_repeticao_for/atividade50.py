soma = 0
contagem = 0
for c in range(1, 7):
    numero = int(input(f"Digite o {c} valor:"))
    if numero %2 == 0:
        soma = soma + numero
        contagem = (contagem + 1)
        print(f"Você informou {(contagem)}, e a soma foi de {(numero)}")
