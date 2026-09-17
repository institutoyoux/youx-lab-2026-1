sexo = str(input('Informe seu sexo:[M/F]'))
while sexo not in 'MmFf':
    sexo = str(input('Dados inválidos.Informe novamente seu sexo:')).strip().upper()[0]
print(f'Sexo {sexo} foi registrado com sucesso.')