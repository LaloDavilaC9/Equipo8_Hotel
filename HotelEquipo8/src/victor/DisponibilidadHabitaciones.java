/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author victo
 */
public class DisponibilidadHabitaciones extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    Toolkit tk;
    Dimension d;
    int ancho,alto;
    
    public DisponibilidadHabitaciones() {
        tk = Toolkit.getDefaultToolkit();
        d = tk.getScreenSize();
        ancho = (int)d.getWidth() ;
        alto = (int)d.getHeight() ;
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.jLabelFondoDisponibilidad, "src/imagenes/FondoPantallaPrincipal.jpg");
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
        jLabelFondoDisponibilidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 7, 0));
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(720, 720));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFondoDisponibilidad.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.add(jLabelFondoDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DisponibilidadHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisponibilidadHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisponibilidadHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisponibilidadHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisponibilidadHabitaciones().setVisible(true);
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
    
    public void paint(Graphics g){
        Toolkit tk;
        Dimension d;
        tk = Toolkit.getDefaultToolkit();
        d = tk.getScreenSize();
        ancho = (int) d.getWidth();
        alto = (int) d.getHeight();
        int altoOperacion = alto;
        System.out.println("El alto de la pantalla es: "+altoOperacion);
        double primerTercio = (altoOperacion/3)/2;
        double segundoTercio = primerTercio*3;
        double tercerTercio = primerTercio*5;
        System.out.println("Primer tercio "+primerTercio);
        System.out.println("Segundo tercio "+segundoTercio);
        System.out.println("Tercero tercio "+tercerTercio);
        
        //Falta automatizar el espacio entre puertas segun la resolucion de la pantalla.
        
        super.paint(g);
        /*g.setColor(Color.BLACK);
        g.drawLine(75, 50, 1850, 50);
        g.drawLine(75, 50, 200, 600000);*/
        int moverIzquierdaPuerta = ancho - 80;
        int moverIzquierdaCirculo = ancho - 80;
        //Para tercer piso.
        for (int i = 0; i < 15; i++) {
            g.setColor(Color.GREEN);
            g.fillRect(moverIzquierdaPuerta, (int)primerTercio, ancho/35, alto/13);
            g.setColor(Color.BLACK);
            g.fillOval(moverIzquierdaCirculo, (int)primerTercio+25, 15, 15);
            moverIzquierdaPuerta -= ancho/16; //Distancia entre cada puerta.
            moverIzquierdaCirculo -= ancho/16; //Distancia entre cada perilla.
            //ipjafdnhPoin
        }
        
        //Para segundo piso.
        /*g.setColor(Color.BLACK);
        g.drawLine(75, 175, 1850, 175);*/
        moverIzquierdaPuerta = ancho -80;
        moverIzquierdaCirculo = ancho - 80;
        for (int i = 0; i < 15; i++) {
            g.setColor(Color.RED);
            g.fillRect(moverIzquierdaPuerta, (int)segundoTercio, ancho/35, alto/13);
            g.setColor(Color.BLACK);
            g.fillOval(moverIzquierdaCirculo, (int)segundoTercio+25, 15, 15);
            moverIzquierdaPuerta -= ancho/16; //Distancia entre cada puerta.
            moverIzquierdaCirculo -= ancho/16; //Distancia entre cada perilla.
        }
        //Para primer piso.
        /*g.setColor(Color.BLACK);
        g.drawLine(75, 300, 1850, 300);*/
        moverIzquierdaPuerta = ancho - 80;
        moverIzquierdaCirculo =ancho - 80;
        for (int i = 0; i < 15; i++) {
            g.setColor(Color.GREEN);
            g.fillRect(moverIzquierdaPuerta, (int)tercerTercio, ancho/35, alto/13);
            g.setColor(Color.BLACK);
            g.fillOval(moverIzquierdaCirculo, (int)tercerTercio+25, 15, 15);
            moverIzquierdaPuerta -= ancho/16; //Distancia entre cada puerta.
            moverIzquierdaCirculo -= ancho/16; //Distancia entre cada perilla.
        }
        /*g.setColor(Color.BLACK);
        g.drawLine(75, 425, 1850, 425);*/
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFondoDisponibilidad;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
