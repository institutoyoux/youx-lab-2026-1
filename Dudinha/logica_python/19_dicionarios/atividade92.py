from datetime import datetime
dados = dict()
dados['nome'] = str(input('Nome:'))
nascimento = int(input('Ano de Nascimento:'))
dados['idade'] = datetime.now().year - nascimento
dados['CDT'] = int(input('Carteira de trabalho (0 não tem):'))
if dados['CDT'] != 0:
    dados['contratação'] = int(input('Ano de contratação:'))
    dados['Salário'] = int(input('Salário:R$'))
    dados['Aposentadoria'] = dados['idade'] + ((dados['contratação'] + 35)) - datetime.now().year
for k,v in dados.items():
    print(f' - {k} tem o valor {v}')