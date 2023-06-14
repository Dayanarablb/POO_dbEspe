/**
 * 
 */
package P1herencia;

/**
 * @author ESPE
 *
 */
public class Automovil extends Vehiculo {

	boolean parabrisas;
    @Override
    
    public void encendido (){
    encendido = true;
    estado = "Automovil encendido";
    }
    //metodo apagado
    public void apagado(){
    encendido = false;
    estado = "Automovil apagado";
    }   

}
