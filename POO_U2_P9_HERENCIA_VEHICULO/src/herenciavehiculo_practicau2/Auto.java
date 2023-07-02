
package herenciavehiculo_practicau2;

public class Auto extends Vehiculo{//Herencia- exteds - hereda atributos y metodos de la clase padre Vehiculo
    //Atributos
    private String transmision;
    private boolean parabrisas;
    private int multa;
    
    //Constructor
    public Auto(String numPlaca, String marca, int numRuedas, int estado, String transmision, boolean parabrisas, int multa){
        super(numPlaca,marca,numRuedas,estado);
        this.transmision = transmision;
        this.parabrisas = parabrisas;
        this.multa = multa;  
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
    public void setMultas (int multa){
        this.multa=multa;
    }
    public void addMultas(){
        this.multa++;
    }
    public int getMulta(){
        return multa;
        
    }
}
