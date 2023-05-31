package evaluacion1;

public class GestionMatri {
	//Declaro mis variables 
    String nombre_Alumno;
    String nombre_Profesor;
    String Direccion;
    int Telefono;
    private int cedula;
    
    
    //Creamos el constructor 
    public GestionMatri(String nombre_prof, int cedula, String Direccion, int Telefono) {
    this.nombre_Profesor = nombre_Profesor;   
    this.cedula = cedula;
    this.Direccion = Direccion;
    this.Telefono = Telefono;
    }
       
}
