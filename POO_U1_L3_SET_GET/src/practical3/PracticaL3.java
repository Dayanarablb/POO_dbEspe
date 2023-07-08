
package practical3;

import java.util.Scanner;


public class PracticaL3 {
    public static void main(String[] args) {
      
 
      Scanner teclado=new Scanner(System.in); //Creacion del objeto teclado de tipo Scanner
      
      String nombre, apellido;
      int edad;
      System.out.print("Ingrese su nombre:");
      nombre=teclado.nextLine();//se almacena en la variable nombre lo que el usuario ha digitado
      System.out.println("Ingrese su apellido");
      apellido=teclado.nextLine();//nextLine()recupera la informacion ingresada por teclado en formato String
      System.out.println("Ingrese su edad");
      edad=teclado.nextInt();//nextInt() recupera la informacion ingresada por teclado en formato int
                             
      //Creacion de objeto de la clase persona 
      Persona persona= new Persona(); 
      persona.setNombre(nombre);
      persona.setApellido(apellido);
      persona.setEdad(edad);
      
      //Impriminos los resultados almacenados
      System.out.println("Datos de la persona");
      System.out.println("Nombre:"+persona.getNombre());
      System.out.println("Apellido: "+persona.getApellido());
      System.out.println("Edad: "+persona.getEdad());
      
    
    }     
}
