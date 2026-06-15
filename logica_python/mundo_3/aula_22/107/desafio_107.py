def aumentar(preço, taxa):
    res = preço + (preço * taxa/100)
    return res
def diminuir(preço, taxa):
    res = preço - (preço * taxa/100)
    return res
def dobro(preço):
    res = preço * 2
    return res
def metade(preço):
    res = preço / 2
    return res

preço = (float(input('Digite seu preço: R$ ')))
print(f'A medate de {preço} é {metade(preço)}')
print(f'O dobro de {preço} é {dobro(preço)}')
print(f'Aumentado 10%, temos {aumentar(preço, 10)}')
