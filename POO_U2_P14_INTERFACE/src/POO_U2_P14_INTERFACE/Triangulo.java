package POO_U2_P14_INTERFACE;

public class Triangulo implements Figura, Dibujar {
	double base;
	double altura;
	
	public Triangulo (double base, double altura) {
		this.base=base;
		this.altura=altura;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularArea() {
		double multiplicacion = base *altura;
		double res=multiplicacion/2;
		return res;
	}

}




