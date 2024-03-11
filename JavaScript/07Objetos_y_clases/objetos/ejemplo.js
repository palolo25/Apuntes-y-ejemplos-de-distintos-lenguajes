// Definición de un objeto 'coche'
const coche = {
    marca: 'Toyota',
    modelo: 'Corolla',
    año: 2020,
    arrancar: function() {
      console.log('El coche está arrancado.');
    }
  };
  
  // Acceder a propiedades del objeto
  console.log(coche.marca); // Salida: Toyota
  
  // Llamar a un método del objeto
  coche.arrancar(); // Salida: El coche está arrancado.