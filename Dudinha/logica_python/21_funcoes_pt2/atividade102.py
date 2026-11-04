def fatorial(num, show=False):
    """
     Calcula o fatorial de um número.
     :param num: O número a ser calculado.
     :param show: (Opcional) Valor lógico (True/False) para mostrar ou não o processo.
     :return: O valor do fatorial do número.
     """
    f = 1
    for c in range(num, 0, -1):
        if show:
            print(f"{c}", end="")
            if c > 1:
                print(" x ", end="")
            else:
                print(" = ", end="")
        f *= c
    return f
print(fatorial(5, show=True))
help(fatorial)