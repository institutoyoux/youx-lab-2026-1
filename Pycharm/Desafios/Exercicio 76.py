from resource import RLIMIT_STACK

lista = ('Lápis',1.50,
             'Borracha',2,
             'Apontador',3,
             'Mochila',150,
             'Livros',55.70)
print('-'*40)
print('LISTAGUEM DE PREÇOS')
print('-'*40)
for pos in range(0, len(lista)):
    if pos % 2 ==0:
        print(f'{lista[pos]:.<40}', end='')
    else:
        print(f'R${lista[pos]:>10.2f}')