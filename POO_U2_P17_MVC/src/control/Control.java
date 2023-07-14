
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo;
import vista.Vista;

public class Control implements ActionListener {
    
    private Vista view;
    private modelo model;
    
    public Control (Vista view, modelo model){
        this.model=model;
        this.view=view;
        this.view.btSumar.addActionListener(this);
        
    }
    public void Iniciar(){
        view.setTitle("Usted va a sumar por medio de MVC");
        view.setLocationRelativeTo(view);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN1.setText(String.valueOf(model.getV2()));
        view.txtResultado.setText(String.valueOf(model.getTotal()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
       
        model.setV1(Integer.valueOf(view.txtN1.getText()));
        model.setV2(Integer.valueOf(view.txtN1.getText()));
        model.sumar();
        model.restar();
        model.multiplicar();
        model.dividir();
        view.txtResultado.setText(String.valueOf(model.getTotal()));
        
    }
}

