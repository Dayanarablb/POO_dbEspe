
package ramdom_practica;
public class RAMDOM_PRACTICA {

    
    public static void main(String[] args) {
        // PRACTICA DE OPERADORES LOGICOS 
        //Usar ramdom libreria math, obtenemos nuestros numeros ramdomicos
        //1)Mostrar el resultado de cierto numero aleatorio entero de dos digitos
        //y decir si se encuetra entre el valor 10 y 60.
        //Utilizar el metodo random() dentro de la clase Math.
        int RANDOM = (int) (Math.random() * 90 + 100); // genera un número aleatorio entero de dos dígitos (entre 10 y 99)
        System.out.println("El número aleatorio es: " +RANDOM);
        
        if (RANDOM >= 10 && RANDOM <= 60) {
            System.out.println("El número aleatorio está entre 10 y 60.");
        } else {
            System.out.println("El número aleatorio no está entre 10 y 60.");
        }
    }
}
        
        
    
