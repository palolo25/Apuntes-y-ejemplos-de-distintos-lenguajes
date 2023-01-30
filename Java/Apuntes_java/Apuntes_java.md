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

## Qué es y para qué sirve el NetBeans
- NetBeans IDE es un entorno de desarrollo integrado de código abierto y gratuito para el desarrollo de aplicaciones en los sistemas operativos Windows, Mac, Linux y Solaris.
## Qué es y para qué sirve IDE
- Un entorno de desarrollo integrado (IDE) es una aplicación de software que ayuda a los programadores a desarrollar código de software de manera eficiente. Aumenta la productividad de los desarrolladores al combinar capacidades como editar, crear, probar y empaquetar software en una aplicación fácil de usar.

- Hay entornos de desarrollo de programación mas sofisticados que proporcionan una enorme cantidad de funcionalidades.
1. editor de texto
2. ayuda 
3. compilador
4. depurador

# El algoritmo principal
- Cuando empezamos a programar en java tendremos que entender que es una clase y cual debemos usar. Hasta que no sepamos que es una funcion y una clase, solo veras lo que genera automaticamente el IDE.

```java
    

public class conceptosBasicos {

	public static void main(String[] args) {
		

	}

}




```
# Palabras reservadas
- En java existen palabras con un significado especial. ha estas se las denomina reservadas y definen la gramática del lenguaje. las palabras reservadas solo pueden utilizarse en un determinado lugar del programa y no pueden ser utilizados como identificadores.

- Las palabras actualmente reservadas por JavaScript son: break , case , catch , continue , default , delete , do , else , finally , for , function , if , in , instanceof , new , return , switch , this , throw , try , typeof , var , void , while , with .

# Que es una variable?
- Magnitud que puede tener un valor cualquiera de las comprendidas en un conjunto. En javascript se distinguen 5 tipos de variables: de tipo texto (string), número, booleanas , objetos y funciones. Los textos, números y booleanos son intuitivos.


# Identificadores 
- Java es **case sensitive**, esto quiere decirque hace distincion de mayusculas y minusculas, no es lo mismo **edad** que **eDaD**. tienen una notacion distinta.

# Case sensitive
- **Case sensitive** es una expresión utilizada en informática que se aplica a todos los textos en los que tiene importancia escribir un carácter en mayúsculas o minúsculas. El caso contrario sería **Case insensitive**, es decir, insensible a mayúsculas o minúsculas.

# Tipos de datos y rango 
- Cada variable ocupa un espacio de memoria en el ordenador, cada una de ellos necesita un espacio ya que uno muy pequeño puede ser insuficiente o uno muy grande desaprovecha memoria. la solucion a esto no es definir un tamaño de memoria para cada variable sino usar los predefinidos de java. El rango es el espacio que ocupa en memoria y el rango de valores que puede almacenar.

 |**TIPO**|**USO**|**TAMAÑO**|**RANGO**|
|--|--|--|--|
|Byte|Entero corto|8 bits| de-128 a 127|
|Short|Entero|16 bits|de-32768 a 32 767|
|Int|Entero|32 bits|de -2 147 483 648 a 2 147 483 647|
|Long|Entero largo|64 bits|+- 9 223 372 036 854 775 808  |
|Float|Real precision sencilla|32 bits|de -10³² a 10³²  |
|Double|Real precision doble|64 bits| de -10 y 10 |
|Boolean|lógico|1 bit| true o false  |
|Char|texto|16 bits|cualquier carácter  |
# Constantes 
Caso especial de variable al que se le asigna un valor y este permanece inmutable durante el resto del programa, la forma de hacerlos constantes es usando la la palabra reservada **final** delante del dato. 
```java
final int casa=10;
```
# Comentarios
- Estos comentarios sirven para describir la funcionalidad del codigo y facilitar la comprension de la solucion implementada. especialemnte hechos para facilitar el mantenimiento de un programa.
```java
/* Comentario
de
 multilinea*/
 
// Comentario de una linea

/**Este comentario sirve para la documentacion*/
```

# Operadores básicos
- En java con su multitud de variables, constantes, numeros y otras expresiones, podemos realizar distintas operaciones.

- Operador de asignacion(modifican el valor de una variable).

