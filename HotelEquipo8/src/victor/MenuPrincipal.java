/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import consultas.baseDeDatos;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import victor.miniForms.IngresosDelHotel;
import victor.miniForms.TotalDeHabitaciones;

/**
 *
 * @author victo
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;    
    Toolkit tk;
    Dimension d;
    int ancho, alto;

    public MenuPrincipal() {
        tk = Toolkit.getDefaultToolkit();
        d = tk.getScreenSize();
        ancho = (int) d.getWidth();
        alto = (int) d.getHeight();
        initComponents();
        this.pintarImagen(this.jLabelFondoMenu, "src/imagenes/FondoBienvenida.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelFondoMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCheckIn = new javax.swing.JMenu();
        jMenuCheckOut = new javax.swing.JMenu();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuConsultarPersonasHospedadas = new javax.swing.JMenu();
        jMenuConsultaExtra = new javax.swing.JMenu();
        jMenuConsultarGaleria = new javax.swing.JMenu();
        jMenuConsultarHabDispXPiso = new javax.swing.JMenu();
        jMenuConsultaBuscar = new javax.swing.JMenu();
        jMenuConsultarPorHuesped = new javax.swing.JMenu();
        jMenuConsultaPorHabitacion = new javax.swing.JMenu();
        jMenuConsultarCostosHab = new javax.swing.JMenu();
        jMenuConsultarTotalHab = new javax.swing.JMenu();
        jMenuConsultarIngresos = new javax.swing.JMenu();
        jMenuConsultarPorcentajes = new javax.swing.JMenu();
        jMenuConsultarPorcentajeOcupacionTipHab = new javax.swing.JMenu();
        jMenuConsultarPorcentajeOcupacionHotel = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();
        jMenuHabDisp = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setPreferredSize(new Dimension(ancho,alto));

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFondoMenu.setMaximumSize(new java.awt.Dimension(121212, 121212));
        jLabelFondoMenu.setPreferredSize(jPanel1.getPreferredSize());
        jPanel1.add(jLabelFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenuCheckIn.setBackground(new java.awt.Color(0, 0, 0));
        jMenuCheckIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        jMenuCheckIn.setForeground(new java.awt.Color(204, 204, 0));
        jMenuCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CheckIn.png"))); // NOI18N
        jMenuCheckIn.setText("Check in   ");
        jMenuCheckIn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuBar1.add(jMenuCheckIn);

        jMenuCheckOut.setBackground(new java.awt.Color(0, 0, 0));
        jMenuCheckOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuCheckOut.setForeground(new java.awt.Color(204, 204, 0));
        jMenuCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/CheckOut.png"))); // NOI18N
        jMenuCheckOut.setText("Check out   ");
        jMenuCheckOut.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuBar1.add(jMenuCheckOut);

        jMenuConsultas.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultas.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Consultas.png"))); // NOI18N
        jMenuConsultas.setText("Consultas   ");
        jMenuConsultas.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N

        jMenuConsultarPersonasHospedadas.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarPersonasHospedadas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarPersonasHospedadas.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarPersonasHospedadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/PersonasHospedadas.png"))); // NOI18N
        jMenuConsultarPersonasHospedadas.setText("Personas hospedadas");
        jMenuConsultarPersonasHospedadas.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultas.add(jMenuConsultarPersonasHospedadas);

        jMenuConsultaExtra.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultaExtra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultaExtra.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultaExtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ConsultaExtra.png"))); // NOI18N
        jMenuConsultaExtra.setText("Consulta extra");
        jMenuConsultaExtra.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultas.add(jMenuConsultaExtra);

        jMenuConsultarGaleria.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarGaleria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarGaleria.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarGaleria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Galeria.png"))); // NOI18N
        jMenuConsultarGaleria.setText("Galeria de fotos");
        jMenuConsultarGaleria.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultarGaleria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConsultarGaleriaMouseClicked(evt);
            }
        });
        jMenuConsultas.add(jMenuConsultarGaleria);

        jMenuConsultarHabDispXPiso.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarHabDispXPiso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarHabDispXPiso.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarHabDispXPiso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/HabDispo.png"))); // NOI18N
        jMenuConsultarHabDispXPiso.setText("Hab. Disponibles por piso");
        jMenuConsultarHabDispXPiso.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultas.add(jMenuConsultarHabDispXPiso);

        jMenuConsultaBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultaBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultaBuscar.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultaBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.png"))); // NOI18N
        jMenuConsultaBuscar.setText("Buscar");
        jMenuConsultaBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jMenuConsultarPorHuesped.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarPorHuesped.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarPorHuesped.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarPorHuesped.setText("Por nombre");
        jMenuConsultarPorHuesped.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultaBuscar.add(jMenuConsultarPorHuesped);

        jMenuConsultaPorHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultaPorHabitacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultaPorHabitacion.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultaPorHabitacion.setText("por No. Habitacion");
        jMenuConsultaPorHabitacion.setFocusable(false);
        jMenuConsultaPorHabitacion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultaBuscar.add(jMenuConsultaPorHabitacion);

        jMenuConsultas.add(jMenuConsultaBuscar);

        jMenuConsultarCostosHab.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarCostosHab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarCostosHab.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarCostosHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Costos.png"))); // NOI18N
        jMenuConsultarCostosHab.setText("Costos de hab");
        jMenuConsultarCostosHab.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultas.add(jMenuConsultarCostosHab);

        jMenuConsultarTotalHab.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarTotalHab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarTotalHab.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarTotalHab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Habitaciones.png"))); // NOI18N
        jMenuConsultarTotalHab.setText("Total de hab.");
        jMenuConsultarTotalHab.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultarTotalHab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConsultarTotalHabMouseClicked(evt);
            }
        });
        jMenuConsultas.add(jMenuConsultarTotalHab);

        jMenuConsultarIngresos.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarIngresos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarIngresos.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ingresos.png"))); // NOI18N
        jMenuConsultarIngresos.setText("Ingresos del hotel");
        jMenuConsultarIngresos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultarIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConsultarIngresosMouseClicked(evt);
            }
        });
        jMenuConsultas.add(jMenuConsultarIngresos);

        jMenuConsultarPorcentajes.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarPorcentajes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarPorcentajes.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarPorcentajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Graficos.png"))); // NOI18N
        jMenuConsultarPorcentajes.setText("Porcentajes");
        jMenuConsultarPorcentajes.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jMenuConsultarPorcentajeOcupacionTipHab.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarPorcentajeOcupacionTipHab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarPorcentajeOcupacionTipHab.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarPorcentajeOcupacionTipHab.setText("Por tipo de hab.");
        jMenuConsultarPorcentajeOcupacionTipHab.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultarPorcentajeOcupacionTipHab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConsultarPorcentajeOcupacionTipHabMouseClicked(evt);
            }
        });
        jMenuConsultarPorcentajes.add(jMenuConsultarPorcentajeOcupacionTipHab);

        jMenuConsultarPorcentajeOcupacionHotel.setBackground(new java.awt.Color(0, 0, 0));
        jMenuConsultarPorcentajeOcupacionHotel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuConsultarPorcentajeOcupacionHotel.setForeground(new java.awt.Color(204, 204, 0));
        jMenuConsultarPorcentajeOcupacionHotel.setText("Ocupacion del hotel");
        jMenuConsultarPorcentajeOcupacionHotel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuConsultarPorcentajeOcupacionHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuConsultarPorcentajeOcupacionHotelMouseClicked(evt);
            }
        });
        jMenuConsultarPorcentajes.add(jMenuConsultarPorcentajeOcupacionHotel);

        jMenuConsultas.add(jMenuConsultarPorcentajes);

        jMenuBar1.add(jMenuConsultas);

        jMenuEditar.setBackground(new java.awt.Color(0, 0, 0));
        jMenuEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuEditar.setForeground(new java.awt.Color(204, 204, 0));
        jMenuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Editar.png"))); // NOI18N
        jMenuEditar.setText("Editar   ");
        jMenuEditar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuBar1.add(jMenuEditar);

        jMenuHabDisp.setBackground(new java.awt.Color(0, 0, 0));
        jMenuHabDisp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuHabDisp.setForeground(new java.awt.Color(204, 204, 0));
        jMenuHabDisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/HabDispo2.png"))); // NOI18N
        jMenuHabDisp.setText("Habitaciones disp.   ");
        jMenuHabDisp.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuHabDisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHabDispMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuHabDisp);

        jMenuSalir.setBackground(new java.awt.Color(0, 0, 0));
        jMenuSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuSalir.setForeground(new java.awt.Color(204, 204, 0));
        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.png"))); // NOI18N
        jMenuSalir.setText("Salir   ");
        jMenuSalir.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2787, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        PantallaPrincipal pantallaPrinci = new PantallaPrincipal();
        pantallaPrinci.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuHabDispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHabDispMouseClicked
        // TODO add your handling code here:
        DisponibilidadHabitacionesDesdeMenu habDisp = new DisponibilidadHabitacionesDesdeMenu();
        habDisp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuHabDispMouseClicked

    private void jMenuConsultarGaleriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultarGaleriaMouseClicked
        // TODO add your handling code here:
        GaleriaDeImagenesDesdeMenu galery = new GaleriaDeImagenesDesdeMenu();
        galery.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuConsultarGaleriaMouseClicked

    private void jMenuConsultarPorcentajeOcupacionTipHabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultarPorcentajeOcupacionTipHabMouseClicked
        // TODO add your handling code here:
        baseDeDatos b = new baseDeDatos();
        boolean ocupadaSencillas[] = new boolean [14];
        boolean ocupadaDobles[] = new boolean [16];
        boolean ocupadaTriples[] = new boolean [15];
        //Sencillas
        int n = 0;
        int i = 101;
        do{
            String h = Integer.toString(i);
            try{
                ocupadaSencillas[n] = b.habOcupada(h);
            }catch(Exception e){
                System.out.println(i +") Error UnU");
            }
            i++;
            n++;
            if (i == 106) {
                i = 201;
            }else{
                if (i == 204) {
                    i = 301;
                }
            }
            if (i == 307) {
                break;
            }
        }while(n != 14);
        //Dobles
        n = 0;
        i = 106;
        do{
            String h = Integer.toString(i);
            try{
                ocupadaDobles[n] = b.habOcupada(h);
            }catch(Exception e){
                System.out.println(i +") Error UnU");
            }
            i++;
            n++;
            if (i == 112) {
                i = 204;
            }else{
                if (i == 211) {
                    i = 307;
                }
            }
            if (i == 310) {
                break;
            }
        }while(n != 16);
        //Triples
        n = 0;
        i = 112;
        do{
            String h = Integer.toString(i);
            try{
                ocupadaTriples[n] = b.habOcupada(h);
            }catch(Exception e){
                System.out.println(i +") Error UnU");
            }
            i++;
            n++;
            if (i == 116) {
                i = 211;
            }else{
                if (i == 216) {
                    i = 310;
                }
            }
            if (i == 316) {
                break;
            }
        }while(n != 15);
        int sencillasOcupadas = 0;
        int doblesOcupadas = 0;
        int triplesOcupadas = 0;
        for (int j = 0; j < ocupadaSencillas.length; j++) {
            if (ocupadaSencillas[j] == true) {
                sencillasOcupadas++;
            }
        }
        for (int j = 0; j < ocupadaDobles.length; j++) {
            if (ocupadaDobles[j] == true) {
                doblesOcupadas++;
            }
        }
        for (int j = 0; j < ocupadaTriples.length; j++) {
            if (ocupadaTriples[j] == true) {
                triplesOcupadas++;
            }
        }
        System.out.println("Entre al pastel");
        int produccion[] = new int[3];
        produccion[0] = sencillasOcupadas;
        produccion[1] = doblesOcupadas;
        produccion[2] = triplesOcupadas;
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Osaka (Sencilla)", new Integer(produccion[0]));
        dataset.setValue("Tokio (Doble)", new Integer(produccion[1]));
        dataset.setValue("Kyoto (Triple)", new Integer(produccion[2]));
        
        JFreeChart chart = ChartFactory.createPieChart("HABITACIONES OCUPADAS \n California Suite",dataset,true,true, false);
        ChartPanel panel= new ChartPanel(chart);
        
        JFrame ventana = new JFrame("Grafica de habitaciones ocupadas");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setLocationRelativeTo(null);
        ventana.add(panel);
        ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuConsultarPorcentajeOcupacionTipHabMouseClicked

    private void jMenuConsultarPorcentajeOcupacionHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultarPorcentajeOcupacionHotelMouseClicked
        // TODO add your handling code here:
        Ocupacion graficaTotal = new Ocupacion();
    }//GEN-LAST:event_jMenuConsultarPorcentajeOcupacionHotelMouseClicked

    private void jMenuConsultarIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultarIngresosMouseClicked
        // TODO add your handling code here:
        IngresosDelHotel ingresos = new IngresosDelHotel();
        ingresos.setVisible(true);
        ingresos.setLocationRelativeTo(null);
        ingresos.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuConsultarIngresosMouseClicked

    private void jMenuConsultarTotalHabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuConsultarTotalHabMouseClicked
        // TODO add your handling code here:
        TotalDeHabitaciones totHab = new TotalDeHabitaciones();
        totHab.setVisible(true);
        totHab.setLocationRelativeTo(null);
        totHab.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuConsultarTotalHabMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                    lbl.getWidth(), 
                    lbl.getHeight(), 
                    Image.SCALE_DEFAULT)
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFondoMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCheckIn;
    private javax.swing.JMenu jMenuCheckOut;
    private javax.swing.JMenu jMenuConsultaBuscar;
    private javax.swing.JMenu jMenuConsultaExtra;
    private javax.swing.JMenu jMenuConsultaPorHabitacion;
    private javax.swing.JMenu jMenuConsultarCostosHab;
    private javax.swing.JMenu jMenuConsultarGaleria;
    private javax.swing.JMenu jMenuConsultarHabDispXPiso;
    private javax.swing.JMenu jMenuConsultarIngresos;
    private javax.swing.JMenu jMenuConsultarPersonasHospedadas;
    private javax.swing.JMenu jMenuConsultarPorHuesped;
    private javax.swing.JMenu jMenuConsultarPorcentajeOcupacionHotel;
    private javax.swing.JMenu jMenuConsultarPorcentajeOcupacionTipHab;
    private javax.swing.JMenu jMenuConsultarPorcentajes;
    private javax.swing.JMenu jMenuConsultarTotalHab;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuHabDisp;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
