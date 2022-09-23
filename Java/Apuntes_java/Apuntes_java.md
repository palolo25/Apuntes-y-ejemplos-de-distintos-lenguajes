# Java

## Que es java ?

### Es un lenguaje de proposito general y como tal es valido para realizar todo tipo de aplicaciones.

## Que lo hace distinto ?

- Aplicaciones móviles
- Aplicaciones web
- Aplicaciones de escritorio
- juegos 
- Servidores web y servidores de aplicaciones
- Conexión de base de datos

## Por qué usar java 
- Java funciona en diferentes plataformas (Windows, Mac, Linux, Raspberry Pi, etc.)
- Es uno de los lenguajes de programación más populares del mundo.
- Es fácil de aprender y fácil de usar.
- Es de código abierto y gratuito.
- Java es un lenguaje orientado a objetos que proporciona una estructura clara a los programas y permite reutilizar el código, lo que reduce los costos de desarrollo.
- Es seguro, rápido y potente.

# NETBEANS IDE
- hay entornos de desarrollo de programación mas sofisticados que proporcionan una enorme cantidad de funcionalidades
1. editor de texto
2. ayuda 
3. compilador
4. depurador

# El algoritmo principal
- cuando empecemos a programar en java tendrás que entender que clase debes, usar pero hasta saber que es una clase y una función de momento solo veras lo que la IDE genera de forma automática

```java
    

public class conceptos basicos {

	public static void main(String[] args) {
		

	}

}




```
# Palabras reservadas
- en java existen palabras con un significado especial. ha estas se las denomina reservadas y definen la gramática del lenguaje. las palabras reservadas solo pueden utilizarse en un determinado lugar del programa y no pueden ser utilizados como identificadores.

- Las palabras actualmente reservadas por JavaScript son: break , case , catch , continue , default , delete , do , else , finally , for , function , if , in , instanceof , new , return , switch , this , throw , try , typeof , var , void , while , with .

# Que es una variable?
- magnitud que puede tener un valor cualquiera de las comprendidas en un conjunto. En javascript se distinguen 5 tipos de variables: de tipo texto (string), número, booleanas , objetos y funciones. Los textos, números y booleanos son intuitivos.


# Identificadores 
- java es keysensitive, esto quiere decirque hace distincion de mayusculas y minusculas, no es lo mismo **edad** que **eDaD**. tienen una notacion distinta.

# Tipos de datos y rango 
- cada variable ocupa un espacio de memoria en el ordenador, cada una de ellos necesita un espacio ya que uno muy pequeño puede ser insuficiente o uno muy grande desaprovecha memoria. la solucion a esto no es definir un tamaño de memoria para cada variable sino usar los predefinidos de java. El rango es el espacio que ocupa en memoria y el rango de valores que puede almacenar.

 ![image.png](/.attachments/image-0c84a19b-7ac3-46ca-95b4-2d8e6a2f57d7.png)
# Constantes 
Caso especial de variable al que se le asigna un valor y este permanece inmutable durante el resto del programa, la forma de hacerlos constantes es usando la expredion **final** delante del dato. 
```java
final int casa=10;
```
# Comentarios
- Estos comentarios sirven para describir la funcionalidad del codigo y facilitar la comprension de la solucion implementada. especialemnte hechos para facilitar el mantenimiento de un programa.
![image.png](/.attachments/image-cbbab326-1cda-4580-9b07-8f29550d6049.png)

# Operaciones básicas 
- En java con su multitud de variables, constantes, numeros y otras expresiones, podemos realizar distintas operaciones.

- Operador de asignacion(modifican el valor de una variable).
![image.png](/.attachments/image-15659179-951c-465b-80ba-94ba234f4ae0.png)
- Operadores aritmeticos
![image.png](/.attachments/image-4fd29345-a28e-4cac-a873-766a80b288b9.png)
- Operadores relacionales 
 Son aquellos que dan un resultado logico o booleano a partir de las relaciones de expresiones numericas. estos valores se representan mediante los literales de true y false.
![image.png](/.attachments/image-25cd5a93-c159-4574-9bb7-68bce0044a2b.png)
- Operadores logicos
  Operan a partir de expresiones logicas(se usan las formas de **and**, **or** y **not**).
![image.jng](/.attachments/image-cc78585c-8239-40f9-bba4-9b6bcb2646b1.jpg)

# API de java 
- La gran ventaja de los lenguajes modernos es que disponen de una amplia biblioteca de herramientas que realizan tareas complejas de forma transparente al programador uqe los utiliza facilitando su tarea. la existencia de esta herramientas facilita al programador, pero cuando no existen el programador tiene que desarrollarlas.

- Estas herramientas en java se denominan clases y facilitan multultitud de tareas 

- **Lectura de datos** : leen info desde teclado, fichero o otro dispositivo.
- **Calculos complejos** : realizar operaciones matematicas complejas.
- **Manejo de errores** : controla la situacion un error de algun tipo.
- **Escritura de datos** : escriben informacion relevante en dispositivos de almacenamiento, impresoras, monitores, etc.
# Salida por consola
- La  operacion mas sencilla que proporciona el API es que permite mostrar un mensaje por pantalla 
```java
System.out.println("hola mundo");
```
# Entrada de datos 
- Otra operacion sencilla del API es la entrada por tecldo que consiste en que el usuario introduzca datos por teclado para esto tenemos el scanner.
```java
Scanner sc = new Scanner(System.in);
```

