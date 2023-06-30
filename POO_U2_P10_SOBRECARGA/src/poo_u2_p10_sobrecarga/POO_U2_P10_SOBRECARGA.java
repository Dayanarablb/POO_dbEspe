
package poo_u2_p10_sobrecarga;


public class POO_U2_P10_SOBRECARGA {

    
    public static void main(String[] args) {
        
       Persona person1 =new Persona("Dayanara", 19);//Aqui envio el dato
       person1.Jugar();//llamo a mi metodo Jugar 
       
       Persona person2 =new Persona(123645);
       person2.Jugar("Bolicha");//Aqui ya envio el dato String del juego que le gusta
    }
    
}
