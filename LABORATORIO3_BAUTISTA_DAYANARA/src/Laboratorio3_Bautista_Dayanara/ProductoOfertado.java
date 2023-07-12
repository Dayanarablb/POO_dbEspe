package Laboratorio3_Bautista_Dayanara;

public class ProductoOfertado extends Producto {//CLASE HIJA 
	//Atributos
	 private int dias;
	 //Constructor - Paso de parametros
	    public ProductoOfertado(String nombre, double precio, int dias) {
	        super(nombre, precio);//herencia de la clase producto 
	        this.dias = dias;
	    }
	    //Metodos get y set

	    public int getDias() {
	        return dias;
	    }
	    public void setDias(int dias) {
	        this.dias = dias;
	    }
	}

