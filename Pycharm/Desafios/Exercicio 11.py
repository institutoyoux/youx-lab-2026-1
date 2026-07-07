largura = float(input('Largura da parede: '))
altura = float(input('Altura da parede: '))
área = largura * altura
print('A sua parede tem a dimensão de {}x{} e sua área e de {}m². '.format(largura, altura, área))
tinta = área / 2
print('Para pintar está parede, vocé precisará de {}L de tinta.'.format(tinta))
