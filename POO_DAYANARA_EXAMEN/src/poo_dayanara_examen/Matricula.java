// Clase Matricula
package poo_dayanara_examen;

public class Matricula {
    private int estudianteID;
    private int materiaID;

    public Matricula(int estudianteID, int materiaID) {
        this.estudianteID = estudianteID;
        this.materiaID = materiaID;
    }

    public int getEstudianteID() {
        return estudianteID;
    }

    public int getMateriaID() {
        return materiaID;
    }
}