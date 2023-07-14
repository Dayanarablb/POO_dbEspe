
package poo_u2_t4_polimorfismo;
public abstract class Deportista {
    
    private String nombre;
    private int edad;
    private String disciplina;
    private String sexo;
    
    //Constructor
    public Deportista (String nombre, int edad, String disciplina, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.disciplina=disciplina;
        this.sexo=sexo;
    }
    //Atributos privados set y getter
    
    public abstract void entrenamiento();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
