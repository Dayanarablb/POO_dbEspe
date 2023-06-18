package figurasgeometricasl1u2_bautistadayanara;
public class Triangulo extends Figuras {//extends relacion de herencia entre clases
     //Atributos
    private double base;
    private double altura;
    //Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

     @Override//Indica que un metodo de una clase hija esta implementando un metodo de la superclase Fuguras
    //Metodo para calcular el area del Triangulo
    public double calcularArea() {
        return (base * altura) / 2;
    }

      @Override
    //Metodo para calcular el Perimetro del Triangulo   
    public double calcularPerimetro() {
        //Triangulo equilatero
        return 3 * base;
    }
    
}
