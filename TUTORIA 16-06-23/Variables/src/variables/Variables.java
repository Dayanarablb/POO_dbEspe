
package variables;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        //El Scanner sirve para ingresar datos por consola
        Scanner sc =new Scanner (System.in); //Scanner es una clase que tiene Java y tamnien la tenemos que instanciar
        //Variables las declaro
        int n1;
        int n2;
        //Pedimos el numero 1 por consola
        System.out.println("Escribir el numero 1");
        //nexInt para leer n1 el primer numero que se va a ingresar
        n1=sc.nextInt();
        //Pedimos el numero 2 por consola
        System.out.println("Escribir el numero 1");
         //nexInt para leer n2 el primer numero que se va a ingresar
        n2=sc.nextInt();
        //Usamos el condicional if else para saber si un numero es mayor que otro
        if(n1>n2){
           System.out.println("El numero mayor es: "+n1); 
        }else
          System.out.println("El numero mayor es: "+n2);       
    }   
}
