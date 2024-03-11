import matplotlib.pyplot as plt
class Punto:
    def __init__(self,x,y):
        self.X = x
        self.Y = y
    def mostrarPunto(self):
         print("El punto es(", self.X, ",", self.Y, ")")
    
    
    def dibujarPunto(self):
        plt.scatter(self.X, self.Y, color='red')
        plt.show()
        
# Crear un objeto de la clase Punto con las coordenadas (3, 4)
mi_punto1 = Punto(3, 4)

# Crear otro objeto de la clase Punto con las coordenadas (-2, 7)
mi_punto2 = Punto(-2, 7)

# Crear un tercer objeto de la clase Punto con las coordenadas (0, -5)
mi_punto3 = Punto(0, -5)

# Llamar al método dibujarPunto para graficar los puntos
mi_punto1.dibujarPunto()
mi_punto2.dibujarPunto()
mi_punto3.dibujarPunto()

# Llamar al método mostrarPunto para imprimir las coordenadas del punto.
mi_punto1.mostrarPunto() # Salida: "El punto es( 3 , 4 )"
mi_punto2.mostrarPunto() # Salida: "El punto es( -2 , 7 )"
mi_punto3.mostrarPunto() # Salida: "El punto es( 0 , 5 )"