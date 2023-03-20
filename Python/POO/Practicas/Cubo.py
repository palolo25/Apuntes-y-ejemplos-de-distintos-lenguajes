class Cubo:
    def __init__(self , ancho , alto , profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad
    def calcular_cubo(self):
        return self.ancho * self.alto * self.profundidad

ancho = int(input("Escribe el ancho: "))
alto = int(input("Escribe el alto: "))
profundidad = int(input("Escribe la profundidad: "))

cubo1 = Cubo(ancho, alto , profundidad)

print(f'El area del cubo es: {cubo1.calcular_cubo}')