package Laboratorio3_Bautista_Dayanara;

public class Producto {//CLASE PADRE
	//ATRIBUTOS
	String nombre; //VARIABLE NOMBRE DE TIPO STRING 
	double precio;//VARIABLE PRECIO DE TIPO DOUBLE
	//CONSTRCUTOR
		public Producto(String nombre, double precio) {//DEFINO PARAMETROS
			this.nombre= nombre;
			this.precio=precio;	
		}
		//METODOS GET Y SET
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {//DECLARO UNA VRIABLE NOMBRE DE TIPO STRING 
			this.nombre=nombre;
		}

		public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio=precio;
	    }		
		//METODO PA OBTENER EL PRCIO DEL PRODUCTO PEDIDO
		
		public double ObtenerPrecioPedido(int PedidoUnidades) {//DECLARO UNA VARIABLE PEDIDO UNIDADES DE TIPO ENTERO
			
			 double precioFinal = 0;
			 
               //DESCUENTO PARA LOS PRODUCTOS SI SON ESTANDAR
		        if (this instanceof ProductoEstandar) {
		        	//Condicional if para aplicar descuento segun las reglas del negocio del ejercicio
		            if (PedidoUnidades >= 5) {//
		                precioFinal = PedidoUnidades * precio * 1/10; //SI EL PRODUCTO ES ESTANDAR APLICA UN 10% DE DESCUENTO SI LAS UNIDADES SON IGUALES O SUPERIORES A 5
		            //
		            } else {
		                precioFinal = PedidoUnidades * precio;
		            }
		        } else if (this instanceof ProductoOfertado) {
		            int diasRestantes = ((ProductoOfertado) this).getDias();
		            if (diasRestantes == 1) {
		                precioFinal = PedidoUnidades * precio * 1/20; //DESCUENTO DEL 20%
		            } else if (diasRestantes >= 2 && diasRestantes <= 3) {
		                precioFinal = PedidoUnidades * precio * 1/15; //15% DESCUENTO
		            } else if (diasRestantes > 3) {
		                precioFinal = PedidoUnidades * precio * 1/10; //10% DESCUENTO 
		            }
		        }

		        return precioFinal;
		    }
		}

		

		
		
