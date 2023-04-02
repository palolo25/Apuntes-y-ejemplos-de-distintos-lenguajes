import matplotlib.pyplot as plt
class punto:
    def __init__(self,x,y):
        self.X = x
        self.Y = y
    def mostrarPunto(self):
         print("El punto es(", self.X, ",", self.Y, ")")
    
    
    def dibujarPunto(self):
        plt.scatter(self.X, self.Y, color='red')
        plt.show()
        
    
# Crear un objeto de la clase Punto con las coordenadas (3, 4)
mi_punto = punto(3, 4)

# Llamar al método mostrarPunto para imprimir las coordenadas del punto.
mi_punto.mostrarPunto() # Salida: "El punto es( 3 , 4 )"

# Llamar al método dibujarPunto para graficar el punto.
mi_punto.dibujarPunto()