package POO_U2_P14_INTERFACE;

public class Cuadrado implements Figura, Dibujar {//Estoy implementando los metodos de la clase padre figura y dibujar
	double lado;
	
	public Cuadrado (double lado) {
		this.lado=lado;
	}

	@Override
	public double calcularArea() {
		double respuesta=lado*lado;
		return respuesta;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

}
