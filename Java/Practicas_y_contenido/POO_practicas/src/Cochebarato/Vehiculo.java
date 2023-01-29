/*
 Ejercicio 3: Construir un programa que dada una serie de veh�culos caracterizados por su marca, modelo y precio, imprima las propiedades del veh�culo m�s barato.
Para ello, se deber�n leer por
teclado las caracter�sticas de cada vehiculo y crear una clase que represente a cada�uno�de
ellos
  */


package Cochebarato;

public class Vehiculo {

    private String marca;
    private String modelo;
    private float precio;


    public Vehiculo(String marca, String modelo, float precio) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String mostrarDatos() {

        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio + "\n";

    }



}


