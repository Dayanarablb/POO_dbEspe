
package poo_u2_p15_ficheros;

import java.io.*;
public class Archivo {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File (nombreArchivo);
        
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();//se cierra
            
            System.out.println("Archivo Creado");
            
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);//out es salida - Esta saliendo
            
        }
    }
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File (nombreArchivo);
        
        try{
            PrintWriter salida = new PrintWriter(archivo);//Si no existe el archivo lo creo 
            salida.println("Contenido");
            salida.close();//se cierra
            
            System.out.println("Archivo Creado");
            
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);//out es salida - Esta saliendo
            
        }
    }
}
