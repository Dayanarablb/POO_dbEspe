
package Vista;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class GeneradorPDF {
    public static void generarPDF(String fileName, String laboratorio, String hora, String fecha, String dia) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
            Paragraph titulo = new Paragraph("Reporte de Horarios", fontTitulo);
            titulo.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(titulo);

            Font fontContenido = FontFactory.getFont(FontFactory.HELVETICA, 12);
            Paragraph contenido = new Paragraph();
            contenido.add("N° Laboratorio: " + laboratorio + "\n");
            contenido.add("Hora: " + hora + "\n");
            contenido.add("Fecha: " + fecha + "\n");
            contenido.add("Día: " + dia + "\n\n");
            document.add(contenido);

            document.close();
            System.out.println("PDF generado exitosamente");
        } catch (DocumentException | FileNotFoundException e) {
            System.err.println("Error al generar el PDF: " + e.getMessage());
        }
    }
    
}
