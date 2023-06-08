package POO_Bautista;
import java.util.Scanner;

public class Administrador {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Producto pro = new Producto();
        
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); //

            switch (opcion) {
                case 1:
                	pro.ingresarProducto(scanner); 
                    break;
                case 2:
                	pro.ingresarProveedor(scanner);
                    break;
                case 3:
                    break;
                case 4:
                	pro.ingresarNuevoPedido(scanner);
                    break;
                case 5:
                    
                    break;
                case 6:
                	System.out.println("Gracias por visitarnos!");
                    break;
                
                default:
                    System.out.println("Opcion inválida. Introduce un número valido.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
		
	 private static void mostrarMenu() { //Metodo para mostrar el menu de opciones 
	        System.out.println("----- MENU -----");
	        System.out.println("1. Productos");
	        System.out.println("2. Proveedores");
	        System.out.println("3. Nuevo pedido");
	        System.out.println("4. Pedido mayor");
	        System.out.println("5. total facturado");
	        System.out.println("6. Salir");
	        System.out.print("Selecciona una opcion: ");
	    }
		
}



