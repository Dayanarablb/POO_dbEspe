
package sistemagestionhorarioslaboratorios;


public class Laboratorio {
    private String nombre;
    private int capacidad;
    private String equipos;

    public Laboratorio(String nombre, int capacidad, String equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
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

    public boolean verificarDisponibilidad(String horario) {
        // Implementar la lógica para verificar la disponibilidad del horario.
        // Por simplicidad, este método siempre devolverá verdadero.
        return true;
    }
}

