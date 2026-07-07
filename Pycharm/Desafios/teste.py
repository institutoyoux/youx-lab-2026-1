funcionarios = [
    {"Nome": "José",      "Salario": 1500, "anos_trabalhados": 6},
    {"Nome": "Maria",     "Salario": 1800, "anos_trabalhados": 4},
    {"Nome": "João",      "Salario": 2200, "anos_trabalhados": 8},
    {"Nome": "Ana",       "Salario": 2000, "anos_trabalhados": 3},
    {"Nome": "Carlos",    "Salario": 2500, "anos_trabalhados": 10},
    {"Nome": "Paula",     "Salario": 2300, "anos_trabalhados": 5},
    {"Nome": "Marcos",    "Salario": 1900, "anos_trabalhados": 2},
    {"Nome": "Fernanda",  "Salario": 2600, "anos_trabalhados": 7},
    {"Nome": "Rafael",    "Salario": 2100, "anos_trabalhados": 4},
    {"Nome": "Clara",     "Salario": 2400, "anos_trabalhados": 6},
    {"Nome": "Bruno",     "Salario": 1700, "anos_trabalhados": 1},
    {"Nome": "Luiza",     "Salario": 2800, "anos_trabalhados": 9},
    {"Nome": "Felipe",    "Salario": 1950, "anos_trabalhados": 3},
    {"Nome": "Camila",    "Salario": 2250, "anos_trabalhados": 5},
    {"Nome": "Ricardo",   "Salario": 2700, "anos_trabalhados": 11},
    {"Nome": "Patrícia",  "Salario": 2100, "anos_trabalhados": 4},
    {"Nome": "Gustavo",   "Salario": 2600, "anos_trabalhados": 8},
    {"Nome": "Larissa",   "Salario": 1850, "anos_trabalhados": 2},
    {"Nome": "Tiago",     "Salario": 2350, "anos_trabalhados": 6},
    {"Nome": "Renata",    "Salario": 2550, "anos_trabalhados": 7},
    {"Nome": "Diego",     "Salario": 2000, "anos_trabalhados": 3},
    {"Nome": "Beatriz",   "Salario": 2450, "anos_trabalhados": 5},
    {"Nome": "André",     "Salario": 1900, "anos_trabalhados": 2},
    {"Nome": "Aline",     "Salario": 2300, "anos_trabalhados": 4},
    {"Nome": "Fábio",     "Salario": 2750, "anos_trabalhados": 9},
    {"Nome": "Sofia",     "Salario": 2150, "anos_trabalhados": 3},
    {"Nome": "Eduardo",   "Salario": 2650, "anos_trabalhados": 8},
    {"Nome": "Carolina",  "Salario": 2050, "anos_trabalhados": 4},
    {"Nome": "Henrique",  "Salario": 2500, "anos_trabalhados": 6},
] #Criei a lista dos funcionarios
for l in funcionarios: #Usei o for para ler a lista de funcionarios inteira
    if l['anos_trabalhados'] <= 5: #Condição para que se os anos trabalhados forem menor que 5
        l['salario_novo'] = l['Salario'] * 1.10 #Recebendo 10% de aumento no salario
    elif l['anos_trabalhados'] > 5:#Condição para que se os anos trabalhados forem maior do que 5
        l['salario_novo'] = l['Salario'] * 1.20#Rebendo 20% de aumento no salario
    print('Funcionário {}, Salario antigo {}, Salario novo {:.2f}'.format(l['Nome'],  l['Salario'], l['salario_novo'] ))#Mostrei o novo resultado dos salarios da lista
    print('-=' * 33)
#Minha maior dificuldade foi a conta da %