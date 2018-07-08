''' Calculadora simples com as quatro funções'''
'''Devs Ricardo Brasil'''

# add
def add(x, y):
   return x + y

# sub
def subtract(x, y):
   return x - y

# multiply
def multiply(x, y):
   return x * y

# divide
def divide(x, y):
   return x / y

# pow
def pow(x, y):
   return x ** y

# abs
def abs(x, y):
   return x % y

print("Choice an option:")
print("1.Sum")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")
print("5.Pow")
print("6.Mod")

# Captura a entrada do usuário
choice = input("Choice an option (1/2/3/4/5/6):")
print("Option " + choice + " as selected.\n")

num1 = int(input("Insert first number: "))
num2 = int(input("Insert second number: "))


if choice == '1':
   print('Result: \n')
   print (num1,"+",num2,"=", add(num1,num2))

elif choice == '2':
   print('Result: \n')
   print(num1,"-",num2,"=", subtract(num1,num2))

elif choice == '3':
   print('Result: \n')
   print(num1,"*",num2,"=", multiply(num1,num2))

elif choice == '4':
   print('Result: \n')
   print(num1,"/",num2,"=", divide(num1,num2))

elif choice == '5':
   print('Result: \n')
   print(num1,"**",num2,"=", pow(num1,num2))

elif choice == '6':
   print('Result: \n')
   print(num1, "%", num2, "=", abs(num1, num2))

else:
   print("Invalid Input")