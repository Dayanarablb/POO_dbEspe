package operadores.relacionales;

public  class  Operadores_Relacionales {


    public  static  void  main ( String [] args ) {
        //Operadores relacionales comunes 
        //igual==, diferente !=, mayor >,mayor igual >= ,menor <, menor igual <=
        //Declaramos variables
        int  valor1 = 1 ; //variables de tipo entero
        int  valor2 = 4 ;
        System.out.println(valor1 == valor2);//false
        System.out.println(valor1 < valor2);//true
        System.out.println(valor1 > valor2);//false
        System.out.println(valor1 <= valor2);//true
        System.out.println(valor1 >= valor2);//true

        //Java compara ambas variables o ambas anotaciones con el operador relacional que usemos.
    }

}
