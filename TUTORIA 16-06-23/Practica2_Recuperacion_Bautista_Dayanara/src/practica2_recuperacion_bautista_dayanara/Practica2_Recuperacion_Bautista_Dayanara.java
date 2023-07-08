
package practica2_recuperacion_bautista_dayanara;

import java.util.Scanner;//Aqui importamos la libreria Scanner - Scanner es una clase de java

public class Practica2_Recuperacion_Bautista_Dayanara {

    public static void main(String[] args) {
        //Ingresar nombre del estudiante
        //Ingresar 3 notas
        //Presentar el nombre
        //Presentar las notas
        //Presento la nota mayor
    //Importamos Scanner para el ingreso de datos 
    Scanner sc = new Scanner(System.in);
    //Declaro las variables que voy a utilizar
    String Nombre;
    float nota1, nota2, nota3;
    
    System.out.println("Ingrese su Nombre: ");
    Nombre = sc.nextLine();
    System.out.println("Ingrese la nota 1: ");
    nota1 = sc.nextFloat();
    System.out.println("Ingrese la nota 2: ");
    nota2 =sc.nextFloat();
    System.out.println("Ingrese la nota 3: ");
    nota3 = sc.nextFloat();
    //Imprime los resultados
     System.out.println("El nombre del estudiante es: "+Nombre);
    if (nota1>nota2){
        System.out.println("El nota mayor es: " +nota1);
    }else if (nota2>nota3){
        System.out.println("El nota mayor es: " +nota2);
    }else{
        System.out.println("El nota mayor es: " +nota3);
    }
    
    }
    
}
