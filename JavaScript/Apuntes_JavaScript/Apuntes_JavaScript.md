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

### Concatenación de cadenas

La conexión de dos o más cadenas entre sí se llama concatenación.
Usando las cadenas declaradas en la sección de Cadenas anterior:

```js
let nombreCompleto = primerNombre + espacio + apellido; // concatenación, fusionando dos cadenas juntas.
console.log(nombreCompleto);
```

```sh
Asabeneh Yetayeh
```

Podemos concatenar cadenas de diferentes formas.

#### Concatenar usando el operador de suma

Concatenar usando el operador de suma es una forma antigua. Esta forma de concatenar es tediosa y propensa a errores. Es bueno saber cómo concatenar de esta manera, pero recomiendo enfáticamente usar las cadenas de plantilla ES6 (explicadas más adelante).

```js
// Declarar diferentes variables de diferentes tipos de datos
let espacio = " ";
let primerNombre = "Asabeneh";
let apellido = "Yetayeh";
let pais = "Finland";
let ciudad = "Helsinki";
let idioma = "JavaScript";
let trabajo = "teacher";
let edad = 250;

let nombreCompleto = primerNombre + espacio + apellido;
let datosPersonaUno =
  nombreCompleto + ". Yo tengo " + edad + ". Vivo en" + pais; // Adición de cadena ES5

console.log(personInfoOne);
```

```sh
Asabeneh Yetayeh. Yo tengo 250v Finland
```

#### Cadenas literales largas

Una cadena puede ser un solo carácter, un párrafo o una página. Si la longitud de la cadena es demasiado grande, no cabe en una línea. Podemos usar el carácter de barra invertida (\\) al final de cada línea para indicar que la cadena continuará en la línea siguiente.
**Ejemplo:**

```js
const parrafo =
  "Mi nombre es Asabeneh Yetayeh. Vivo en Finlandia, Helsinki.\
Soy profesora y me encanta enseñar. Enseño HTML, CSS, JavaScript, React, Redux, \
Node.js, Python, Data Analysis y D3.js para cualquier persona interesada en aprender. \
A fines de 2019, estaba pensando en expandir mi enseñanza y llegar a \
a la audiencia global y comencé un desafío de Python del 20 de noviembre al 19 de diciembre.\
Fue una de las experiencias más gratificantes e inspiradoras.\
Ahora, estamos en 2020. Disfruto preparando el desafío 30DaysOfJavaScript y \
Espero que tú también estés disfrutando.";

console.log(parrafo);
```

#### Secuencias de escape en cadenas

En JavaScript y otros lenguajes de programación \ seguido de algunos caracteres es una secuencia de escape. Veamos los caracteres de escape más comunes:

-\n: nueva linea

- \t: Tabulador, significa 8 espacios
- \\\\: barra invertida
- \\': Una frase (')
- \\": comillas dobles (")

```js
console.log(
  "Espero que todos estén disfrutando el desafío de 30 días de JavaScript.¿Y tú?"
); // salto de línea
console.log("Días\temasEjercicios");
console.log("Día 1\t3\t5");
console.log("Día 2\t3\t5");
console.log("Día 3\t3\t5");
console.log("Día 4\t3\t5");
console.log("Este es un símbolo de barra invertida (\\)"); // Para escribir una barra invertida
console.log(
  'En todos los lenguajes de programación comienza con "¡Hola, mundo!"'
);
console.log(
  "En todos los lenguajes de programación comienza con '¡Hola, mundo!'"
);
console.log("El dicho 'Ver para creer' no es correcto en 2022");
```

Salida en consola:

```sh
Espero que todos estén disfrutando el desafío de 30 días de JavaScript.
¿Y tú?

Días temas Ejercicios
Día 1 3 5
Día 2 3 5
Día 3 3 5
Día 4 3 5
Este es un símbolo de barra invertida (\)
En todos los lenguajes de programación comienza con"¡Hola, mundo!"
En todos los lenguajes de programación comienza con"¡Hola, mundo!"
El dicho 'Ver para creer' no es correcto en 2022
```

