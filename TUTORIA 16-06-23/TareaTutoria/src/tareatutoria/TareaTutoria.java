
package tareatutoria;

import java.util.Scanner;
public class TareaTutoria { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Atributos - Estos atributos van despues de intanciar la clase Scanner
    //En estas variables se van a guardar los datos que ingrese el usuario
    String nombre;
    float nota1;
    float nota2;
    float nota3;
    float promedio;
    float suma;    
    System.out.println("Ingrese su nombre");
    nombre = sc.nextLine();
    System.out.println("Ingrese notas que esten en el rango de 0 a 20");
    System.out.println("Ingrese la nota 1: ");
    nota1 = sc.nextFloat();
    System.out.println("Ingrese la nota 2: ");
    nota2 = sc.nextFloat();
    System.out.println("Ingrese la nota 3: ");
    nota3 = sc.nextFloat();
    //Operacion para sacar el promedio de las 3 notas
    suma = nota1+nota2+nota3;
    promedio = suma/3;
    System.out.println("Su promedio es: "+promedio);
    //Ahora utilizare un condicional para saber si el estudiatea aprobo o reprobo 
    
    if (promedio>=14 && promedio<=20){
        System.out.println("Aprobado");
    }else{
         System.out.println("Reprobado");   
        
    }
 
    }
    
}
