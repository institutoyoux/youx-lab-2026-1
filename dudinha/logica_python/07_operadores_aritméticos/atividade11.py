larg = float(input('Largura da parede:'))
alt = float(input('Altura da parede:'))
área = larg * alt
print(' Sua parede tem a dimensão de {:.0f}x{:.0f} e sua área é de {:.0f} m².'.format(larg, alt, área))
tinta = área / 2
print('para pintar essa parede,você precisará de {}L de tinta.'.format(tinta))