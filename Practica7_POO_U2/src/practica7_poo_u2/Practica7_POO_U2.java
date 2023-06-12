package practica7_poo_u2;

//Main Principal 
public class Practica7_POO_U2 {
    
    
    public static void main(String[] args) {
        //Instanciamos la clase padre que es "Vehiculo"
        Vehiculo veh = new Vehiculo ();
        //Instanciamos las clase creadas que son automovil y Motocicleta
        Automovil auto= new Automovil ();
        Motocicleta moto = new Motocicleta ();
        //Llamada a los metodos - Metodo encendido 
        veh.encendido();
        auto.encendido();
        moto.encendido();
        //Imprimimos
        System.out.println(veh.estado);
        System.out.println(auto.estado);
        System.out.println(moto.estado);
        
    }
    
    
   
    
    
}
