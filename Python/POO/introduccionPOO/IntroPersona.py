class Persona:
    
    def __init__(self):
        
        self.nombre = str(input("Escribe tu nombre: "))
        self.apellido = str(input("Escribe tu Apellido: "))
        self.edad = int(input("Escribe tu edad: "))
        
        

persona1 = Persona()

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)