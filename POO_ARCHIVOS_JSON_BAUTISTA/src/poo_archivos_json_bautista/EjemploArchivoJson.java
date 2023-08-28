
package poo_archivos_json_bautista;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class EjemploArchivoJson {
    //Metodo
    public void GuardarArchivoJson(){
     JSONObject jsonObject = new JSONObject();
     
     jsonObject.put("nombre", "Elizabeth");
     jsonObject.put("apellido", "Bravo");
     jsonObject.put("carrera", "ITIN");
     jsonObject.put("edad", 19);
     jsonObject.put("ciudad", "Santo Domingo");
     
     //Escribir Archivo JSON
     try (FileWriter fileWriter = new FileWriter("Datos.json")){
         fileWriter.write(jsonObject.toJSONString());
         System.out.println("Archivo JSON creado exitosamente");
     }catch(IOException e){
         e.printStackTrace();
     }
     //Leer 
     JSONParser jsonParser = new JSONParser();
     try (FileReader fileReader = new FileReader("Datos.json")){
         JSONObject parsedObject = (JSONObject) jsonParser.parse (fileReader);
         
         //Valores especificos del objeto parsedObject
          String nombre = (String) parsedObject.get("nombre");
            String apellido = (String) parsedObject.get("apellido");
            String carrera = (String) parsedObject.get("carrera");
            long edad = (long) parsedObject.get("edad");
            String ciudad = (String) parsedObject.get("ciudad");
//imprimen en la consola los valores que obtuvimos del archivo JSON
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Carrera: " + carrera);
            System.out.println("Edad: " + edad);
            System.out.println("Ciudad: " + ciudad);
/*en caso de que ocurra una excepción durante la lectura o el análisis del archivo, 
el programa capturará la excepción y la imprimirá en la consola utilizando e.printStackTrace(). */
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
         
}
     
    

