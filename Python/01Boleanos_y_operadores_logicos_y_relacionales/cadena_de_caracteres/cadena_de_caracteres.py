def run():
    pass


if __name__ == "__main__":
    run()




separador = """
/
/
/
"""
cadena_ejemplo = "Hola buenos dias"
cadena_ejemplo2 = "hOLA BUENOS DIAS"
print(cadena_ejemplo.capitalize())
#.capitalize pone la primera letra de una cadena en mayuscula.
print(cadena_ejemplo.upper())
#.upper permite poner toda la cadena de texto en mayusculas.
print(cadena_ejemplo2.lower())
#.lower permite poner la cadena de texto toda en minusculas.
print(len(cadena_ejemplo))
# len() permite saber el numero total de carateres de la cadena de texto.
print(separador)
cadenaejemplo3 = "En un lugar de la mancha..."
print(cadenaejemplo3.isalnum())
cadenaejemplo3="1234567890"
print(cadenaejemplo3.isalnum())
cadenaejemplo3="abcdefg1234567890"
print(cadenaejemplo3.isalnum())
cadenaejemplo3="abcdefg 1234567890"
print(cadenaejemplo3.isalnum())
#.isalnum comprueba si los caracteres son alfanumericos o no.

print(separador)
cadenaejemplo4 = "Enunlugardelamancha"
print(cadenaejemplo4.isalpha())
cadenaejemplo4="1234567890"
print(cadenaejemplo4.isalpha())
cadenaejemplo4="abcdefg1234567890"
print(cadenaejemplo4.isalpha())
cadenaejemplo4="abcdefg 1234567890"
print(cadenaejemplo4.isalpha())
#.isalpha comprueba si todos los caracteres son alfabeticos

print(separador)
cadenaejemplo5 = "Enunlugardelamancha"
print(cadenaejemplo5.isdigit())
cadenaejemplo5="1234567890"
print(cadenaejemplo5.isdigit())
cadenaejemplo5="abcdefg1234567890"
print(cadenaejemplo5.isdigit())
cadenaejemplo5="abcdefg 1234567890"
print(cadenaejemplo5.isdigit())
#.isdigit comprueba si todos los carateres son numericos.
print(separador)
cadena_ejemplo = "hola buenos dias"
print(cadena_ejemplo.islower())
cadena_ejemplo2 = "HOLA BUENOS DIAS"
print(cadena_ejemplo2.islower())
#.islower comprueba si toda la cadena de texto esta en minusculas
print(separador)
cadena_ejemplo = "hola buenos dias"
print(cadena_ejemplo.isupper())
cadena_ejemplo2 = "HOLA BUENOS DIAS"
print(cadena_ejemplo2.isupper())
#.isupper comprueba si toda la cadena esta en mayusculas.
print(separador)
cadena_ejemplo6 = " Hola mundo"
print(cadena_ejemplo6.lstrip())
cadena_ejemplo6 = "Hola mundo "
print(cadena_ejemplo6.rstrip())
cadena_ejemplo6 = " Hola mundo "
print(cadena_ejemplo6.strip())
# Istrip, rstrip y strip, que van a permitirte eliminar
# espacios en blanco al principio y al final de la cadena de texto.
# Para eliminar los caracteres del comienzo de la cadena tienes que
# utilizar Istrip, para eliminar los caracteres del final de la cadena
# tienes que utilizar rstrip, y por último, para eliminar ambos a la
# vez tienes que utilizar strip, que hace lo mismo que los dos
# anteriores pero en una sola instrucción.
print(separador)

cadena_ejemplo7 = "abcdefghijklmnopqrstuvwxyz"
print(max(cadena_ejemplo7))
print(min(cadena_ejemplo7))
# Max y Min permiten conocer el catacter de la cadena de texto mayor o menor del alfabeto.

print(separador)

cadena_ejemplo8 = "AEIOU"
print(cadena_ejemplo8.replace("A","E"))
#.replace permite remlazar caracteres de la cadena de texto por otro caracteres.

print(separador)

print(cadena_ejemplo2.swapcase())
#.swaocase cambia las mayusculas por minusculas y viceversa en una cade de texto.

print(separador)

print(cadena_ejemplo.split())
#.split va a convertir la cadena en una lista separada por espacios.

print(separador)

print(cadena_ejemplo.split(","))
# En este caso le indicamos un caracter que queramos colocar en la separacion.
