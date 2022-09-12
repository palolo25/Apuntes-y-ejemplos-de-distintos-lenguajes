#Generador de contraseña. Este programa genera contraseñas de forma automatica con los caracteres que necesites.
import random


def password_generator():  
    # Esto es todo el conjunto de caracteres.
    lower_case = "abcdefghijklmnopqrstuvwxyz"
    upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    number = "0123456789"
    symbols = "!·$%&/?¿¡~€*-_\<>"
    # En use_for juntamos todos los caracteres.
    use_for = lower_case + upper_case + number + symbols
    # lenght_for_pass marca el numero de caracteres de la contraseña.
    lenght_for_pass = 9
    # password agrupa la funcion ramdom que es la que se va a encargar de que la eleccion de los caracteres sea aleatoria, 
    # #marcando el limite en los caracteres de use_for y la longitud de lenght_for_pass. 
    password = "".join(random.sample(use_for, lenght_for_pass))
    print("tu contraseña es:", password)
if __name__ == "__main__":
    password_generator()