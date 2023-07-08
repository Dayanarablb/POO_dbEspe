
package figurasgeometricasl1u2_bautistadayanara;


public class Cuadrado extends Figuras {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    //Metodo para calcular el area del Cuadrado
    public double calcularArea() {
        return lado * lado;
    }
   @Override
   //Metodo para calcular el Perimetro del cuadrado
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
}
