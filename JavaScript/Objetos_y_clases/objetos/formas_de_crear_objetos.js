// Object Literal
const miObjeto = { 
    propiedad1: valor1,
    propiedad2: valor2,
    // ...
};

// Constructor de Objeto
function MiObjeto(propiedad1, propiedad2) {
    this.propiedad1 = propiedad1;
    this.propiedad2 = propiedad2;
}

const miNuevoObjeto = new MiObjeto(valor1, valor2);

// Object.create()
const miObjeto2 = Object.create(null);
miObjeto.propiedad1 = valor1;
miObjeto.propiedad2 = valor2;

// Clases (ES6)
class MiClase {
    constructor(propiedad1, propiedad2) {
        this.propiedad1 = propiedad1;
        this.propiedad2 = propiedad2;
    }
}

const miNuevoObjeto2 = new MiClase(valor1, valor2);

// Funciones de fábrica
function crearObjeto(propiedad1, propiedad2) {
    return {
        propiedad1: propiedad1,
        propiedad2: propiedad2
    };
}

const miNuevoObjeto3 = crearObjeto(valor1, valor2);

// Funciones constructoras con prototipos
function MiObjeto(propiedad1, propiedad2) {
    this.propiedad1 = propiedad1;
    this.propiedad2 = propiedad2;
}

MiObjeto.prototype.otraFuncion = function() {
    // ...
};

const miNuevoObjeto4 = new MiObjeto(valor1, valor2);