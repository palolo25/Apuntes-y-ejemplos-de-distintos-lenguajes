// Crear un objeto
let persona = {
    nombre: 'Raul',
    apellido: 'Sanz',
    email: 'r.sanz@gmail.com',
    edad: 22,
    nombreCompleto: function(){
        return this.nombre + ' ' + this.apellido;
    }
}
// Sacar por pantalla cada atributo y el objeto completo
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);

console.log(persona.nombreCompleto())