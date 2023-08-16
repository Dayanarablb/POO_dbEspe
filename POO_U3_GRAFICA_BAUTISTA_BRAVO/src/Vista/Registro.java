/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;


/**
 *
 * @author Administrador
 */
public class Registro extends JFrame {
    //Creamos una ventana grafica con JFrame
    //Indagar el API de Java - Libreria JFRAME
    public JPanel panel;//Esto controla todo lo que va en la ventana registro - Coloco el panel aqui para utilizarlo en todas las funciones o metodos
    public Registro(){//Dentro del panel habra una ventana llamada registro
        this.setSize(500,500);
        //El titulo en la ventana SERA REGISTRO
        setTitle("REGISTRO");
        //TODOS ESTOS COMANDOS ESTAN EN EL API DE JAVA
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema
        
    //CENTRAR LA VENTANA 
    //setBounds(500,200,500,500);//Estoy dando dimension para esta pantalla - Aqui estoy dando las coordenadas para que se sentren - Esto solo hara que se centre solo en mi pantalla
    //Centrar para toda pantalla
    setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
    iniciarComponentes();
    }
    //Funcion de componentes
    //Metodo para llamar a todos los componentes como botones - cajas de texto - texto
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarBotones();
        ColocarCajaTexto();
        colocarAreaTexto();
        
    }
    //Metodo para colocar panel
    private void colocarPanel(){
        panel = new JPanel();
        //lE DAMOS UN COLOR AL PANEL 
        panel.setBackground(Color.MAGENTA);
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);//add. agregro panel     
    }
    //Metodo en donde se crean etiquetas
    public void colocarEtiquetas(){
        //Esto es un Label
        JLabel label = new JLabel("REGISTRAR",SwingConstants.CENTER);
        //Inscrustamos
        panel.add(label);
        //bloqueamos los diseños para hacer diseños propios
        panel.setLayout(null);//anulamos el diseño del panel que viene por defecto
        label.setBounds(100, 10,350,50);//Cambia el lugar en donde esta el texto
        //Color de fondo de la etiqueta
        label.setForeground(Color.BLUE);
         //panel.setBackground(Color.ORANGE);
         label.setOpaque(true); //Api de java - Jlabel - y ahi esta todo
         //Creamos Objeto
         JLabel labell = new JLabel();
         labell.setText("NOMBRE");
         //AGREGAMOS LA ETIQUETA AL PANEL
         panel.add(labell);
         //Ubicamos la etiqueta
         labell.setHorizontalAlignment(HEIGHT);
         //Cambiar la Fuente
         labell.setForeground(Color.BLUE);
         labell.setFont(new Font("arial",Font.PLAIN, 20));
         labell.setBounds(30, 110,350,50);
         //PONER IMAGEN
         JLabel labelimagen=new JLabel();
         ImageIcon imagen =new ImageIcon("registro.jfif");
         labelimagen.setBounds(20, 70, 100, 50);
         panel.add(labelimagen);
         
         labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(), Image.SCALE_SMOOTH)));
         
    }
    public void ColocarBotones(){
        JButton boton = new JButton("CLICK");
        boton.setBounds(30,310,100,50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
       
        
         JButton boton1 = new JButton("imagen");
         ImageIcon imagen1 =new ImageIcon("boton.jfif");
         
        boton1.setBounds(150,310,100,50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('b');
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(), Image.SCALE_SMOOTH)));
         
    }
     //Comando para volovar caja de texto
    public void ColocarCajaTexto(){
    JTextField cajaTexto1 = new JTextField();
    cajaTexto1.setBounds(65,200,350,50);
    panel.add(cajaTexto1);
    cajaTexto1.setText("POO");
    System.out.println("El texto de la caja es: "+cajaTexto1.getText());
    }
    
    public void colocarAreaTexto(){
        JTextArea textarea1 = new JTextArea();
         textarea1.setBounds(130,130,250,150);
         panel.add(textarea1);
         textarea1.setText("POO");
         textarea1.append("\n Escribir aqui....");
         
         //Comandos para crear Scroll en una area de texto
         JScrollPane barra = new JScrollPane(textarea1);
         //Scroll vertical
         barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
         //Scroll HORIZONTAL
         barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         textarea1.setBounds(65,380,350,50);
         panel.add(barra);
         
    }
    
}

