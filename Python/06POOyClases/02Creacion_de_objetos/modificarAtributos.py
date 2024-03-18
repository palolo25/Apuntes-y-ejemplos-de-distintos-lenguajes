class Persona:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

persona1 = Persona('Juan', 'Perez', 28)
print(f'Objeto Persona 1: {persona1.nombre} {persona1.apellido} {persona1.edad}')

# Modificamos el nombre, el apellido y la edad 
persona1.nombre = 'Juan Carlos'
persona1.apellido = 'Perez'
persona1.edad = 25
# Los volvemos a imprimir 
print(f'Objeto Persona 1: {persona1.nombre} {persona1.apellido} {persona1.edad}')

persona2 = Persona('Carla', 'Sanchez', 30)
print(f'Objeto Persona 2: {persona2.nombre} {persona2.apellido} {persona2.edad}')

persona2.nombre = 'Juan Carlos'
persona2.apellido = 'Blanco'
persona2.edad = 29
print(f'Objeto Persona 2: {persona2.nombre} {persona2.apellido} {persona2.edad}')