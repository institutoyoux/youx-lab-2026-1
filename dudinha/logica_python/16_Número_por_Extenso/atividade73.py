Times = ('Atlético-MG', 'Athletico-PR', 'Bahia', 'Botafogo', 'Chapecoense',
'Corinthians', 'Coritiba','Cruzeiro', 'Flamengo',
'Fluminense', 'Grêmio', 'Internacional', 'Mirassol',
'Palmeiras', 'Red Bull', 'Bragantino',
'Remo', 'Santos', 'São Paulo', 'Vasco da Gama')
print('_' * 30)
print(f'Lista de times do Brazileirão:')
print('_' * 19)
print(f'Os 5 primeiros são:{Times[0:5]}')
print('_' * 18)
print(f'Os 4 últimos são:{Times[-4:]}')
print('_' * 26)
print(f'Times em ordem alfabética:{sorted(Times)}')
print('_' * 27)
print(f'O Cruzeiro está na {Times.index("Cruzeiro")+1} posição.')