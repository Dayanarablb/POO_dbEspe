
package correcionexamenp1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CorrecionExamenP1 {

        public static void main(String[] args) throws IOException {
        //SCANNER para pedir que usuario ingrese alguna opcion por consola
        Camion c = new Camion();
        Motocicleta m = new Motocicleta("", 0,0.0, "", 0);
        Scanner sc = new Scanner(System.in);
        int op;               
        do{
            System.out.println("================ Menu Opciones ==================");
            System.out.println("1. Crear archivo de carros (CSV)");
            System.out.println("2. Crear archivo de motos (JSON)" );
            System.out.println("3. Ingresar carros (Arreglos/CSV) que se ocupará en el archivo carro.csv");
            System.out.println("4. Ver lista de carros (CSV)");
            System.out.println("5. Ingresar motos (Arreglos/JSON) que se ocupará en el archivo motos.json");
            System.out.println("6. Ver lista de motos (JSON)" );
            System.out.println("7. Salir");
            System.out.println("Elija una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
        
            switch(op){
                case 1:
                    c.crearArchivoCarrosCsv();                    
                    break;
                case 2:
                    m.crearArchivoJson();
                    break;
                case 3:
                    c.agregarCarro();
                    break;
                case 4:
                    c.mostrarCarros();
                    break;
                case 5:
                     try {
                         m.agregarMoto();
                         escribirArchivoJsonMoto(m);
                         leerArchivoJsonMoto();
                        } catch (IOException e) {
                        e.printStackTrace();
                        }
                    break;
                case 6:
                    leerArchivoJsonMoto();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelva a elejir una opcion: ");                       
            }
        }while(op != 7); 
        sc.close();        
    }
        public static void escribirArchivoJsonMoto(Motocicleta m) throws IOException {      
        try (JsonWriter writer = new JsonWriter(new FileWriter("moto.json", true))) {
            System.out.println("Archivo.json creado con exito!");

            writer.setIndent("   ");
            Gson jsonString = new GsonBuilder().setPrettyPrinting().create();
            jsonString.toJson(m, Motocicleta.class, writer);          
        }
    }
     public static void leerArchivoJsonMoto() throws FileNotFoundException, IOException {
    File archivo = new File("moto.json");
    if (archivo.exists()) {
        try (BufferedReader reader = new BufferedReader(new FileReader("moto.json"))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            
            // Imprimir el contenido completo del archivo JSON
            System.out.println(stringBuilder.toString());
        }
    } else {
        System.out.println("El archivo moto.json no existe.");
    }
}   
}
