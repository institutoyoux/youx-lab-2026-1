while True:
    numero = int(input('Quer ver a tabuada de qual valor?'))
    print('_' * 25)
    if numero < 0:
        break
    for c in range(1,11):
        print(f'{numero} x {c} = {numero*c}')
    print('_' * 25)
print('PROGRAMA TABUADA ENCERRADO.Volte sempre!')