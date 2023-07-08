
package poo_u2_p15_ficheros;

import java.io.*;
public class Archivo {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File (nombreArchivo);
        
        try{
            PrintWriter salida = new PrintWriter(archivo);//PrintWriter sirve para crear archivo o escribir un archivo
            salida.close();//se cierra           //archivo es el objeto de la instancia File
            
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
            
            System.out.println("Se escribio en el archivo");
            
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);//out es salida - Esta saliendo
            
        }  
    }
    public static void leerArchivo(String nombArchivo, String contenido) throws IOException{
        File Archivo = new File(nombArchivo);
        
        try{
            BufferedReader entrada = new BufferedReader(new FileReader( Archivo));
            String lectura = entrada.readLine();
            
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
            System.out.println("Se creo el archivo correctamente");
            
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
    }
    
    public static void eliminarArchivo(String nombArchivo, String contenido){
        File Archivo = new File(nombArchivo);
        System.out.println(Archivo.exists());
        Archivo.delete();
        System.out.println("Archivo eliminado");    
    }
}
