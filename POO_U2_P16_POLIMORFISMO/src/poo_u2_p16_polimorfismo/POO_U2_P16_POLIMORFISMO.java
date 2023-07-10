
package poo_u2_p16_polimorfismo;

import java.util.Scanner;


public class POO_U2_P16_POLIMORFISMO {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       //Pido datos por pantalla al usuario
        System.out.println("Ingrese el color de la Figura: ");
        String color = sc.nextLine();
        System.out.println("Altura: ");
        int h = sc.nextInt();
        System.out.println("Longitud de la base: ");
        int longitud = sc.nextInt();
         Rectangulo rect = new Rectangulo(h,longitud,color);
        System.out.println("Rectangulo: "+rect.superficie());
        System.out.println("Color: "+rect.getColor());
       //LLamammos al metodo mostrarDatosFiguras
       mostrarDatosFiguras(new Triangulo (10, 15, "Rosado"));
       mostrarDatosFiguras(new Circulo(6,"Rojo"));
    }
    //Aplicacion de polimorfismo
    //la gran ventaja del polimorfismo es la reutilizacion de codigo, al forzar a todas las clases
    // va a tener el mismo formato, esta expresion o metodo vale para cualquier subclase de figura
    // cuyos objetos vengan aqui como parametros...
    private static void mostrarDatosFiguras(Figura f){
        System.out.println("Color: "+f.getColor());
        System.out.println("Superficie de la figura: "+f.superficie());
        
        
    }
    
}
