package sistemapago;

public class Docente extends Personal {
	//NUEVO ATRIBUTO
	private int nivel;
	
	//CONSTRUCTOR
	public Docente(String nombre, int edad, String cedula, double salario, String telefono, int nivel) {
		super(nombre, edad, cedula, salario, telefono);
		this.nivel=nivel;
		
	}

	@Override
	public double CalcularPago(double SalarioTotal) {
		
		if (nivel == 6 || nivel >=4) {
			SalarioTotal = getSalario()*100/15;
			System.out.println("Salario Total: "+SalarioTotal);
		}else {
			System.out.println("Su salario sigue siendo:" +getSalario());
		}
		return SalarioTotal;
	}
	
	public void mostrarSalarioTotalDocente() {
		System.out.println("====SALARIO DOCENTE=======");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Edad: "+getEdad());
		System.out.println("Cedula: "+getCedula());
		System.out.println("Salario: "+getSalario());
		System.out.println("Telefono: "+getTelefono());
	}	
}
	