package retornoDeValores;

/**

La clase Operacionretor permite realizar operaciones aritméticas básicas con dos números ingresados por el usuario

y mostrar los resultados en consola.
*/
public class Operacionretor {

/**

Este método permite sumar dos números enteros ingresados por el usuario y devolver el resultado.
@param numero1 El primer número a sumar.
@param numero2 El segundo número a sumar.
@return El resultado de la suma de numero1 y numero2.
*/
public int Sumar(int numero1, int numero2) {
int suma = numero1 + numero2;
return suma;
}
/**

Este método permite restar dos números enteros ingresados por el usuario y devolver el resultado.
@param numero1 El número al que se le restará numero2.
@param numero2 El número que se restará de numero1.
@return El resultado de la resta de numero2 a numero1.
*/
public int Restar(int numero1, int numero2) {
int resta = numero1 - numero2;
return resta;
}
/**

Este método permite dividir dos números enteros ingresados por el usuario y devolver el resultado.
@param numero1 El número que se dividirá entre numero2.
@param numero2 El número que se utilizará como divisor.
@return El resultado de la división de numero1 entre numero2.
@throws ArithmeticException si numero2 es cero.
*/
public int Dividir(int numero1, int numero2) throws ArithmeticException {
if (numero2 == 0) {
throw new ArithmeticException("No se puede dividir entre cero.");
}
int division = numero1 / numero2;
return division;
}
/**

Este método permite multiplicar dos números enteros ingresados por el usuario y devolver el resultado.
@param numero1 El primer número a multiplicar.
@param numero2 El segundo número a multiplicar.
@return El resultado de la multiplicación de numero1 y numero2.
*/
public int Multiplicar(int numero1, int numero2) {
int multiplicacion = numero1 * numero2;
return multiplicacion;
}
/**

Este método muestra en consola los resultados de las operaciones realizadas.
@param suma El resultado de la suma.
@param resta El resultado de la resta.
@param division El resultado de la división.
@param multiplicacion El resultado de la multiplicación.
*/
public void MostrarResultados(int suma, int resta, int division, int multiplicacion) {
System.out.println("El resultado de la suma es: " + suma);
System.out.println("El resultado de la resta es: " + resta);
System.out.println("El resultado de la division es: " + division);
System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
}
}