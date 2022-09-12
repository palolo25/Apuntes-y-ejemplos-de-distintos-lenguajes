euros = input("cuantos euros tienes")
euros = float(euros)
valor_dollar = 1.0023
dolares = euros * valor_dollar
dolares = round(dolares,2)
dolares = str(dolares)
print("tienes $" + dolares + " dolares")