# def suma(a = 0,b = 0) -> int:  Su valor por defecto es 0
def suma(a = 0,b = 0): 
    return a + b


resultado = suma()

print(f"Resultado de la suma: {resultado}") # La suma es igual a 0

print(f"Resultado de la suma: {suma(5,3)}") # Estos valores sobrescriben los valores por defecto

