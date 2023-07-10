
package poo_u2_p16_polimorfismo;


public class Rectangulo extends Figura{
    private int h;
    private int longitud;

    public Rectangulo(int h, int longitud, String color) {
        super(color);
        this.h=h;
        this.longitud=longitud;
    }

    @Override
    public int superficie() {
       return h*longitud;
    }
    
}
