from Persona import Persona



class OtraClase:
    def __init__(self):
        self.persona = Persona('Juan', 'Perez', 28)

    def mostrar_detalle_persona(self):
        self.persona.nombre = 'Juan Carlos'
        self.persona.apellido = 'Lara'
        self.persona.edad = 30
        self.persona.mostrar_detalle()
