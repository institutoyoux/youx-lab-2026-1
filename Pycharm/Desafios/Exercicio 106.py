while True:
    print("-"*40)
    print("  Menu interativo de ajuda em python")
    print("-"*40)
    h = input("Digite o comando para obter ajuda: ").strip()
    if h:
        help(h)