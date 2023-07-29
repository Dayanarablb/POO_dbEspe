
package poo_u2_recuperacion_superheroes;

import java.util.Scanner;

public class Holk extends Superheroes {
    //Atributos
    String capacidad;
    //Constructor
    public Holk (String sexo, int nivelFuerza, String Poderes, String capacidad ) {
	super(sexo, nivelFuerza, Poderes);
	this.capacidad = capacidad;
	}
	
@Override
public void SalvarMundo() {
Scanner sc = new Scanner(System.in);
System.out.println("============= Superheroe MujerMaravilla ===============");
System.out.println("Holk es un superheroe muy Fuerte pero no siempre tiene un elevado nivel de Fuerza ya que se vuelve a convertir en humano");
//Por esta vez Holk solo va a poder cumplir misiones en la noche ya que que en el dia se vuelve a convertir en humano 
// desde las 8 hasta las 12 podra cumplir con las misiones que le pongan y salvara al mundo
//desde la 1 hasta las 7 su poder de revierte, vuelve a ser un humano y pierde toda la fuerza entonces de esta manera no podra salvar al mundo
int hora = 0;
if(hora>=8 || hora<=12){
    System.out.println("Holk esta preparado para salvar al mundo!");
}else{if(hora<=7 && hora>=11){
    System.out.println("Holk por ahora no tiene la capacidad necesaria para Salvar al mundo");
 }
            
}
}		
}



    

