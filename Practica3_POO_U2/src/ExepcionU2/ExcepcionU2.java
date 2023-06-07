
package ExepcionU2;
import java.io.InputStreamReader; //Libreria
import java.io.BufferedReader; // Libreria
import java.io.IOException;

public class ExcepcionU2 {

	
	public static void main(String[] args) {
		
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		
		try {
			String nombre= br.readLine();
			int div =8/0;
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ArithmeticException es) {
			System.out.println("NO PUEDE DIVIDIR EN CERO");
		}
	}
}

