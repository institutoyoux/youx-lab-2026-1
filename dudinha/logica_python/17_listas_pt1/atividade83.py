cont = 0
expressao = input('Digite uma expressão: ')
for c in expressao:
    if c == '(':
        cont += 1
    elif c == ')':
        cont -= 1
    if cont < 0:
        print('Expressão invalida')
        break
else:
    if cont == 0:
        print('Expressão valida!')
    else:
        print('Expressão invalida!')