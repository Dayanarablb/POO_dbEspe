
package arreglos;
import java.util.Scanner;
public class Arreglos {
   
    public static void main(String[] args) {
        //Importamos clase Scanner ya que vamos a pedir que el usuario ingrese datos
        Scanner sc = new Scanner(System.in);//in ----------> Entrada de datos - out---------->salida de datos
        //Arreglo es un vector
       /* String apellido_1= "Bautista";
        String apellido_2= "Bravo";
        String apellido_3= "Cevallos";
        String apellido_4= "Vaca";
        String apellido_5= "Nuñes";*/
        
        //Una manera mas optima de realizar esto sera guardarlos en una sola variable
        
        //Declaracion de un arreglo de tipo String 
        //Abrimos los corchetes y le ponemos el nombre de nuestro arreglo, usamos =new STRING
        //y dentro del corchete colocamos el tamaño de nuestro arreglo, en nuestro arreglo van a caber 10 apellidos
        //Los areglos empiezan desde el cero 0 - 9 tenemos 10 posiciones
        int sumaPrecios = 0;//inicializo en cero porque lo vamos a utilizar para sumar
        int promedio = 0;
        String [] apellidos = new String [10];
        apellidos[0]="Bautista";
        apellidos[1]="Bravo";
        apellidos[2]="Briones";
        apellidos[3]="Zambrano";
        apellidos[4]="Cevallos";
        apellidos[5]="Fernandez";
        apellidos[6]="Gonzales";
        apellidos[7]="Salazar";
        apellidos[8]="Solorzano";
        apellidos[9]="Punguil";
        //FORMA 1 
        //Imprimo mi arreglo
        //Puedo imprimir el arreglo de la siguiente manera pero no se ve tan bien
        /*System.out.println(apellidos[0]);
        System.out.println(apellidos[1]);
        System.out.println(apellidos[2]);
        System.out.println(apellidos[3]);
        System.out.println(apellidos[4]);
        System.out.println(apellidos[5]);
        System.out.println(apellidos[6]);
        System.out.println(apellidos[7]);
        System.out.println(apellidos[8]);
        System.out.println(apellidos[9]);*/
        
        //Podemos hacerlo de otra manera utilizando un ciclo for
        //Inicializamos una variable i que empieza en cero
        //Decimos que la variable i va a ser menor que el tamaño de los apellidos
        //Length significa tamaño en este caso esto quiere decir i es menos al tamaños de los apellidos que es [10]
        //i++ es lo mismo que poner i+1
        
        //FORMA 2
        //Tambien podriamos poner el for de la siguiente manera
        /* for(int i=0; i<10;i++){
            System.out.println(apellidos[i]);
            
        }*/
      
        //FORMA 3
        for(int i=0; i<apellidos.length;i++){
            System.out.println(apellidos[i]);
            
        }
        //CREO UN ARREGLO PARA IMPRIMIR PRECIOS 
       //EN ESTE FOR VOY A PEDIRLE LOS PRECIOS AL USUARIO
        int [] precios = new int [3];        
        for(int i=0; i<precios.length;i++){
            System.out.println("Ingrese un precio: ");
            precios[i]= sc.nextInt();        
        }  
        //EN ESTE FOR VOY A IMPRIMIR LOS PRECIOS 
        for(int i=0; i<precios.length;i++){
            System.out.println(precios[i]);          
        }    
        //OPERACIONES CON ARREGLOS
        //MANERA FEA DE HACERLO PERO IGUALMENTE VA A FUNCIONAR
        //int sumaPrecios = precios[0]+precios[1]+precios[2];
        //la variable sumaPrecios la declaramos fuera del for para poder utilizarla en todo el programa
         for(int i=0; i<precios.length;i++){
             sumaPrecios = sumaPrecios+precios[i];
             promedio = sumaPrecios/precios.length; //tambien podemos dividir para precios.length que es el tamaño del arreglo de precio osea 3
             //i=0 
             //sumaPrecios = 0
             /* 
             posicion 0= 15 
             posicion 1= 16
             posicion 2= 17
             
             i = 0 entonces va a sumar la posicion 0 que en este caso es  15 + sumaPrecios que es = 0
             entonces suma a 15
             ahora i++ y i=1
             posicion 1 es = 16 ahora va a sumar 15+16 ya que ahora 15 esta guardado en la variable precioSuma despues de haber sumado 0+15
             i++ y i=2
             31 esta guardado en SUMAPRECIOS entonces en la posicio 2 esta 17 ahora suma 31+17 = 48 esta es la suma de los precios
             
             
             
             
             */
        } 
         System.out.println("Suma de precios: "+sumaPrecios);
         System.out.println("Promedio: "+promedio);

    }    
}
