import datetime
ano_nascimento = int(input('Ano de Nascimento:'))
ano_atual = datetime.date.today().year
idade = ano_atual - ano_nascimento
if idade <= 9:
    print('A classificação é MIRIM.')
elif idade <= 14:
    print('A calssificação é INFANTIL.')
elif idade <= 19:
    print('A classificação é JÚNIOR.')
elif idade <= 25:
    print('A classificação é SÊNIOR.')
elif idade > 25:
    print('A classificação é MASTER.')
