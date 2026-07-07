def f(n, show):
    """
    função que retorna o fatorial de um número!
    :param n: valor a ser fatorado
    :param show: define se deve exibir a conta ou apenas o resultado
    :return:
    """
    f = 1
    for i in range(0, n):
        f *= n-i
        if show:
            if i+1 < n:
                print("{}".format(n - i), end=" x ")
            else:
                print("{}".format(n - i), end=" = ")
    return f

print(f(5, True))