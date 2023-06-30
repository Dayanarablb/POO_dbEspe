
package sistemagestionhorarioslaboratorios;

import java.util.Scanner;


public class SistemaGestionHorariosLaboratorios {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de laboratorios que desea ingresar
        System.out.print("Ingrese la cantidad de laboratorios a agregar: ");
        int numLaboratorios = scanner.nextInt();

        // Crear un arreglo para almacenar los laboratorios
        Laboratorio[] laboratorios = new Laboratorio[numLaboratorios];

        // Llenar la información de cada laboratorio
        for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("\nIngrese la información del laboratorio " + (i + 1) + ":");
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Capacidad: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Equipos: ");
            String equipos = scanner.nextLine();
            System.out.print("Tipo de equipo (solo para Laboratorio1): ");
            String tipoEquipo = scanner.nextLine();

            laboratorios[i] = new Laboratorio1(nombre, capacidad, equipos, tipoEquipo);
        }

        // Pedir al usuario la cantidad de asignaturas que desea ingresar
        System.out.print("\nIngrese la cantidad de asignaturas a agregar: ");
        int numAsignaturas = scanner.nextInt();

        // Crear un arreglo para almacenar las asignaturas
        Asignatura[] asignaturas = new Asignatura[numAsignaturas];

        // Llenar la información de cada asignatura
        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("\nIngrese la información de la asignatura " + (i + 1) + ":");
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Horario: ");
            String horario = scanner.nextLine();

            // Mostrar los laboratorios disponibles y permitir al usuario elegir uno
            System.out.println("Laboratorios disponibles:");
            for (int j = 0; j < numLaboratorios; j++) {
                System.out.println((j + 1) + ". " + laboratorios[j].getNombre());
            }
            System.out.print("Seleccione el laboratorio para esta asignatura: ");
            int labIndex = scanner.nextInt();

            asignaturas[i] = new Asignatura(nombre, horario, laboratorios[labIndex - 1]);
        }

        // Mostrar la información de los laboratorios
        System.out.println("\nInformación de los laboratorios:");
        for (int i = 0; i < numLaboratorios; i++) {
            Laboratorio laboratorio = laboratorios[i];
            System.out.println("\nLaboratorio " + (i + 1) + ":");
            System.out.println("Nombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());
            System.out.println("Equipos: " + laboratorio.getEquipos());
        }

        scanner.close();
    }
}
    
    

