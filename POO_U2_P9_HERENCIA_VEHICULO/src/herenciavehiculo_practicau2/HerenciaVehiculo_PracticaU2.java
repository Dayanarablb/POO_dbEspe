
package herenciavehiculo_practicau2;

public class HerenciaVehiculo_PracticaU2 {

    public static void main(String[] args) {
   
    System.out.println("------------------ VEHICULO -----------------");
    Vehiculo veh = new Vehiculo("CD-154","Toyota",4,1);
    veh.getMarca();
    veh.getNumRuedas();
    veh.setEstado(1);
    veh.setNumPlaca("CD-154");
   
    System.out.println("Numero de placa: "+veh.getNumPlaca());
    System.out.println("Marca: "+veh.getMarca());
    System.out.println("Numero de Ruedas: "+veh.getNumRuedas());
    System.out.println("Estado: "+veh.getEstado());
    
    System.out.println("------------------ AUTO -----------------");    
    Auto auto = new Auto("BB1562", "HYUNDAI", 4, 5,"Buena", true, 40);
    auto.OnOffParabrisas();
    auto.getMulta();
    auto.addMultas();
    
    System.out.println("Numero de placa: "+auto.getNumPlaca());
    System.out.println("Marca: "+auto.getMarca());
    System.out.println("Numero de Ruedas: "+auto.getNumRuedas());
    System.out.println("Estado: "+auto.getEstado());
    System.out.println("Multa: "+auto.getMulta());
  
    System.out.println("------------------ CAMION -----------------");
    Camion camion = new Camion (false," Rojo",18.5,"JHH025","SINOTRUCK", 10, 5);
    camion.OnOffParabrisas();
    camion.getColor();
    camion.getCarga();
    
    System.out.println("Color del Camion: "+camion.getColor());
    System.out.println("Carga: "+camion.getCarga());
    System.out.println("Numero de placa: "+camion.getNumPlaca());
    System.out.println("Estado: "+camion.getMarca());
    System.out.println("Multa: "+camion.getNumRuedas());
    System.out.println("Multa: "+camion.getEstado());
     
    }
    
}
