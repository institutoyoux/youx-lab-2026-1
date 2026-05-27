from utilidadeCeV import moeda
from utilidadeCeV import dado
preco = dado.leiaDinheiro('Digite o preço: R$ ')
print(f'A metade de {moeda.moeda(preco)} é {moeda.metade(preco, True)}.')
print(f'O dobro de {moeda.moeda(preco)} é {moeda.dobro(preco, True)}.')
print(f'Aumentando 10%, temos {moeda.aumentar(preco, 10, True)}.')
print(f'Reduzido 13%, temos {moeda.diminuir(preco, 13, True)}.')
def leiaint(msg):
    while True:
        try:
            numero = int(input(msg))
        except (ValueError, TypeError):
            print("ERRO: por favor, digite um numero inteiro valido. ")
            continue
        else:
            return numero
num = leiaint("Digite um valor: ")
print(f"O valor digitado foi {num}")