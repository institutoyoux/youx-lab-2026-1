galera = []
pessoa = {}
soma_idade = 0
while True:
    pessoa.clear()
    pessoa['nome'] = str(input('Nome: '))
    while True:
        pessoa['sexo'] = str(input('Sexo [M/F]: ')).upper()[0]
        if pessoa['sexo'] in ['M', 'F']:
            break
        print('ERRO! Por favor, digite apenas M ou F.')
    pessoa['idade'] = int(input('Idade: '))
    soma_idade += pessoa['idade']
    galera.append(pessoa.copy())
    continuar = str(input('Quer continuar? [S/N] ')).upper()[0]
    if continuar == 'N':
        break
total_pessoas = len(galera)
media_idade = soma_idade / total_pessoas if total_pessoas > 0 else 0
mulheres = []
acima_media = []
for p in galera:
    if p['sexo'] == 'F':
        mulheres.append(p['nome'])
    if p['idade'] > media_idade:
        acima_media.append(p)
print('-=' * 30)
print(f'Total de pessoas cadastradas: {total_pessoas}')
print(f'A média de idade é de: {media_idade:.2f} anos')
print(f'Lista das mulheres cadastradas: {mulheres}')
print(f'Lista de pessoas com idade acima da média:')
for p in acima_media:
    print(f'   -> Nome: {p["nome"]} | Sexo: {p["sexo"]} | Idade: {p["idade"]}')