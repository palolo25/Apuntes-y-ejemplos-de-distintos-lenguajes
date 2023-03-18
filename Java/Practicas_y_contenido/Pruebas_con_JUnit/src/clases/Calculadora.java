package clases;

/**

La clase Calculadora proporciona diferentes operaciones matem�ticas b�sicas,

como suma, resta, multiplicaci�n y divisi�n de dos n�meros enteros.
*/
public class Calculadora {

/**

Suma dos n�meros enteros y devuelve el resultado.
@param a El primer n�mero a sumar.
@param b El segundo n�mero a sumar.
@return El resultado de la suma de a y b.
*/
public int sumar(int a, int b) {
return a + b;
}
/**

Resta dos n�meros enteros y devuelve el resultado.
@param a El n�mero al que se le restar� b.
@param b El n�mero que se restar� de a.
@return El resultado de la resta de a y b.
*/
public int restar(int a, int b) {
return a - b;
}
/**

Multiplica dos n�meros enteros y devuelve el resultado.
@param a El primer n�mero a multiplicar.
@param b El segundo n�mero a multiplicar.
@return El resultado de la multiplicaci�n de a y b.
*/
public int multiplicar(int a, int b) {
return a * b;
}
/**

Divide dos n�meros enteros y devuelve el resultado.
@param a El n�mero que se dividir� entre b.
@param b El n�mero que se utilizar� como divisor.
@return El resultado de la divisi�n de a entre b.
@throws ArithmeticException si b es cero.
*/
public int dividir(int a, int b) throws ArithmeticException {
if (b == 0) {
throw new ArithmeticException("No se puede dividir entre cero.");
}
return a / b;
}
}