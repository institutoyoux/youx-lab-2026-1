nota1 = float(input('Primeira notado aluno: '))
nota2 = float(input('Segunda nota do aluno: '))
media = (nota1 + nota2) / 2
print('Tirando {:.1f} e {:.1f}, a media desse aluno é {:.1f}'.format(nota1, nota2, media))
if 7 > media >= 5:
    print('O aluno está de recuperação ')
elif media < 5:
    print('O aluno está reprovado. ')
elif media >= 7:
    print('O aluno está aprovado. ')