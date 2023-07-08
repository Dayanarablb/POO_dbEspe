// Clase Profesor
package poo_dayanara_examen;

public class Profesor {
    private int ID;
    private String nombre;
    private String direccion;
    private String cedula;
    private String telefono;
    private String genero;

    public Profesor(int ID, String nombre, String direccion, String cedula, String telefono, String genero) {
        this.ID = ID;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.genero = genero;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getGenero() {
        return genero;
    }
}