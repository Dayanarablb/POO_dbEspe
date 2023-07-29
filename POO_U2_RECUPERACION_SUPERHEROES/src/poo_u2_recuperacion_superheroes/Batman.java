
package poo_u2_recuperacion_superheroes;

import java.util.Scanner;


public class Batman extends Superheroes{
    //Nuevo Atributo
    String colorcapa;
    //Constructor
    public Batman (String sexo, int nivelFuerza, String Poderes, String colorcapa ) {
    super(sexo, nivelFuerza, Poderes);
    this.colorcapa =colorcapa;
}

public String getColorcapa() {
        return colorcapa;
}   
@Override
public void SalvarMundo() {
Scanner sc = new Scanner(System.in);
System.out.println("============= Superheroe Batman ===============");
System.out.println("Sexo: "+getSexo());
System.out.println("nivelFuerza: "+getNivelFuerza());
System.out.println("Poderes que necesita de Batman: "+getPoderes());
System.out.println("Color de la capa de Bataman para la mision: "+getColorcapa());
			
//Niveles de Fuerza
//Nivel 4 : Tiene suficiente fuerza y no se desgasta
//Nivel 3: Tiene que comer para tener la fuerza suficiente para salvar al mundo
//Nivel 2: Tiene que dormir 8 para poder lograr salvar al mundo;
//Nivel 1: Tiene que recargarse completamente para poder ir a la mision; 
		
if(nivelFuerza==4) {
System.out.println("Batman esta Listo para Salvar al mundo!");
}else if (nivelFuerza<3 && nivelFuerza==3) {
System.out.println("Batman tiene que comer y dormir para poder Salvar al mundo, Deseas esperarlo?");
}else if(nivelFuerza==1) {
System.out.println("Por ahora Batman no puede Salvar al mundo :(");
}			
}		
}
		

