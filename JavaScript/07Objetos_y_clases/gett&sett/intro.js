// Definición de la clase Persona
class Persona {
    // Constructor que inicializa el nombre y la edad
    constructor(nombre, edad) {
      this._nombre = nombre; // Asigna el nombre
      this._edad = edad; // Asigna la edad
    }
  
    // Getter para obtener el nombre
    get nombre() {
      return this._nombre;
    }
  
    // Setter para establecer el nombre
    set nombre(nuevoNombre) {
      this._nombre = nuevoNombre;
    }
  
    // Getter para obtener la edad
    get edad() {
      return this._edad;
    }
  
    // Setter para establecer la edad
    set edad(nuevaEdad) {
      this._edad = nuevaEdad;
    }
  }
  
  // Crear una instancia de la clase Persona
  const juan = new Persona('Juan', 30);
  
  // Obtener el nombre usando el getter
  console.log(juan.nombre); // Salida: Juan
  
  // Cambiar el nombre usando el setter
  juan.nombre = 'Juanito';
  console.log(juan.nombre); // Salida: Juanito
  
  // Obtener la edad usando el getter
  console.log(juan.edad); // Salida: 30
  
  // Cambiar la edad usando el setter
  juan.edad = 31;
  console.log(juan.edad); // Salida: 31
  