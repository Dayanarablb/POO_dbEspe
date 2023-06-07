
package examen1_correccion;


public class Profesor {
    String Nombre_Profesor;
    String direccion;
    String Telefono;
    private String cedula;
    
    
    //Creamos el constructor //Sirve para pasar como argumento lo que es la nota el nombre y la cedula
    public Profesor(String Nombre_Profesor, String direccion, String Telefono, String cedula) {
        this.Nombre_Profesor = Nombre_Profesor;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.cedula = cedula;
           
    }

    public String getCedula() {
        return cedula;
    
    }
}
