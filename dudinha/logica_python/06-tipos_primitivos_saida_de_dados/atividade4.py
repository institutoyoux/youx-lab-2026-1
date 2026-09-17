from curses.ascii import isspace

a = input('digite algo:')
print ('o tipo primitivo desse valor é',type(a))
print ('só tem espaços?',a.isspace())
print('é um número?',a.isnumeric())
print('é um alfabeto?',a.isalpha())
print('é alfanúmerico?',a.isalnum())
print('está em maiúsculas?',a.isupper())
print('está em minúscula?',a.islower())
print('está capitalizada?',a.istitle())
