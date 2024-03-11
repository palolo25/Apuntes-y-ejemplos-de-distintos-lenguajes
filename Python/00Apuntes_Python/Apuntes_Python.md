# Python 

## Que es python 

- Python es un lenguaje de programación popular. Fue creado por Guido van Rossum y lanzado en 1991. Python es un lenguaje de programación popular. Python se puede usar en un servidor para crear aplicaciones web.

## Que puede hacer python

1. Python se puede usar en un servidor para crear aplicaciones web.
1. Python se puede usar junto con el software para crear flujos de trabajo.
1. Python puede conectarse a sistemas de bases de datos. También puede leer y modificar archivos.
1. Python se puede usar para manejar big data y realizar operaciones matemáticas complejas.
1. Python se puede utilizar para la creación rápida de prototipos o para el desarrollo de software listo para la producción.

```Python
print("hola mundo") 
```

# Sintaxis de python

## Sangría de Python

- La sangría se refiere a los espacios al comienzo de una línea de código. Mientras que en otros lenguajes de programación la sangría en el código es solo para facilitar la lectura, la sangría en Python es muy importante. Python usa sangría para indicar un bloque de código.

```Python
if 5 > 2:
  print("Five is greater than two!")
```


# Comentarios

- Los comentarios se pueden usar para explicar el código de Python.

- Los comentarios se pueden utilizar para hacer que el código sea más legible.

- Los comentarios se pueden usar para evitar la ejecución al probar el código.

```python
 #Esto es un comentario
print("hola mundo")

print("hola mundo") #Esto es un comentario

#print("hola mundo")
print("silla, mesa!")
```
## Comentarios en varias lineas 

- Python realmente no tiene una sintaxis para comentarios de varias líneas.Para agregar un comentario de varias líneas, puede insertar un ```#``` para cada línea.

```python
# Esto es un comentario
# En mas 
# de una linea
print("hola mundo")
 ```
 - También puedes agregar un comentario de varias lineas introduciendolo entre triples comillas dobles ```Comentario```
 ```python
 """Comentario en varias lineas
 en el que puedes poner todas las que quieras
 """
 ```
# Variables en python

- En Python, las variables se crean cuando le asignas un valor

```python
x = 5
y = "Hello, World!"
```

# Tipos de datos integrados
En programación, el tipo de datos es un concepto importante.

Las variables pueden almacenar datos de diferentes tipos, y diferentes tipos pueden hacer cosas diferentes.

Python tiene los siguientes tipos de datos integrados de forma predeterminada, en estas categorías:

- Tipo de texto: ``str``
- Tipos numéricos: ``int``, ``float``, ``complex``
- Tipos de secuencia: ``list``, ``tuple``, ``range``
- Tipo de mapeo ``dict``
- Establecer tipos: ``set``,``frozenset``
- Tipo booleano ``bool``
- Tipos binarios: ``bytes``, ``bytearray``, ``memoryview``
- Ninguno Tipo: ``NoneType``

# Números de Python

Hay tres tipos numéricos en Python:

- ``int``
- ``float``
- ``complex``
```python
x = 1    # int
y = 2.8  # float
z = 1j   # complex
```
## Enteros

```python
x = 1
y = 35656222554887711
z = -3255522

print(type(x))
print(type(y))
print(type(z))
```

## Flotantes

```python
x = 1.10
y = 1.0
z = -35.59

print(type(x))
print(type(y))
print(type(z))
```
## Complejo

```python
x = 3+5j
y = 5j
z = -5j

print(type(x))
print(type(y))
print(type(z))
```

# Conversion de tipos

- Puede convertir de un tipo a otro con los métodos ``int()``, ``float()`` y  ``complex()``.

```python
x = 1    # int
y = 2.8  # float
z = 1j   # complex

#convert from int to float:
a = float(x)

#convert from float to int:
b = int(y)

#convert from int to complex:
c = complex(x)

print(a)
print(b)
print(c)

print(type(a))
print(type(b))
print(type(c))
```

# Número aleatorio

Python no tiene una ``random()`` función para hacer un número aleatorio, pero Python tiene un módulo integrado llamado randomque se puede usar para hacer números aleatorios.
```python
import random

print(random.randrange(1, 10))
```

