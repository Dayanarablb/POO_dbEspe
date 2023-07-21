package sistemapago;

public class Administrativo extends Personal {
	//Atributos
	private int tiempoEmpresa;
	
	//Constructor
	public Administrativo(String nombre, int edad, String cedula, double salario, String telefono, int tiempoEmpresa) {
		super(nombre, edad, cedula, salario, telefono);
		this.tiempoEmpresa=tiempoEmpresa;
	}
	@Override
	public double CalcularPago(double SalarioTotal) {
		int añosenEmpresa= tiempoEmpresa - 2023;
		
		SalarioTotal = getSalario()*100/12;
		
		if(añosenEmpresa>=15 || añosenEmpresa==26) {
			
			System.out.println("Salario total: "+SalarioTotal);
			
		}else if(añosenEmpresa == 10) {
			
			SalarioTotal*=100/11;
			
			System.out.println("Salario total: "+SalarioTotal);	
		}
		return SalarioTotal;
	}
	public void mostrarSalarioTotalTecnico() {
		System.out.println("====SALARIO ADMINISTRATIVO=======");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Edad: "+getEdad());
		System.out.println("Cedula: "+getCedula());
		System.out.println("Salario: "+getSalario());
		System.out.println("Telefono: "+getTelefono());
		
    }
}