#### Literales de plantilla

Para crear una plantilla de cadenas(cadenas de plantilla), usamos dos tildes de retroceso. Podemos inyectar datos como expresiones dentro de una cadena de plantilla. Para inyectar datos, encerramos la expresión con un corchete ({}) precedido por un signo $. Consulte la sintaxis a continuación.

```js
//Sintaxis
`Texto literal de cadena``Cadena de texto literal ${expresión}`;
```

**Ejemplo: 1**

```js
console.log(`La suma de 2 y 3 es 5`); // escribiendo estáticamente los datos
let a = 2;
let b = 3;
console.log(`La suma de ${a} y ${b} es ${a + b}`); // inyectando los datos dinámicamente
```

**Ejemplo:2**

```js
let espacio = " ";
let primerNombre = "Asabeneh";
let apellido = "Yetayeh";
let pais = "Finland";
let ciudad = "Helsinki";
let idioma = "JavaScript";
let trabajo = "profesora";
let edad = 250;
let nombreCompleto = primerNombre + espacio + apellido;

let personaInfoDos = `Soy ${nombreCompleto}. Tengo ${edad} años. Vivo en ${pais}.`; //ES6 - Método de interpolación de cadenas
let personaInfoTres = `Soy ${nombreCompleto}. Vivo en ${ciudad}, ${pais}. Soy una ${trabajo}. Enseño ${idioma}.`;
console.log(personaInfoDos);
console.log(personaInfoTres);
```

```sh
Soy Asabeneh Yetayeh. Tengo 250 años. Vivo en  in Finland.
Soy Asabeneh Yetayeh. Vivo en Helsinki, Finland. Soy una profesora. Enseño JavaScript.
```

Usando una plantilla de cadena o un método de interpolación de cadena, podemos agregar expresiones, que podrían ser un valor, o algunas operaciones (comparación, operaciones aritméticas, operación ternaria).

```js
let a = 2;
let b = 3;
console.log(`${a} es mayor que ${b}: ${a > b}`);
```

```sh
2 es mayor que 3: false
```

### Métodos de cadena

Todo en JavaScript es un objeto. Una cadena es un tipo de datos primitivo, lo que significa que no podemos modificarla una vez que se crea. El objeto de cadena tiene muchos métodos de cadena. Existen diferentes métodos de cadenas que nos pueden ayudar a trabajar con cadenas.

1. _longitud_: el método de cadena _longitud_ devuelve el número de caracteres en una cadena incluido el espacio vacío.

**Example:**

```js
let js = "JavaScript";
console.log(js.length); // 10
let primerNombre = "Asabeneh";
console.log(primerNombre.length); // 8
```

2. _Acceder a los caracteres de una cadena_: Podemos acceder a cada carácter de una cadena usando su índice. En programación, el conteo comienza desde 0. El primer índice de la cadena es cero y el último índice es la longitud de la cadena menos uno.

![image.png](/JavaScript/Apuntes_JavaScript/imagenes/Captura%20de%20pantalla%202023-01-30%20212451.png)

Accedamos a diferentes caracteres en la cadena 'JavaScript'.

```js
let string = "JavaScript";
let firstLetter = string[0];

console.log(firstLetter); // J

let secondLetter = string[1]; // a
let thirdLetter = string[2];
let lastLetter = string[9];

console.log(lastLetter); // t

let lastIndex = string.length - 1;

console.log(lastIndex); // 9
console.log(string[lastIndex]); // t
```

3. _toUpperCase()_: este método cambia la cadena a letras mayúsculas.

```js
let string = "JavaScript";

console.log(string.toUpperCase()); // JAVASCRIPT

let firstName = "Asabeneh";

console.log(firstName.toUpperCase()); // ASABENEH

let country = "Finland";

console.log(country.toUpperCase()); // FINLAND
```

4. _toLowerCase()_: este método cambia la cadena a letras minúsculas.

