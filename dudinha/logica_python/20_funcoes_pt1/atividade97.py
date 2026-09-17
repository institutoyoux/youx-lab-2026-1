def escreva(msg):
    tam=len(msg)+4
    print('~'*tam)
    print(f'  {msg}')
    print('~' * tam)
palavras=list()
while True:
    palavra=str(input('DIGITE ALGO :'))
    continuar=str(input('Deseja continuar ?[S/N] : '))
    palavras.append(palavra)
    if continuar.upper() == 'N':
        for palavra in palavras:
            escreva(palavra)