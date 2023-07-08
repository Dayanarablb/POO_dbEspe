
package examen1_correccion;

import java.util.Scanner;


public class Examen1_Correccion {

    
    public static void main(String[] args) {
        int op = 0; 
        String cedula = null;
        String nombre, direccion, telefono;
        
        Scanner sc = new Scanner(System.in);
        Matricula mat = new Matricula();//Instanciamos el objeto
        
        do {
        	//Creo el menu de Opciones 
            System.out.println(
                    "Bievenidos.. \n" +
                    "1. Profesores \n" +
                    "2. Alumnos \n" +
                    "3. Materias \n" +
                    "4. Gestion Matriculas \n" +
                    "5. Total matriculados \n"+
                    "6. Salir \n"       
            );
            op = sc.nextInt();
            
            switch(op) {
                case 1:
                	ingresarProfesores(2);
                         break;
                       
                case 2: 
                       ingresarAlumnos(6);
                        break;
                    
                case 3: 
                      ingresarMaterias(4);
                    
                    break;
                case 4:
                    gestionMatriculas();
                    
                    break;
                case 5:
                    mostrarTotalMatriculados();
                    
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
    
                default:  System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (op != 6);
    }
    
}

       
    
    

