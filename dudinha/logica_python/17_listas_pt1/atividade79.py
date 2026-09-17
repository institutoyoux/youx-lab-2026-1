lista_valores = []
while True:
    valor = int(input('Digite um valor:'))
    if valor not in lista_valores:
        lista_valores.append(valor)
        print('Valor adicionado com sucesso..')
    else:
        print('Valor duplicado! Não será adicionado...')
    r = str(input('Quer continuar? [S/N] '))
    if r in 'Nn':
        break
print(f'Você digitou os valores: {lista_valores}.')




