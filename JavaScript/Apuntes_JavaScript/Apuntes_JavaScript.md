# JavaScript

## Que es javascript

- Es un lenguaje de scripting multiplataforma y orientado a objetos. JavaScript es el lenguaje de programación más popular del mundo.

## ¿Por qué estudiar JavaScript?

- JavaScript es uno de los 3 lenguajes que todos los desarrolladores web deben aprender:

   1. HTML para definir el contenido de las páginas web

   2. CSS para especificar el diseño de las páginas web

   3. JavaScript para programar el comportamiento de las páginas web

**JAVASCRIPT ES DISTINTO DE JAVA !!!**

- JavaScript y Java son lenguajes completamente diferentes, tanto en concepto como en diseño.

- JavaScript fue inventado por Brendan Eich en 1995 y se convirtió en un estándar ECMA en 1997.

- ECMA-262 es el nombre oficial del estándar. ECMAScript es el nombre oficial del lenguaje.

- Muestra informacion sobre la pagina web que se esta ejecutando en ese momento, y tambien incluye la línea de comando que puedes usar para ejecutar expresiones Javascript en la pagina actual.

## Sacar por panatalla

- La funcion ```console.log()``` muestra la informacion proporcionada en la consola de javascript.

```javascript
console.log("hola mundo");
```

## Comentarios

Javascript tiene dos tipos de sintaxis:

```javascript

// Comentario de una linea

/*
Este es multilinea
*/
```

### Que es un comentario

- Los comentarios son anotaciones en el codigo fuente de un programa que son invisibles para el interprete, los comentarios se usan para describir **aspectos importantes** que permitan una mejor comprension del código.

## Variables javascript

4 formas de declarar una variable de JavaScript:

1. Usando ```var```
1. Usando ```let```
1. Usando ```const```
1. usando ```nada```

### ¿Qué son las Variables?

Las variables son contenedores para almacenar datos (almacenar valores de datos).

- En este ejemplo, ```x```, ```y```  y ```z```, son variables declaradas con la varpalabra clave.

```javascript
var x = 5;
var y = 6;
var z = x + y;
```

### ¿Cuándo usar var?

**Declare siempre las variables de JavaScript con ```var```, ```let``` o ```const```.**

1. La palabra clave var se usa en todo el código JavaScript desde 1995 hasta 2015.
1. Las palabras clave let y const se agregaron a JavaScript en 2015.
1. Si desea que su código se ejecute en navegadores más antiguos, debe usar var.

### ¿Cuándo usar const?

Si quieres una regla general: declara siempre las variables con const.

- Si cree que el valor de la variable puede cambiar, use ```let```.

```Javascript
const price1 = 5;
const price2 = 6;
let total = price1 + price2;
```

## Identificadores JavaScript

Todas las variables de JavaScript deben identificarse con nombres únicos. Estos nombres únicos se denominan **identificadores** .

Los identificadores pueden ser nombres cortos (como x e y) o nombres más descriptivos (edad, suma, volumen total).

Las reglas generales para construir nombres para variables (identificadores únicos) son:

1. Los nombres pueden contener letras, dígitos, guiones bajos y signos de dólar.
1. Los nombres deben comenzar con una letra.
1. Los nombres también pueden comenzar con $ y _ (pero no lo usaremos en este tutorial).
1. Los nombres distinguen entre mayúsculas y minúsculas (y e Y son variables diferentes).
1. Las palabras reservadas (como las palabras clave de JavaScript) no se pueden usar como nombres.

**(Los identificadores de JavaScript distinguen entre mayúsculas y minúsculas).**


# Tipos de Datos

En la sección anterior, mencionamos un poco sobre los tipos de datos. Los datos o valores tienen tipos de datos. Los tipos de datos describen las características de los datos. Los tipos de datos se pueden dividir en dos:

1. Tipos de datos primitivos
2. Tipos de datos que no son primitivos (referencias de objetos)

### Tipos de datos primitivos

Los tipos de datos primitivos en JavaScript incluyen:

1.  Números: enteros, flotantes
2.  Cadenas: cualquier dato entre comillas simples, comillas dobles o comillas invertidas
3.  Booleanos: valor verdadero o falso
4.  Nulo - valor vacío o sin valor
5.  Indefinido - una variable declarada sin un valor

Los tipos de datos que no son primitivos en JavaScript incluyen:

1. Objetos
2. Funciones
3. Matrices

Ahora, veamos qué significan exactamente los tipos de datos primitivos y no primitivos.
Los tipos de datos _primitivos_ son tipos de datos inmutables (no modificables). Una vez que se crea un tipo de datos primitivo, no podemos modificarlo.

**Ejemplo:**

```js
let palabra = "JavaScript";
```
Si intentamos modificar la cadena almacenada en la variable _word_, JavaScript debería generar un error. Cualquier tipo de datos bajo comillas simples, comillas dobles o comillas invertidas son un tipo de datos de cadena.

```js
palabra[0] = "Y";
```

Esta expresión no cambia la cadena almacenada en la variable _word_. Entonces, podemos decir que las cadenas no son modificables o, en otras palabras, inmutables. Los tipos de datos primitivos se comparan por sus valores. Comparemos diferentes valores de datos. Vea el ejemplo a continuación:

```js
let num1 = 3;
let num2 = 3;

console.log(num1 == num2); // Verdadero

let js = "JavaScript";
let py = "Python";

console.log(js == py); // Falso

let luzOn = true;
let luzOff = false;

console.log(luztOn == luzOff); // Falso
```

## Tipos de datos no primitivos

