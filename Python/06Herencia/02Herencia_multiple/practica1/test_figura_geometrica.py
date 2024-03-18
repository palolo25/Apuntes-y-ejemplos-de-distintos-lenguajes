from Cuadrado import Cuadrado
from Rectangulo import Rectangulo
cuadrado1 = Cuadrado(5,'rojo')

print(f' Calculo del area: {cuadrado1.calcular_area()}')
print(cuadrado1)

# MRO - Method Resolution Order
print(Cuadrado.mro())

# Rectangulo 

rectangulo1 = Rectangulo(3, 8, 'verde')

print(f'Calculo de area rectangulo: {rectangulo1.calcular_area()}' )
print(rectangulo1)