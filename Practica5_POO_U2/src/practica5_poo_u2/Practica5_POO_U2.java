
package practica5_poo_u2;
import java.io.*; //De esta manera importo la libreria .io que se encuentran en java y ya no es necesario escribir libreria por libreria...
import java.util.*; //De esta manera llamo a toda la libreria .util en java... 
public class Practica5_POO_U2 {

    
    public static void main(String[] args) throws FileNotFoundException {// FileNotFoundException es una excepción que se utiliza para manejar errores relacionados con la lectura o escritura de archivos.
                                           //Esta excepción se lanza cuando un código intenta abrir o acceder a un archivo que no existe en el sistema de archivos.
     //Instanciamos
     try(BufferedReader br = new BufferedReader(new FileReader ("C:\\Users\\EFRAIN\\Documents\\NetBeansProjects\\Practica5POO.txt"));//Practica5POO.txt es el archivo que se creo en el blog de notas
             BufferedWriter bw = new BufferedWriter(new FileWriter ("C:\\Users\\EFRAIN\\Documents\\NetBeansProjects\\Practica5POO.txt"));){
        
        //BufferedReader: LEE
        //FileReader: LEE BLOG DE NOTAS
        //BufferedWriter: ESCRIBE
        //FileWriter: ESCRIBE EN EL BLOG DE NOTAS(ARCHIVO)
        bw.write("Prueba de escritura de ficheros");//Se esta usando br que es el objeto que se creo al momento que instanciamos
        //bw.write esta escribiendo "Prueba de escritura de ficheros" // Escribe linea por linea
        bw.newLine();//nueva linea
        bw.write("Prueba 1");
        bw.newLine();
        
        bw.flush();//Guarda lo que esta Escrito
        
        String linea = br.readLine();// Declaramos la variable linea de tipo String = a br.readLine 
        //br.readLine lee linea por linea
        while(linea != null){//Revisa linea por linea
            System.out.println(linea);
            linea=br.readLine();
        }
        
        }catch(IOException e){//IOException es Entrada y salida
                System.out.println("Error E/S. "+e);
        }
        
    }
    
}
