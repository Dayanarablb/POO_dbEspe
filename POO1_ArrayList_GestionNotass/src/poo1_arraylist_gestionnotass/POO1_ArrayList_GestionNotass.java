
package poo1_arraylist_gestionnotass;
import java.util.Scanner;
public class POO1_ArrayList_GestionNotass {
    
    public static void main(String[] args) {
        //Instanciamos el objeto
        GestionNotass gnotas=new GestionNotass();
        int op; // opcione elegida por el usuario
        Scanner sc = new Scanner(System.in);
        double nota;// variable para ir guardando la nota
        //generamos el menu
        do{
            // presentamos menu
            System.out.println("1.- Añadir Nota");
            System.out.println("2.- Ver Media");
            System.out.println("3.- Ver Aprobados");
            System.out.println("4.- Salir");
            op=Integer.parseInt(sc.nextLine());
            
            switch(op){
                case 1 -> {
                    System.out.println("Introduce nota");
                    nota=Double.parseDouble(sc.nextLine());
                    gnotas.guardarNota(nota);
                }
                case 2 -> System.out.println("Media actual"+gnotas.media());
                case 3 -> System.out.println("Aprobados"+gnotas.aprobados());      
            }
            
        }while(op!=4);   
    }
    
}
