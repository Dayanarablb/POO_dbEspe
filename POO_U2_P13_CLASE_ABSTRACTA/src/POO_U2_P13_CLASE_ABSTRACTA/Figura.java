package POO_U2_P13_CLASE_ABSTRACTA;

public abstract class Figura {//clase abstracta
	
	//Sus atributos pueden ser de tipo publico y protec
	double x;
	double y;
	
	//Constructor
	public Figura () {
		
	}
	
	public Figura(double x, double y) {
		this.x= x;
		this.y=x;
		
	}
	//Metodo abstracto
	
	public abstract double CalcularArea(); //aqui no se utilizan llaves

}
