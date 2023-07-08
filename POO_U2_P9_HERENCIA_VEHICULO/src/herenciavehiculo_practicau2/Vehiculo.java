
package herenciavehiculo_practicau2;

public class Vehiculo {
    //Atributos
    private String numPlaca;
    public String marca;
    public int numRuedas;
    public int estado;
    //Constructor
    public Vehiculo(String numPlaca, String marca, int numRuedas, int estado) {
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.numRuedas = numRuedas;
        this.estado = estado;
        
    //Metodos get y set
    }
    public String getMarca() {
        return marca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
    //Metodos get y set
    public String getNumPlaca() {
        return numPlaca;
    }
    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public int getEstado() {
        return estado;
    }  
    
}
//get - Mostrar
//Set - Establecer
