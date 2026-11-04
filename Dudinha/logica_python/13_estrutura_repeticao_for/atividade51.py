primeiro_termo = int(input('Digite o primeiro termo:'))
razao = int(input('Digite a razao:'))
for c in range (0, 10, 1):
    pa = primeiro_termo + (c-0) * razao
    print(pa,end='->')
print('FIM')
