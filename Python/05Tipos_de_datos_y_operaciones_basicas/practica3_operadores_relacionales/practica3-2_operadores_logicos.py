#imprimir true si la edad es par
#y si no es mayor de 24 

edad=24
condicion1= (edad%2) ==0
condicion2 = not(edad>24)
resultado= condicion1 and condicion2
print(resultado)