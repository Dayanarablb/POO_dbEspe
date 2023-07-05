package POO_U2_P13_CLASE_ABSTRACTA;
import java.util.Scanner;

public class POO_U2_P13_CLASE_ABSTRACTA {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Area el Circulo");
		System.out.println("Ingrese el radio");
		double radio = sc.nextDouble();
		Circulo circulo = new Circulo(radio);
		System.out.println("El area del Circulo es"+circulo.CalcularArea());
			
		
	}

}
