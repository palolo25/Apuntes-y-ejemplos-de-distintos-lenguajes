def conversor(valor_dollar, valor_euro):
    pesos = input("cuantos pesos tiene?: ")
    pesos = float(pesos)
    

    dolares = pesos / valor_dollar
    dolares = round(dolares,2)
    dolares = str(dolares)
    print("tienes $" + dolares + " dolares")
    
    euros = pesos / valor_euro
    euros = round(euros,2)
    euros = str(euros)
    print("tienes €" + euros + " euros")

menu = """
Bienvenidos a nuestro conversor de monedas 🤑

1-Pesos colombianos
2-Pesos argentinos
3-Pesos mexicanos

Elige una opcion: """

opcion = input(menu)

if opcion == "1":
    conversor(3875,4383)

    
elif opcion == "2":
    conversor(65,139)
   
    
elif opcion == "3":
    conversor(24,20)
    
else:
    print("Ingrese una de las opciones")


