class Producto {
    constructor(nombre, precio, stock) {
      this.nombre = nombre;
      this.precio = precio;
      this.stock = stock;
    }
  
    vender(cantidad) {
      if (cantidad <= this.stock) {
        this.stock -= cantidad;
        return `Se han vendido ${cantidad} ${this.nombre}(s).`;
      } else {
        return `No hay suficiente stock de ${this.nombre}.`;
      }
    }
  
    reponer(cantidad) {
      this.stock += cantidad;
      return `Se han añadido ${cantidad} ${this.nombre}(s) al inventario.`;
    }
  }
  
  const producto1 = new Producto('Laptop', 1000, 10);
  console.log(producto1.vender(5)); // Salida: Se han vendido 5 Laptop(s).
  console.log(producto1.reponer(3)); // Salida: Se han añadido 3 Laptop(s) al inventario.