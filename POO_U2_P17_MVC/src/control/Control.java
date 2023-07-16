
package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Control implements ActionListener {
    private Vista view;
    private Modelo model;
    
    public Control (Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
        
    }
    public void iniciar(){
        this.view.setTitle("USTED VA A REALIZAR OPERACIONES POR MEDIO MVC ");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResultado.setText(String.valueOf(model.getTotal()));
   }
    
    @Override
    public void actionPerformed(ActionEvent e){
    model.setV1(Integer.valueOf(view.txtN1.getText()));
    model.setV2(Integer.valueOf(view.txtN2.getText()));
    if(e.getSource()==view.btnSumar){
    model.Sumar();
    }
    if(e.getSource()==view.btnRestar){
        model.Restar();
    }
    if(e.getSource()==view.btnMultiplicar){
        model.Multiplicar();
    }
    
    if(e.getSource()==view.btnDividir){
        model.Dividir();
    }
    view.txtResultado.setText(String.valueOf(model.getTotal()));
}
   
    
}
