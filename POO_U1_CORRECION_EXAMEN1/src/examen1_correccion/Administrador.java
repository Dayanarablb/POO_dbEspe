
package examen1_correccion;

import java.util.ArrayList;
import java.util.Scanner;


public class Administrador {
    int cantidad;
    public ArrayList<Profesor> profesor;
    public ArrayList<Alumno> alumnos;
    public ArrayList<Materia> materias;
    public ArrayList<Matricula> matriculas;
    
    public Administrador(){
    
        profesor = new ArrayList<>(); 
        alumnos = new ArrayList<>();
        materias = new ArrayList<>(); 
        matriculas = new ArrayList<>();
    }
    private static void ingresarProfesores(int cantidad) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos del profesor " + (i + 1) + ":");
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Celular: ");
            String celular = scanner.nextLine();
            Profesor profesor = new Profesor(cedula, nombre, direccion, telefono, celular);
            profesores.add(profesor);
        }
         private static void ingresarAlumnos(int cantidad) {
         Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Celular: ");
            String celular = scanner.nextLine();
            Alumno alumno = new Alumno(cedula, nombre, direccion, telefono, celular);
            alumnos.add(alumno);
            
        } 
           private static void ingresarMaterias(int cantidad) {
           Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos de la materia " + (i + 1) + ":");
            System.out.print(System"Nombre: ");
            String nombre = scanner.nextLine();
            Materia materia = new Materia(nombre);
            materias.add(materia);
        }
    
}
}
