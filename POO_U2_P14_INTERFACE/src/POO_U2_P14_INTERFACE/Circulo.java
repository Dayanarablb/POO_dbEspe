package POO_U2_P14_INTERFACE;

public class Circulo implements Figura, Dibujar, Rotar {
	double radio;
	
	

	public Circulo(double radio) {
	this.radio=radio;
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() {
		double pi=3.1416;
		double resul=pi*radio*radio;
		return resul;
	}

	@Override
	public void rotar() {
		System.out.println("Usted si rueda");
		
	}

	@Override
	public void dibujar() {
		System.out.println("Vas a dibujar");
		
	}

}
