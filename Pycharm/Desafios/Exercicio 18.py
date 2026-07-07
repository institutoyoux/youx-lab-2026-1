from math import radians, sin, cos, tan
ângulo = float(input('Digite o ângulo que vocé deseja: '))
seno = sin(radians(ângulo))
print('O ângulo de {} e o seno de {:.2f}'.format(ângulo, seno))
cosseno = cos(radians(ângulo))
print('O ângulo de {} e o Cosseno de {:.2f}'.format(ângulo, cosseno))
tangente = tan(radians(ângulo))
print('O ângulo de {} e a tangente de {:.2f}'.format(ângulo, tangente))