def maior(* nmr):
    ma = 0
    for i in nmr:
        if nmr.index(i) == 0:
            ma = i
        elif i > ma:
            ma = i
    print("-"*20)
    print(f"Analisando valores passados:\n{nmr} Foram informados {len(nmr)} números ao todo.\n{ma} foi o maior valor informado!")

maior(5, 8, 0, 2)