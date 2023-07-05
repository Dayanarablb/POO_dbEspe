package POO_U2_P13_CLASE_ABSTRACTA;

public class Cuadrado extends Figura {
	
	//Atrbutos nuevos
	double lado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(double lado, double x, double y) {
		super(x, y);
		this.lado=lado;
	}

	@Override //Redefinimos el metodo
	public double CalcularArea() {
		double resultado = lado*lado;
		return resultado;
	}//todas las clases hijas deben tener el metodo abstracto por lo menos uno
	
	
}
