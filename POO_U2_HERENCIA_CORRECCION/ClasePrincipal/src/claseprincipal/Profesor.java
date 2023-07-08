
package claseprincipal;

public class Profesor extends Persona{
    private String Materia;
    private int Telefono;
//Constructor
    public Profesor(String Nombre, String Apellido, int Edad, int Cedula, String Materia, int Telefono){
        super(Nombre, Apellido, Edad, Cedula);
       
        this.Materia = Materia;
        this.Telefono = Telefono;
     //Metodo para mostrar los Datos del Profesor
    }
    public void mostrarDatosProfesor(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Cedula de Indentificacion: "+getCedula());
        System.out.println("Materia que imparte: "+Materia);
        System.out.println("Nombre: "+Telefono);
    }
    //Metodo para asignar una nueva Aula al profesor para que imparta su materia
    public void asignarAula(String nuevaAula){
    String Aula = nuevaAula;
    System.out.println("Se ha asignado el Aula nueva A06.");
    }
    
  }
    



