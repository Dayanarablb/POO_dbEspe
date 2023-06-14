/**
 * 
 */
package P1herencia;

/**
 * @author ESPE
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Instanciamos la clase padre que es "Vehiculo"
		
        Vehiculo veh = new Vehiculo ();
        
        //Instanciamos las clase creadas que son automovil y Motocicleta
        Automovil auto= new Automovil ();
        Motocicleta moto = new Motocicleta ();
        Vehiculo veh1 =new Vehiculo();
        Automovil auto1 =new Automovil();
        Motocicleta moto1= new Motocicleta();
        
        Vehiculo veh2 =new Vehiculo();
        Automovil auto2 =new Automovil();
        Motocicleta moto2= new Motocicleta();
        
        //Llamada a los metodos - Metodo encendido 
        veh.encendido();
        auto.encendido();
        moto.encendido();
        
        veh1.encendido();
        moto1.encendido();
        auto1.encendido();
        
        veh2.encendido();
        moto2.encendido();
        auto2.encendido();
        
        //Imprimimos
        
        System.out.println(veh.estado);
        System.out.println(auto.estado);
        System.out.println(moto.estado);
         
        //Objeto 2
        
        System.out.println(veh1.estado);
        System.out.println(auto1.estado);
        System.out.println(moto1.estado);
        
        System.out.println(veh2.estado);
        System.out.println(auto2.estado);
        System.out.println(moto2.estado);

	}

}
