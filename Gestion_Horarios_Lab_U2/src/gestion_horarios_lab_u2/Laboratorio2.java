
package gestion_horarios_lab_u2;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio2 extends Laboratorio {
    private String nombrePractica;
      private List<String> horario;
      
    public Laboratorio2 (String nombrepractica, String nombre, int capacidad, String equipos, String tipoEquipo, String responsable){
        super(nombre, capacidad, equipos, tipoEquipo, responsable);
        this.nombrePractica = nombrepractica;
        this.horario = new ArrayList<>();
        
    }
    public String getNombrePractica() {
        return nombrePractica;
    }
    public void setNombrePractica(String nombrePractica) {
        this.nombrePractica = nombrePractica;
    }
    @Override
    
    public List<String> getHorario() {
        return horario;
    }

    @Override
    public boolean validarHorario(String hora) {
        return horario.contains(hora);
    }
    @Override
    public void agregarHorario(String hora) {
        horario.add(hora);
    }
}