```js
let string = "JavasCript";

console.log(string.toLowerCase()); // javascript

let firstName = "Asabeneh";

console.log(firstName.toLowerCase()); // asabeneh

let country = "Finland";

console.log(country.toLowerCase()); // finland
```

5. _substr()_: Se necesitan dos argumentos, el índice inicial y el número de caracteres para dividir.

```js
let string = "JavaScript";
console.log(string.substr(4, 6)); // Script

let country = "Finland";
console.log(country.substr(3, 4)); // land
```

6. _substring()_: Toma dos argumentos, el índice inicial y el índice final, pero no incluye el carácter en el índice final.

```js
let string = "JavaScript";

console.log(string.substring(0, 4)); // Java
console.log(string.substring(4, 10)); // Script
console.log(string.substring(4)); // Script

let country = "Finland";

console.log(country.substring(0, 3)); // Fin
console.log(country.substring(3, 7)); // land
console.log(country.substring(3)); // land
```

7. _split()_: El método split divide una cadena en un lugar específico.

```js
let string = "30 Days Of JavaScript";

console.log(string.split()); // Cambios en una matriz -> ["30 Days Of JavaScript"]
console.log(string.split(" ")); // Dividir a una matriz en el espacio -> ["30", "Days", "Of", "JavaScript"]

let firstName = "Asabeneh";

console.log(firstName.split()); // Cambiar a una matriz - > ["Asabeneh"]
console.log(firstName.split("")); // Dividir en una matriz en cada letra ->  ["A", "s", "a", "b", "e", "n", "e", "h"]

let countries = "Finland, Sweden, Norway, Denmark, and Iceland";

console.log(countries.split(",")); // Dividir en cualquier matriz en coma -> ["Finland", " Sweden", " Norway", " Denmark", " and Iceland"]
console.log(countries.split(", ")); //  ["Finland", "Sweden", "Norway", "Denmark", "and Iceland"]
```

8. _trim()_: Elimina el espacio final al principio o al final de una cadena.

```js
let string = "   30 Days Of JavaScript   ";

console.log(string);
console.log(string.trim(" "));

let firstName = " Asabeneh ";

console.log(firstName);
console.log(firstName.trim()); // todavía elimina espacios al principio y al final de la cadena
```

```sh
   30 Days Of JavasCript
30 Days Of JavasCript
  Asabeneh
Asabeneh
```

9. _includes()_: Toma un argumento de subcadena y verifica si existe un argumento de subcadena en la cadena. _includes()_ devuelve un valor booleano. Si existe una subcadena en una cadena, devuelve verdadero; de lo contrario, devuelve falso.

```js
let string = "30 Days Of JavaScript";

console.log(string.includes("Days")); // verdadero
console.log(string.includes("days")); // falso: ¡se distingue entre mayúsculas y minúsculas!
console.log(string.includes("Script")); // verdadero
console.log(string.includes("script")); // falso
console.log(string.includes("java")); // falso
console.log(string.includes("Java")); // verdadero

let country = "Finland";

console.log(country.includes("fin")); // falso
console.log(country.includes("Fin")); // verdadero
console.log(country.includes("land")); // verdadero
console.log(country.includes("Land")); // falso
```

10. _replace()_: toma como parámetro la subcadena antigua y una nueva subcadena.

```js
string.replace(oldsubstring, newsubstring);
```

```js
let string = "30 Days Of JavaScript";
console.log(string.replace("JavaScript", "Python")); // 30 Days Of Python

let country = "Finland";
console.log(country.replace("Fin", "Noman")); // Nomanland
```

11. _charAt()_: Toma índice y devuelve el valor en ese índice

```js
string.charAt(index);
```

```js
let string = "30 Days Of JavaScript";
console.log(string.charAt(0)); // 3

let lastIndex = string.length - 1;
console.log(string.charAt(lastIndex)); // t
```

12. _charCodeAt()_: Toma el índice y devuelve el código char (número ASCII) del valor en ese índice

