p = int(input('Digite o primeiro termo: '))
r = int(input('Digite a razão: '))
de = p + (10 - 1) * r
for i in range(p, de + r, r):
    print('{} -> '.format(i), end='')
print('FIM!')
