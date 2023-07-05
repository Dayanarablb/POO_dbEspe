package POO_U2_P13_CLASE_ABSTRACTA;

public class Circulo extends Figura{
double radio;

public Circulo(double radio) {
	this.radio=radio;
	
}

public Circulo (double radio, double x, double y) {
	super(x, y);
	this.radio=radio;
}
	@Override
	public double CalcularArea() {
		double pi=3.1416;
		double result= pi*radio*radio;
		return result;
	}

}
