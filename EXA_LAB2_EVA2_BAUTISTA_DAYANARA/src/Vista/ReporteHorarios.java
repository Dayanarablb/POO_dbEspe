
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
import Vista.GeneradorPDF;

public class ReporteHorarios extends JInternalFrame{
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
    private JComboBox comboHora;
    private JComboBox comboFecha;
    private JComboBox comboDia;
    private DefaultTableModel tablaModel;
    private JTable jtabla;
    
    public ReporteHorarios(){
        conexionEstudiante = new Conexion();
        
        this.setSize(1200,700);
        setTitle("HORARIOS");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//sirve para que se cierre el sistema       
        //setBounds(500,200,500,500);
        //setLocationRelativeTo(null);//Con esta linea de codigo si o si se va a centrar la pantalla en cualquir computadora - donde uno quiera
        iniciarComponentes(); 
        //Colocar un icono en el registro
        ImageIcon image = new ImageIcon("reporte.png");
        //setIconImage(image.getImage());   
        
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        CombosBox();
        Tabla();
        ColocarBotones();
    }
    private void colocarPanel(){
        panel = new JPanel();
        //lE DAMOS UN COLOR AL PANEL 
        panel.setBackground(new Color(148,176,236));//Color lila o solo podria utilizar Color.green
        //Poner el panel sobre la ventana registro
        this.getContentPane().add(panel);//add. agregro panel     
    }
    public void colocarEtiquetas(){
        //Esto es un Label
        JLabel label = new JLabel("REPORTE DE HORARIOS",SwingConstants.CENTER);
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
         ImageIcon imagen =new ImageIcon("reportehorario.png");
         labelimagen.setBounds(18, 20, 100, 50);
         panel.add(labelimagen);
         labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(), Image.SCALE_SMOOTH))); 
         
         //Creamos Objeto
     
         JLabel label4 = new JLabel();
         label4.setText("N° LABORATORIO");
         panel.add(label4);
         label4.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label4.setForeground(Color.BLACK);
         label4.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 17));
         label4.setBounds(30, 90,350,50);
                  
         JLabel label6 = new JLabel();
         label6.setText("HORA");
         panel.add(label6);
         label6.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label6.setForeground(Color.BLACK);
         label6.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 17));
         label6.setBounds(300, 90,350,50);
         
         JLabel label7 = new JLabel();
         label7.setText("FECHA");
         panel.add(label7);
         label7.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label7.setForeground(Color.BLACK);
         label7.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 17));
         label7.setBounds(550, 90,350,50);
         
         JLabel label8 = new JLabel();
         label8.setText("DIA");
         panel.add(label8);
         label8.setHorizontalAlignment(SwingConstants.LEFT);
         //Cambiar la Fuente
         label8.setForeground(Color.BLACK);
         label8.setFont(new Font("Source Serif Pro Semibold",Font.PLAIN, 17));
         label8.setBounds(800, 90,350,50);
        
                  
    }
    public void CombosBox(){
       String [] numLaboratorio = {"L01","L02","L03","L04","L05","L06","D01","D02","D03","D04","D05"};
         combonumLabo = new JComboBox(numLaboratorio);
         combonumLabo.setBounds(30,130,200,30);
         panel.add(combonumLabo);
         
         String [] Hora = {"07h00AM a 09h00AM","09h00AM a 11h00AM","11h00AM A 13h00PM","13h30PM A 15h00PM"};
         comboHora = new JComboBox(Hora);
         comboHora.setBounds(300,130,200,30);
         panel.add(comboHora);
         
         String [] Fecha = {"27/08/2023","28/08/2023","29/08/2023","30/08/2023","31/08/2023","01/09/2023","04/09/2023","05/09/2023","06/09/2023","07/09/2023","08/09/2023"};
         comboFecha = new JComboBox(Fecha);
         comboFecha.setBounds(550,130,200,30);
         panel.add(comboFecha);
         
         String [] Dia = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
         comboDia = new JComboBox(Dia);
         comboDia.setBounds(800,130,200,30);
         panel.add(comboDia); 
    }
     public void Tabla(){
        String [] tabla = {"N° Laboratorio", "Hora","Fecha","Dia"};
        tablaModel = new DefaultTableModel (tabla,0);
        jtabla = new JTable(tablaModel);
        JScrollPane scrollPane = new JScrollPane(jtabla);
        scrollPane.setBounds(30,350,700,280);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane); 
        mostrarDatos();    
     }
     public void ColocarBotones(){
        JButton boton = new JButton("GUARDAR");
        boton.setBounds(1000,200,160,50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        /*ImageIcon imagen = new ImageIcon("guardarhorario.png"); // Reemplaza con la ruta de tu imagen
        Image imagenEscalada = imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
        ImageIcon imagenIcono = new ImageIcon(imagenEscalada);
        boton.setIcon(imagenIcono);*/
        
        boton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String laboratorio = (String) combonumLabo.getSelectedItem();
        String hora = (String) comboHora.getSelectedItem();
        String fecha = (String) comboFecha.getSelectedItem();
        String dia = (String) comboDia.getSelectedItem();

        insertarDatos(laboratorio, hora, fecha, dia);
        mostrarDatos();

        // Generar PDF utilizando la clase GeneradorPDF
        GeneradorPDF.generarPDF("reporte_horarios.pdf", laboratorio, hora, fecha, dia);
    }
});

        
       JButton boton1 = new JButton("ELIMINAR");
       boton1.setBounds(780,200,160,50);
       panel.add(boton1);
       boton1.setEnabled(true);
       boton1.setMnemonic('b'); 
       /*ImageIcon imagene = new ImageIcon("eliminarhorario.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladae = imagene.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIconoe = new ImageIcon(imagenEscaladae);
       boton1.setIcon(imagenIconoe);*/
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
       boton2.setBounds(1000,300,160,50);
       panel.add(boton2);
       boton2.setEnabled(true);
       boton2.setMnemonic('C');
       /*ImageIcon imagennuevo = new ImageIcon("nuevohorario.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladanuevo = imagennuevo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIcononuevo = new ImageIcon(imagenEscaladanuevo);
       boton2.setIcon(imagenIcononuevo);*/
       boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                combonumLabo.setSelectedIndex(0);
                comboHora.setSelectedIndex(0);
                comboFecha.setSelectedIndex(0);
                comboDia.setSelectedIndex(0);
                       
            }
        });
       
       JButton boton3 = new JButton("ACTUALIZAR");
       boton3.setBounds(780,300,160,50);
       panel.add(boton3);
       boton3.setEnabled(true);
       boton3.setMnemonic('d'); 
       /*ImageIcon imagenac = new ImageIcon("actualizarhorario.png"); // Reemplaza con la ruta de tu imagen
       Image imagenEscaladac = imagenac.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ajusta el tamaño de la imagen
       ImageIcon imagenIconoac = new ImageIcon(imagenEscaladac);
       boton3.setIcon(imagenIconoac);
       
       //boton3.setEnabled(false);
       //boton3.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(botonact.getWidth(), botonact.getHeight(), Image.SCALE_SMOOTH)));*/
    boton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
                String laboratorio = (String)combonumLabo.getSelectedItem();
                String hora = (String)comboHora.getSelectedItem();
                String fecha = (String)comboFecha.getSelectedItem();
                String dia = (String)comboDia.getSelectedItem();
                // Actualizar datos en la base de datos
        actualizarDatos(laboratorio, hora, fecha, dia);
        // Actualizar datos en la tabla de la interfaz
        int filaSeleccionada = jtabla.getSelectedRow();
        tablaModel.setValueAt(laboratorio, filaSeleccionada, 0);
        tablaModel.setValueAt(hora, filaSeleccionada, 1);
        tablaModel.setValueAt(fecha, filaSeleccionada, 2);
        tablaModel.setValueAt(dia, filaSeleccionada, 3);
       
        // Deshabilitar campos de texto después de guardar los cambios
        habilitarCamposEdicion() ;
        deshabilitarCamposEdicion();
    }
     });     
}  
    private void insertarDatos (String laboratorio, String hora, String fecha, String dia) {
          String SQL = "INSERT INTO `reporte` (repo_laboratorio, repo_hora, repo_fecha, repo_dia) "
                + "VALUES (?, ?, ?, ?)";

        try {
            Connection con = conexionEstudiante.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, laboratorio);
            ps.setString(2, hora);
            ps.setString(3, fecha);
            ps.setString(4, dia);
           
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos agregados ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar los datos " + ex.getMessage());
        }
    } 
    
    private void LimpiarCeldas() {
        combonumLabo.setSelectedIndex(0);
        comboHora.setSelectedIndex(0);
        comboFecha.setSelectedIndex(0);
        comboDia.setSelectedIndex(0);
         
    }
    
    private void mostrarDatos() {
        String[] titulos = {"N° Laboratorio", "Hora","Fecha","Dia"};
        String registroestu[] = new String[7];
        tablaModel = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM `reporte`";
        try {
            Connection con = conexionEstudiante.conexion();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registroestu[0] = rs.getString("repo_laboratorio");
                registroestu[1] = rs.getString("repo_hora");
                registroestu[2] = rs.getString("repo_fecha");
                registroestu[3] = rs.getString("repo_dia");
                tablaModel.addRow(registroestu);
            }
            // Set the table model to the table
            jtabla.setModel(tablaModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
        }
    }
      
    public void eliminarDatos(String codigo) {
    String SQL = "DELETE FROM `reporte` WHERE repo_laboratorio = ?";
    
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

    combonumLabo.setEditable(true);
    comboHora.setEditable(true);
    comboFecha.setEditable(true);
    comboDia.setEditable(true);
    }
    
    private void deshabilitarCamposEdicion() {
   
    combonumLabo.setEditable(false);
    comboHora.setEditable(false);
    comboFecha.setEditable(false);
    comboDia.setEditable(false);  
 }
    
    public void actualizarDatos(String laboratorio,String hora, String fecha, String dia) {
    String SQL = "UPDATE `reporte` SET repo_hora=? , repo_fecha = ?, repo_dia = ? "
            + " WHERE repo_laboratorio = ?";

    try {
        Connection con = conexionEstudiante.conexion();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, laboratorio);
            ps.setString(2, hora);
            ps.setString(3, fecha);
            ps.setString(4, dia);
  
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + ex.getMessage());
    }
    
}
    
                      
}


    
    
    

