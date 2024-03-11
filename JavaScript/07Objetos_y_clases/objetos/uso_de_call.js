// Definimos una función constructora llamada 'Persona'
function Persona(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
}

// Creamos un objeto vacío llamado 'juan'
const juan = {};

// Llamamos a la función Persona con 'juan' como contexto y pasamos los valores usando 'call'
Persona.call(juan, 'Juan', 30);

// Agregamos el método 'saludar' directamente a 'juan'
juan.saludar = function() {
    console.log(`Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);
}

// Llamamos al método 'saludar' de 'juan'
juan.saludar(); // Salida: "Hola, mi nombre es Juan y tengo 30 años."