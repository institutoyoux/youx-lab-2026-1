def leiaint(msg):
    while True:
        try:
            numero = int(input(msg))
        except (ValueError, TypeError):
            print("ERRO: por favor, digite um numero inteiro valido. ")
            continue
        else:
            return numero
num = leiaint("Digite um valor: ")
print(f"O valor digitado foi {num}")