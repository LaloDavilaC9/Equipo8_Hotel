/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import consultas.MySqlConn;
import consultas.baseDeDatos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author victo
 */
public class DisponibilidadHabitacionesDesdeCheckIn extends javax.swing.JFrame{

    private ImageIcon imagen;
    private Icon icono;
    Toolkit tk;
    Dimension d;
    int ancho,alto;
    MySqlConn conn;
    
    public DisponibilidadHabitacionesDesdeCheckIn() {
        tk = Toolkit.getDefaultToolkit();
        d = tk.getScreenSize();
        ancho = (int)d.getWidth() ;
        alto = (int)d.getHeight() ;
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.jLabelFondoDisponibilidad, "src/imagenes/FondoPantallaDisponibilidadHabitaciones.jpg");
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
        jPanel2 = new javax.swing.JPanel();
        jLabelFondoDisponibilidad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 7, 0));
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new Dimension(ancho,alto-77));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabelFondoDisponibilidad.setPreferredSize(new Dimension(ancho,alto));
        jPanel2.add(jLabelFondoDisponibilidad, java.awt.BorderLayout.CENTER);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setText("Salir a check in");
        jButton1.setMaximumSize(new java.awt.Dimension(121212, 121212));
        jButton1.setPreferredSize(new Dimension(ancho,alto/25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.SOUTH);
        jButton1.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CheckIn checkin = new CheckIn();
        checkin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DisponibilidadHabitacionesDesdeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisponibilidadHabitacionesDesdeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisponibilidadHabitacionesDesdeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisponibilidadHabitacionesDesdeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisponibilidadHabitacionesDesdeCheckIn().setVisible(true);
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

               baseDeDatos b = new baseDeDatos();
        boolean ocupada[] = new boolean [45];
        int n = 0;
        int aux = 101;
        for (int i = aux; i <= 115; i++) {
            String h = Integer.toString(i);
            try{
                ocupada[n] = b.habOcupada(h);
                if (ocupada[n]){
                    System.out.println(i +") - Ocupada");
                    
                }else{
                    System.out.println(i +") - Disponible");
                }
            }catch(Exception e){
                System.out.println(i +") Error UnU");
            }
            n++;
        }
        aux = 201;
        for (int i = aux; i <= 215; i++) {
            String h = Integer.toString(i);
            try {
                ocupada[n] = b.habOcupada(h);
                if (ocupada[n]) {
                    System.out.println(i + ") - Ocupada");

                } else {
                    System.out.println(i + ") - Disponible");
                }
            } catch (Exception e) {
                System.out.println(i + ") Error UnU");
            }
            n++;
        }
        aux = 301;
        for (int i = aux; i <= 315; i++) {
            String h = Integer.toString(i);
            try {
                ocupada[n] = b.habOcupada(h);
                if (ocupada[n]) {
                    System.out.println(i + ") - Ocupada");

                } else {
                    System.out.println(i + ") - Disponible");
                }
            } catch (Exception e) {
                System.out.println(i + ") Error UnU");
            }
            n++;
        }
        
        Toolkit tk;
        Dimension d;
        tk = Toolkit.getDefaultToolkit();
        d = tk.getScreenSize();
        ancho = (int) d.getWidth();
        alto = (int) d.getHeight();
        int altoOperacion = alto;
        System.out.println("El alto de la pantalla es: "+altoOperacion);
        double primerTercio = (altoOperacion / 3) / 2;
        double segundoTercio = primerTercio * 3;
        double tercerTercio = primerTercio * 5;
        System.out.println("Primer tercio " + primerTercio);
        System.out.println("Segundo tercio " + segundoTercio);
        System.out.println("Tercero tercio " + tercerTercio);

        super.paint(g);

        int moverIzquierdaPuerta = ancho - 80;
        int moverIzquierdaCirculo = ancho - 80;
        int moverIzquierdaTipo = ancho - 80;
        n = 30;
        //Para tercer piso.
        for (int i = 0; i < 15; i++) {
            if (ocupada[n]) {
                g.setColor(Color.RED);
                g.fillRect(moverIzquierdaPuerta, (int) primerTercio, ancho / 35, alto / 13);
                g.setColor(Color.BLACK);
                g.fillOval(moverIzquierdaCirculo, (int) primerTercio + 25, 15, 15);
                if (i >= 0 && i <= 5) {
                    g.setColor(Color.YELLOW);
                }else{
                    if (i >= 6 && i <= 8) {
                        g.setColor(Color.BLUE);
                    }else{
                        g.setColor(Color.MAGENTA);
                    }
                }            
                g.fillRect(moverIzquierdaPuerta, (int) primerTercio, ancho / 100, alto / 50);
                moverIzquierdaPuerta -= ancho / 16; //Distancia entre cada puerta.
                moverIzquierdaCirculo -= ancho / 16; //Distancia entre cada perilla.
                moverIzquierdaTipo -= ancho / 16; //Distancia entre cada triangulo.
            } else {
                g.setColor(Color.GREEN);
                g.fillRect(moverIzquierdaPuerta, (int) primerTercio, ancho / 35, alto / 13);
                g.setColor(Color.BLACK);
                g.fillOval(moverIzquierdaCirculo, (int) primerTercio + 25, 15, 15);
                 if (i >= 0 && i <= 5) {
                    g.setColor(Color.YELLOW);
                }else{
                    if (i >= 6 && i <= 8) {
                        g.setColor(Color.BLUE);
                    }else{
                        g.setColor(Color.MAGENTA);
                    }
                }                  
                g.fillRect(moverIzquierdaPuerta, (int) primerTercio, ancho / 100, alto / 50);
                moverIzquierdaPuerta -= ancho / 16; //Distancia entre cada puerta.
                moverIzquierdaCirculo -= ancho / 16; //Distancia entre cada perilla.
                moverIzquierdaTipo -= ancho / 16; //Distancia entre cada triangulo.
            }
            n++;
        }

        //Para segundo piso.
        n = 15;
        moverIzquierdaPuerta = ancho - 80;
        moverIzquierdaCirculo = ancho - 80;
        moverIzquierdaTipo = ancho - 80;
        for (int i = 0; i < 15; i++) {
            if (ocupada[n]) {
                g.setColor(Color.RED);
                g.fillRect(moverIzquierdaPuerta, (int) segundoTercio, ancho / 35, alto / 13);
                g.setColor(Color.BLACK);
                g.fillOval(moverIzquierdaCirculo, (int) segundoTercio + 25, 15, 15);
                if (i >= 0 && i <= 2) {
                    g.setColor(Color.YELLOW);
                }else{
                    if (i >= 3 && i <= 9) {
                        g.setColor(Color.BLUE);
                    }else{
                        g.setColor(Color.MAGENTA);
                    }
                }
                g.fillRect(moverIzquierdaPuerta, (int) segundoTercio, ancho / 100, alto / 50);
                moverIzquierdaPuerta -= ancho / 16; //Distancia entre cada puerta.
                moverIzquierdaCirculo -= ancho / 16; //Distancia entre cada perilla.
                moverIzquierdaTipo -= ancho / 16; //Distancia entre cada triangulo.
            } else {
                g.setColor(Color.GREEN);
                g.fillRect(moverIzquierdaPuerta, (int) segundoTercio, ancho / 35, alto / 13);
                g.setColor(Color.BLACK);
                g.fillOval(moverIzquierdaCirculo, (int) segundoTercio + 25, 15, 15);
                if (i >= 0 && i <= 2) {
                    g.setColor(Color.YELLOW);
                }else{
                    if (i >= 3 && i <= 9) {
                        g.setColor(Color.BLUE);
                    }else{
                        g.setColor(Color.MAGENTA);
                    }
                }
                g.fillRect(moverIzquierdaPuerta, (int) segundoTercio, ancho / 100, alto / 50);
                
                moverIzquierdaPuerta -= ancho / 16; //Distancia entre cada puerta.
                moverIzquierdaCirculo -= ancho / 16; //Distancia entre cada perilla.
                moverIzquierdaTipo -= ancho / 16; //Distancia entre cada triangulo.
            }
            n++;
        }

        //Para primer piso.
        n = 0;
        moverIzquierdaPuerta = ancho - 80;
        moverIzquierdaCirculo = ancho - 80;
        moverIzquierdaTipo = ancho - 80;
        for (int i = 0; i < 15; i++) {
            if (ocupada[n]) {
                g.setColor(Color.RED);
                g.fillRect(moverIzquierdaPuerta, (int) tercerTercio, ancho / 35, alto / 13);
                g.setColor(Color.BLACK);
                g.fillOval(moverIzquierdaCirculo, (int) tercerTercio + 25, 15, 15);
               if (i >= 0 && i <= 4) {
                    g.setColor(Color.YELLOW);
                }else{
                    if (i >= 5 && i <= 10) {
                        g.setColor(Color.BLUE);
                    }else{
                        g.setColor(Color.MAGENTA);
                    }
                }                
                g.fillRect(moverIzquierdaPuerta, (int) tercerTercio, ancho / 100, alto / 50);
                
                moverIzquierdaPuerta -= ancho / 16; //Distancia entre cada puerta.
                moverIzquierdaCirculo -= ancho / 16; //Distancia entre cada perilla.
                moverIzquierdaTipo -= ancho / 16; //Distancia entre cada triangulo.
            } else {
                g.setColor(Color.GREEN);
                g.fillRect(moverIzquierdaPuerta, (int) tercerTercio, ancho / 35, alto / 13);
                g.setColor(Color.BLACK);
                g.fillOval(moverIzquierdaCirculo, (int) tercerTercio + 25, 15, 15);
                if (i >= 0 && i <= 4) {
                    g.setColor(Color.YELLOW);
                }else{
                    if (i >= 5 && i <= 10) {
                        g.setColor(Color.BLUE);
                    }else{
                        g.setColor(Color.MAGENTA);
                    }
                }                    
                g.fillRect(moverIzquierdaPuerta,(int) tercerTercio, ancho / 100, alto / 50);
                
                moverIzquierdaPuerta -= ancho / 16; //Distancia entre cada puerta.
                moverIzquierdaCirculo -= ancho / 16; //Distancia entre cada perilla.
                moverIzquierdaTipo -= ancho / 16; //Distancia entre cada triangulo.
            }
            n++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelFondoDisponibilidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
