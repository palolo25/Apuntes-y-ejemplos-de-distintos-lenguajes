def sumar(*args):
    resultado = 0
    
    for valor in args:
        resultado += valor
    return resultado

print(sumar(3,5,7))