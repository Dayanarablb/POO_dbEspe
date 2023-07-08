package POO_U2_P14_INTERFACE;

import java.util.Scanner;


public class POO_U2_P14_INTERFACE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
	
		System.out.println("Area el Circulo");
		System.out.println("Ingrese el radio");
		double radio = sc.nextDouble();
		Circulo circulo = new Circulo(radio);
		System.out.println("El area del Circulo es: "+circulo.calcularArea());
		circulo.dibujar();
		circulo.rotar();
		
		System.out.println("Area Cuadrado");
		System.out.println("Ingrese el lado");
		double lado = sc.nextDouble();
		Cuadrado cuadrado = new Cuadrado(lado);
		System.out.println("El area del Circulo es: "+cuadrado.calcularArea());
		cuadrado.dibujar();
		
		
		System.out.println("Area Triangulo");
		System.out.println("Ingrese la base: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese la altura: ");
		double altura = sc.nextDouble();
		Triangulo triangulo = new Triangulo(base, altura);
		System.out.println("El area del Triangulo es: "+triangulo.calcularArea());
		triangulo.dibujar();
		

	}

}
