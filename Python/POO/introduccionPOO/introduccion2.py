class Persona:
    
    def __init__(self, nombre, apellido , edad):
        
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        
        

persona1 = Persona('Antonio', 'Sanz', 46)

print(f"Persona 1: {persona1.nombre} {persona1.apellido} {persona1.edad}")