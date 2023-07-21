package sistemapago;

public class Tecnico extends Personal {
	//ATRIBUTOS
	int Experiencia;
	
	//Constructor
	public Tecnico(String nombre, int edad, String cedula, double salario, String telefono, int Experiencia) {
		super(nombre, edad, cedula, salario, telefono);
		this.Experiencia=Experiencia;
		
	}
	@Override
	public double CalcularPago(double SalarioTotal) {
		SalarioTotal = getSalario()*100/13;
		if(Experiencia==4 && Experiencia >=3) {
			System.out.println("Salario total: "+SalarioTotal);
		}else if(Experiencia >=2) {
			SalarioTotal*=100/10;
			System.out.println("Salario total: "+SalarioTotal);	
		}
		return SalarioTotal;
	}
	public void mostrarSalarioTotalTecnico() {
		System.out.println("====SALARIO TECNICO=======");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Edad: "+getEdad());
		System.out.println("Cedula: "+getCedula());
		System.out.println("Salario: "+getSalario());
		System.out.println("Telefono: "+getTelefono());
	}
}
