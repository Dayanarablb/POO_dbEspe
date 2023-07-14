
package poo_u2_p17_mvc;

import control.Control;
import modelo.modelo;
import vista.Vista;

public class POO_U2_P17_MVC {
    public static void main(String[] args) {
        
        modelo model = new modelo();
        Vista vist = new Vista();
        Control cont = new Control(vist, model);
        cont.Iniciar();
        vist.setVisible(true);       
    } 
}
                                  