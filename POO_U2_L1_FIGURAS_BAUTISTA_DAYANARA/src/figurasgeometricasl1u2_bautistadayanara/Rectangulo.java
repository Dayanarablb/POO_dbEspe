/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricasl1u2_bautistadayanara;

/**
 *
 * @author EFRAIN
 */
public class Rectangulo extends Figuras {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    //Metodo para calcular el area del Rectangulo
    public double calcularArea() {
        return base * altura;
    }

    @Override
    //Metodo para calcular el perimetro del Rectangulo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    } 
    
}
