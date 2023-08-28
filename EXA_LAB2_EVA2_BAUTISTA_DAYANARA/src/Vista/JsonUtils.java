
package Vista;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtils {
    public static void guardarEstudianteJson(String codigo, String cedula, String apellido, String nombre,
                                            String email, String telefono, String direccion, String materia, String estado) {
        JSONObject estudianteJson = new JSONObject();
        estudianteJson.put("es_codigo", codigo);
        estudianteJson.put("es_cedula", cedula);
        estudianteJson.put("es_apellido", apellido);
        estudianteJson.put("es_nombre", nombre);
        estudianteJson.put("es_email", email);
        estudianteJson.put("es_telefono", telefono);
        estudianteJson.put("es_direccion", direccion);
        estudianteJson.put("es_materia", materia);
        estudianteJson.put("es_estado", estado);

        try (FileWriter file = new FileWriter("estudiante.json")) {
            file.write(estudianteJson.toJSONString());
            file.flush();
            System.out.println("Datos guardados en estudiante.json");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
