soma = 0
cont = 0
for numero in range(1,501, 2):
    if numero % 3 == 0:
        cont = cont + 1
        soma = soma + numero
print('A soma entre todos os {} valores é {}'.format(cont, soma))