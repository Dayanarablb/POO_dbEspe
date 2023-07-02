
package claseprincipal;

public class ClasePrincipal {

   
    public static void main(String[] args) {

        Persona pr = new Persona("Felipe", "Sabando", 30, 235164);
        System.out.println(" ========== Persona ========= ");
        pr.getNombre();
        pr.getApellido();
        pr.getEdad();
        pr.getCedula();
        System.out.println("Nombre: "+pr.getNombre());
        System.out.println("Apellido: "+pr.getApellido());
        System.out.println("Edad: "+pr.getEdad());
        System.out.println("Cedula de Indentificacion: "+pr.getCedula());
        
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
    

