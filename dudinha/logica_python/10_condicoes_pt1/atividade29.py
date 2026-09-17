Velocidade = float(input('Qual é a velocidade atual do carro?'))
if Velocidade > 80:
    print('MULTADO!Você excedeu o limite permitido que é 80 km/h')
    Multa = (Velocidade - 80) * 7
    print(f"você deve pagar uma multa de {(Multa)}")