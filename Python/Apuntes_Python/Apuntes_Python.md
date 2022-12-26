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
