
package claseprincipal;

public class ClasePrincipal {

   
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Dayanara","Bravo", 19, 235008,"Tecnologias de la Informacion",15.4f);//f - flotante
        System.out.println(" ========== Alumno ========= ");
        alumno.mostrarDatosAlumno();
        alumno.EstadoAlumno();

        Profesor profesor = new Profesor("Javier","Cevallos", 40, 156421, "Programacion Orientada a Objetos", 222142);
        System.out.println(" ========= Profesor ======== ");
        profesor.mostrarDatosProfesor();
        profesor.asignarAula("Nueva Aula");
    }
}
    

