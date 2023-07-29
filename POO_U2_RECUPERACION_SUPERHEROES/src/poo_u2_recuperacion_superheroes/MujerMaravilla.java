
package poo_u2_recuperacion_superheroes;

import java.util.Scanner;


public class MujerMaravilla extends Superheroes {
    //Atributos
    double porcentajeBelleza;
    //Constructor
    public MujerMaravilla (String sexo, int nivelFuerza, String Poderes, double porcentajeBelleza ) {
	super(sexo, nivelFuerza, Poderes);
	this.porcentajeBelleza = porcentajeBelleza;
    }

//MetodoAbstracto
@Override
public void SalvarMundo() {
Scanner sc = new Scanner(System.in);
System.out.println("============= Superheroe Batman ===============");
System.out.println("Sexo: "+getSexo());
System.out.println("nivelFuerza: "+getNivelFuerza());
System.out.println("Poderes que necesita de la Mujer Maravilla para la mision: "+getPoderes());
				
//Niveles de Fuerza
//Nivel 4 : Tiene suficiente fuerza y no se desgasta
//Nivel 3: Tiene que comer para tener la fuerza suficiente para salvar al mundo
//Nivel 2: Tiene que dormir 8 para poder lograr salvar al mundo;
//Nivel 1: Tiene que recargarse completamente para poder ir a la mision; 
			
if(nivelFuerza==4) {
System.out.println("La Mujer Maravilla esta Lista para Salvar al mundo!");
}else if (nivelFuerza<3 && nivelFuerza==3) {
System.out.println("La mujer maravilla tiene que comer y dormir para poder Salvar al mundo,  Deseas esperarla?");
}else if(nivelFuerza==1 || porcentajeBelleza==0.79 ) {
System.out.println("La mujer maravilla no tiene tanta fuerza, pero si tu mision es sobre conquista, ella esta preparada!");
}
					
}
			
}	
		
    

