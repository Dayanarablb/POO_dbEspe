package clases_poo_db;

public class Estudiantes { //Creacion de la clase Estudiantes
    
    //Atributos
    String nombre;
    String apellido;
    int edad;
    String carrera;
    String sexo;
    
    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes (); //Instancia - Creacion del objeto
        //estudiante1 tiene todo los atributos que tiene la clase(nombre, apellido, edad, carrera, sexo)
        //Rellenamos los atributos del objeto "estudiante1" 
        estudiante1.nombre = "Dayanara";
        estudiante1.apellido = "Bautista";
        estudiante1.edad = 19;
        estudiante1.carrera = "ITIN";
        estudiante1.sexo = "Femenino";
        
        
        System.out.println("---------------ESTUDIANTE 1-----------------");
        System.out.println("Nombre:" +estudiante1.nombre);
        System.out.println("Apellido:" +estudiante1.apellido);
        System.out.println("Edad:" +estudiante1.edad);
        System.out.println("Carrera:" +estudiante1.carrera);
        System.out.println("Sexo:" +estudiante1.sexo);
        
        Estudiantes estudiante2 = new Estudiantes (); //Instancia - Creacion del objeto
        //estudiante1 tiene todo los atributos que tiene la clase(nombre, apellido, edad, carrera, sexo)
        //Rellenamos los atributos del objeto "estudiante2" 
        estudiante2.nombre = "Mirko";
        estudiante2.apellido = "Trovato";
        estudiante2.edad = 23;
        estudiante2.carrera = "Agropecuaria";
        estudiante2.sexo = "Masculino";
        
        System.out.println("---------------ESTUDIANTE 2-----------------");
        System.out.println("Nombre:" +estudiante2.nombre);
        System.out.println("Apellido:" +estudiante2.apellido);
        System.out.println("Edad:" +estudiante2.edad);
        System.out.println("Carrera:" +estudiante2.carrera);
        System.out.println("Sexo:" +estudiante2.sexo);   
    }     
}

