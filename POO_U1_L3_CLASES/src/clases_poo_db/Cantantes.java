
package clases_poo_db;


public class Cantantes { //Creacion de la clase Cantantes
    //Atributos
    String Nombre;
    String Apodo;
    int Edad;
    String Genero;
    int Hijos;
    
    public static void main(String[] args) {
        Cantantes cantante1 = new Cantantes (); //Instancia - Creacion del objeto
        //estudiante1 tiene todo los atributos que tiene la clase(Nombre, apodo, edad, Tipo de musica que canta, la cantidad de hijos que tiene el cantante)
        //Rellenamos los atributos del objeto "cantante1" 
        cantante1.Nombre = "Juan Pablo";
        cantante1.Apodo = "Ozuna";
        cantante1.Edad = 31;
        cantante1.Genero = "Regueton";
        cantante1.Hijos = 2;
        
        
        System.out.println("---------------CANTANTE 1-----------------");
        System.out.println("Nombre:" +cantante1.Nombre);
        System.out.println("Apodo:" +cantante1.Apodo);
        System.out.println("Edad:" +cantante1.Edad);
        System.out.println("Tipo de musica:" +cantante1.Genero);
        System.out.println("Hijos:" +cantante1.Hijos);
        
        Cantantes cantante2 = new Cantantes (); //Instancia - Creacion del objeto
        //estudiante1 tiene todo los atributos que tiene la clase (Nombre, apodo, edad, Tipo de musica que canta, la cantidad de hijos que tiene el cantante)
        //Rellenamos los atributos del objeto "cantante1"
        cantante2.Nombre = "José Álvaro Osorio Balvín";
        cantante2.Apodo = "J Balvín";
        cantante2.Edad = 38;
        cantante2.Genero = "Reguetón, pop latino, trap latino";
        cantante2.Hijos = 1;
        
        
        System.out.println("---------------CANTANTE 2-----------------");
        System.out.println("Nombre:" +cantante2.Nombre);
        System.out.println("Apodo:" +cantante2.Apodo);
        System.out.println("Edad:" +cantante2.Edad);
        System.out.println("Tipo de musica:" +cantante2.Genero);
        System.out.println("Hijos:" +cantante2.Hijos);
        
    }     
}
    
    
    
    

