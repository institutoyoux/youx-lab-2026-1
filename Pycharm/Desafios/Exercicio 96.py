def area(l, c):
    return (l * c)

print("   Controle de Terrenos")
print("-"*25)
l = float(input("Largura (m): "))
c = float(input("Cumprimento (m): "))
print(f"A area de de um terreno {l}x{c} é {area(l, c)}m²")