## Especificar un tipo de variable

- Puede haber ocasiones en las que desee especificar un tipo en una variable. Esto se puede hacer con fundición. Python es un lenguaje orientado a objetos y, como tal, utiliza clases para definir tipos de datos, incluidos sus tipos primitivos.

- Por lo tanto, la conversión en python se realiza mediante funciones de constructor:

- ``int()`` : Construye un número entero a partir de un literal entero, un literal flotante (eliminando todos los decimales) o un literal de cadena (siempre que la cadena represente un número entero).

- ``float()`` : Construye un número flotante a partir de un literal entero, un literal flotante o un literal de cadena (siempre que la cadena represente un flotante o un entero).

- ``str()`` : Construye una cadena a partir de una amplia variedad de tipos de datos, incluidas cadenas, literales enteros y literales flotantes.

```python
x = int(1)   # x will be 1
y = int(2.8) # y will be 2
z = int("3") # z will be 3

#float
x = float(1)     # x will be 1.0
y = float(2.8)   # y will be 2.8
z = float("3")   # z will be 3.0
w = float("4.2") # w will be 4.2

#complex
x = str("s1") # x will be 's1'
y = str(2)    # y will be '2'
z = str(3.0)  # z will be '3.0'
```

## Concatenacion

En Python las matemáticas funcionan tanto con palabras como con números.
 
Así que no sólo podemos añadir enteros y floats, sino también cadenas, utilizando algo llamado concatenación, que se puede hacer en dos cadenas cualesquiera.

Las cadenas que contienen números se siguen añadiendo como cadenas y no como enteros.

```python
print("Spam" + 'eggs')
print("2"+'2')
```

Tal vez no puedas sumar cadenas con números enteros, pero sí puedes multiplicar por ellos.
 
Multiplicar una cadena por un entero, produce una versión repetida de la cadena original.

```python
print("spam" * 3)

print(4 * '2')
```


# Estructuras de control de flujo

Python admite estructuras de control de flujo como **if-else**, **while** y **for**. Aquí hay algunos ejemplos:

```python
# if-else
x = 42
if x < 0:
    print("x es negativo")
elif x == 0:
    print("x es cero")
else:
    print("x es positivo")

# while
i = 0
while i < 10:
    print(i)
    i += 1

# for
for i in range(10):
    print(i)

```

## Sentencia if-else
La sentencia **if-else** se usa para ejecutar un bloque de código si se cumple una determinada condición.

```python
x = 5

if x > 0:
    print("x es mayor que 0")
elif x == 0:
    print("x es igual a 0")
else:
    print("x es menor que 0")

```

## Bucle while
El bucle **while** se utiliza para repetir un bloque de código mientras se cumple una determinada condición.
```python
x = 0

while x < 5:
    print(x)
    x += 1

```

## Bucle for
El bucle **for** se utiliza para iterar sobre una secuencia de elementos.

```python
nombres = ["Juan", "Maria", "Pedro"]

for nombre in nombres:
    print(nombre)
```

## Funciones
En Python, una función es un bloque de código que realiza una tarea específica. Las funciones se definen con la palabra clave **def**.
```python
def factorial(n):
    """
    Calcula el factorial de un número utilizando la recursividad.
    """
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

```

# POO

## Clases en python

En Python, una clase es una plantilla para crear objetos que tienen atributos y métodos en común. Para usar una clase, primero debes definirla y luego crear instancias de la misma.

```python
# Definir una clase "Persona"
class Persona:
    # Constructor para inicializar el objeto "Persona"
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    
    # Método para imprimir información sobre la persona
    def informacion(self):
        print("Mi nombre es", self.nombre, "y tengo", self.edad, "años.")

# Crear una instancia de la clase "Persona"
persona1 = Persona("Juan", 25)

# Acceder a los atributos de la instancia
print(persona1.nombre)
print(persona1.edad)

# Llamar al método "informacion" de la instancia
persona1.informacion()

```
- En este ejemplo, primero definimos una clase llamada "Persona" con un constructor __init__ que inicializa los atributos "nombre" y "edad". También definimos un método llamado "informacion" que imprime información sobre la persona.

