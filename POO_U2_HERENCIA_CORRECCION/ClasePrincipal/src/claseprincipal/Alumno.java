
package claseprincipal;

public class Alumno extends Persona {//Esta clase hereda todos los atributos y metodos de la clase Padre Persona
    //Ya no es necesario escribir los otros atributos ya que ya estan heredando - Reutilizacion de codigo
    //Atributos extras de la clase Alumno
    private String Carrera;
    private float notaFinal;
    
    //Constructor
    public Alumno (String Nombre, String Apellido, int Edad, int Cedula,String Carrera, float notaFinal){
        //En la clase persona ya estan inicializados los atributos Nombre, Apellido, Edad y Cedula (Atributos heredados) ya no los tenemos que volver a inicializarlos
        super (Nombre, Apellido, Edad, Cedula);
        
        this.Carrera = Carrera;
        this.notaFinal = notaFinal;
}
    //Metodo para mostrar los Datos del Estudiante
    public void mostrarDatosAlumno(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Cedula de Indentificacion: "+getCedula());
        System.out.println("Carrera: "+Carrera);
        System.out.println("Nombre: "+notaFinal);
    }
    
    public void EstadoAlumno(){
    if(notaFinal>=14 && notaFinal<=20){
        System.out.println("Aprobado");
    }else{
         System.out.println("Reprobado");  
    }
}
}

