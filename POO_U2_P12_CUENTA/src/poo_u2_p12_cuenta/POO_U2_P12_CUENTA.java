
package poo_u2_p12_cuenta;


public class POO_U2_P12_CUENTA {

    
    public static void main(String[] args) {
        
        Cuenta cta = new Cuenta("Dayanara");
        cta.Saldo();
        Cuenta cta1 = new Cuenta (23564, "*********");
        cta1.Saldo("456,51");
        CtaLimitada clim = new CtaLimitada(25, 50, "Dayanara", 23564, "********");
        clim.Deposito(20);
        CtaLimitada clim1 = new CtaLimitada(25, 50, "Dayanara", 23564, "********");
        clim1.Retiro(50);
    }
    
}
