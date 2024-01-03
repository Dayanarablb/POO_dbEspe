
package correcionexamenp1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Motocicleta extends Vehiculo{ //Clase Hija
    //Atributos
    public String cadena;
    public int pedales;
    
    //Constructor

    public Motocicleta(String cadena, int pedales, double precio, String marca, int año_creacion) {
        super(precio, marca, año_creacion);
        this.cadena = cadena;
        this.pedales = pedales;
    }
    
    //public Motocicleta(){
        
    //}    
    //Metodos Getters and Setters
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public int getPedales() {
        return pedales;
    }
    public void setPedales(int pedales) {
        this.pedales = pedales;
    }
   
    public void crearArchivoJson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Archivo.json : ");
        String fileName = sc.nextLine() + ".json";
        // Bloque Try-Catch para manejar excepciones de IO
        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("El archivo " + fileName + " ha sido creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    public void agregarMoto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de motos que desea registrar: ");
        int cantidad = sc.nextInt();
    
    //Ahora creo los arreglos
    String marcaVeh[]= new String[cantidad];
    int añoVeh[]= new int[cantidad];
    double precioVeh[] = new double [cantidad];
    String cadena[] = new String [cantidad];
    int pedales[]= new int[cantidad];
    
    for(int i=0; i<cantidad; i++){
        
        System.out.println("Ingrese la marca de la moto N° "+(i+1)+ ": ");
        marcaVeh[i]= sc.next();
        System.out.println("Ingrese el año de la moto N° "+(i+1)+ ": ");
        añoVeh[i]= sc.nextInt();
        System.out.println("Ingrese el precio de la moto N° "+(i+1)+ ": ");
        precioVeh[i]= sc.nextDouble();
        System.out.println("Ingrese el tipo de cadena de la moto N° "+(i+1)+ ": ");
        cadena[i]= sc.next();
        System.out.println("Ingrese el numero de los pedales de la moto N° "+(i+1)+ ": ");
        pedales[i]= sc.nextInt();  
    }     
    System.out.println("=========================================");
    System.out.println("         MOTOS AGREGADAS       ");
    System.out.println("=========================================");
    for (int i=0; i<cantidad; i++){
    System.out.println("\n Moto N° "+(i+1));
    System.out.println("Marca: "+marcaVeh[i]);
    System.out.println("Año: "+añoVeh[i]);
    System.out.println("Precio: "+precioVeh[i]);
    System.out.println("Cadena: "+cadena[i]);
    System.out.println("Numero/Tamaño Pedal: "+ pedales[i]);    
    }
    }
    public void mostrarMoto(){
        agregarMoto();        
    }
}
