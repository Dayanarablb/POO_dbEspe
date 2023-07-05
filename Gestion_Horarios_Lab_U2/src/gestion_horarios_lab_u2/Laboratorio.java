
package gestion_horarios_lab_u2;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    //Atributos
    String nombre;
    private int capacidad;
    private String equipos;
    private String tipoEquipo;
    private List<String> horario;
    private String responsable;

    // Constructor
    public Laboratorio(String nombre, int capacidad, String equipos, String tipoEquipo, String responsable) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
        this.tipoEquipo = tipoEquipo;
        this.horario = new ArrayList<>();
        this.responsable = responsable;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public void agregarHorario(String hora) {
        horario.add(hora);
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEquipos() {
        return equipos;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public List<String> getHorario() {
        return horario;
    }

    public String getResponsable() {
        return responsable;
    }
    public boolean validarHorario(String hora) {
        return horario.contains(hora);
    }
}