- Luego, creamos una instancia de la clase "Persona" llamada "persona1" y le pasamos los valores "Juan" y 25 para los atributos "nombre" y "edad". Luego, accedemos a los atributos de la instancia usando la notación de punto (por ejemplo, persona1.nombre) y llamamos al método "informacion" de la instancia usando la misma notación de punto (persona1.informacion()).


## Herencia en python

La herencia es una característica clave de la programación orientada a objetos, y Python ofrece soporte completo para la herencia de clases.

Para heredar una clase en Python, simplemente defina una nueva clase y haga que su declaración comience con el nombre de la clase de la cual desea heredar, seguido de paréntesis. Por ejemplo, si tiene una clase "Animal" y desea crear una clase "Perro" que herede de ella, la declaración de la clase "Perro" podría ser la siguiente:
```python
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def hacer_sonido(self):
        print("Haciendo sonidos genéricos")

class Perro(Animal):
    def __init__(self, nombre, edad, raza):
        super().__init__(nombre, edad)
        self.raza = raza

    def hacer_sonido(self):
        print("Ladrando")

    def __str__(self):
        return f"{self.nombre} ({self.edad} años, {self.raza})"

```
En este ejemplo, la clase "Perro" hereda de la clase "Animal". La clase "Perro" tiene un método hacer_sonido() que sobrescribe el método con el mismo nombre en la clase "Animal". También tiene un método __str__() que devuelve una cadena que representa al perro.

La llamada a super().__init__() en el constructor de la clase "Perro" llama al constructor de la clase "Animal", lo que le permite inicializar los atributos heredados. En este caso, "Perro" también tiene un atributo adicional, "raza".

Para crear una instancia de la clase "Perro", simplemente use su constructor y proporcione los argumentos necesarios, incluyendo los que se requieren para el constructor heredado de la clase "Animal":

```python
mi_perro = Perro("Fido", 3, "Labrador")
print(mi_perro) # salida: Fido (3 años, Labrador)
mi_perro.hacer_sonido() # salida: Ladrando
```
## Organizacion de las clases 

Comparado con otros lenguajes en python no es necesario tener varios documentos y que cada uno contenga una clase. 
Un módulo de Python puede contener una o varias clases, funciones y variables. La idea es que todas estas cosas juntas tienen un propósito o funcionalidad común.

Cuando trabajas con múltiples clases en un solo archivo de Python, generalmente se recomienda seguir una convención de nomenclatura para nombrar el archivo que contenga estas clases. La convención de nomenclatura es nombrar el archivo después de la clase principal en el archivo. Por ejemplo, si tienes una clase llamada Empleado, y otra clase llamada Departamento, y ambas están en un mismo archivo, entonces el archivo podría llamarse empresa.py.

En resumen, no es necesario tener un documento por cada clase en Python, pero es importante seguir una convención de nomenclatura para nombrar el archivo que contenga múltiples clases, para que el código sea fácil de entender y mantener.

## Importar en python

La declaración de importación permite que un módulo o un archivo de Python importe el contenido de otro archivo de Python o módulo. Una vez que se ha importado un archivo o módulo, todas las funciones, clases y variables definidas en él están disponibles para su uso en el archivo actual.

Hay varias maneras de importar código de un archivo de Python a otro archivo de Python. A continuación se presentan tres formas comunes de hacerlo:
```python
import nombre_del_modulo

# Para usar cualquier función o clase en el módulo
nombre_del_modulo.nombre_de_funcion()
nombre_del_modulo.nombre_de_clase()
```

```python
from nombre_del_modulo import nombre_de_funcion, nombre_de_clase

# Para usar la función o clase importada
nombre_de_funcion()
nombre_de_clase()

```

```python
import nombre_del_modulo as alias

# Para usar cualquier función o clase en el módulo
alias.nombre_de_funcion()
alias.nombre_de_clase()

# O

from nombre_del_modulo import nombre_de_funcion as alias

# Para usar la función importada con un alias
alias()
```
Es importante tener en cuenta que el archivo de Python que se importa debe estar en el mismo directorio que el archivo que lo está importando o en un directorio en la variable de entorno PYTHONPATH. También es posible importar módulos o archivos de Python que están en una ruta de acceso específica utilizando el paquete sys de Python, pero esto es menos común.

