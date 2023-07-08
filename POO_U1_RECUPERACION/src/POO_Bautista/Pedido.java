package POO_Bautista;

public class Pedido {
	private String nombreProducto;
    private Double PrecioUnitario;

    public Pedido(String nombreProducto, Double PrecioUnitario) {
        this.nombreProducto = nombreProducto;
        this.PrecioUnitario = PrecioUnitario;
      
    }
    public String getnombreProducto() {
        return nombreProducto;
    }

    public Double getPrecioUnitario() {
        return PrecioUnitario;
    }

}
