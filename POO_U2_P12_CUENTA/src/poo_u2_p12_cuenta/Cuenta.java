
package poo_u2_p12_cuenta;


public class Cuenta {
   String Usuario;
   private int Cedula;
   private String Contraseña;
   //Constructor 
   public Cuenta( String usuario){
       this.Usuario = usuario;    
   }
   //SOBRECARGA constructor 
   public Cuenta(int cedula, String contraseña){
       this.Cedula = cedula;
       this.Contraseña = contraseña;
   }
   //SOBRECARGA DE METODOS
   public void Saldo(){
       System.out.println("Usuario: "+ Usuario +" Su saldo es de:" );
   }
   public void Saldo(String Saldo){
       System.out.println(""+Saldo);
   } 
}
