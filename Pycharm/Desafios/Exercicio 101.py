def si(ano):
    from datetime import date
    h = date.today().year
    id = h - ano
    if id < 15:
        print(f"Com {id} anos o voto é proibido")
    if id >= 16 and id < 18 or id >= 65:
        print(f"Com {id} anos o voto é opcional")
    if id >= 18 and id < 65:
        print(f"Com {id} anos o voto é obrigatório")
si(int(input("Seu ano de nascimento: ")))