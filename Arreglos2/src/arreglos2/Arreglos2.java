
package arreglos2;

/*Realiza un programa que contenga un vector cuya longitud sea proporcionado por el usuario,
posteriormente solicitar al usuario los nmumeros necesarios para llenar todas las posiciones
del vector, es decir si el usuario solicito un arreglo de 10 posiciones, entonces el programa
debera solicitarle al usuario 10 numeros y finalmente se debe imprimir el arreglo en pantalla de
la siguiente manera:

[5] [54] [12] [65] [6] [54] [897]
*/
import java.util.Scanner;

public class Arreglos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        float promedio = 0;
        System.out.println("Ingrese la longitud del arreglo: ");
        int longitud = sc.nextInt();
        int[] arreglo = new int[longitud];
        System.out.println("La longitud del arreglo es: " + "[" + longitud + "]");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un número para la posición " + i + " del arreglo: ");
            arreglo[i] = sc.nextInt();
            System.out.println("arreglo[" + i + "]=" + arreglo[i]);
        }

        // Imprimir el contenido del arreglo
        System.out.print("El contenido del arreglo es: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        for(int i=0; i<arreglo.length;i++){
             suma = suma+arreglo[i];
             promedio = suma/arreglo.length;
        }
        System.out.println("\nLa suma de los numeros del arreglo es: "+suma);
        System.out.println("El promedios de los numeros del arreglo es: "+promedio);
    }
}
/*public class Arreglos2 {

        public static void main(String[] args) {
        //Primero utilizo la clase Scanner para pedirle al usuario los datos por pantalla
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la longitud del arreglo: ");
        int longitud =sc.nextInt();//leer
        int[] arreglo = new int[longitud];
        System.out.println("La longitud del arreglo es: arreglo"+ "[" + longitud + "]");
        
        //Utilizo un for 
         for(int i=0; i<arreglo.length;i++){
            System.out.println("Ingrese numeros para las diferentes posiciones del arreglo: ");
            int numeros = sc.nextInt();
            System.out.println("arreglo"+"["+i+"]"+"="+numeros);  
                  
        } 
         for(int i=0; i<arreglo.length;i++){
            System.out.print("["+numeros+"]");     
         }
        }
               
       
    
} */ 
