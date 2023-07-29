
package poo_u2_recuperacion_superheroes;

import java.util.Scanner;


public class POO_U2_RECUPERACION_SUPERHEROES {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int op;
    do{
        System.out.print("Vamos a Salvar al Mundo! , Estos son los superheroes disponibles:");
        System.out.println("\n//////////// SUPERHEROES //////////");
	System.out.println("1. Batman");
	System.out.println("2. Mujer Maravilla");
        System.out.println("3. Holk");
        System.out.println("4. No hay misiones");
        System.out.println("¿A que Superheroe necesitaras en esta mision, para salvar al mundo?");
        op = sc.nextInt();
        sc.nextLine();
        
        switch (op){
            case 1:
                System.out.println("Sexo: ");
		String sexo = sc.nextLine();
		System.out.println("Nivel de Fuerza: ");
		int nivelFuerza = sc.nextInt();
                sc.nextLine(); 
		System.out.println("Poderes: ");
		String Poderes = sc.nextLine();
		System.out.println("Ingrese el color de Capa con el que desea ver a Batman: ");
		String colorcapa = sc.nextLine();
		Batman bt = new Batman (sexo, nivelFuerza, Poderes, colorcapa);
		bt.SalvarMundo();
		break;
                
            case 2:
                System.out.println("Sexo: ");
		String sex = sc.nextLine();
		System.out.println("Nivel de Fuerza: ");
		int nivelFuerz = sc.nextInt();
                sc.nextLine(); 
		System.out.println("Poderes: ");
		String Pode = sc.nextLine();
		System.out.println("Porcentaje de Belleza que necesita de la mujer maravilla: ");
		double porcentajeBelleza = sc.nextDouble();
		MujerMaravilla mm = new MujerMaravilla (sex, nivelFuerz, Pode, porcentajeBelleza);
		mm.SalvarMundo();
		break;
            
            case 3: 
                System.out.println("Sexo: ");
		String sexo_ = sc.nextLine();
		System.out.println("Nivel de Fuerza: ");
		int nivelFuerza_ = sc.nextInt();
                sc.nextLine(); 
		System.out.println("Poderes: ");
		String Poderes_ = sc.nextLine();
                System.out.println("Ingresa que capacidades necesitas que tenga Holk para la mision: ");
                String capacidad= sc.nextLine();
		Holk hol = new Holk (sexo_, nivelFuerza_, Poderes_, capacidad);
		hol.SalvarMundo();
		break;
            
            case 4: 
                System.out.println("Gracias por confiar en nuestros Superheroes");
            default:System.out.println("Opcíon inválida. Intente nuevamente");
        }        
        }while (op != 4);
	sc.close();		
}    
}




