
package figurasgeometricasl1u2_bautistadayanara;


public class Pentagono extends Figuras {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    @Override
     //metodo para calcular el area del Pentagono
    public double calcularArea() {
        return (lado * lado * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
    }

    @Override
    //metodo para calcular el perimetro de pentagono
    public double calcularPerimetro() {
        return 5 * lado;
    }
    
}
