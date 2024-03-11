const coches = ['BMW', 'MERCEDES', 'AUDI', 'VOLVO', 'TOYOTA'];
console.log(coches)

console.log(coches[2])
console.log(coches[4])

for(let i = 0; i < coches.length; i++){
    console.log(coches[i]);
}
// Asi se modifica un espacio del arreglo
coches[1] = 'MERCEDESBENZ';

console.log(coches[1])

// Asi se agrega una nueva marca al arrglo
coches.push('HYUNDAI');

console.log(coches)
console.log(coches.length)
coches[coches.length] = 'CADILLAC'

console.log(coches)