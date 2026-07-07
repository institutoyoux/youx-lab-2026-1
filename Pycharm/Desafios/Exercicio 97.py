def pr(msg):
    co = 4
    for i in range(0, len(msg)):
        co += 1
    print("~"*co)
    print(f"  {msg}")
    print("~"*co)
pr("TESTE AQUI")
pr("teste dnv")
pr("k")