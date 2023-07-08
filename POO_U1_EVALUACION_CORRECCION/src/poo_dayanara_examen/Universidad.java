// Clase Universidad
package poo_dayanara_examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidad {
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;
    private ArrayList<Materia> materias;
    private ArrayList<Matricula> matriculas;

    public Universidad() {
        alumnos = new ArrayList<>();
        profesores = new ArrayList<>();
        materias = new ArrayList<>();
        matriculas = new ArrayList<>();
    }

    public void ingresarAlumno(Scanner scanner) {
        System.out.println("----- INGRESAR ALUMNO -----");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();

        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();

        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        Alumno alumno = new Alumno(id, nombre, direccion, cedula, telefono, genero);
        alumnos.add(alumno);

        System.out.println("Alumno ingresado exitosamente.\n");
    }

    public void ingresarProfesor(Scanner scanner) {
        System.out.println("----- INGRESAR PROFESOR -----");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();

        System.out.print("Cedula: ");
        String cedula = scanner.nextLine();

        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        Profesor profesor = new Profesor(id, nombre, direccion, cedula, telefono, genero);
        profesores.add(profesor);

        System.out.println("Profesor ingresado exitosamente.\n");
    }

    public void ingresarMateria(Scanner scanner) {
        System.out.println("----- INGRESAR MATERIA -----");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Profesores disponibles:");
        mostrarProfesores();

        System.out.print("ID del profesor: ");
        int profesorID = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        boolean profesorExiste = false;
        for (Profesor profesor : profesores) {
            if (profesor.getID() == profesorID) {
                profesorExiste = true;
                break;
            }
        }

        if (profesorExiste) {
            Materia materia = new Materia(id, nombre, profesorID);
            materias.add(materia);

            System.out.println("Materia ingresada exitosamente.\n");
        } else {
            System.out.println("Error: El profesor con ID " + profesorID + " no existe.\n");
        }
    }

    public void ingresarMatricula(Scanner scanner) {
        System.out.println("----- INGRESAR MATRÍCULA -----");

        System.out.println("Alumnos disponibles:");
        mostrarAlumnos();

        System.out.print("ID del alumno: ");
        int estudianteID = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.println("Materias disponibles:");
        mostrarMaterias();

        System.out.print("ID de la materia: ");
        int materiaID = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        boolean alumnoExiste = false;
        boolean materiaExiste = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getID() == estudianteID) {
                alumnoExiste = true;
                break;
            }
        }

        for (Materia materia : materias) {
            if (materia.getID() == materiaID) {
                materiaExiste = true;
                break;
            }
        }

        if (alumnoExiste && materiaExiste) {
            Matricula matricula = new Matricula(estudianteID, materiaID);
            matriculas.add(matricula);

            System.out.println("Matricula ingresada exitosamente.\n");
        } else {
            System.out.println("Error: El alumno o la materia no existen.\n");
        }
    }

    public void mostrarMatriculados() {
        System.out.println("----- MATRICULADOS -----");

        for (Matricula matricula : matriculas) {
            Alumno alumno = buscarAlumnoPorID(matricula.getEstudianteID());
            Materia materia = buscarMateriaPorID(matricula.getMateriaID());

            if (alumno != null && materia != null) {
                System.out.println("Estudiante:");
                System.out.println("ID: " + alumno.getID());
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Genero: " + alumno.getGenero());

                System.out.println("Materia:");
                System.out.println("Nombre: " + materia.getNombre());

                System.out.println("--------------------");
            }
        }

        System.out.println("Total de matriculados:");
        System.out.println("Masculino: " + contarMatriculadosPorGenero("Masculino"));
        System.out.println("Femenino: " + contarMatriculadosPorGenero("Femenino"));
        System.out.println("No definido: " + contarMatriculadosPorGenero("No definido"));

        System.out.println();
    }

    public void mostrarMatriculadosPorGenero() {
        System.out.println("----- MATRICULADOS POR GENERO -----");
        System.out.println("Masculino: " + contarMatriculadosPorGenero("Masculino"));
        System.out.println("Femenino: " + contarMatriculadosPorGenero("Femenino"));
        System.out.println("No definido: " + contarMatriculadosPorGenero("No definido"));
        System.out.println();
    }

    private Alumno buscarAlumnoPorID(int id) {
        for (Alumno alumno : alumnos) {
            if (alumno.getID() == id) {
                return alumno;
            }
        }
        return null;
    }

    private Materia buscarMateriaPorID(int id) {
        for (Materia materia : materias) {
            if (materia.getID() == id) {
                return materia;
            }
        }
        return null;
    }

    private int contarMatriculadosPorGenero(String genero) {
        int contador = 0;
        for (Matricula matricula : matriculas) {
            Alumno alumno = buscarAlumnoPorID(matricula.getEstudianteID());
            if (alumno != null && alumno.getGenero().equals(genero)) {
                contador++;
            }
        }
        return contador;
    }

    private void mostrarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getID());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("--------------------");
        }
    }

    private void mostrarProfesores() {
        for (Profesor profesor : profesores) {
            System.out.println("ID: " + profesor.getID());
            System.out.println("Nombre: " + profesor.getNombre());
            System.out.println("--------------------");
        }
    }

    private void mostrarMaterias() {
        for (Materia materia : materias) {
            System.out.println("ID: " + materia.getID());
            System.out.println("Nombre: " + materia.getNombre());
            System.out.println("--------------------");
        }
    }
}