
package poo_u2_p11_sobreescritura;


public class POO_U2_P11_SOBREESCRITURA {

    
    public static void main(String[] args) {
        //Instanciamos
        
        Persona per1 = new Persona();
        Gato gat1 = new Gato ();
        //Va a tomar el metodo que estoy redefiniendo con @Override
        per1.Comer();
        gat1.Comer();
       
    }
    
}
