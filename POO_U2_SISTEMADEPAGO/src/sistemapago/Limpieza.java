package sistemapago;

public class Limpieza extends Personal { 
	//ATRIBUTOS
	private int diasExtras;
	
	//CONSTRUCTOR
	public Limpieza(String nombre, int edad, String cedula, double salario, String telefono, int diasExtras) {
		super(nombre, edad, cedula, salario, telefono);
		this.diasExtras=diasExtras;
	}
	
	@Override
	public double CalcularPago(double SalarioTotal) {
	
		SalarioTotal = getSalario()*100/20;
		
		if(diasExtras>=6 || diasExtras ==4) {		
			System.out.println("Salario total: "+SalarioTotal);	
		}else {
			System.out.println("No ha hecho  ningun merito entonces su Salario es: "+SalarioTotal);	
		}
		return SalarioTotal;
	}
	public void mostrarSalarioTotalTecnico() {
		System.out.println("==== SALARIO LIMPIEZA =======");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Edad: "+getEdad());
		System.out.println("Cedula: "+getCedula());
		System.out.println("Salario: "+getSalario());
		System.out.println("Telefono: "+getTelefono());	
    }

}