![image.png](/Java/Apuntes_java/imagenes/Conceptos%20b%C3%A1sicos/asignacion.png)

- Operadores aritmeticos

![image.png](/Java/Apuntes_java/imagenes/Conceptos%20b%C3%A1sicos/operadores.png)

- Operadores relacionales 
 Son aquellos que dan un resultado logico o booleano a partir de las relaciones de expresiones numericas. estos valores se representan mediante los literales de true y false.
 
![image.png](/Java/Apuntes_java/imagenes/Conceptos%20b%C3%A1sicos/operadores.png)
- Operadores logicos
  Operan a partir de expresiones logicas(se usan las formas de **and**, **or** y **not**).
  
![image.jng](/Java/Apuntes_java/imagenes/Conceptos%20b%C3%A1sicos/logicos.png)

# API de java 
- La gran ventaja de los lenguajes modernos es que disponen de una amplia biblioteca de componentes que realizan tareas complejas de forma transparente al programador uqe los utiliza facilitando su tarea. la existencia de esta herramientas facilita al programador, pero cuando no existen el programador tiene que desarrollarlas.

- Estas herramientas en java se denominan clases y facilitan multultitud de tareas 

- **Lectura de datos** : Leen info desde teclado, fichero o otro dispositivo.
- **Calculos complejos** : Realizar operaciones matematicas complejas.
- **Manejo de errores** : Controla la situacion un error de algun tipo.
- **Escritura de datos** : Escriben informacion relevante en dispositivos de almacenamiento, impresoras, monitores, etc.
# Salida por consola
- La  operacion mas sencilla que proporciona el API es que permite mostrar un mensaje por pantalla. 
```java
System.out.println("hola mundo");
```
# Entrada de datos 
- Otra operacion sencilla del API es la entrada por tecldo que consiste en que el usuario introduzca datos por teclado para esto tenemos el scanner.
```java
Scanner sc = new Scanner(System.in);
```

# Condicionales 

- Los programas no tiene porque ejecutar siempre la misma secuencia de ordenes, se puede dar el caso en el que según el valor de alguna expresión o de alguna condición, puede interesar ejecutar o evitar ciertas sentencias. esta funcionalidad nos la proporcionan los if, if-else y swicht.

# Expresiones lógicas
- Una condición es el resultado de la evaluación de una expresión relacional y/o lógica, los valores de las condiciones son siempre de tipo booleano es decir **true** o **false** con los que se representa en java.
- La diferencia entre un lógico y un relacional es que el lógico usa expresiones numéricas y el relacional usa expresiones booleanas, aun así ambos generan valores booleanos.

# Operadores relacionales
- Estos operadores son aquellos que comparan valores numérico y cadenas para luego generar valores booleanos.

![image.png](/Java/Apuntes_java/imagenes/Condicional/operador_relacional.png)

# Operadores logicos 
### Estos operadores se usan para condiciones mas complejas.
- # Operador &&
- Será cierto si ambos operando son ciertos.

![image.png](/Java/Apuntes_java/imagenes/Condicional/operador_logico_1.png)
- # operador ||
- Es cierto si cualquiera de los dos operandos es cierto. 

![image.png](/Java/Apuntes_java/imagenes/Condicional/operador_logico_2.png)
- # Operador ! 
- Cambia el valor al; que e aplica de true a false y viceversa. 

![image.png](/Java/Apuntes_java/imagenes/Condicional/operador_logico_3.png)

# Condicional simple: if
- Esta instrucción proporciona un control sobre el conjunto de instrucciones que se pueden ejecutar o no, dependiendo de la evaluación de la condición.
 
 ![image.png](/Java/Apuntes_java/imagenes/Condicional/condicional_simple_if.png)

# Condicional doble: if-else
- En esta instrcuccion se especifican dos bloques de instrucciones en los cuales el primero se ejecutara cuando la condicion sea vedadera y el segundo se ejecutara cuando la condicion sea falsa, ambos bloque son mutuamente excluyentes lo que quiere decir que en cada ejecucion solo se hace uno de los dos.
![image.png](/Java/Apuntes_java/imagenes/Condicional/condicional_doble_if.png)
```java
a = 5;
if (a < 0) {
    System.out.prinln("valor negativo");
} else {
    System.out.println("valor positivo");
}
```

