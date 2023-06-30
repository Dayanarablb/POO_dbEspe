
package claseprincipal;
public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Cedula;

    public Persona(String Nombre, String Apellido, int Edad, int Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Cedula = Cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public int getEdad() {
        return Edad;
    }
    public int getCedula() {
        return Cedula;
    }  
    
}
