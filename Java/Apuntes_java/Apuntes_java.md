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
int i=0;
while (i<5) {
i=i+1;
System.out.println(i);
}

```
- El bucle do-while es muy similar al while con la diferencia de que primero se ejecuta la instrucción y después se evalúa la condición. 
- **ejemplo accion/condición**
```java
int i=0;
do {
i=i+1;
System.out.println(i);
} while (i<5);
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
for (i=1; i<=10; i++) {
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
![image.png](/.attachments/image-bbb3ff10-4b31-443c-ace8-50ab4db784fc.png)

# Bucles independientes 
- Cuando esto no dependen de otros anidados para deterrminar el numero de iteraciones se denominan independientes.
# Bucles dependientes 
- Podria darse el caso de que un bucle interno no sea independiente de la ejecucion de los externos y dependa de sus variables de control.