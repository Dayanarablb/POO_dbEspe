package poo_l1;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int num1;
    int num2;
    int sumar;
    int restar;
    int division;
    int multiplicacion;
    //Metodos
    public void capturarNumeros (){
    //metodo para pedir por pantalla los numeros
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero; "));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero; "));
    }
    //metodo para sumar los dos numeros
    public void sumar(){
    sumar = num1+num2;
    }
    //metodo para restar dos numeros
    public void restar (){
    restar = num1-num2;
    }
    //metodo para dividir dos numeros
    public void division (){
    division = num1/num2;
    }
    //metodo para multilicar dos numeros
    public void multiplicacion (){
    multiplicacion = num1*num2;
    }
    public void mostrarResultados(){
    System.out.println("El resultado de la suma es:"+sumar);
    System.out.println("El resultado de la resta es:"+restar);
    System.out.println("El resultado de la division es:"+division);
    System.out.println("El resultado de la multiplicacion es:"+multiplicacion);
    }   
}
