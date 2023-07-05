
package gestion_horarios_lab_u2;

public class Asignatura{
   
   //Atributos
    private String asignatura;
    private String nrc;
    //Constructor
    public Asignatura(String Asignatura, String nrc){
        this.asignatura = Asignatura;
        this.nrc = nrc;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getNrc() {
        return nrc;
    }
}
    
   
