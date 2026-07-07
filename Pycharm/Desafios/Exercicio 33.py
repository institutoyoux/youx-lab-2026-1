a = int(input('Primeiro valor: '))
b = int(input('Segundo valor: '))
c = int(input('Segundo valor: '))
#Verificando qual e o menor
menor = a
if b < a and b < c:
    menor = c
if c < a and c < b:
    menor = b
#Verificando qual e o maior
maior = a
if b > a and b > c:
    maior = b
if c > a and c > b:
    maior = c
print('O menor valor digitado foi {}'.format(menor))
print('O maior valor digitado foi {}'.format(maior))
