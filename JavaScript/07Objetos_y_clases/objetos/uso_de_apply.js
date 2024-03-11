// Definimos una función constructora llamada 'Persona'
function Persona(nombre, edad) {
    this.nombre = nombre; // Asigna el nombre proporcionado al objeto
    this.edad = edad; // Asigna la edad proporcionada al objeto
}

const juan = {}; // Creamos un objeto vacío llamado 'juan'

// Usamos apply para llamar a la función 'Persona' con 'juan' como contexto
// y pasamos los valores como un array ['Juan', 30]
Persona.apply(juan, ['Juan', 30]);

// Agregamos el método 'saludar' directamente a 'juan'
juan.saludar = function() {
    console.log(`Hola, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);
}

// Llamamos al método 'saludar' de 'juan'
juan.saludar(); // Salida: "Hola, mi nombre es Juan y tengo 30 años."