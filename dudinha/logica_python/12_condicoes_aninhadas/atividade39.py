from datetime import date

from django.db.models.functions import datetime

ano_atual = date.today().year
nascimento = int(input('Qual ano você nasceu?'))
idade = ano_atual-nascimento
print('quem nasceu em {} tem {} anos em {}.'.format(nascimento, idade, ano_atual))
if idade < 18:
    print('falta {} anos pra você se alistar.'.format())
elif idade == 18:
    print('está na hora de se alistar.'.format(ano_atual))
elif idade > 18:
    print('Já passou do tempo do alistamento!você deveria tar se alistado a {} anos.'.format(date))