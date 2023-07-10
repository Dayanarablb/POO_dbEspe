
package poo_u2_p16_polimorfismo;


public abstract class Figura {//Minimo de debe reutilizar un metodo
    private String color;
    //Constructor
    public Figura (String color){
        super();
        this.color=color;
    }
    //Metodo que se va a utilizar como polimorfismo
    //Calcular la superficie
    
    public abstract int superficie();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
