
package Vista;

import Control.Conexion;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Horario extends JInternalFrame{
    private Conexion conexionEstudiante;
    private JPanel panel;
    private JTextField cajaTexto1;
    private JTextField cajaTexto2;
    private JTextField cajaTexto3;
    private JTextField cajaTexto4;
    private JTextField cajaTexto5;
    private JTextField cajaTexto6;
    private JTextField cajaTexto7;
    private JComboBox combonumLabo;
    private JComboBox horalab;
    private DefaultTableModel tablaModel;
    private JTable jtabla;
    
    public Horario(){
        conexionEstudiante = new Conexion();
        
        this.setSize(1200,700);
        setTitle("HORARIOS");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema       
        //setBounds(500,200,500,500);
        //setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
        iniciarComponentes(); 
        //Colocar un icono en el registro
        ImageIcon image = new ImageIcon("hora.png");
        //setIconImage(image.getImage());   
        
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarCajaTexto();
        Tabla();
        ColocarBotones();
    }
    private void colocarPanel(){
        panel = new JPanel();
        //lE DAMOS UN COLOR AL PANEL 
        panel.setBackground(new Color(102,43,9));//Color lila o solo podria utilizar Color.green
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);//add. agregro panel     
    }
    public void colocarEtiquetas(){
        //Esto es un Label
        JLabel label = new JLabel("HORARIOS LABORATORIOS",SwingConstants.CENTER);
        //Inscrustamos
        panel.add(label);
        //bloqueamos los diseños para hacer diseños propios
        panel.setLayout(null);//anulamos el diseño del panel que viene por defecto
        label.setBounds(125, 20,280,40);//Cambia el lugar en donde esta el texto
        //Color de fondo de la etiqueta
        label.setForeground(Color.BLACK);//cOLOR DE LA LETRA REGISTRAR ESTUDIANTES
        label.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 20));
         //panel.setBackground(Color.ORANGE);
         label.setOpaque(true); //Api de java - Jlabel - y ahi esta todo
         //PONER IMAGEN
         JLabel labelimagen=new JLabel();
         ImageIcon imagen =new ImageIcon("imagenhora.png");
         labelimagen.setBounds(18, 20, 100, 50);
         panel.add(labelimagen);
         labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(), Image.SCALE_SMOOTH))); 
         
         //Creamos Objeto
        JLabel labell = new JLabel();
         labell.setText("CODIGO");
         //AGREGAMOS LA ETIQUETA AL PANEL
         panel.add(labell);
         //Ubicamos la etiqueta
         labell.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         labell.setForeground(Color.WHITE);
         labell.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         labell.setBounds(30, 90,350,50);
         //Agregar cedula Estudiante
         JLabel label3 = new JLabel();
         label3.setText("MATERIA");
         panel.add(label3);
         label3.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label3.setForeground(Color.WHITE);
         label3.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label3.setBounds(30, 130,350,50);
         JLabel label4 = new JLabel();
         label4.setText("N° LABORATORIO");
         panel.add(label4);
         label4.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label4.setForeground(Color.WHITE);
         label4.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label4.setBounds(400, 90,350,50);
         JLabel label5 = new JLabel();
         label5.setText("RESPONSABLE");
         panel.add(label5);
         label5.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label5.setForeground(Color.WHITE);
         label5.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label5.setBounds(400, 130,350,50);
         
         JLabel label6 = new JLabel();
         label6.setText("HORA");
         panel.add(label6);
         label6.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label6.setForeground(Color.WHITE);
         label6.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label6.setBounds(30, 170,350,50);
         
         JLabel label7 = new JLabel();
         label7.setText("FECHA");
         panel.add(label7);
         label7.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label7.setForeground(Color.WHITE);
         label7.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label7.setBounds(30, 210,350,50);
         
         JLabel label8 = new JLabel();
         label8.setText("CAPACIDAD");
         panel.add(label8);
         label8.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label8.setForeground(Color.WHITE);
         label8.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label8.setBounds(400, 170,350,50);
             
    }
    public void ColocarCajaTexto(){
        
    cajaTexto1 = new JTextField();
    cajaTexto1.setBounds(120,100,200,30);
    panel.add(cajaTexto1);
    cajaTexto1.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto1.getText());
    
    cajaTexto2 = new JTextField();
    cajaTexto2.setBounds(120,139,200,30);
    panel.add(cajaTexto2);
    cajaTexto2.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto2.getText());
    //Numero de Laboratorio
    String [] numLaboratorio = {"L01","L02","L03","L04","L05"};
    combonumLabo = new JComboBox(numLaboratorio);
    combonumLabo.setBounds(550,100,200,30);
    panel.add(combonumLabo);
    //Docente Encargado
    
    cajaTexto3 = new JTextField();
    cajaTexto3.setBounds(550,139,200,30);
    panel.add(cajaTexto3);
    cajaTexto3.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto3.getText());
    //HORA LABBORATORIO
    
    String [] horas = {"07h00AM a 09h00AM","09h00AM a 11h00AM","11h00AM A 13h00PM","13h30PM A 15h00PM"};
    horalab = new JComboBox(horas);
    horalab.setBounds(120,178,200,30);
    panel.add(horalab);
    //FECHA LABORATORIO

    cajaTexto4 = new JTextField();
    cajaTexto4.setBounds(120,217,200,30);
    panel.add(cajaTexto4);
    cajaTexto4.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto4.getText());
    
    //Capacidad
    cajaTexto5 = new JTextField();
    cajaTexto5.setBounds(550,179,200,30);
    panel.add(cajaTexto5);
    cajaTexto5.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto5.getText());
    
    
    /*JLabel labelimagen1=new JLabel();
    ImageIcon imagen1 =new ImageIcon("salvar.png");
    labelimagen1.setBounds(340, 105,64,64);
    panel.add(labelimagen1);
    labelimagen1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(labelimagen1.getWidth(),labelimagen1.getHeight(), Image.SCALE_SMOOTH))); 
    
    JLabel labelimagen2=new JLabel();
    ImageIcon imagen2 =new ImageIcon("eliminado.png");
    labelimagen2.setBounds(340, 190,64,64);
    panel.add(labelimagen2);
    labelimagen2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(labelimagen2.getWidth(),labelimagen2.getHeight(), Image.SCALE_SMOOTH))); 
    
    JLabel labelimagen3=new JLabel();
    ImageIcon imagen3 =new ImageIcon("nuevo.png");
    labelimagen3.setBounds(340, 305,64,64);
    panel.add(labelimagen3);
    labelimagen3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(labelimagen3.getWidth(),labelimagen3.getHeight(), Image.SCALE_SMOOTH))); 
        
    JLabel labelimagen4=new JLabel();
    ImageIcon imagen4 =new ImageIcon("actualizar.png");
    labelimagen4.setBounds(340, 400,64,64);
    panel.add(labelimagen4);
    labelimagen4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(labelimagen4.getWidth(),labelimagen4.getHeight(), Image.SCALE_SMOOTH))); 
    */        
    }
    public void Tabla(){
        String [] tabla = {"Codigo", "Materia", "N° Laboratorio", "Responsable","Hora", "Fecha","Capacidad"};
        tablaModel = new DefaultTableModel (tabla,0);
        jtabla = new JTable(tablaModel);
        JScrollPane scrollPane = new JScrollPane(jtabla);
        scrollPane.setBounds(30,300,700,300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane); 
        mostrarDatos();    
     }
    public void ColocarBotones(){
        JButton boton = new JButton("GUARDAR");
        boton.setBounds(780,100,160,50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        ImageIcon imagen = new ImageIcon("guardarhorario.png"); // Reemplaza con la ruta de tu imagen
        Image imagenEscalada = imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
        ImageIcon imagenIcono = new ImageIcon(imagenEscalada);
        boton.setIcon(imagenIcono);
        
        boton.addActionListener(new ActionListener() {
         @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = cajaTexto1.getText();
                String materia = cajaTexto2.getText();
                String numlaboratorio =(String) combonumLabo.getSelectedItem();
                String docente = cajaTexto3.getText();
                String hora = (String)horalab.getSelectedItem();
                String fecha = cajaTexto4.getText();
                String capacidad = cajaTexto5.getText();
                
                insertarDatos(codigo, materia, numlaboratorio, docente, hora, fecha, capacidad);
                mostrarDatos();
            }
        });
        
       JButton boton1 = new JButton("ELIMINAR");
       boton1.setBounds(780,200,160,50);
       panel.add(boton1);
       boton1.setEnabled(true);
       boton1.setMnemonic('b'); 
       ImageIcon imagene = new ImageIcon("eliminarhorario.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladae = imagene.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIconoe = new ImageIcon(imagenEscaladae);
       boton1.setIcon(imagenIconoe);
       boton1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int filaSeleccionada = jtabla.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.");
        } else {
            String codigo = (String) jtabla.getValueAt(filaSeleccionada, 0); // Columna de la cédula

            // Eliminar fila de la base de datos
            eliminarDatos(codigo);

            // Eliminar fila de la tabla en la interfaz
            tablaModel.removeRow(filaSeleccionada);
        }
    }

        });   
       JButton boton2 = new JButton("NUEVO");
       boton2.setBounds(1000,100,160,50);
       panel.add(boton2);
       boton2.setEnabled(true);
       boton2.setMnemonic('C');
       ImageIcon imagennuevo = new ImageIcon("nuevohorario.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladanuevo = imagennuevo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIcononuevo = new ImageIcon(imagenEscaladanuevo);
       boton2.setIcon(imagenIcononuevo);
       boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTexto1.setText("");
                cajaTexto2.setText("");
                combonumLabo.setSelectedIndex(0);
                cajaTexto3.setText("");//docente encargado
                horalab.setSelectedIndex(0);
                cajaTexto4.setText("");
                cajaTexto5.setText("");          
            }
        });
       
       JButton boton3 = new JButton("ACTUALIZAR");
       boton3.setBounds(1000,200,160,50);
       panel.add(boton3);
       boton3.setEnabled(true);
       boton3.setMnemonic('d'); 
       ImageIcon imagenac = new ImageIcon("actualizarhorario.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladac = imagenac.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIconoac = new ImageIcon(imagenEscaladac);
       boton3.setIcon(imagenIconoac);
       
       //boton3.setEnabled(false);
       //boton3.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(botonact.getWidth(), botonact.getHeight(), Image.SCALE_SMOOTH)));
    boton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
                String codigo = cajaTexto1.getText();
                String materia = cajaTexto2.getText();
                String numlaboratorio =(String) combonumLabo.getSelectedItem();
                String docente = cajaTexto3.getText();
                String hora = (String)horalab.getSelectedItem();
                String fecha = cajaTexto4.getText();
                String capacidad = cajaTexto5.getText();
                // Actualizar datos en la base de datos
        actualizarDatos(codigo, materia, numlaboratorio, docente, hora,fecha, capacidad);
        // Actualizar datos en la tabla de la interfaz
        int filaSeleccionada = jtabla.getSelectedRow();
        tablaModel.setValueAt(codigo, filaSeleccionada, 0);
        tablaModel.setValueAt(materia, filaSeleccionada, 1);
        tablaModel.setValueAt(numlaboratorio, filaSeleccionada, 2);
        tablaModel.setValueAt(docente, filaSeleccionada, 3);
        tablaModel.setValueAt(hora, filaSeleccionada, 4);
        tablaModel.setValueAt(fecha, filaSeleccionada, 5);
        tablaModel.setValueAt(capacidad, filaSeleccionada, 6);

        // Deshabilitar campos de texto después de guardar los cambios
        habilitarCamposEdicion() ;
        deshabilitarCamposEdicion();
    }
     });     
}  
    private void insertarDatos (String codigo, String materia, String numlaboratorio, String docente, String hora, String fecha, String capacidad) {
          String SQL = "INSERT INTO `horarios` (h_codigo, h_materia, h_laboratorio, h_docente, h_hora, h_fecha, h_capacidad) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection con = conexionEstudiante.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, codigo);
            ps.setString(2, materia);
            ps.setString(3, numlaboratorio);
            ps.setString(4, docente);
            ps.setString(5, hora);
            ps.setString(6, fecha);
            ps.setString(7, capacidad);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos agregados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos " + ex.getMessage());
        }
    } 
    
    private void LimpiarCeldas() {
        cajaTexto1.setText("");
        cajaTexto2.setText("");
        combonumLabo.setSelectedIndex(0);
        cajaTexto3.setText("");//docente encargado
        horalab.setSelectedIndex(0);
        cajaTexto4.setText("");
        cajaTexto5.setText("");  
    }
    
    private void mostrarDatos() {
        String[] titulos = {"Codigo", "Materia", "N° Laboratorio", "Responsable","Hora", "Fecha","Capacidad"};
        String registroestu[] = new String[7];
        tablaModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `horarios`";
        try {
            Connection con = conexionEstudiante.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registroestu[0] = rs.getString("h_codigo");
                registroestu[1] = rs.getString("h_materia");
                registroestu[2] = rs.getString("h_laboratorio");
                registroestu[3] = rs.getString("h_docente");
                registroestu[4] = rs.getString("h_hora");
                registroestu[5] = rs.getString("h_fecha");
                registroestu[6] = rs.getString("h_capacidad");
                tablaModel.addRow(registroestu);
            }
            // Set the table model to the table
            jtabla.setModel(tablaModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
      
    public void eliminarDatos(String codigo) {
    String SQL = "DELETE FROM `horarios` WHERE h_codigo = ?";
    
    try {
        Connection con = conexionEstudiante.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, codigo);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + ex.getMessage());
    }
}
    
    
    private void habilitarCamposEdicion() {

    cajaTexto1.setEditable(true);
    cajaTexto2.setEditable(true);
    combonumLabo.setEditable(true);
    cajaTexto3.setEditable(true);
    horalab.setEditable(true);
    cajaTexto4.setEditable(true);
    cajaTexto5.setEditable(true);  
    }
    
    private void deshabilitarCamposEdicion() {
    cajaTexto1.setEditable(false);
    cajaTexto2.setEditable(false);
    combonumLabo.setEditable(false);
    cajaTexto3.setEditable(false);
    horalab.setEditable(false);
    cajaTexto4.setEditable(false);
    cajaTexto5.setEditable(false);  
                
            }
    
    public void actualizarDatos(String codigo, String materia, String numlaboratorio, String docente, String hora, String fecha, String capacidad) {
    String SQL = "UPDATE `horarios` SET h_materia=? , h_laboratorio = ?, h_docente = ?, h_hora = ?, "
            + "h_fecha, h_capacidad = ? WHERE h_codigo = ?";

    try {
        Connection con = conexionEstudiante.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, codigo);
            ps.setString(2, materia);
            ps.setString(3, numlaboratorio);
            ps.setString(4, docente);
            ps.setString(5, hora);
            ps.setString(6, fecha);
            ps.setString(7, capacidad);
           
        

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    }
}
    
                      
}


    

 
    
    
    
    
    

