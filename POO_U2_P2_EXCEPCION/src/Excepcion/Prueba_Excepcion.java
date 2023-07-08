package Excepcion;

public class Prueba_Excepcion {
	
	public static void main (String args []) {
		
		int numero[]=new int[5];
		try {
			
		numero[7]=0;
		}
		
		catch(java.lang.ArrayIndexOutOfBoundsException Error) {
			System.out.println("Se genero una excepcion al acceder al arreglo");
		}
	}

}