# Operador ternario
Este operador permite la seleccion del valor entre los dos posibles dependiendo de la evaluacion de una expresion segun sea true o false.
```java
public string IsLessThan(int candidate, int threshold) {
    return candidate < threshold ? "Yes, It is!" : "No, It is not" ;
}
```

# Anidación de condicionales 
Cuando se tienen que realizar varias comprobaciones se pueden anidar tantos **if** o **if-else** como necesitemos, unos dentro de otros, esto hace que las comprobaciones sean excluyentes lo que hace que el codigo sea mas eficiente.
```java
int edad = 12;
if (edad < 13) {
    System.out.println("Infantil");
} else {
    if (edad < 18) {
        System.out.println("Adolescente");
    } else {
        if (edad < 40) {
            System.out.println("Joven mayor de edad");
        } else {
            if (edad < 65) {
                System.out.println("Adulto mayor de edad");
            } else {
                System.out.println("Jubilado");
            }
        }
    }
}

```
# Condicional multiple: switch 
- La opcion de usar varios **if-else** anidados deja de ser util cuando el codigo empieza a ser poco legiblepara estos casos disponemos de **switch**.
```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Hoy es lunes");
        break;
    case 2:
        System.out.println("Hoy es martes");
        break;
    case 3:
        System.out.println("Hoy es miércoles");
        break;
    case 4:
        System.out.println("Hoy es Jueves");
        break;
    case 5:
        System.out.println("Hoy es Viernes");
        break;
    case 6:
        System.out.println("Hoy es Sábado");
        break;
    case 7:
        System.out.println("Hoy es Domingo");
        break;
    default:
        System.out.println("El número " + dia +
            " no es un dia de la semana");
}
```
- Esta sentencia de java va evaluando los distintos casos hasta encontrar uno que se cumpla. 

![image.png](/Java/Apuntes_java/imagenes/Condicional/condicional_switch.png)
- Con el switch es posible que varios **case** se ejecuten en el mismo codigo.
```java
public class Principal {
    public static void main(String[] args) {
        int valor = 7;
        switch (valor) {
            case 1:
            case 2:
            case 3:

                System.out.println("El valor es 1, 2 o 3");
                break;
            case 4:
            case 5:
            case 6:

                System.out.println("El valor es 4, 5 o 6");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("El valor es 7, 8 o 9");
                break;
            default:
                System.out.println("El valor de mayor que 9")
        }
    }
}

```
- A parte de esto no siempre la variable o expresion a evaluar tiene que ser un entero.
```java
public class Principal {
    public static void main(String[] args) {
        char valor = 'b';
        switch (valor) {
            case 'a':
                System.out.println("El valor es a");
                break;
            case 'b':
                System.out.println("El valor es b");
                break;
            case 'c':
                System.out.println("El valor es c");
                break;
            case 'd':
                System.out.println("El valor es d");
                break;
            default:
                System.out.println("El valor es distinto de
                }
        }
    }

```




# Que es un bucle?
- Un bucle es una estructura que contiene un bloque de instrucciones que se repite, cada ejecución es una iteración. el uso de bucles hace mas fácil la escritura los programas quitando el código duplicado.
- ## Java dispone de los bucles for y while que son de tipo condicion-accion y el do-while que es accion-condicion.

# Bucles controlados por condición
- El numero de iteraciones se lleva a cabo mediante una condición, si es cierta el bucle hará otra iteración.

# While y do-while
 - Al igual que el comportamiento de **if**, *while* depende de la evaluación de una condición. este bucle llevara acabo una nueva iteración basándose en el valor del a condición.

