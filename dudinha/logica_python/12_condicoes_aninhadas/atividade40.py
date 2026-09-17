nota1 = float(input('primeira nota:'))
nota2 = float(input('segunda nota:'))
m = (nota1 + nota2)/2
print('Tirando {} e {},a média é {}.'.format(nota1, nota2, m))
if m < 5.0:
    print('O aluno está REPROVADO.')
elif m > 5.0 and m < 6.9:
    print('O aluno está de RECUPERAÇÃO.')
elif m >= 7:
    print('O aluno está APROVADO!')