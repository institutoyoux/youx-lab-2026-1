import moeda

p = float(input('Digite o preço: R$ '))
print(f'A metade de {moeda.moeda(p)} é {moeda.metade(p, True)}.')
print(f'O dobro de {moeda.moeda(p)} é {moeda.dobro(p, True)}.')
print(f'Aumentando 10%, temos {moeda.moeda(moeda.aumentar(p, 10, True))}.')
print(f'Reduzido 13%, temos {moeda.diminuir(p, 13, True)}.')
def aumentar(preco=0, taxa=0, formato=False):
    res = preco + (preco * taxa / 100)
    return res if not formato is False else moeda(res)