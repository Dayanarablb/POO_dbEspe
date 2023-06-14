/**
 * 
 */
package Area;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Ingrese el lado del cuadrado: ");//INGRESA EL VALOR DEL LADO
        
        double lado = sc.nextDouble();
        
        //El valor que ingresa del lado lo eleva al cuadrado para calcular el area
        
        double area = Math.pow(lado, 2);
        
        System.out.println("El área del cuadrado es: " + area);
        
        double perimetro = area*4;
        
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

}

