
package poo_u2_p16_polimorfismo;

public class Circulo extends Figura { //en la clases abstractas tengo que llamar al constructor y metodo
private int radio;
    public Circulo(int radio, String color) {
        super(color);
        this.radio=radio;
    }

    @Override
    public int superficie() {
        return (int) (Math.PI*radio*radio); 
    }
    
}