- **Ejemplo condición/accion**
```java
int i = 0;
while (i < 5) {
    i = i + 1;
    System.out.println(i);
}

```
- El bucle do-while es muy similar al while con la diferencia de que primero se ejecuta la instrucción y después se evalúa la condición. 
- **ejemplo accion/condición**
```java
int i = 0;
do {
    i = i + 1;
    System.out.println(i);
} while (i < 5);
```
# Bucles controlados por for
- Este bucle permite el control del numero de iteraciones mediante un contador. el bucle for esta controlado por una condicion. al ser configurable la inicializacion y el incremento permite determinar el numero de iteraciones que va a tener el bucle.
```java
for (expresión de inicialización; condición; expresión de incremento) {
 Acciones del bucle
}
```
- **ejemplo de un contador con for**
```java
int i;
for (i = 1; i <= 10; i++) {
    System.out.println(i);
}
System.out.println(i);
```
# Salidas anticipadas
- Segun la logica que queramos aplicar nos puede venir bien acabar con un bucle antes que finalice la condicion haciendo todas las iteraciones.
- **break** finaliza completamente un bucle.
- **continue** detiene la iteracion actual y continua con la siguiente.
**ESTAS INSTRUCCIONES FUNCIONAN BIEN PERO ALGUNOS AUTORES RECOMIENDAN NO USARLOS YA QUE INTERFIEREN EN LA SECUENCIA NATURAL DE INSTRUCCIONES**

# Bucles anidados
- Cuando usamos bucles es frecuente la anidacion de los mismos, que consiste en meter un bucle dentro de otro. cuando haces esto se multiplica el numero de veces que se ejecutan las instrucciones.

![image.png](/Java/Apuntes_java/imagenes/bucles/anidados.png)

# Bucles independientes 
- Cuando esto no dependen de otros anidados para deterrminar el numero de iteraciones se denominan independientes.
# Bucles dependientes 
- Podria darse el caso de que un bucle interno no sea independiente de la ejecucion de los externos y dependa de sus variables de control.

# Bucle independientes

- Cuando los bucles anidados no dependen, en absoluto, unos de otros para determinar el número de iteraciones, se denominan bucles anidados independientes. 

```java
for (i = 1; i <= 4; i++) {
    for (j = 1; j <= 3; j++) {
        System.out.println("Ejecutando.
            .
            ");
        }
    }

```

- El bucle externo, controlado por la variable i, realizará cuatro iteraciones, donde i toma los valores 1, 2, 3 y 4. El bucle interno, controlado por j, realizará tres iteraciones, tomando j los valores 1, 2 y 3.

### ¿Cuántas veces se ejecutará la sentencia System. out printIn ("Ejecutando.." ) :?

- Mientras el bucle externo está en su primera iteración (i vale 1), el bucle interno realiza sus 3 iteraciones; j toma los valores: 1, 2 y 3. Durante la segunda iteración del bucle externo (1 vale 2), el bucle interno realiza otras tres iteraciones, tomando de nuevo j los valores: 1, 2 y 3. Para las siguientes dos iteraciones del bucle externo, donde i toma los valores 3 y 4 consecutivamente, el bucle interno realizará de nuevo tres iteraciones en ambos casos.

![image.png](/Java/Apuntes_java/imagenes/bucles/interno%20o%20externo.png)


**Otro ejemplo**

```java
for (i = 1; i <= 2; i++) {
    System.out printin("Bucle externo, i=" + i);
    for (j = 1; j <= 3; j++) {
        System.out.println("
            ..Bucle medio, j = " + j):
            for (k = 1; k <= 4; k++) {
                System.out.printIn(" ....Bucle interno, k="  +  k);
            }
        }
    }
```


# Bucles dependientes

- Puede darse el caso que el número de iteraciones de un bucle interno no sea independiente de la ejecución de los bucles exteriores, y dependa de sus variables de control.
- Decimos entonces que son bucles anidados dependientes. Veamos el siguiente fragmento de código, a modo de ejemplo, donde las variables utilizadas en el bucle externo (i) se toma como base para comparar con los valores de la variable (j) que controla el bucle más interno.

```java
for (1 = 1; 1 <= 3; i++) {
    System.out.printin("Bucle externo, i=" + i);
    j = 1;
    while (j <= i) {
        System.out printin("...Bucle interno, j=" + j);
        j++;
    }
}

```
-  Durante la primera iteración del bucle i, el bucle interno realiza una sola iteración.

- En la segunda iteración del bucle externo con i que vale 2, el bucle interno realiza dos iteraciones.

- En la áltimo vuelto, cuando i vale 3, el bucle interno se ejecuta tres veces.

