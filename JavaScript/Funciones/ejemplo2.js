// Declaramos la funcion 
function miFuncion(a, b){
    return a + b;
}
// lamamos a la funcion
let resultado = miFuncion(4, 5);
console.log(resultado);


// Declaracion funcion de tipo expresion 

let x = function (a, b){return a + b};
resultado = x(1, 2)
console.log(resultado)

(function(){
    console.log('ejecutando la funcion');
})();