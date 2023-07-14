package poo_u2_t4_polimorfismo;


public class Atletismo extends Deportista {
    
    private String prueba;
    
    public Atletismo( String nombre, int edad, String disciplina, String sexo,String prueba){
        super(nombre, edad, disciplina, sexo);
        this.prueba=prueba;
        
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    @Override//sobreescritura dentro de la herencia
    public void entrenamiento() {
        System.out.println("El atletismo es un deporte en el cual se necesita mucha resistencia");
       
    }
    public void mostrardatos(){
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("EDAD: "+getEdad());
        System.out.println("DISCIPLINA: "+getDisciplina());
        System.out.println("SEXO: "+getSexo());
        System.out.println("PRUEBA: "+getPrueba());
    }
    
}
