
package practica6_poo_u2;
import java.io.*;
import java.util.*;

//Sirven para leer y escribir datos en archivos com extencion csv (tipos Excel) 
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Practica6_POO_U2 {

    
    public static void main(String[] args) {
        
        //Creacion de una arreglo que guarde los datos de la clase
        List<Persona> persona = new ArrayList<Persona>();
        
        /**Ingreso manual de datos al arreglo antes creado
        * persona: es el nombre del array al momento que instanciamos -creacion del objeto persona en el Array 
        * Persona: Es la clase creada en este proyecto
        */
        persona.add(new Persona("Dayanara", "09948512", "dy@gmail.com"));
        persona.add(new Persona("Jeremy", "09845623", "jm@hotmail.com"));
        persona.add(new Persona("Analia", "098564712", "anlia@yahoo.com"));
        persona.add(new Persona("Rihana", "09456231", "rirr@outlook.com"));
        
        ExportarCSV(persona);
        ImportarCSV();
        
    }
     public static void ExportarCSV(List<Persona> persona) {
        String salidaArchivo = "Persona1.csv"; // Nombre del archivo
        boolean existe = new File(salidaArchivo).exists(); // Verifica si existe
        
        // Si existe un archivo llamado asi lo borra
        if(existe) {
            File archivoPersona = new File(salidaArchivo);
            archivoPersona.delete();
        }
        
        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            
            // Datos para identificar las columnas
            salidaCSV.write("Nombre");
            salidaCSV.write("Telefono");
            salidaCSV.write("Email");
            
            salidaCSV.endRecord(); // Deja de escribir en el archivo
            
            // Recorremos la lista y lo insertamos en el archivo
            for(Persona user : persona) {
                salidaCSV.write(user.getNomb());
                salidaCSV.write(user.getTelef());
                salidaCSV.write(user.getMail());
                
                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }
            
            salidaCSV.close(); // Cierra el archivo
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    }
    
    public static void ImportarCSV() {
        try{
            List<Persona> persona = new ArrayList<Persona>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerPersona = new CsvReader("Persona.csv");
            leerPersona.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerPersona.readRecord()) {
                String nombre = leerPersona.get(0);
                String telefono = leerPersona.get(1);
                String email = leerPersona.get(2);
                
                persona.add(new Persona(nombre, telefono, email)); // Añade la informacion a la lista
            }
            
            leerPersona.close(); // Cierra el archivo
            
            // Recorremos la lista y la mostramos en la pantalla
            for(Persona user : persona) {
                System.out.println(user.getNomb() + " , "
                    + user.getTelef() + " , "
                    +user.getMail());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

