import random

def run():
    numero_aleatorio = random.randint(1,100)    
    numero_elegido = int(input("Elige un numero: "))
    while numero_elegido != numero_aleatorio:
        if numero_elegido < numero_aleatorio:
            print("Busca un numerpo mas grande")
        else:
            print("Busca un numero mas pequeño")
        numero_elegido = int(input("Elige otro numero: "))
    print("Ganaste")        

if __name__ == "__main__":
    run()