// para declarar una variable usamos 'var' pero eso es una mala practica
// Se recomienda mas usar 'let' para variables y 'const' para constantes
// tambien se puede declarar un variable escribiendo solo el nombre de la variable(Esto en codigo es valido, pero es mala practica)

let nombre;
nombre = 'Juan';
console.log(nombre);

const apellido = 'Perez';

// Si hay mas de dos palabras en una variable usamos la notacion de camelcase

let nombreCompleto = "Juan Perez";
console.log(nombreCompleto);


let x , y;
x = 10, y = 20;

let z = x + y;
console.log(z);

// En js hay Key sensitive, esto quiere decir que hace diferencia de mayus y minus.

let nombrePasa = 'Pepe';
let nombrepasa = 'Antonio';

console.log(nombrePasa);
console.log(nombrepasa);

// Las variables no pueden empezar usando numeros solo estan permitido usar '_' o '$'

let _prueba;
let $prueba;
let a1prueba;

