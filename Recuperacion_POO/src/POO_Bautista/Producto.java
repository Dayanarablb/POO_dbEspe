package POO_Bautista;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {

	 private ArrayList<Producto> producto;
	 private ArrayList<Proveedor> proveedor;
	 private ArrayList<Pedido> pedido;

	    public Producto() {
	        producto =new ArrayList<>();
	        proveedor =new ArrayList<>();
	        pedido = new ArrayList<>();
	    }
	    
    public void ingresarProducto(Scanner scanner) {
    System.out.println("Ingrese un producto");

    System.out.print("Nombre del producto: ");
    String nombreProducto = scanner.nextLine();
    scanner.nextLine(); 

    System.out.print("Precio Unitario: ");
    Double PrecioUnitario = scanner.nextDouble();

    Producto producto = new Producto();
    Producto.add(producto);

    System.out.println("El producto se ha ingresado.\n");
    }

    private static void add(Producto producto2) {
		
	}

	public void ingresarProveedor(Scanner scanner) {
        System.out.println("Ingrese el proveedor");

        System.out.print("Nombre del proveedor: ");
        String nombreProveedor = scanner.nextLine();
        scanner.nextLine(); 
        Proveedor proveedor = new Proveedor(nombreProveedor);
        Proveedor.add(proveedor);
}
	public void ingresarNuevoPedido(Scanner scanner) {
	    System.out.println("Ingrese un nuevo Producto");

	    System.out.print("Nombre del producto: ");
	    String nombreProducto = scanner.nextLine();
	    scanner.nextLine(); 

	    System.out.print("Precio Unitario: ");
	    Double PrecioUnitario = scanner.nextDouble();

	    Producto producto = new Producto();
	    Producto.add1(producto);

	    System.out.println("El producto se ha ingresado.\n");
	    }

	    private static void add1(Producto producto2) {
			// TODO Auto-generated met
			
		}
	
}