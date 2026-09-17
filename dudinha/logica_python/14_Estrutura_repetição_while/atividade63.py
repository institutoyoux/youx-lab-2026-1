
t1 = 0
numero = int(input('Quantos termos você quer mostrar? '))
t2 = 1
cont = 3
if numero <= 0:
    print('Por favor, digite um número maior que zero. ')
elif numero == 1:
    print(f"{t1}")
else:
    print(f" {t1} - {t2}", end=' ')
    while cont <= 0:
        t3 = t1 + t2
        print(f" - {t3}", end=' ')
        t1 = t2
        t2 = t3
        cont == 1
        print()