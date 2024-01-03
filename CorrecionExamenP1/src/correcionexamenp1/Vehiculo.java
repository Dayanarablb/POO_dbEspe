
package correcionexamenp1;

import java.util.Scanner;

public class Vehiculo {
    private double precio;
    private String marca;
    private int año_creacion;

    public Vehiculo(double precio, String marca, int año_creacion) {
        this.precio = precio;
        this.marca = marca;
        this.año_creacion = año_creacion;
    }
    public Vehiculo(){
        
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAño_creacion() {
        return año_creacion;
    }
    public void setAño_creacion(int año_creacion) {
        this.año_creacion = año_creacion;
    }
    public void mostrarMarca(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de carros que desea registar: ");
    int cantidad = sc.nextInt();
    //double precioVeh[] = new double [cantidad];
    String marcaVeh[]= new String[cantidad];
    int añoVeh[]= new int[cantidad];
    
    
        for (int i=0; i<cantidad;i++){
            
            System.out.println("Vehiculo N° "+(i+1)+":");
            System.out.println("Ingrese la Marca del Vehiculo: ");
            marca = sc.nextLine();
            marcaVeh[i]= marca;
            sc.nextLine();
            System.out.println("Ingrese el Año del Vehiculo: ");
            año_creacion = sc.nextInt();
            añoVeh [i]= año_creacion;
            
        }
        //Aqui ya imprimo los Datos
                System.out.println("=========================================");
                System.out.println("         AÑO Y MARCAS DE VEHICULOS       ");
                System.out.println("=========================================");
                for (int i=0; i<cantidad; i++){
                System.out.println("\nVehiculo N° "+(i+1));
                System.out.println("Marca: "+marcaVeh[i]);
                System.out.println("Año: "+añoVeh[i]);           
        }
 
    }   
    public void mostrarPrecio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de carros que desea registar: ");
        int cantidad = sc.nextInt();
        double precioVeh[] = new double [cantidad];
        
        for (int i=0; i<cantidad;i++){
            
            System.out.println("Vehiculo N° "+(i+1)+":");
            System.out.println("Ingrese el Precio del Vehiculo: ");
            precio = sc.nextDouble();
            precioVeh [i] = precio;
            sc.nextLine();
        }
             //Aqui ya imprimo los Datos
                System.out.println("=========================================");
                System.out.println("         PRECIOS DE VEHICULOS       ");
                System.out.println("=========================================");
                for (int i=0; i<cantidad; i++){
                System.out.println("\nVehiculo N° "+(i+1));
                System.out.println("Precio: "+precioVeh[i]);
                }
    }
}
                
   


