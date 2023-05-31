package evaluacion1;
import java.util.Scanner;
public class Evaluacion1 {

	public static void main(String[] args) {
        int op = 0; 
        String nombre_Profesor, Direccion;
        String nombre_Alumno;
        String Materias;
        int cedula, Telefono;
        
        
        Scanner req = new Scanner(System.in);
        Administrador admin = new Administrador();//Instanciamos el objeto
        
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
            op = req.nextInt();
            
            switch(op) {
                case 1:
                	//Pido todos los datos del Profesor 
                    System.out.println( " Primera Opcion");
                    req.nextLine(); 
                    System.out.println( "Nombre: ");
                    nombre_Profesor = req.nextLine();
                    System.out.println( "Cedula: ");
                    cedula = req.nextInt();
                    System.out.println( "Direccion: ");
                    Direccion = req.nextLine();
                    System.out.println( "tlf: ");
                    Telefono = req.nextInt();
                    System.out.println( "Se estan guardando los datos...");
                    admin.Profesores(nombre_Profesor, cedula, Direccion, Telefono);//Paso los argumentos en orden 
                    System.out.println( "Se guardo correctamente los datos del profesor");
                    break;
                    
                case 2:
                	
                	System.out.println( " Segunda Opcion ");
                    req.nextLine(); 
                    System.out.println( "Nombre Estudiante: ");
                    nombre_Alumno = req.nextLine();
                    System.out.println( "Se guardaron sus Datos");
                    admin.Alumnos(nombre_Alumno);//Paso los argumentos
                    break;
                    
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
    
                default: 
                    break;
            }
        } while (op != 5);
    }
    
}

