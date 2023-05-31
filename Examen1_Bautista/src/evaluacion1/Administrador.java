
package evaluacion1;

import java.util.ArrayList;

public class Administrador {
	
	public ArrayList<String> arrGestionMatricula;//creamos un array para los profesores 
	
	//Creacion de Constructor
	public Administrador() {
		
		arrGestionMatricula = new ArrayList<>();
		
	}
	//Realizo el metodo para pedir los datos del profesor 
	public void Profesores(String nombre_Profesor, int cedula, String Direccion, int Telefono){
        GestionMatri nombre1 = new GestionMatri(nombre_Profesor, cedula,Direccion,Telefono);
        arrGestionMatricula.add(nombre1);
 
	}
	//Realizo metodo para pedir los datos del profesor 
	public void Alumnos(String nombre_Alumnos) {
		GestionMatri Alumno1 = new GestionMatri(nombre_Alumnos);
        arrGestionMatricula.add(Alumno1);
		
	}
	
}
