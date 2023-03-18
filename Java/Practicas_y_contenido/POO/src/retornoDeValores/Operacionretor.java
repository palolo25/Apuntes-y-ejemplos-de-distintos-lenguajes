package retornoDeValores;

/**

La clase Operacionretor permite realizar operaciones aritm�ticas b�sicas con dos n�meros ingresados por el usuario

y mostrar los resultados en consola.
*/
public class Operacionretor {

/**

Este m�todo permite sumar dos n�meros enteros ingresados por el usuario y devolver el resultado.
@param numero1 El primer n�mero a sumar.
@param numero2 El segundo n�mero a sumar.
@return El resultado de la suma de numero1 y numero2.
*/
public int Sumar(int numero1, int numero2) {
int suma = numero1 + numero2;
return suma;
}
/**

Este m�todo permite restar dos n�meros enteros ingresados por el usuario y devolver el resultado.
@param numero1 El n�mero al que se le restar� numero2.
@param numero2 El n�mero que se restar� de numero1.
@return El resultado de la resta de numero2 a numero1.
*/
public int Restar(int numero1, int numero2) {
int resta = numero1 - numero2;
return resta;
}
/**

Este m�todo permite dividir dos n�meros enteros ingresados por el usuario y devolver el resultado.
@param numero1 El n�mero que se dividir� entre numero2.
@param numero2 El n�mero que se utilizar� como divisor.
@return El resultado de la divisi�n de numero1 entre numero2.
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

Este m�todo permite multiplicar dos n�meros enteros ingresados por el usuario y devolver el resultado.
@param numero1 El primer n�mero a multiplicar.
@param numero2 El segundo n�mero a multiplicar.
@return El resultado de la multiplicaci�n de numero1 y numero2.
*/
public int Multiplicar(int numero1, int numero2) {
int multiplicacion = numero1 * numero2;
return multiplicacion;
}
/**

Este m�todo muestra en consola los resultados de las operaciones realizadas.
@param suma El resultado de la suma.
@param resta El resultado de la resta.
@param division El resultado de la divisi�n.
@param multiplicacion El resultado de la multiplicaci�n.
*/
public void MostrarResultados(int suma, int resta, int division, int multiplicacion) {
System.out.println("El resultado de la suma es: " + suma);
System.out.println("El resultado de la resta es: " + resta);
System.out.println("El resultado de la division es: " + division);
System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
}
}