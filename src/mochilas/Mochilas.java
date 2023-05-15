
package mochilas;


public class Mochilas {

    //Atributos
    String Marca;
    double precio;
    String color;
    int CantidadBolsillos;
    String Material;
    public static void main(String[] args) {
    // Cantantes cantante1 = new Cantantes (); 
    //Instancia - Creacion del objeto
    Mochilas mochila1 = new Mochilas ();
    //mochila1 tiene todo los atributos que tiene la clase(Marca, preci, color, cantidad de bolsillos que tiene la mochila, material con el que esta elaborada)
    //Rellenamos los atributos del objeto "mochila1" 
    mochila1.Marca = "Nike";
    mochila1.precio = 18.50;
    mochila1.color = "Negra";
    mochila1.CantidadBolsillos = 4;
    mochila1.Material =" Algodon- Nailon-";
     
   
    //Imprimir los resultados del objeto 1
    System.out.println("---------------Mochila 1-----------------");
    System.out.println("La marca de la mochila es:" +mochila1.Marca);
    System.out.println("El precio de la mochila es:" +mochila1.precio);
    System.out.println("Color:" +mochila1.color);
    System.out.println("Cantidad de bolsillos:" +mochila1.CantidadBolsillos);
    System.out.println("Material:" +mochila1.Material);
    //Instancia    
    Mochilas mochila2 = new Mochilas ();//Creacion del objeto
    //mochila1 tiene todo los atributos que tiene la clase(Marca, preci, color, cantidad de bolsillos que tiene la mochila, material con el que esta elaborada)
    //Rellenamos los atributos del objeto "mochila1" 
    mochila2.Marca = "Gucci";
    mochila2.precio = 30;
    mochila2.color = "Roja";
    mochila2.CantidadBolsillos = 3;
    mochila2.Material ="Cuero";
     
   
    //Imprimir los resultados del objeto 1
    System.out.println("---------------Mochila 2-----------------");
    System.out.println("La marca de la mochila es:" +mochila2.Marca);
    System.out.println("El precio de la mochila es:" +mochila2.precio);
    System.out.println("Color:" +mochila2.color);
    System.out.println("Cantidad de bolsillos:" +mochila2.CantidadBolsillos);
    System.out.println("Material:" +mochila2.Material);   
    }
    
}
