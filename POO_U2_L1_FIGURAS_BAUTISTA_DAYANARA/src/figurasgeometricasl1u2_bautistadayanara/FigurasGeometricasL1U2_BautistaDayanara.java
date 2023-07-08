package figurasgeometricasl1u2_bautistadayanara;
import java.util.Scanner;
public class FigurasGeometricasL1U2_BautistaDayanara {

   
    public static void main(String[] args) {
       //Instanciamos Scanner y sc el objeto para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);//Scanner se utiliza para leer la entrada del usuario desde la consola.
        
        int op = 0;//Inicializo en cero

        do { //Ciclo do while, bucle que se va a repetir hasta que la opcion seleccionada sea 5 que es (Salir).
            //Menu de Opciones para que el usuario pueda elegir una figura geometrica y saber su Area y perimetro
            System.out.println("======== MENU DE OPCIONES  =======");
            System.out.println("======== FIGURAS GEOMETRICAS ==========");
            System.out.print("Elija una figura para saber su Area y perimetro");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triángulo");
            System.out.println("3. Rectángulo");
            System.out.println("4. Pentágono");
            System.out.println("5. Salir");
            //Op ---> utilizo sc.nextInt para leer la variable op que se la declaro como un tipo de dato entero la cual sera hasta la opcion 5
            op = sc.nextInt();

            switch (op) {//1,2,3,4,5
                case 1: // Area y perimetro del Cuadrado
                    System.out.print("Ingrese el lado del cuadrado: ");//Este mensaje saldra por consola pidiendo en dato al usuario
                    double ladoCuadrado = sc.nextDouble();// Lee el valor ingresado por el usuario y lo asigna a la variable LadoCuadrado de tipo double
                    Cuadrado cd = new Cuadrado(ladoCuadrado);// Instanciamos o creamos el objeto Cuadrado utilizando el valor del lado del cuadrado ingresado por el usuario. El objeto se asigna a la variable cd
                    //Imprime este mensaje por consola y calcula el area del cuadrado llamando al metodo calcularArea() en el objeto cd de tipo Cuadrado
                    System.out.println("El Área del cuadrado es: " + cd.calcularArea());
                    //Imprime este mensaje por consola y calcula el perimetro del cuadrado llamando al metodo calcularPerimetro() en el objeto cd de tipo Cuadrado
                    System.out.println("El Perímetro del cuadrado es: " + cd.calcularPerimetro());
                    break;
                case 2: // Area y perimetro Triángulo
                    System.out.print("Ingrese la base del triángulo: ");//Sale este mensaje por consola pidiendole al usuario un dato
                    // Lee el valor ingresado por el usuario y lo asigna a la variable baseTriangulo de tipo double
                    double baseTriangulo = sc.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    //Lee el valor ingresado por el usuario y lo asigna a la variable alturaTringulo de tipo double que representa la altura del triangulo
                    double alturaTriangulo = sc.nextDouble();
                    //Instanciamos y creamos un nuevo objeto llamado Triangulo utilizando los valores de base y altura dados por el usuario, El objeto se asigna a la variable tg.
                    Triangulo tg = new Triangulo(baseTriangulo, alturaTriangulo);
                    //Imprime por consola el mensaje y realiza el calculo del Area del triangulo llamando al metodo Calcular Areaen el objeto tg de tipo Triangulo
                    System.out.println("El Área del triángulo es: " + tg.calcularArea());
                    //Imprime mensaje y llama al metodo calcularPerimetro
                    System.out.println("El Perímetro del triángulo es: " + tg.calcularPerimetro());
                    break;
                case 3: // Area y perimetro Rectángulo
                    System.out.print("Ingrese la base del rectángulo: ");//Mensaje por consola pidiendo la base del Reactangulo al Usuario
                    double baseRectangulo = sc.nextDouble(); //Lee la base del Rectangulo
                    System.out.print("Ingrese la altura del rectángulo: ");//Pido la altura del rectangulo al usuario por consola
                    double alturaRectangulo = sc.nextDouble();//Lee la altura del rectangulo
                    //Creo un nuevo objeto Rectangulo, USO los valores de base y altura que fueron dados por el usuario. El objeto se asigna a la variable rc
                    Rectangulo rc = new Rectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("El Área del rectángulo es: " + rc.calcularArea());////Imprime mensaje y llama al metodo calcularArea
                    System.out.println("El Perímetro del rectángulo es: " + rc.calcularPerimetro());//Imprime mensaje y llama al metodo calcularPerimetro
                    break;
                case 4: // Area y perimetro Pentágono
                    System.out.print("Ingrese el lado del pentágono: ");
                    double ladoPentagono = sc.nextDouble();
                    Pentagono pg = new Pentagono(ladoPentagono);
                    System.out.println("Área del pentágono: " + pg.calcularArea());
                    System.out.println("Perímetro del pentágono: " + pg.calcularPerimetro());
                    break;
                case 5: // Salir
                    System.out.println("Usted ha salido del programa!");
                    break;//Finaliza la ejecucion del switch y sale del caso
                default:
                    System.out.println("No existe esta opcion!");
                    break;
            }

            System.out.println();
        } while (op != 5);

        sc.close();
    }
}
    


