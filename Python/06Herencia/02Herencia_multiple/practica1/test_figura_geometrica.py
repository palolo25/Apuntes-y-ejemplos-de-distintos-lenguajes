from Cuadrado import Cuadrado
from Rectangulo import Rectangulo



print('Creacion de objeto Cuadrado'.center(50, '-'))
cuadrado1 = Cuadrado(5,'rojo')
print(f'Calculo del area: {cuadrado1.calcular_area()}')
print(cuadrado1)

# MRO - Method Resolution Order
print('Cuadrado con MRO'.center(50, '-'))
print(Cuadrado.mro())

# Rectangulo 
print('Creacion de objeto Rectangulo'.center(50, '-'))
rectangulo1 = Rectangulo(3, 8, 'verde')

print(f'Calculo de area rectangulo: {rectangulo1.calcular_area()}' )
print(rectangulo1)