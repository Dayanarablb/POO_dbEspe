
package practico;

/**
 *
 * @author EFRAIN
 */
public class Notas {
    //boolean para ingresar notas con decimales
    double nota;
    String nombre;
    private int cedula;// el private solo se puede usar dentro de esta clase 
    
    //Creamos el constructor //Sirve para pasar como argumento lo que es la nota el nombre y la cedula
    public Notas(double nota, String nombre, int cedula) {
        this.nota = nota;
        this.nombre = nombre;
        this.cedula = cedula;
    }


    public int getCedula() {
        return cedula;
    
    //get - Obtener
    //set - establecer
    //put - actualizar
    //del - eliminar
    }
    
}
