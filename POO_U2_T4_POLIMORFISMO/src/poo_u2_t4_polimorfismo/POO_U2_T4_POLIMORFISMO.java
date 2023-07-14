
package poo_u2_t4_polimorfismo;

import java.util.Scanner;


public class POO_U2_T4_POLIMORFISMO {

    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opc;
    System.out.println("Escoja una opcion"
    +"\n1. Atletismo"
    +"\n2. Natacion");
    opc = entrada.nextInt();
    entrada.nextLine();
    
    switch(opc){
        case 1:
                System.out.println("INGRESE LOS DATOS DEL ATLETA");
                System.out.println("NOMBRE: ");
                String nombre =entrada.nextLine();
                System.out.println("edad: ");
                int edad =entrada.nextInt();
                System.out.println("DISCIPLINA: : ");
                String disciplina =entrada.nextLine();
                System.out.println("Sexo: ");
                String sexo =entrada.nextLine();
                System.out.println("Prueba: ");
                String prueba =entrada.nextLine();
                Atletismo atle = new Atletismo (nombre, edad, disciplina,sexo,prueba);
                atle.entrenamiento();
                atle.mostrardatos();
            
            case 2:
                
                System.out.println("Ingresar los datos");
                System.out.print("Nombre: ");
                nombre = entrada.nextLine();
                System.out.print("Edad: ");
                edad = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Disciplina: ");
                disciplina = entrada.nextLine();
                System.out.print("Sexo: ");
                sexo = entrada.nextLine();
                System.out.print("Estilo: ");
                String estilo = entrada.nextLine(); 
                Natacion nata = new Natacion(nombre, edad, disciplina, sexo, estilo);
                nata.entrenamiento();
                nata.mostrardatos();
                break;
            default:
                System.out.println("No existe la opcion selecionada, vuelva a intentarlo");
                break;
        }
    }
    
}
            
                 
  