
package practica7_poo_u2;


public class Motocicleta extends Vehiculo{
    
    boolean patada;//para que herede los atributos de la clase padre tenemos que poner despues del nombre m,otocicleta el comando extends y lllamammos a la clase vehiculo
    //estoy diciendo que es una extencion de la clase vehiculo
    @Override//comado que dice que estamos herendando estos metodos de la clase padre (Vehiculo) nos dice que los podemos utilizar 
    public void encendido (){
    encendido = true;
    estado = "Vehiculo encendido";
    }
    //metodo apagado
    public void apagado(){
    encendido = false;
    estado = "Vehiculo apagado";
    }
}
