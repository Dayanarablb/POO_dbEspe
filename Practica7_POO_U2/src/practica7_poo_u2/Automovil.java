
package practica7_poo_u2;


public class Automovil extends Vehiculo{
    boolean parabrisas;
    @Override
    
    public void encendido (){
    encendido = true;
    estado = "Vehiculo encendido";
    }
    //metodo apagado
    public void apagado(){
    encendido = false;
    estado = "Vehiculo apagado";
    }   
}
