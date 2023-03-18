package clases;

/**

La clase Calculadora proporciona diferentes operaciones matemáticas básicas,

como suma, resta, multiplicación y división de dos números enteros.
*/
public class Calculadora {

/**

Suma dos números enteros y devuelve el resultado.
@param a El primer número a sumar.
@param b El segundo número a sumar.
@return El resultado de la suma de a y b.
*/
public int sumar(int a, int b) {
return a + b;
}
/**

Resta dos números enteros y devuelve el resultado.
@param a El número al que se le restará b.
@param b El número que se restará de a.
@return El resultado de la resta de a y b.
*/
public int restar(int a, int b) {
return a - b;
}
/**

Multiplica dos números enteros y devuelve el resultado.
@param a El primer número a multiplicar.
@param b El segundo número a multiplicar.
@return El resultado de la multiplicación de a y b.
*/
public int multiplicar(int a, int b) {
return a * b;
}
/**

Divide dos números enteros y devuelve el resultado.
@param a El número que se dividirá entre b.
@param b El número que se utilizará como divisor.
@return El resultado de la división de a entre b.
@throws ArithmeticException si b es cero.
*/
public int dividir(int a, int b) throws ArithmeticException {
if (b == 0) {
throw new ArithmeticException("No se puede dividir entre cero.");
}
return a / b;
}
}