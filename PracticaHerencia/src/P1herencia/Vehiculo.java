/**
 * 
 */
package P1herencia;


public class Vehiculo {

	//Atributos
    String placa;
    int numero_ruedas;
    boolean encendido;
    String estado;
    
    public void setnumero_ruedas(int ruedas){//void no retorna nada //se le pone otro nombre
    	numero_ruedas = ruedas;
    	}
    	//Declaro metodo encendido
    	public void encendido (){
    	    encendido = true;
    	    estado = "Vehiculo apagado";
    	}
    	//metodo apagado
    	public void apagado(){
    	    encendido = false;
    	    estado = "Vehiculo encendido ";
    	}
    	}