- La variable i controla el número de iteraciones del bucle interno y resulta un total de 4 4 2 4 3 = 6 iteraciones. Los posibles cambios en el número de iteraciones de estos bucles hacen que a priori no sea tan fácil conocer el número total de iteraciones.



# Arreglos

- Responda a una sencilla pregunta: ¿cuántos valores puede almacenar simultáneamente una variable? Según vimos en el primer capítulo, la respuesta es obvia: un solo valor en cada instante. Analicemos el siguiente código:
edad = 6;
edad = 23;
- La variable edad inicialmente almacena el valor 6 y a continuación 23. Cada nueva asignación modifica edad, pero, independientemente del número de asignaciones, la variable contiene únicamente un valor en cada momento y se conoce como una variable escalar. ¿Existe una forma de almacenar más de un valor simultáneamente en una variable? La respuesta es sí, mediante el uso de tablas


## ¿Que es un arreglo?
- Un array (arreglo) en Java es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo. El tamaño de los arrays se declara en un primer momento y no puede cambiar luego durante la ejecución del programa.



## Indices

- El problema es cómo distinguir entre cada uno de los elementos o componentes que constituyen una tabla. En nuestro caso, ¿cómo podemos utilizar el valor 85 o el valor 19 que se encuentran almacenados en la tabla edad? La solución consiste en asignar un número de orden, llamado índice, a cada elemento, para así poder diferenciarlos. Al primer elemento se le asigna el índice 0, al segundo el índice 1 y así sucesivamente. Al último elemento le corresponde como índice el número total de elementos menos uno.
- La forma de utilizar un elemento concreto de una tabla es a través del nombre de lavariable junto al número -índice- que distingue ese elemento entre corchetes ([ ]). Por ejemplo, para utilizar el cuarto elemento de edad elemento con indice 3- , escribiremos: edad [3], que contiene un valor de 23.

![image.jpg](/Java/Apuntes_java/imagenes/arrays/primeracap.png)

### indices fuera de rango

- La variable edad es una tabla de 5 enteros. Ni que decir tiene que podemos utilizar cada uno de los 5 elementos que la componen, de la forma: edad [0], edad [1].. ., edad [4]. ¿Qué ocurrirá si utilizamos un índice que se encuentra fuera del rango de 0 a 4? Es decir, qué efecto produce escribir, edad [-2] edad [7]
- Obtendremos un error en tiempo de ejecución que provoca que el programa termine de forma inesperada, ya que se detecta que los elementos asociados a los índices utilizados no existen.


## Construccion de tablas

- En el momento de crear una tabla tendremos que decidir qué tipo de datos vamos a almacenar y cuántos elementos necesitamos, declarar variables para tablas y crear la propia tabla.
### Tamaño y tipo
- Una tabla se define mediante dos características fundamentales: su tamaño y su tipo.

- El tamaño o longitud es el número de elementos que componen una tabla. Y el tipo de una tabla es el de los datos que almacena en todos y cada uno de sus elementos. En la foto podemos ver dos tablas: la primera compuesta por tres elementos de tipo doble y la segundo por seis elementos de tipo entero.

![image.jpg](/Java/Apuntes_java/imagenes/arrays/segundacap.png)


# Matrices 

## ¿Que es una matriz?

- Una matriz en un arreglo bidimensional, necesita dos índices para acceder a sus elementos. Gráficamente podemos representar una matriz como una tabla de n filas y m columnas cuyos elementos son todos del mismo tipo. La siguiente figura representa un matriz M de 3 filas y 5 columnas:

![image.jpg](/Java/Apuntes_java/imagenes/matrices/ejemplo.png)



# POO

- La programacion orientada a objetos es una forma especial de programar, mas cercano a como expresariamos las cosas en la vida real que otros tipos de programacion.
 
 ## Clases 
 - Un conjunto de objetos con caracteristicas similares.

 ```java
 package Introduccion;

import javax.swing.JOptionPane;

public class Operacion {
//Atributos 
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multi;
	int divi;
	
	
//Metodos 
// Metodo para pedir al usuario dos numeros 
	
	public void LeerNumeros() {
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero:"));
		
	}
	public void Sumar() {
		suma = numero1 + numero2;
	}
	public void Restar() {
		resta = numero1 - numero2;
	}
	public void Dividir() {
		divi = numero1 / numero2;
	}
	public void Multiplicar() {
		multi = numero1 * numero2;
	}
	public void MostrarResultados() {
		System.out.println("El resultado de la suma es: "+ suma);
		System.out.println("El resultado de la resta es: "+ resta);
		System.out.println("El resultado de la division es: "+ divi);
		System.out.println("El resultado de la multiplicacion es: "+ multi);
	}
}

 ```
