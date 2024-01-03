
package correcionexamenp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Camion extends Vehiculo {
    //Atributos
    public int cantidad_asientos;
    public String color_chasis;
    
    //Constructor
    public Camion(int cantidad_asientos, String color_chasis, double precio, String marca, int año_creacion) {
        super(precio, marca, año_creacion);
        this.cantidad_asientos = cantidad_asientos;
        this.color_chasis = color_chasis;
    }    
    public Camion(){
        
    }
    //Metodos Getters and Setters
    public int getCantidad_asientos() {
        return cantidad_asientos;
    }

    public void setCantidad_asientos(int cantidad_asientos) {
        this.cantidad_asientos = cantidad_asientos;
    }

    public String getColor_chasis() {
        return color_chasis;
    }

    public void setColor_chasis(String color_chasis) {
        this.color_chasis = color_chasis;
    }
    
    public void agregarCarro() throws IOException{
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de Carros que desea registrar: ");
    int cantidad = sc.nextInt();
    
    //Ahora creo los arreglos
    String marcaVeh[]= new String[cantidad];
    int añoVeh[]= new int[cantidad];
    double precioVeh[] = new double [cantidad];
    int cantidadAsientos[] = new int [cantidad];
    String color[]= new String[cantidad];
    
    for(int i=0; i<cantidad; i++){
        
        System.out.println("Ingrese la marca del Carro N° "+(i+1)+ ": ");
        marcaVeh[i]= sc.next();
        System.out.println("Ingrese el año del Carro N° "+(i+1)+ ": ");
        añoVeh[i]= sc.nextInt();
        System.out.println("Ingrese el precio del Carro N° "+(i+1)+ ": ");
        precioVeh[i]= sc.nextDouble();
        System.out.println("Ingrese la cantidad de asientos del Carro N° "+(i+1)+ ": ");
        cantidadAsientos[i]= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el color del Carro N° "+(i+1)+ ": ");
        color[i]= sc.next();

        //LLAMO AL METODO EN DONDE VOY A GUARDAR ESTOS DATOS EN ARCHIVO CSV
        guardarCarrosArchivoCsv(marcaVeh, añoVeh, precioVeh, cantidadAsientos, color);       
    }
}
    
    public void mostrarCarros() throws FileNotFoundException{
        try(BufferedReader fr = new BufferedReader(new FileReader("Carros.csv"))){
        //Lee cada linea del archivo CSV
        while(fr.ready()){
            String linea = fr.readLine();
            String[]datos = linea.split(",");
            for(String dato : datos){
                System.out.println(dato);
            }
        }
        System.out.println("Datos de Carros leidos correctamente en Archivo.CSV!");
        }catch(IOException e){
          e.printStackTrace();  
        }
        
    }  
    
    public void crearArchivoCarrosCsv(){
     Scanner sc = new Scanner(System.in);  
     //Aqui le pido al usuario que ingrese el nombre del archivo csv
     System.out.println("Ingrese el nombre del archivo.csv : ");
     String fileName = sc.nextLine();     
     //Bloque Try catch
     try{
         BufferedWriter writer = new BufferedWriter(new FileWriter(fileName+".csv"));//FileWriter es para escribir en el archivo
         System.out.println("El archivo.csv ha sido creado con exito! ");        
     }catch(IOException e){
         e.printStackTrace();
     }
    }
    
  public void guardarCarrosArchivoCsv(String marcaVeh[], int añoVeh[], double precioVeh[], int cantidadAsientos[], String color[]) throws IOException {
        try (FileWriter fw = new FileWriter("Carros.csv")) {
            // Agregar encabezados
            fw.write("Marca,Anio,Precio,Cantidad de Asientos,Color\n");
            // Agregar datos
            for (int i = 0; i < marcaVeh.length; i++) {
                fw.write(marcaVeh[i] + "," + añoVeh[i] + "," + precioVeh[i] + "," + cantidadAsientos[i] + "," + color[i] + "\n");
            }
            System.out.println("Carros guardados en archivo.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}   

