
package poo_metodos_parametros_argumentos;


public class Operacion {

    //Atributos
    int suma;
    int resta;
    int dividir;
    int multiplicar;
    //Metodos
    }
    //metodo para sumar los dos numeros
    public void sumar(int num1, int num2){
        suma = num1+num1;
    
    }
    //metodo para restar dos numeros
    public void restar (int num1, int num2){
        resta = num1-num2;
    
    }
    //metodo para dividir dos numeros
    public void division (int num1, int num2){
        dividir = num1/num2;
    
    }
    //metodo para multilicar dos numeros
    public void multiplicacion (int num1, int num2){
        multiplicar = num1*num2;
   
    }
    public void mostrarResultados(){
    System.out.println("El resultado de la suma es:"+suma);
    System.out.println("El resultado de la resta es:"+resta);
    System.out.println("El resultado de la division es:"+dividir);
    System.out.println("El resultado de la multiplicacion es:"+multiplicar  );
    }   
    
}
