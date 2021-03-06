/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Recibo {
    
    private static String nombreHotel = "California Suite";
    private static String lemaHotel = "La mejor experiencia solo en el mejor hotel";
    private static String ubicacionHotel = "Avenida Cruza el Río, Fraccionamiento Las Hadas, No. 32";

    public Recibo() {
    }
    
    public static void main(String[] args) {
        
    }
    
    public void generar(String datos[]){
        //Fecha actual
        Date f = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        String fecha = formato.format(f);
        try{
            //Crear el archivo
            FileOutputStream archivo = new FileOutputStream("Recibo_" +datos[0] + "_" + datos[1] + ".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            //Logo del hotel
            Image logo = Image.getInstance("src/imagenes/LogoHotel.jpg");
            logo.setAlignment(1);
            logo.scaleAbsolute(120, 120);
            documento.add(logo);
            //Nombre del hotel
            Paragraph nh = new Paragraph( nombreHotel + " \n\n", FontFactory.getFont("Times New Roman", 24, Font.ITALIC, BaseColor.BLACK));
            nh.setAlignment(1);
            documento.add(nh);
            //Lema del hotel
            Paragraph l = new Paragraph("\n" +lemaHotel);
            l.setAlignment(1);
            documento.add(l);
            //Ubicación del hotel - Fecha actual
            Paragraph u = new Paragraph("\n" +ubicacionHotel +"                             Fecha: " +fecha);
            u.setAlignment(0);
            documento.add(u);
            //Nombre de huésped y Ciudad
            Paragraph n1 = new Paragraph("\nHuésped: " + datos[0] + " " +  datos[1]  + " " + datos[2] +"                                          Ciudad: " + datos[3]);
            n1.setAlignment(0);
            documento.add(n1);
            //Fechas
            Paragraph f1 = new Paragraph("\nFecha de ingreso: " + datos[4] +"               Fecha de salida: " + datos[5]);
            f1.setAlignment(1);
            documento.add(f1);
            //Tipo de habitación - Costo
            Paragraph h1 = new Paragraph("\nTipo de habitación: " + datos[8] +"             Costo: $" + datos[9]);
            h1.setAlignment(1);
            documento.add(h1);
            //Dias de hospedaje
            Paragraph d = new Paragraph("\nDias de hospedaje: " + datos[7] );
            d.setAlignment(1);
            documento.add(d);
            //Pagos
            float p1 = Float.parseFloat(datos[11]);
            float p2 = Float.parseFloat(datos[12]);
            Paragraph p = new Paragraph("\nTotal a pagar sin cargos extra: $" + p1 +"    Total a pagar con cargos extra: $" + p2);
            p.setAlignment(1);
            documento.add(p);
            //Servicios
            Paragraph s1 = new Paragraph("\nLista de cargos extra:\n");
            s1.setAlignment(1);
            documento.add(s1);
            if(datos[13].equals("1")){
                Paragraph s2 = new Paragraph("Gimnasio..............  + $100");
                s2.setAlignment(1);
                documento.add(s2);
            }
            if(datos[14].equals("1")){
                Paragraph s3 = new Paragraph("Iglesia..............  + $3500");
                s3.setAlignment(1);
                documento.add(s3);
            }
            if(datos[15].equals("1")){
                Paragraph s4 = new Paragraph("Karaoke..............  + $250");
                s4.setAlignment(1);
                documento.add(s4);
            }
            if(datos[16].equals("1")){
                Paragraph s5 = new Paragraph("Paseo por ruinas..............  + $50");
                s5.setAlignment(1);
                documento.add(s5);
            }
            if(datos[17].equals("1")){
                Paragraph s6 = new Paragraph("Spa..............  + $500");
                s6.setAlignment(1);
                documento.add(s6);
            }
            if(datos[18].equals("1")){
                Paragraph s7 = new Paragraph("Salón de usos múltiples..............  + $1200");
                s7.setAlignment(1);
                documento.add(s7);
            }
            //Firma de gerente
            Image firma = Image.getInstance("src/imagenes/FirmaGerente.jpg");
            firma.setAlignment(1);
            firma.scaleAbsolute(90, 40);
            documento.add(firma);
            //Nombre gerente
            Paragraph gerente = new Paragraph("Firma de Gerente");
            gerente.setAlignment(1);
            documento.add(gerente);
            Paragraph nomF = new Paragraph("Paco Ronaldo Gutierritos Saavedra");
            nomF.setAlignment(1);
            documento.add(nomF);
            //Salida
            Paragraph s = new Paragraph("Salida completada");
            s.setAlignment(1);
            documento.add(s);
            Paragraph s2 = new Paragraph("Esperemos haya disfrutado su estancia,");
            s2.setAlignment(1);
            documento.add(s2);
            //Cierra el archivo
            documento.close();
            System.out.println("Recibo generado con éxito");
            JOptionPane.showMessageDialog(null, "Recibo de salida generado con éxito");
        }catch(Exception ex){
            System.out.println("Error");
            ex.printStackTrace();
        }
    }
    
}
