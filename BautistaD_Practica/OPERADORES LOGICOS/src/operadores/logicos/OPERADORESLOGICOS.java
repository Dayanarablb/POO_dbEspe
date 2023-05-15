
package operadores.logicos;


public class OPERADORESLOGICOS {

    
    public static void main(String[] args) {
        //Los operadores logicos se los utiliza para construir condiciones completas
        //(y)AND: && Si se cumplen todad las condiciones el resultada es verdadero (true)
        //(o)OR: || si se cumple una o mas condiciones el resultado es verdadero (true)
        //NEGACION (NOT) != ,devuelve un valor contrario (true) (false)
        
        int  valor1 = 1 ; //variables de tipo entero
        int  valor2 = 4 ;
        System.out.println((valor1 == valor2)&&(valor1 != valor2));//false
        System.out.println((valor1 == valor2)||(valor1 != valor2));//true
        System.out.println((valor1 <= valor2)&&(valor1 == valor2));//false
        
    }
    
}
