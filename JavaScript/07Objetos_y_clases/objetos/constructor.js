// Definimos un constructor llamado Persona
function Persona(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
    
    this.saludar = function() {
      console.log(`Hola, soy ${this.nombre} y tengo ${this.edad} años.`);
    }
  }
  
  // Creamos una nueva instancia de Persona
  var persona1 = new Persona('Juan', 30);
  
  // Accedemos a las propiedades y métodos de la instancia
  console.log(persona1.nombre); // Output: Juan
  console.log(persona1.edad);   // Output: 30
  persona1.saludar();           // Output: Hola, soy Juan y tengo 30 años.