
package gestion_horarios_lab_u2;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio1 extends Laboratorio {
    
    //ATRIBUTOS
    private String sustancias;
    private List<String> horario;
    
    //CONSTRUCTOR
    public Laboratorio1(String sustancias, String nombre, int capacidad, String equipos, String tipoEquipo, String responsable ){
    super(nombre, capacidad, equipos, tipoEquipo, responsable);
    this.sustancias=sustancias;
    this.horario = new ArrayList<>();
}
    //METODOS

    public void setSustancias(String sustancias) {
        this.sustancias = sustancias;
    }

    public String getSustancias() {
        return sustancias;
    }
    @Override
    public void agregarHorario(String hora) {
        horario.add(hora);
    }
    @Override
    public List<String> getHorario() {
        return horario;
    } 
    @Override
    public boolean validarHorario(String hora) {
        return horario.contains(hora);
    }
}
