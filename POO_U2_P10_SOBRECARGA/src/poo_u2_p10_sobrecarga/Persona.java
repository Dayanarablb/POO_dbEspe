
package poo_u2_p10_sobrecarga;


public class Persona {
    String nombre;
    int edad;
    int cedula;// tambien podemos poner la cedula con el tipo de dto LONG
    
    //Constructor
    //SOBRECARGA DE CONSTRUCTORES

    public Persona(String nombre, int edad) {
        this.nombre = nombre;//This.nombre toma en cuenta el atributo y = nombre toma en cuenta el parametro
        this.edad = edad; 
    }
    //Sobrecarga crear en la misma clase otro constructor con el mismo nombre de la clase pero diferentes parametros
    public Persona (int cedula){
        this.cedula = cedula;
    }
    //SOBRECARGA DE METODOS
   //Metodos
    public void Jugar(){
        System.out.println(" Mi nombre es: "+nombre + " voy a jugar");
    }
    //sobrecarga de metodo - es el mimo nombre de metodo pero usa otro parametro 
    public void Jugar (String juego){
        System.out.println(" Voy a jugar: " + juego + " me gusta mucho");
        
    }
}
