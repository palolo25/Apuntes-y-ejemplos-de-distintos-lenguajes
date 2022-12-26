/*
 Construir un programa que calcule el area y el perimetro de un cuadrilatero
 dada la longitud de sus lados. Los valores de la longitud deberan introducirse
 por linea de ordenes. Si es un cuadrado, solo se proporcionara 
 la longitud de uno de los lados al constructor.
  */
package cuadrilatero;

public class cuadrilatero {

    //Atributos

    private float lado1;
    private float lado2;
    private float perimetro;
    private float area;
    //Metodo constructor 1 (Cuadrilatero)
    public cuadrilatero(float lado1, float lado2) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo constructor 2 (Cuadrado)
    public cuadrilatero(float lado1) {
        super();
        this.lado1 = this.lado2 = lado1;
    }

    // GETTER y SETTER

    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        float area = (lado1 * lado2);
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }






}