## Su clase main
 ```java
 package Introduccion;

public class MainOperacion {
	
	public static void main(String []args) {
		
		Operacion op = new Operacion();
		
		
		op.LeerNumeros();
		op.Sumar();
		op.Restar();
		op.Dividir();
		op.Multiplicar();
		op.MostrarResultados();
		
		
	}

}
 ```
 ## Concepto y creacion de métodos

 - Un método es una accion o compotamiento de los objetos.


 ## Métodos : retorno de valores 

```java
package EncapsulamientoYMetodoAccesor;

public class Clase1 {

	private int edad;
	private String nombre;
	
	//Metodo Setter: Establece la edad
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Metodo Getter: Mostramos la edad
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
```
## Su clase main
```java
package EncapsulamientoYMetodoAccesor;

public class MainClases {

	public static void main(String[] args) {
		
		Clase1 p1 = new Clase1();
		
		
		p1.setEdad(15);
		p1.setNombre("Pablo");
		System.out.println("La edad es: "+ p1.getEdad());
		System.out.println("Mi nombre es: "+ p1.getNombre());
		
	}

}
```

# Método constructor

- Un constructor es un método especial de una clase que se invoca siempre que se crea un objeto de una clase.

- Cuando se crea un objeto ocurren tres cosas:

1. Se asigna memoria para el objeto
1. Se inicializa los atributos de ese objeto
1. Se invoca al constructor de la clase que puede ser uno entre varios


 ```java
 package MetodoConstructor;

public class Constructor {

	//Atributos
	String nombre;
	int edad;
	
	//Metodos
	
	//Metodo constructor
	public Constructor(String _nombre, int _edad) {
		
		nombre = _nombre;
		edad = _edad;	
	}
	
	//Otra forma de hacerlo 
	//El this. hace diferencia entre atributo y parametro
/*public Constructor(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;	
	}*/
	
	
	public void mostrarDatos() {
		
		System.out.println("El nombre es: "+ nombre);
		System.out.println("La edad es: "+ edad);
	}
}
 ```

 # Sobrecargar un método 

 - La sobrecarga de Metodos es la creacion de varios metodos con el mismo nombre pero con diferente lista de parametros.

 ```java
 package SobrecargarMetodos;

public class Sobrecarga {
	
	String nombre;
	int edad;
	String dni;
	
	//Metodos
	public Sobrecarga(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Sobrecarga(String dni) {
		super();
		this.dni = dni;
	}

	
	public void correr() {
		System.out.println("Soy "+nombre+ " ,tengo "+edad+ " años y estoy en una carrera"+" y mi dni es "+dni);
	}
	public void correr(int km) {
		System.out.println("He recorrido "+km+" kilometros");
	}
}
 ```
 # Main de la clase

 ```java
 package SobrecargarMetodos;

public class MainSobrecarga {

	public static void main(String[] args) {
	
		
		Sobrecarga p1 = new Sobrecarga("pablo",21);
		
		p1.correr();
		
		Sobrecarga p2 = new Sobrecarga("1234567R");
		
		p2.correr(15);

	}
}
 ```
# Niveles de acceso a los miembros de una clase

- En Java huy varios niveles de acceso a los miembros de una clase, es decir, a los atributos y métodos de una clase:
- **Público (public)**. Se puede acceder a ese miembro desde cualquier otra clase de la aplicación.
- **Privado (private)**. No se puede acceder a ese miembro desde ninguna otra clase.
- **Protegido (protected)**. No se puede acceder a ese miembro desde ninguna otra clase, excepto las que pertenezcan al mismo paquete y las subclases, que sí podrán. 

No especificado. Si no especificas el nivel de acceso, solo podrán acceder al miembro de la clase las clases del mismo paquete, pero no las
subclases.

