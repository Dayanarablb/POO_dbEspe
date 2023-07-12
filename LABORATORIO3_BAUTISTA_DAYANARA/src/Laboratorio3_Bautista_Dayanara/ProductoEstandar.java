package Laboratorio3_Bautista_Dayanara;

public class ProductoEstandar extends Producto {//Heredo tributos y metodos de la clase padre Producto - CLASE HIJA
	//Atributos
	private String seccion;
	//Constructor
	public ProductoEstandar(String nombre, double precio, String seccion) {
		super(nombre, precio);//Herencia de la clase producto 
		this.seccion=seccion;	
	}
	//Metodos
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}