```js
string.charCodeAt(index);
```

```js
let string = "30 Days Of JavaScript";
console.log(string.charCodeAt(3)); // D ASCII numbero es 68

let lastIndex = string.length - 1;
console.log(string.charCodeAt(lastIndex)); // t ASCII es 116
```

13. _indexOf()_: Toma una subcadena y si la subcadena existe en una cadena, devuelve la primera posición de la subcadena; si no existe, devuelve -1

```js
string.indexOf(substring);
```

```js
let string = "30 Days Of JavaScript";

console.log(string.indexOf("D")); // 3
console.log(string.indexOf("Days")); // 3
console.log(string.indexOf("days")); // -1
console.log(string.indexOf("a")); // 4
console.log(string.indexOf("JavaScript")); // 11
console.log(string.indexOf("Script")); //15
console.log(string.indexOf("script")); // -1
```

14. _lastIndexOf()_: Toma una subcadena y si la subcadena existe en una cadena, devuelve la última posición de la subcadena; si no existe, devuelve -1

```js
//syntax
string.lastIndexOf(substring);
```

```js
let string =
  "I love JavaScript. If you do not love JavaScript what else can you love.";

console.log(string.lastIndexOf("love")); // 67
console.log(string.lastIndexOf("you")); // 63
console.log(string.lastIndexOf("JavaScript")); // 38
```

15. _concat()_: toma muchas subcadenas y las une.

```js
string.concat(substring, substring, substring);
```

```js
let string = "30";
console.log(string.concat("Days", "Of", "JavaScript")); // 30DaysOfJavaScript

let country = "Fin";
console.log(country.concat("land")); // Finland
```

16. _startsWith_: toma una subcadena como argumento y verifica si la cadena comienza con esa subcadena especificada. Devuelve un valor booleano (verdadero o falso).

```js
//syntax
string.startsWith(substring);
```

```js
let string = "Love is the best to in this world";

console.log(string.startsWith("Love")); // verdadero
console.log(string.startsWith("love")); // falso
console.log(string.startsWith("world")); // falso

let country = "Finland";

console.log(country.startsWith("Fin")); // verdadero
console.log(country.startsWith("fin")); // falso
console.log(country.startsWith("land")); //  falso
```

17. _endsWith_: toma una subcadena como argumento y verifica si la cadena termina con esa subcadena especificada. Devuelve un valor booleano (verdadero o falso).

```js
string.endsWith(substring);
```

```js
let string = "Love is the most powerful feeling in the world";

console.log(string.endsWith("world")); // verdadero
console.log(string.endsWith("love")); // falso
console.log(string.endsWith("in the world")); // verdadero

let country = "Finland";

console.log(country.endsWith("land")); // verdadero
console.log(country.endsWith("fin")); // falso
console.log(country.endsWith("Fin")); //  falso
```

18. _search_: toma una subcadena como argumento y devuelve el índice de la primera coincidencia. El valor de búsqueda puede ser una cadena o un patrón de expresión regular.

```js
string.search(substring);
```

```js
let string =
  "I love JavaScript. If you do not love JavaScript what else can you love.";
console.log(string.search("love")); // 2
console.log(string.search(/javascript/gi)); // 7
```

19. _match_: toma una subcadena o un patrón de expresión regular como argumento y devuelve una matriz si hay una coincidencia; de lo contrario, devuelve un valor nulo. Veamos cómo se ve un patrón de expresión regular. Comienza con /signo y termina con /signo.

```js
let string = "love";
let patternOne = /love/; // sin ninguna bandera
let patternTwo = /love/gi; // g-significa buscar en todo el texto, i - no distingue entre mayúsculas y minúsculas
```

Coincidencia de sintaxis

```js
// sintaxis
string.match(substring);
```

```js
let string =
  "I love JavaScript. If you do not love JavaScript what else can you love.";
console.log(string.match("love"));
```

```sh
["love", index: 2, input: "I love JavaScript. If you do not love JavaScript what else can you love.", groups: undefined]
```

