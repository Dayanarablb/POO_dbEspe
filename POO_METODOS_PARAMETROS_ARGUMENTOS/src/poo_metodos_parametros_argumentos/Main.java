
package poo_metodos_parametros_argumentos;

import javax.swing.JOptionPane;


public class Main {
  public static void main (String [] args){
      
      int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
      int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
      
      Operacion ope = new Operacion ();
      ope.suma(num1, num2);
      ope.resta(num1, num2);
      ope.dividir(num1, num2);
      ope.multiplicar(num1, num2);
      
      ope.mostrarResultados();
  }  
}
