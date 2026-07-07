cont = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze', 'cartoze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte')
while True:
    numero = int(input('Dgite um número entre 0 e 20: '))
    if 0<= numero <= 20:
        break
    print('Tente novamente.', end='')
print(f'Você digitou o número {cont[numero]}')