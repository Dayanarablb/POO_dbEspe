package sistemapago;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//INSTANCIAR - CREAR OBJETOS
		Scanner sc = new Scanner (System.in);
		int opc=0;
		
		do {
			//MENU DE OPCIONES 
			System.out.println(" MENU DE OPCIONES ");
			System.out.println(" 1. DOCENTE ");
			System.out.println(" 2. TECNICO ");
			System.out.println(" 3. ADMINISTRATIVO ");
			System.out.println(" 4. LIMPIEZA ");
			System.out.println(" 5. SALIR ");
			System.out.println("Ingrese una opcion: ");
			opc = sc.nextInt();
			sc.nextLine();
			
			switch(opc) {
			//AQUI PDIO LOS DATOS AL PERSONAL 
			case  1:
				System.out.println("Ingrese su nombre: ");
				String nombre= sc.nextLine();
				System.out.println("Ingrese su edad: ");
				int edad= sc.nextInt();
				System.out.println("Ingrese su cedula: ");
				String cedula= sc.nextLine();
				sc.nextLine();
				System.out.println("Ingrese su salario: ");
				double salario= sc.nextDouble();
				sc.nextLine();
				System.out.println("Ingrese su Telefono: ");
				String Telefono= sc.nextLine();
				System.out.println("Ingrese su Nivel: ");
				int nivel= sc.nextInt();
				//INSTANCIO
				Docente doc = new Docente (nombre, edad, cedula, salario, Telefono, nivel);
				doc.CalcularPago(salario);
				doc.mostrarSalarioTotalDocente();		
			break;
			
			case 2:
				System.out.println("Ingrese su nombre: ");
				String nombret= sc.nextLine();
				System.out.println("Ingrese su edad: ");
				int edadt= sc.nextInt();
				System.out.println("Ingrese su cedula: ");
				String cedulat= sc.nextLine();
				System.out.println("Ingrese su salario: ");
				double salariot= sc.nextDouble();
				sc.nextLine();
				System.out.println("Ingrese su Telefono: ");
				String Telefonot=sc.nextLine();
				System.out.println("Ingrese cuantos años de experiencia tiene entre 3 - 4: ");
				int Experienciat= sc.nextInt();
				//INSTANCIO
				Tecnico tec = new Tecnico (nombret, edadt, cedulat, salariot, Telefonot,Experienciat);
				tec.CalcularPago(salariot);
				tec.mostrarSalarioTotalTecnico();	
			break;
			
			case 3:
				System.out.println("Ingrese su nombre: ");
				String nombrea= sc.nextLine();
				System.out.println("Ingrese su edad: ");
				int edada= sc.nextInt();
				System.out.println("Ingrese su cedula: ");
				String cedulaa= sc.nextLine();
				System.out.println("Ingrese su salario: ");
				double salarioa= sc.nextDouble();
				sc.nextLine();
				System.out.println("Ingrese su Telefono: ");
				String Telefonoa= sc.nextLine();
				System.out.println("Ingrese el tiempo que lleva en la empresa (Año): ");
				int tiempoEmpresa= sc.nextInt();
				//INSTANCIO
				Administrativo add = new Administrativo (nombrea, edada, cedulaa, salarioa, Telefonoa, tiempoEmpresa);
				add.CalcularPago(salarioa);
				add.mostrarSalarioTotalTecnico();
				
			break;
			
			case 4:
				System.out.println("Ingrese su nombre: ");
				String nombreL= sc.nextLine();
				System.out.println("Ingrese su edad: ");
				int edadL= sc.nextInt();
				System.out.println("Ingrese su cedula: ");
				String cedulaL= sc.nextLine();
				System.out.println("Ingrese su salario: ");
				double salarioL= sc.nextDouble();
				sc.nextLine();
				System.out.println("Ingrese su Telefono: ");
				String TelefonoL= sc.nextLine();
				System.out.println("Ingrese los dias extras que ha trabajado: ");
				int diasExtras= sc.nextInt();
				Limpieza lim = new Limpieza (nombreL, edadL, cedulaL, salarioL, TelefonoL, diasExtras);
				lim.CalcularPago(salarioL);
				lim.mostrarSalarioTotalTecnico();
			case 5:
				System.out.println("SALIR");
				default:
					System.out.println("NO EXISTE ESA OPCION, VUELVA A INTENTAR");
			break;
			}
		}while(opc!=5);	
	}
}
