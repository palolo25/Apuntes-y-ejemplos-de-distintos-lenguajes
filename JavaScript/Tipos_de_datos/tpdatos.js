//Tipo de dato String
var nombre = "carlos";
console.log(nombre);

//Tipo de dato numerico
var numero = 1000;
console.log(numero);

//Tipo de dato object
var objeto1 = {
    nombre:"juan",
    apellido:"perez",
    telefono:"12345678"
}
console.log(objeto1)
// Typeof indica e tipo de dato que almacena 
var objeto = {
    nombre:"juan",
    apellido:"perez",
    telefono:"12345678"
}
console.log(typeof objeto);

//Tipo de dato boolean (true o false)

var bandera = true;
console.log(bandera);

//Tipo de dato function

function mifuncion(){}
console.log(typeof mifuncion);

// tipo de dato symbol

var simbolo = Symbol("mi simbolo");
console.log(simbolo);

// Tipo clase es una function

class Persona{
    constructor(nombre,apellido){
    this.nombre = nombre;
    this.apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo undefined

var x;
console.log(x);

// null = ausencia de valor

var y = null;
console.log(y);
