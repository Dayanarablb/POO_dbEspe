package Laboratorio3_Bautista_Dayanara;
import java.util.Scanner;//IMPORTO LA CLASE SCANNER
public class Main {

	public static void main(String[] args) {
		//Instancio y creo la clase Scanner para pedirle lo datos al usuario por pantalla
		
		Scanner sc = new Scanner(System.in);
	
		//CREO VARIOS PRODUCTOS
		System.out.println("===== PRODUCTOS ESTADAR ========");
		System.out.println("Producto Estandar 1: ");
        ProductoEstandar producto1 = crearProductoEstandar(sc);

        System.out.println("Producto Estándar 2: ");
        ProductoEstandar producto2 = crearProductoEstandar(sc);
        
        System.out.println("Producto Estándar: 3");
        ProductoEstandar producto3 = crearProductoEstandar(sc);

        System.out.println("===== PRODUCTOS OFERTADOS ========");
        
        System.out.println("Producto Ofertado 1:");
        ProductoOfertado producto4 = crearProductoOfertado(sc);

        System.out.println("Producto Ofertado 2:");
        ProductoOfertado producto5 = crearProductoOfertado(sc);

        System.out.println("Producto Ofertado 3:");
        ProductoOfertado producto6 = crearProductoOfertado(sc);
        

        //LLAMO AL PARAMETRO OBETNERPRECIOPEDIDO Y CALCULO EL PEDIDO TOTAL
        System.out.print("Ingrese el número de unidades pedidas: ");
        int unidadesPedidas = sc.nextInt();

        double totalPedido = 0;
        //CREO UN ARRAY DE PRODUCTO QUE CONTIENE LOS OBJETOS DE PRODUCTO
        //QUE ES producto1, producto2, producto3, producto4, producto5, producto6
        //UTILIZO UN BUCLE FOR PARA RECORRER EL ARRAY
        //SUMO EL PRECIO DEL PRODUCTO - UTILIZO EL METODO "ObtenerPrecioPedido"
        Producto[] productos = {producto1, producto2, producto3, producto4, producto5, producto6};

        for (Producto producto : productos) {
            totalPedido += producto.ObtenerPrecioPedido(unidadesPedidas);
        }
        System.out.println("Total del pedido: " + totalPedido);
        sc.close();
    }
	//METODO STATICO PARA CREAR UN PODUCTO ESTANDAR PIDIENDO POR PANTALL LOS DATOS AL USUARIO
	public static ProductoEstandar crearProductoEstandar(Scanner sc) {
        System.out.print("Ingrese el nombre del producto: ");//TAMBIEN PIDO POR CONSOLA
        String nombre = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese la sección del producto: ");
        String seccion = sc.nextLine();

        return new ProductoEstandar(nombre, precio, seccion);
    }
	
	//METODO STATICO PARA CREAR UN PODUCTO ESTANDAR PIDIENDO POR PANTALL LOS DATOS AL USUARIO
    public static ProductoOfertado crearProductoOfertado(Scanner sc) {//PIEDO DATOS POR CONSOLA
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese los días restantes para que finalice la oferta: ");
        int dias = sc.nextInt();
        sc.nextLine();

        return new ProductoOfertado(nombre, precio, dias);
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

    
	




