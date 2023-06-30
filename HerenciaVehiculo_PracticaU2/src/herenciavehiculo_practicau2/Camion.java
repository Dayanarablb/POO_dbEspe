
package herenciavehiculo_practicau2;


public class Camion extends Vehiculo{
    //Atributos
    private boolean parabrisas;
    public String color;
    private double carga;
    //Constructor

    public Camion(boolean parabrisas, String color, double carga, String numPlaca, String marca, int numRuedas, int estado) {
        super(numPlaca, marca, numRuedas, estado);
        this.parabrisas = parabrisas;
        this.color = color;
        this.carga = carga;
    }
    //Metodos
    public void OnOffParabrisas(){
        if(this.parabrisas){
            this.parabrisas=false;
            System.out.println("Parabrisas Apagado");
        }else{ this.parabrisas=true;
            System.out.println("Parabrisas Encendido");
        }
    }

    public String getColor() {
        return color;
    }

    public double getCarga() {
        return carga;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
       
    }
    
    

