
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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;

public class Estudiantes extends JInternalFrame {
    //Declaro una variable conexionEstudiante de tipo CONEXION
    private Conexion conexionEstudiante;
    private JTextField cajaTexto1;
    private JTextField cajaTexto2;
    private JTextField cajaTexto3;
    private JTextField cajaTexto4;
    private JTextField cajaTexto5;
    private JTextField cajaTexto6; 
    private JTextField cajaTexto7;
    private JComboBox<String> combo;
    private JRadioButton button;
    private JRadioButton button1;
    private JPanel panel;
    private DefaultTableModel tablaModel;
    private JTable jtabla;
    private JComboBox cajaboxestado;
    private JButton botonact;
    
    public Estudiantes(){//Dentro del panel habra una ventana llamada registro
        
        conexionEstudiante = new Conexion();
        
        this.setSize(1200,700);
        setTitle("ESTUDIANTES");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema       
        //setBounds(500,200,500,500);
        //setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
        iniciarComponentes(); 
        //Colocar un icono en el registro
        ImageIcon image = new ImageIcon("transparente.png");
       // setIconImage(image.getImage());
    
}
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        ColocarCajaTexto();
        ColocarComboBox();
        ColocarBotones();
        JCombox();
        Tabla();
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
         //PONER IMAGEN
         JLabel labelimagen=new JLabel();
         ImageIcon imagen =new ImageIcon("registro.png");
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
         label3.setText("CEDULA");
         panel.add(label3);
         label3.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label3.setForeground(Color.WHITE);
         label3.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label3.setBounds(30, 130,350,50);
         JLabel label4 = new JLabel();
         label4.setText("APELLIDO");
         panel.add(label4);
         label4.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label4.setForeground(Color.WHITE);
         label4.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label4.setBounds(30, 170,350,50);
         JLabel label5 = new JLabel();
         label5.setText("NOMBRE");
         panel.add(label5);
         label5.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label5.setForeground(Color.WHITE);
         label5.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label5.setBounds(30, 210,350,50);
         
         JLabel label6 = new JLabel();
         label6.setText("EMAIL");
         panel.add(label6);
         label6.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label6.setForeground(Color.WHITE);
         label6.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label6.setBounds(30, 250,350,50);
         
         JLabel label7 = new JLabel();
         label7.setText("TELEFONO");
         panel.add(label7);
         label7.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label7.setForeground(Color.WHITE);
         label7.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label7.setBounds(30, 290,350,50);
         
         JLabel label8 = new JLabel();
         label8.setText("DIRECCION");
         panel.add(label8);
         label8.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label8.setForeground(Color.WHITE);
         label8.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label8.setBounds(30, 340,350,50);
         
         JLabel label9 = new JLabel();
         label9.setText("MATERIA");
         panel.add(label9);
         label9.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label9.setForeground(Color.WHITE);
         label9.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label9.setBounds(30, 380,350,50);
         
