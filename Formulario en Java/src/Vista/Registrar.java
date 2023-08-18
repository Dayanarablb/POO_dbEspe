
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Registrar extends JFrame{/*En esta linea de codigo Registro viene a ser una subclase que hereda todas las funcionalidades la la clase padre JFrame
  y metodos proporcionados por JFrame*/
    public JPanel panel;
    public Registrar(){//Dentro del panel habra una ventana llamada registro
        this.setSize(500,500);
        setTitle("REGISTRO ESTUDIANTES");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema       
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
        iniciarComponentes(); 
        //Colocar un icono en el registro
        ImageIcon image = new ImageIcon("registroo.png");
        setIconImage(image.getImage());
        
}
    private void iniciarComponentes(){
       colocarPanel();
       colocarEtiquetas();
       ColocarCajaTexto();
       ColocarBotones();
    }
     private void colocarPanel(){
        panel = new JPanel();
        //lE DAMOS UN COLOR AL PANEL 
        panel.setBackground(new Color(123,50,250));//Color lila o solo podria utilizar Color.green
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);//add. agregro panel     
    }
     //Metodo en donde se crean etiquetas
    public void colocarEtiquetas(){
        //Esto es un Label
        JLabel label = new JLabel("REGISTRAR ESTUDIANTES",SwingConstants.CENTER);
        //Inscrustamos
        panel.add(label);
        //bloqueamos los diseños para hacer diseños propios
        panel.setLayout(null);//anulamos el diseño del panel que viene por defecto
        label.setBounds(125, 20,280,40);//Cambia el lugar en donde esta el texto
        //Color de fondo de la etiqueta
        label.setForeground(Color.black);//cOLOR DE LA LETRA REGISTRAR ESTUDIANTES
        label.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 20));
         //panel.setBackground(Color.ORANGE);
         label.setOpaque(true); //Api de java - Jlabel - y ahi esta todo
         //Creamos Objeto
         JLabel labell = new JLabel();
         labell.setText("NOMBRE");
         //AGREGAMOS LA ETIQUETA AL PANEL
         panel.add(labell);
         //Ubicamos la etiqueta
         labell.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         labell.setForeground(Color.black);
         labell.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         labell.setBounds(30, 90,350,50);
         //Agregar cedula Estudiante
         JLabel label3 = new JLabel();
         label3.setText("CEDULA");
         panel.add(label3);
         label3.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label3.setForeground(Color.black);
         label3.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label3.setBounds(30, 130,350,50);
         JLabel label4 = new JLabel();
         label4.setText("CARRERA");
         panel.add(label4);
         label4.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label4.setForeground(Color.black);
         label4.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label4.setBounds(30, 170,350,50);
         JLabel label5 = new JLabel();
         label5.setText("NIVEL");
         panel.add(label5);
         label5.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label5.setForeground(Color.black);
         label5.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label5.setBounds(30, 210,350,50);
         //PONER IMAGEN
         JLabel labelimagen=new JLabel();
         ImageIcon imagen =new ImageIcon("verificar.png");
         labelimagen.setBounds(18, 20, 100, 50);
         panel.add(labelimagen);
         labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(), Image.SCALE_SMOOTH)));     
    }
     public void ColocarCajaTexto(){
    JTextField cajaTexto1 = new JTextField();
    cajaTexto1.setBounds(120,100,200,30);
    panel.add(cajaTexto1);
    cajaTexto1.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto1.getText());
    JTextField cajaTexto2 = new JTextField();
    cajaTexto2.setBounds(120,139,200,30);
    panel.add(cajaTexto2);
    cajaTexto2.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto2.getText());
    JTextField cajaTexto3 = new JTextField();
    cajaTexto3.setBounds(120,179,200,30);
    panel.add(cajaTexto3);
    cajaTexto3.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto3.getText());
    JTextField cajaTexto4 = new JTextField();
    cajaTexto4.setBounds(120,219,200,30);
    panel.add(cajaTexto4);
    cajaTexto4.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto4.getText());
    }
      public void ColocarBotones(){
        JButton boton = new JButton("YES");
        boton.setBounds(30,310,100,50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
       
        
         JButton boton1 = new JButton("imagen");
         ImageIcon imagen1 =new ImageIcon("yes.png");
         
        boton1.setBounds(150,310,100,50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('b');
        boton1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(), Image.SCALE_SMOOTH)));
        
         JButton boton2 = new JButton("NOT");
        boton2.setBounds(30,380,100,50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('c');
       
        
         JButton boton3 = new JButton("imagen");
         ImageIcon imagen2 =new ImageIcon("not.png");
         
        boton3.setBounds(150,382,100,50);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('d');
        boton3.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(boton3.getWidth(),boton3.getHeight(), Image.SCALE_SMOOTH)));
    }
      
    
   
      
    
}
/*SwingConstants.LEFT: Alinea el contenido a la izquierda.
SwingConstants.CENTER: Alinea el contenido en el centro.
SwingConstants.RIGHT: Alinea el contenido a la derecha.
SwingConstants.LEADING: Alinea el contenido en función de la dirección del componente (izquierda en inglés, derecha en lenguajes que se escriben de derecha a izquierda).
SwingConstants.TRAILING: Alinea el contenido en función de la dirección del componente (derecha en inglés, izquierda en lenguajes que se escriben de derecha a izquierda).*/
