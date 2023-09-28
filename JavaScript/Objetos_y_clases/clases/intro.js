// Definición de una clase 'Persona'
class Persona {
    // Constructor que inicializa el nombre y la edad
    constructor(nombre, edad) {
      this.nombre = nombre;
      this.edad = edad;
    }
  
    // Método que imprime información de la persona
    presentarse() {
      console.log(`Hola, soy ${this.nombre} y tengo ${this.edad} años.`);
    }
  }
  
  // Crear una instancia de la clase 'Persona'
  const juan = new Persona('Juan', 30);
  
  // Llamar al método 'presentarse'
  juan.presentarse(); // Salida: Hola, soy Juan y tengo 30 años.