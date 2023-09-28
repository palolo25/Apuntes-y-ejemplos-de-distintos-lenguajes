class Producto {
    constructor(nombre, stock) {
      this._nombre = nombre;
      this._stock = stock;
    }
  
    get nombre() {
      return this._nombre;
    }
  
    set nombre(nuevoNombre) {
      if (typeof nuevoNombre === 'string' && nuevoNombre.length > 0) {
        this._nombre = nuevoNombre;
      } else {
        console.log('El nombre debe ser una cadena no vacía.');
      }
    }
  
    get stock() {
      return this._stock;
    }
  
    set stock(nuevoStock) {
      if (Number.isInteger(nuevoStock) && nuevoStock >= 0) {
        this._stock = nuevoStock;
      } else {
        console.log('El stock debe ser un número entero no negativo.');
      }
    }
  
    vender(cantidad) {
      if (cantidad > 0 && cantidad <= this._stock) {
        this._stock -= cantidad;
        return `Se vendieron ${cantidad} unidades de ${this._nombre}.`;
      } else if (cantidad > this._stock) {
        return `No hay suficiente stock de ${this._nombre}.`;
      } else {
        return `La cantidad debe ser un número positivo.`;
      }
    }
  }
  
  const producto = new Producto('Laptop', 10);
  
  console.log(producto.vender(5)); // Salida: Se vendieron 5 unidades de Laptop.
  console.log(producto.vender(8)); // Salida: No hay suficiente stock de Laptop.
  console.log(producto.vender(-3)); // Salida: La cantidad debe ser un número positivo.