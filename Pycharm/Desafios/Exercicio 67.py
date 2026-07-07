while True:
    numero = int(input('Qual tabuada vc deseja ver?:'))
    if numero < 0:
        break
    for c in range(1, 11):
        print(f'{numero} x {c} = {numero*c}')
print('Fim da tabuata')