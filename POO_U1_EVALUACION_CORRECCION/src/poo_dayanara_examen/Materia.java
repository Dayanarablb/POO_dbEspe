// Clase Materia
package poo_dayanara_examen;

public class Materia {
    private int ID;
    private String nombre;
    private int profesorID;

    public Materia(int ID, String nombre, int profesorID) {
        this.ID = ID;
        this.nombre = nombre;
        this.profesorID = profesorID;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProfesorID() {
        return profesorID;
    }
}
