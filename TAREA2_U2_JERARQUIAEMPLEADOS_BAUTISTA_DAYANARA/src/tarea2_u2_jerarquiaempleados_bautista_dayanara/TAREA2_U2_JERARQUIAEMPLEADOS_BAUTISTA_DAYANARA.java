
package tarea2_u2_jerarquiaempleados_bautista_dayanara;
import java.util.Scanner;
public class TAREA2_U2_JERARQUIAEMPLEADOS_BAUTISTA_DAYANARA {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //Instancio la clase Scanner para pedir datos por pantalla al usuario

        // Variables para almacenar los datos ingresados por el usuario
        String nombre;
        int edad;
        int fechaIngreso;
        double salario;
        int bono =120;
        String departamento;
        int nivel;
        
        // Variables para almacenar los objetos de empleados creados
        Director director = null;
        Operario operario = null;

        // Menú de opciones
        int opcion;
        do {
            System.out.println("--- EMPLEADOS QUE PERTENCEN A LA EMPRESA ---");
            System.out.println("1. Director");
            System.out.println("2. Operario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.println("--- DIRECTOR ---");
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    edad = scanner.nextInt();
                    System.out.print("Fecha en la que ingreso a la empresa (año): ");
                    fechaIngreso = scanner.nextInt();
                    System.out.print("Salario: ");
                    salario = scanner.nextDouble();
                    System.out.print("Bono: " +bono+"\n");
                    scanner.nextLine();
                    System.out.print("Departamento: ");
                    departamento = scanner.nextLine();
                    System.out.print("Número de personal a cargo: ");
                    int personal = scanner.nextInt();

                    director = new Director(nombre, edad, fechaIngreso, salario, bono, departamento, personal);
                    System.out.println("Datos del director ingresados.");
                    System.out.println("-----SALARIO DIRECTOR-------");
                    director.incentivar();
                    break;

                case 2:
                    System.out.println("--- OPERARIO ---");
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    edad = scanner.nextInt();
                    System.out.print("Fecha en la que ingreso a la empresa (año): ");
                    fechaIngreso = scanner.nextInt();
                    System.out.print("Salario: ");
                    salario = scanner.nextDouble();
                    System.out.print("Bono: "+bono+"\n");
                    scanner.nextLine(); // Consumir el salto de línea después de leer el número
                    System.out.print("Departamento: ");
                    departamento = scanner.nextLine();
                    System.out.print("Nivel: ");
                    nivel = scanner.nextInt();
                    operario = new Operario(nombre, edad, fechaIngreso, salario, bono, departamento, nivel);
                    System.out.println("-------SALARIO OPERARIO-------");
                    operario.incentivar();
                    operario.actualizarNivel();
                    break;

                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("No existe esa Opcion.");
            }

            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }
}
        
    
    

