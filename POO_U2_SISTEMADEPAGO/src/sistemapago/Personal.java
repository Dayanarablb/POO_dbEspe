package sistemapago;

public abstract class Personal {//CLASE ABSTRACTA - CLASE PADRE
	//ATRIBUTOS
		private String nombre;
		private int edad;
		private String cedula;
		private double salario;
		private String telefono;
		
		//CONSTRUCTOR
		public Personal (String nombre, int edad, String cedula, double salario, String telefono) {
			this.nombre=nombre;
			this.edad=edad;
			this.cedula=cedula;
			this.salario=salario;
			this.telefono=telefono;	
		}
		//METODO ABSTRACTO
		public abstract double CalcularPago(double SalarioTotal);
		
		//METODOS GETTERS AND SETTERS

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

}
