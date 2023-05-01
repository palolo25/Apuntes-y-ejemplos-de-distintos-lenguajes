import matplotlib.pyplot as plt

class Punto:
    def __init__(self,x,y):
        self.X = x
        self.Y = y
        
    def MostrarPunto(self):
        print("El punto es (",self.X,",",self.Y,")")

class Triangulo:
    def __init__(self, v1, v2, v3):
        self.V1 = v1
        self.V2 = v2
        self.V3 = v3
    def MostrarVertices(self):
        self.V1.MostrarPunto()
        self.V2.MostrarPunto()
        self.V3.MostrarPunto()

# Solicitar coordenadas al usuario
x1 = float(input("Ingrese la coordenada X del primer punto: "))
y1 = float(input("Ingrese la coordenada Y del primer punto: "))
v1 = Punto(x1, y1)
x2 = float(input("Ingrese la coordenada X del segundo punto: "))
y2 = float(input("Ingrese la coordenada Y del segundo punto: "))
v2 = Punto(x2, y2)
x3 = float(input("Ingrese la coordenada X del tercer punto: "))
y3 = float(input("Ingrese la coordenada Y del tercer punto: "))
v3 = Punto(x3, y3)

# Crear triángulo y mostrar vertices
triangulo = Triangulo(v1, v2, v3)
triangulo.MostrarVertices()

# Crear lista con las coordenadas X e Y de cada punto
x = [triangulo.V1.X, triangulo.V2.X, triangulo.V3.X]
y = [triangulo.V1.Y, triangulo.V2.Y, triangulo.V3.Y]

# Agregar los puntos al gráfico y unirlos para ver el triángulo
plt.plot(x, y, 'ro-')

# Mostrar el gráfico
plt.show()