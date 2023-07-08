
package poo1_arraylist_gestionnotass;
import java.util.ArrayList;

public class GestionNotass {
    // generamos un arreglo donde se guradan la snotas
   ArrayList<Double> notas;
   //estructura para guaradar la snotas 
   // creamos un costructor notas 
   public GestionNotass(){
       //instanciamos el arreglo
       notas=new ArrayList<>();
   }
   public void guardarNota (double n){
       // double es dato tipo primitivo
       //pero se puede usar como objeto
       notas.add(n);
   }
   public double media(){
       double media=0;
       //usamos un for 
       for(double d:notas){
           //sumamos las notas
           media+=d;
       }
       //retorna la media, recurriendo a los metodos de arrelist
       return media/notas.size();
   }
   
   public int aprobados(){
       //variable de control op
       int ap=0;
       //recorremos el arraylist
       //comprobamos que cada nota es mayor igual 14
       for(double d:notas){
           if(d>=14){
               //apmliamos la variable en una unidad 
               ap++;
           }
       }
       //se devuelve resultado ap
       return ap;   
}
    
}