```js
let pattern = /love/gi;
console.log(string.match(pattern)); // ["love", "love", "love"]
```

Extraigamos números del texto usando una expresión regular. Esta no es la sección de expresiones regulares, ¡no se asuste! Cubriremos las expresiones regulares más adelante.

```js
let txt =
  "In 2019, I ran 30 Days of Python. Now, in 2020 I am super exited to start this challenge";
let regEx = /\d+/;

// d con carácter de escape significa que d no es una d normal sino que actúa como un dígito
// + significa uno o más dígitos,
// si hay g después de eso, significa global, busque en todas partes.

console.log(txt.match(regEx)); // ["2", "0", "1", "9", "3", "0", "2", "0", "2", "0"]
console.log(txt.match(/\d+/g)); // ["2019", "30", "2020"]
```

20. _repeat()_: toma un número como argumento y devuelve la versión repetida de la cadena.

```js
string.repeat(n);
```

```js
let string = "love";
console.log(string.repeat(10)); // lovelovelovelovelovelovelovelovelovelove
```

## Comprobación de tipos de datos y conversión

### Comprobación de tipos de datos

Para comprobar el tipo de datos de una determinada variable utilizamos el método _typeof_.

**Ejemplo:**

```js
// Diferentes tipos de datos javascript
// Declaremos diferentes tipos de datos

let firstName = 'Asabeneh' // cadena
let lastName = 'Yetayeh'   // cadena
let pais = 'Finlandia'.    // cadena
let ciudad = 'Helsinki'    // cadena
let edad = 250             // numero, no es mi edad real, no te preocupes
let trabajo                    // indefinido, porque no se asignó un valor

console.log(typeof 'Asabeneh')  // cadena
console.log(typeof firstName)   // cadena
console.log(typeof 10)          // numbero
console.log(typeof 3.14)        // numbero
console.log(typeof true)        // booleano
console.log(typeof false)       // booleano
console.log(typeof NaN)         // numbero
console.log(typeof job)         // indefinido
console.log(typeof undefined)   // indefinido
console.log(typeof null)        // objeto
```

### Cambio del tipo de datos

- Casting: Conversión de un tipo de datos a otro tipo de datos. Usamos _parseInt()_, _parseFloat()_, _Number()_, _+ sign_, _str()_
  Cuando hacemos operaciones aritméticas, los números de cadena deben convertirse primero en enteros o flotantes; de lo contrario, devuelve un error.

#### Cadena a Int

Podemos convertir el número de cadena en un número. Cualquier número dentro de una comilla es un número de cadena. Un ejemplo de un número de cadena: '10', '5', etc.
Podemos convertir cadena a número usando los siguientes métodos:

- parseInt()
- Número()
- Signo más (+)

```js
let num = "10";
let numInt = parseInt(num);
console.log(numInt); // 10
```

```js
let num = "10";
let numInt = Number(num);

console.log(numInt); // 10
```

```js
let num = "10";
let numInt = +num;

console.log(numInt); // 10
```

#### Cadena a Floatante

Podemos convertir un número flotante de cadena en un número flotante. Cualquier número flotante dentro de una comilla es un número flotante de cadena. Un ejemplo de un número flotante de cadena: '9.81', '3.14', '1.44', etc.
Podemos convertir cadenas flotantes en números usando los siguientes métodos:

- parseFloat()
- Número()
- Signo más (+)

```js
let num = "9.81";
let numFloat = parseFloat(num);

console.log(numFloat); // 9.81
```

```js
let num = "9.81";
let numFloat = Number(num);

console.log(numFloat); // 9.81
```

```js
let num = "9.81";
let numFloat = +num;

console.log(numFloat); // 9.81
```

#### Flotante a Int

Podemos convertir números flotantes a enteros.
Usamos el siguiente método para convertir float a int:

- parseInt()

```js
let num = 9.81;
let numInt = parseInt(num);

console.log(numInt); // 9
```