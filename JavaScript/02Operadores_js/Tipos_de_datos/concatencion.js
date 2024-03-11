var nombre = 'Juan';
var apellido ='Perez'

var nombreCompleto = nombre +' '+ apellido;

console.log(nombreCompleto)

// otra forma de hacerlo 

var nombreCompleto2 = 'Carlos' + ' ' + 'Lara'
console.log(nombreCompleto2)

// otro formato 

var x = nombre + 219;
console.log(x)

//Utilizadom parentesis le damos prioridad a la operacion 
var y = nombre + (3+5);
console.log(y)
// En este caso encuentra primero el valor numerico y considera que todo es numerico.
// Lo mismo ocurrio antes empezo una cadena y considero que todo lo demas era una cadena.
var z = 2 + 3 + nombre;
console.log(z)