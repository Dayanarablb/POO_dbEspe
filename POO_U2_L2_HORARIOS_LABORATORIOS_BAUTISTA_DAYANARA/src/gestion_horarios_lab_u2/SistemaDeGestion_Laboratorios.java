package gestion_horarios_lab_u2;
import java.util.Scanner;
public class SistemaDeGestion_Laboratorios {

    public static void main(String[] args) {
       //Creacion de Objetos 
       Scanner sc = new Scanner (System.in);
       Laboratorio lab = new Laboratorio(" ",0 , " ", " ", " ");
       Laboratorio1 lab1 = new Laboratorio1("","",0,"","","");
       Laboratorio2 lab2 = new Laboratorio2("","",0,"","","");
       Asignatura asg = new Asignatura("","");
       
       //Pido por consola los datos al usuario
       System.out.print("Ingrese la cantidad de laboratorios a agregar: ");
       int numLaboratorios = sc.nextInt();
       
       for (int i = 0; i < numLaboratorios; i++) {
            System.out.println("\nIngrese la información del laboratorio " + (i + 1) + ":");
            sc.nextLine(); // Limpiar el buffer
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Capacidad: ");
            int capacidad = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            System.out.print("Equipos: ");
            String equipos = sc.nextLine();
            System.out.print("Tipo de equipo: ");
            String tipoEquipo = sc.nextLine();
            System.out.print("Responsable: ");
            String responsable = sc.nextLine();
            System.out.print("Sustancias en la Practica: ");
            String sust = sc.nextLine();
            System.out.print("Nombre de la Practica: ");
            String nomPrac = sc.nextLine();
            System.out.println("\nIngrese la información de la Asignatura " + (i + 1) + ":");
            sc.nextLine(); // Limpiar el buffer
            System.out.print("Asignatura: ");
            String asig = sc.nextLine();
            System.out.print("NRC: ");
            String nrc = sc.nextLine();
            
            //  LlAMADA A LOS METODOS SET
            lab.setNombre(nombre);
            lab.setCapacidad(capacidad);
            lab.setEquipos(equipos);
            lab.setTipoEquipo(tipoEquipo);
            lab.setResponsable(responsable);
            asg.setAsignatura(asig);
            asg.setNrc(nrc);
            
            // Agregar horarios al laboratorio
            System.out.println("\nIngrese los horarios disponibles (Ingrese 'q' para salir):");
            String horario;
            do {
            System.out.print("Horario: ");
            horario = sc.nextLine();
            if (!horario.equalsIgnoreCase("q")) {
                lab.agregarHorario(horario);
            }
            } while (!horario.equalsIgnoreCase("q"));
            

            // Validacion del horario
            System.out.print("\nIngrese un horario a validar: ");
            String horarioValidar = sc.nextLine();
            if (lab.validarHorario(horarioValidar)) {
            System.out.println("El horario está disponible.");
            } else {
            System.out.println("El horario no está disponible.");
            }
            
            lab1.setNombre(nombre);
            lab1.setCapacidad(capacidad);
            lab1.setEquipos(equipos);
            lab1.setTipoEquipo(tipoEquipo);
            lab1.setSustancias(sust);
            lab1.setResponsable(responsable);
            lab1.getHorario();
            
            
            // Agregar horarios al laboratorio
            System.out.println("\nIngrese los horarios disponibles (Ingrese 'q' para salir):");
            String horario1;
            do {
            System.out.print("Horario: ");
            horario1 = sc.nextLine();
            if (!horario1.equalsIgnoreCase("q")) {
                lab1.agregarHorario(horario1);
            }
            } while (!horario1.equalsIgnoreCase("q"));
            
            // Validacion del horario
            
            System.out.print("\nIngrese un horario a validar: ");
            String horario1Validar = sc.nextLine();
            if (lab1.validarHorario(horario1Validar)) {
            System.out.println("El horario está disponible.");
            } else {
            System.out.println("El horario no está disponible.");
            }
            
            lab2.setNombre(nombre);
            lab2.setCapacidad(capacidad);
            lab2.setEquipos(equipos);
            lab2.setTipoEquipo(tipoEquipo);
            lab2.setNombrePractica(nomPrac);
            lab2.setResponsable(responsable);
            
            
            // Agregar horarios al laboratorio
            System.out.println("\nIngrese los horarios disponibles (Ingrese 'q' para salir):");
            String horario2;
            do {
            System.out.print("Horario: ");
            horario2 = sc.nextLine();
            if (!horario2.equalsIgnoreCase("q")) {
                lab2.agregarHorario(horario2);
            }
            } while (!horario2.equalsIgnoreCase("q"));
            // Validacion del horario
            System.out.print("\nIngrese un horario a validar: ");
            String horario2Validar = sc.nextLine();
            if (lab2.validarHorario(horario2Validar)) {
            System.out.println("El horario está disponible.");
            } else {
            System.out.println("El horario no está disponible.");
            }
            
            // Mostrar la información del laboratorio
            System.out.println("\nInformación del laboratorio:");
            System.out.println("Nombre: " + lab.getNombre());
            System.out.println("Capacidad: " + lab.getCapacidad());
            System.out.println("Equipos: " + lab.getEquipos());
            System.out.println("Tipo de equipo: " + lab.getTipoEquipo());
            System.out.println("Responsable: " + lab.getResponsable());
            System.out.println("Asignatura: " + asg.getAsignatura());
            System.out.println("NRC: " + asg.getNrc());
            System.out.println("Horarios disponibles: " + lab.getHorario());               
    }          
            
    }         
 }
    


