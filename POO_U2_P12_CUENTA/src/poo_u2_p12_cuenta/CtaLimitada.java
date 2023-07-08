
package poo_u2_p12_cuenta;


public class CtaLimitada extends Cuenta{
    int Deposito;
    int Retiro;
    
    public CtaLimitada(int deposito, int retiro, String usuario, int cedula, String contraseña){
        super(usuario);
    this.Deposito = deposito;
    this.Retiro = retiro;   
        
    }
    //Metodos 
    public void Deposito(int deposito){
        System.out.println("Usted ha realizado un deposito de: "+ deposito);
        
    }
    public void Retiro (int retiro){
       if(retiro>=10 && retiro<=300){
           System.out.println("Su retiro es de: "+retiro);
       }else{
           System.out.println("No pude retirar mas de $300");
       }
    }
    
}
