
package poo_u2_p15_ficheros;

import java.io.*;
import java.util.Scanner;
import static poo_u2_p15_ficheros.Archivo.crearArchivo;

public class POO_U2_P15_FICHEROS {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contenido= null;
        String nombreArchivo;
        //crearArchivo("Archivo\\miarchivo.txt"); //Alt 92 para poner estas barritas
        
       while (true) {
            System.out.println("=== MENÚ DE OPCIONES ===");
            System.out.println("1. Crear archivo");
            System.out.println("2. Escribir en archivo");
            System.out.println("3. Leer archivo");
            System.out.println("4. Eliminar archivo");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del archivo a crear: ");
                    nombreArchivo = scanner.next();
                    Archivo.crearArchivo(nombreArchivo);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del archivo en el que desea escribir: ");
                    nombreArchivo = scanner.next();
                    scanner.nextLine(); // Consumir el salto de línea después de leer el nombre del archivo
                    System.out.print("Ingrese el contenido a escribir: ");
                    contenido = scanner.nextLine();
                    Archivo.escribirArchivo(nombreArchivo, contenido);
                    
                    break;

                case 3:
                    
                    System.out.print("Ingrese el nombre del archivo a leer: ");
                    nombreArchivo = scanner.next();
                    scanner.nextLine(); // Consumir el salto de línea después de leer el nombre del archivo
                    try {
                        Archivo.leerArchivo(nombreArchivo, contenido);
                        
                        
                    } catch (IOException e) {
                        
                        e.printStackTrace();
                        
                    }
                    break;

                case 4:
                    
                    System.out.print("Ingrese el nombre del archivo a eliminar: ");
                    nombreArchivo = scanner.next();
                    Archivo.eliminarArchivo(nombreArchivo, contenido);
                    
                    break;
                    
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);

                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        }  

    }
    
}



