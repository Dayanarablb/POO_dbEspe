// Clase principal
package poo_dayanara_examen;

import java.util.Scanner;

public class EVALUACIONU1_CORRECCION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Universidad universidad = new Universidad();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    universidad.ingresarAlumno(scanner);
                    break;
                case 2:
                    universidad.ingresarProfesor(scanner);
                    break;
                case 3:
                    universidad.ingresarMateria(scanner);
                    break;
                case 4:
                    universidad.ingresarMatricula(scanner);
                    break;
                case 5:
                    universidad.mostrarMatriculados();
                    break;
                case 6:
                    universidad.mostrarMatriculadosPorGenero();
                    break;
                case 7:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion inválida. Introduce un número valido.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Ingresar alumno");
        System.out.println("2. Ingresar profesor");
        System.out.println("3. Ingresar materia");
        System.out.println("4. Ingresar matricula");
        System.out.println("5. Mostrar matriculas");
        System.out.println("6. Mostrar matriculados por genero");
        System.out.println("7. Salir");
        System.out.print("Selecciona una opcion: ");
    }
}