Los tipos de datos _no primitivos_ son modificables o mutables. Podemos modificar el valor de los tipos de datos no primitivos después de su creación.
Veamos creando una matriz. Una matriz es una lista de valores de datos entre corchetes. Las matrices pueden contener tipos de datos iguales o diferentes. Los valores de matriz están referenciados por su índice. En el índice de matriz de JavaScript comienza en cero. Es decir, el primer elemento de una matriz se encuentra en el índice cero, el segundo elemento en el índice uno y el tercer elemento en el índice dos, etc.


```js
let num = [1, 2, 3];
num[0] = 10;

console.log(nums); // [10, 2, 3]
```
Como puede ver, una matriz, que es un tipo de datos no primitivo, es mutable. Los tipos de datos no primitivos no se pueden comparar por valor. Incluso si dos tipos de datos no primitivos tienen las mismas propiedades y valores, no son estrictamente iguales.

```js
let num = [1, 2, 3];
let numeros = [1, 2, 3];

console.log(num == numeros); // Falso

let usuarioUno = {
  nombre: "Pedro",
  papel: "profesor",
  pais: "Finlandia",
};

let usuarioDos = {
  nombre: "Alfonso",
  papel: "programador",
  pais: "España",
};

console.log(usuarioUno == usuarioDos); // Falso
```
Como regla general, no comparamos tipos de datos no primitivos. No compare matrices, funciones u objetos.
Los valores no primitivos se conocen como tipos de referencia, porque se comparan por referencia en lugar de por valor. Dos objetos solo son estrictamente iguales si se refieren al mismo objeto subyacente.

```js
let nums = [1, 2, 3];
let numeros = num;

console.log(num == numeros); // Verdadero

let usuarioUno = {
  nombre: "Pedro",
  papel: "profesor",
  pais: "Finlandia",
};

let userTwo = userOne;

console.log(usuarioUno == usuarioDos); // Verdadero
```

## Números

Los números son números enteros y valores decimales que pueden hacer todas las operaciones aritméticas.
Veamos algunos ejemplos de Números.

### Declaración de tipos de datos numéricos

```js
let edad = 35;
const gravedad = 9.81; // usamos const para valores que no cambian, constante gravitacional en m/s2
let masa = 72; // masa en Kilogramo
const PI = 3.14; // pi una constante geométrica

// Más ejemplos
const boilingPoint = 100; // temperatura en oC, punto de ebullición del agua que es una constante
const tempcorporal = 37; // oC la temperatura corporal promedio del ser humano, que es una constante

console.log(edad, gravedad, masa, PI, boilingPoint, tempcorporal);
```

### Objeto matemático

En JavaScript, el objeto matemático proporciona muchos métodos para trabajar con números.

```js
const PI = Math.PI;

console.log(PI); // 3.141592653589793

// Redondeo al número más cercano
// si es superior a 0,5 hacia arriba si es inferior a 0,5 redondeo hacia abajo

console.log(Math.round(PI)); // 3 para redondear valores al número más cercano

console.log(Math.round(9.81)); // 10

console.log(Math.floor(PI)); // 3 redondeando hacia abajo

console.log(Math.ceil(PI)); // 4 redondeando hacia arriba

console.log(Math.min(-5, 3, 20, 4, 5, 10)); // -5, devuelve el valor mínimo

console.log(Math.max(-5, 3, 20, 4, 5, 10)); // 20, devuelve el valor máximo

const randNum = Math.random(); // crea un número aleatorio entre 0 y 0,999999
console.log(randNum);

// Vamos a crear un número aleatorio entre 0 y 10

const num = Math.floor(Math.random() * 11); // crea un número aleatorio entre 0 y 10
console.log(num);

//Valor absoluto
console.log(Math.abs(-10)); // 10

//Raíz cuadrada
console.log(Math.sqrt(100)); // 10

console.log(Math.sqrt(2)); // 1.4142135623730951

// Poder
console.log(Math.pow(3, 2)); // 9

console.log(Math.E); // 2.718

// Logaritmo
// Devuelve el logaritmo natural con base E de x, Math.log(x)
console.log(Math.log(2)); // 0.6931471805599453
console.log(Math.log(10)); // 2.302585092994046

// Devuelve el logaritmo natural de 2 y 10 respectivamente
console.log(Math.LN2); // 0.6931471805599453
console.log(Math.LN10); // 2.302585092994046

// Trigonometría
Math.sin(0);
Math.sin(60);

Math.cos(0);
Math.cos(60);
```
## Generador de números aleatorios

El objeto matemático de JavaScript tiene un generador de números de método random() que genera un número de 0 a 0.999999999...

```js
let randomNum = Math.random(); // genera 0 a 0.999...
```

Ahora, veamos cómo podemos usar el método random() para generar un número aleatorio entre 0 y 10:

```js
let randomNum = Math.random(); //  0 a 0.999
let numBtnZeroAndTen = randomNum * 11;

console.log(numBtnZeroAndTen); // esto da: min 0 y max 10.99

let randomNumRoundToFloor = Math.floor(numBtnZeroAndTen);
console.log(randomNumRoundToFloor); // esto da entre 0 y 10
```
## Cadenas

Las cadenas son textos, que están debajo de **_single_** , **_double_**, **_back-tick_** comillas. Para declarar una cadena, necesitamos un nombre de variable, un operador de asignación, un valor entre comillas simples, comillas dobles o comillas invertidas.
Veamos algunos ejemplos de cadenas:

```js
let espacio = " "; // una cadena de espacio vacío
let primerNombre = "Borja";
let apellido = "Perez";
let pais = "España";
let ciudad = "Madrid";
let idioma = "JavaScript";
let trabajo = "Profesor";
let cita = "A grandes males, grandes remedios";
let quotConBackTick = `A grandes males, grandes remedios `;
```