         JLabel label10 = new JLabel();
         label10.setText("ESTADO");
         panel.add(label10);
         label10.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label10.setForeground(Color.WHITE);
         label10.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 15));
         label10.setBounds(30, 430,350,50);
         
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
    
    cajaTexto3 = new JTextField();
    cajaTexto3.setBounds(120,179,200,30);
    panel.add(cajaTexto3);
    cajaTexto3.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto3.getText());
    
    cajaTexto4 = new JTextField();
    cajaTexto4.setBounds(120,219,200,30);
    panel.add(cajaTexto4);
    cajaTexto4.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto4.getText());
    
    cajaTexto5 = new JTextField();
    cajaTexto5.setBounds(120,259,200,30);
    panel.add(cajaTexto5);
    cajaTexto5.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto5.getText());
    
    cajaTexto6 = new JTextField();
    cajaTexto6.setBounds(120,299,200,30);
    panel.add(cajaTexto6);
    cajaTexto6.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto6.getText());
    
    cajaTexto7 = new JTextField();
    cajaTexto7.setBounds(120,349,200,30);
    panel.add(cajaTexto7);
    cajaTexto7.setText(" ");
    System.out.println("El texto de la caja es: "+cajaTexto7.getText());
    
    }
     public void ColocarComboBox(){
         String [] materias = {"Calculo","POO","Computacion Digital","EDO","Fisica"};
         combo = new JComboBox(materias);
         combo.setBounds(120,389,150,30);
         panel.add(combo);
     }
     public void ColocarBotones(){
        JButton boton = new JButton("GUARDAR");
        boton.setBounds(350,110,160,50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        ImageIcon imagen = new ImageIcon("guardares.png"); // Reemplaza con la ruta de tu imagen
        Image imagenEscalada = imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
        ImageIcon imagenIcono = new ImageIcon(imagenEscalada);
        boton.setIcon(imagenIcono);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = cajaTexto1.getText();
                String cedula = cajaTexto2.getText();
                String apellido = cajaTexto3.getText();
                String nombre = cajaTexto4.getText();
                String email = cajaTexto5.getText();
                String telefono = cajaTexto6.getText();
                String direccion = cajaTexto7.getText();
                String materia = (String) combo.getSelectedItem();
                String estado = (String) cajaboxestado.getSelectedItem();

                insertarDatos(codigo, cedula, apellido, nombre, email, telefono, direccion, materia, estado);
                mostrarDatos();

                JsonUtils.guardarEstudianteJson(codigo, cedula, apellido, nombre, email, telefono, direccion, materia, estado);
            }
        });
    
        
       JButton boton1 = new JButton("ELIMINAR");
       boton1.setBounds(350,215,160,50);
       panel.add(boton1);
       boton1.setEnabled(true);
       boton1.setMnemonic('b'); 
       ImageIcon imagene = new ImageIcon("eliminares.png"); // Reemplaza con la ruta de tu imagen
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
       boton2.setBounds(350,320,160,50);
       panel.add(boton2);
       boton2.setEnabled(true);
       boton2.setMnemonic('C'); 
       ImageIcon imagennuevo = new ImageIcon("nuevoes.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladanuevo = imagennuevo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIcononuevo = new ImageIcon(imagenEscaladanuevo);
       boton2.setIcon(imagenIcononuevo);
       boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cajaTexto1.setText("");
                cajaTexto2.setText("");
                cajaTexto3.setText("");
                cajaTexto4.setText("");
                cajaTexto5.setText("");
                cajaTexto6.setText("");
                cajaTexto7.setText("");
                combo.setSelectedIndex(0);
                cajaboxestado.setSelectedIndex(0);
                
            }
        });
       
       JButton boton3 = new JButton("ACTUALIZAR");
       boton3.setBounds(350,425,160,50);
       panel.add(boton3);
       boton3.setEnabled(true);
       boton3.setMnemonic('d'); 
       ImageIcon imagenac = new ImageIcon("actualizares.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladac = imagenac.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIconoac = new ImageIcon(imagenEscaladac);
       boton3.setIcon(imagenIconoac);
       //boton3.setEnabled(false);
       //boton3.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(botonact.getWidth(), botonact.getHeight(), Image.SCALE_SMOOTH)));
    boton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = cajaTexto1.getText();
        String cedula = cajaTexto2.getText();
        String apellido = cajaTexto3.getText();
        String nombre = cajaTexto4.getText();
        String email = cajaTexto5.getText();
        String telefono = cajaTexto6.getText();
        String direccion = cajaTexto7.getText();
        String materia = (String) combo.getSelectedItem();
        String estado = (String) cajaboxestado.getSelectedItem();
        // Actualizar datos en la base de datos
        actualizarDatos(codigo, cedula, apellido, nombre, email, telefono, direccion, materia, estado);

        // Actualizar datos en la tabla de la interfaz
        int filaSeleccionada = jtabla.getSelectedRow();
        tablaModel.setValueAt(codigo, filaSeleccionada, 0);
        tablaModel.setValueAt(cedula, filaSeleccionada, 1);
        tablaModel.setValueAt(apellido, filaSeleccionada, 2);
        tablaModel.setValueAt(nombre, filaSeleccionada, 3);
        tablaModel.setValueAt(email, filaSeleccionada, 4);
        tablaModel.setValueAt(telefono, filaSeleccionada, 5);
        tablaModel.setValueAt(direccion, filaSeleccionada, 6);
        tablaModel.setValueAt(materia, filaSeleccionada, 7);
        tablaModel.setValueAt(estado, filaSeleccionada, 8);

        // Deshabilitar campos de texto después de guardar los cambios
        habilitarCamposEdicion() ;
        deshabilitarCamposEdicion();
    }
     });     
}   
     public void JCombox(){
    cajaboxestado = new JComboBox();
    cajaboxestado.setBounds(120, 440, 110, 30);
    panel.add(cajaboxestado);
    cajaboxestado.addItem("Aprobado");
    cajaboxestado.addItem("Reprobado");
    cajaboxestado.addActionListener((ActionEvent e) -> {
    JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
            String selectedOption = (String) comboBox.getSelectedItem();
            System.out.println("Opción seleccionada: " + selectedOption);
    }); 
          
     }
     public void Tabla(){
        String [] tabla = {"Codigo", "Cedula", "Apellido", "Nombre","Email", "Telefono","Direccion", "Materia", "Estado"};
        tablaModel = new DefaultTableModel (tabla,0);
        jtabla = new JTable(tablaModel);
        JScrollPane scrollPane = new JScrollPane(jtabla);
        scrollPane.setBounds(550,70,610,500);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane); 
        mostrarDatos();    
     }
     private void insertarDatos (String codigo, String cedula, String apellido, String nombre, String email, String telefono, String direccion, String materia, String estado) {
          String SQL = "INSERT INTO `alumnos` (es_codigo, es_cedula, es_apellido, es_nombre, es_email, es_telefono, es_direccion, es_materia, es_estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection con = conexionEstudiante.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, codigo);
            ps.setString(2, cedula);
            ps.setString(3, apellido);
            ps.setString(4, nombre);
            ps.setString(5, email);
            ps.setString(6, telefono);
            ps.setString(7, direccion);
            ps.setString(8, materia);
            ps.setString(9, estado);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos agregados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos " + ex.getMessage());
        }
    } 
    
    private void LimpiarCeldas() {
        cajaTexto1.setText("");
        cajaTexto2.setText("");
        cajaTexto3.setText("");
        cajaTexto4.setText("");
        cajaTexto5.setText("");
        cajaTexto6.setText("");
        cajaTexto7.setText("");
        combo.setSelectedIndex(0);
       cajaboxestado.setSelectedIndex(0);
       
    }
    
    private void mostrarDatos() {
        String[] titulos = {"código", "cedula", "apellido", "nombre", "email", "telefono", "direccion", "materia", "estado"};
        String registroestu[] = new String[9];
        tablaModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `alumnos`";
        try {
            Connection con = conexionEstudiante.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registroestu[0] = rs.getString("es_codigo");
                registroestu[1] = rs.getString("es_cedula");
                registroestu[2] = rs.getString("es_apellido");
                registroestu[3] = rs.getString("es_nombre");
                registroestu[4] = rs.getString("es_email");
                registroestu[5] = rs.getString("es_telefono");
                registroestu[6] = rs.getString("es_direccion");
                registroestu[7] = rs.getString("es_materia");
                registroestu[8] = rs.getString("es_estado");
                tablaModel.addRow(registroestu);
            }
            // Set the table model to the table
            jtabla.setModel(tablaModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
      
    public void eliminarDatos(String codigo) {
    String SQL = "DELETE FROM `alumnos` WHERE es_codigo = ?";
    
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
    cajaTexto1.setEditable(true); // No permitir editar el codigo
    cajaTexto2.setEditable(true);
    cajaTexto3.setEditable(true);
    cajaTexto4.setEditable(true);
    cajaTexto5.setEditable(true);
    cajaTexto6.setEditable(true);
    cajaTexto7.setEnabled(true);
    combo.setEnabled(true);
    button.setEnabled(true);
    button1.setEnabled(true);     
    }
    
    private void deshabilitarCamposEdicion() {
    cajaTexto1.setEditable(false); // No permitir editar el codigo
    cajaTexto2.setEditable(false);
    cajaTexto3.setEditable(false);
    cajaTexto4.setEditable(false);
    cajaTexto5.setEditable(false);
    cajaTexto6.setEditable(false);
    cajaTexto7.setEnabled(false);
    combo.setEnabled(false);
    button.setEnabled(false);
    button1.setEnabled(false);   
                
            }
    
    public void actualizarDatos(String codigo , String cedula, String apellido, String nombre, String email,
        String telefono, String direccion, String materia, String estado) {
    String SQL = "UPDATE `alumnos` SET es_cedula=? , es_apellido = ?, es_nombre = ?, es_email = ?, "
            + "es_telefono = ?, es_direccion = ?, es_materia = ?, es_estado = ? WHERE es_codigo = ?";

    try {
        Connection con = conexionEstudiante.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, cedula);
        ps.setString(2, apellido);
        ps.setString(3, nombre);
        ps.setString(4, email);
        ps.setString(5, telefono);
        ps.setString(6, direccion);
        ps.setString(7, materia);
        ps.setString(8, estado);
        ps.setString(9, codigo);

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    }
}
    
                      
}

