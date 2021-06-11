/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import consultas.MySqlConn;
import consultas.baseDeDatos;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import victor.miniForms.AlertaErrorNumeroDeHabitacion;

/**
 *
 * @author luis
 */
public class CheckOut extends javax.swing.JFrame {
    Toolkit tk;
    Dimension d;
    int ancho, alto;
    public CheckOut() {        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoHab = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroHab = new javax.swing.JTextField();
        jCheckBoxPaseoRuinas = new javax.swing.JCheckBox();
        jCheckBoxGimnasio = new javax.swing.JCheckBox();
        jCheckBoxSpa = new javax.swing.JCheckBox();
        jCheckBoxIglesia = new javax.swing.JCheckBox();
        jCheckBoxSalonUsosMulti = new javax.swing.JCheckBox();
        jCheckBoxKaraoke = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Check-In");
        setExtendedState(4);
        setMinimumSize(new java.awt.Dimension(1, 1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecciona los servicios extra ocupados.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jTextFieldNumeroHab.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel1.add(jTextFieldNumeroHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 150, -1));

        jCheckBoxPaseoRuinas.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jCheckBoxPaseoRuinas.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPaseoRuinas.setText("Paseo por ruinas");
        jCheckBoxPaseoRuinas.setOpaque(false);
        jPanel1.add(jCheckBoxPaseoRuinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jCheckBoxGimnasio.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jCheckBoxGimnasio.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxGimnasio.setText("Gimnasio");
        jCheckBoxGimnasio.setOpaque(false);
        jPanel1.add(jCheckBoxGimnasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 130, -1));

        jCheckBoxSpa.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jCheckBoxSpa.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSpa.setText("Spa");
        jCheckBoxSpa.setOpaque(false);
        jPanel1.add(jCheckBoxSpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 120, -1));

        jCheckBoxIglesia.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jCheckBoxIglesia.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxIglesia.setText("Iglesia");
        jCheckBoxIglesia.setOpaque(false);
        jPanel1.add(jCheckBoxIglesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 270, -1));

        jCheckBoxSalonUsosMulti.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jCheckBoxSalonUsosMulti.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSalonUsosMulti.setText("Salón de usos multiples");
        jCheckBoxSalonUsosMulti.setOpaque(false);
        jPanel1.add(jCheckBoxSalonUsosMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 270, -1));

        jCheckBoxKaraoke.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jCheckBoxKaraoke.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxKaraoke.setText("Karaoke");
        jCheckBoxKaraoke.setOpaque(false);
        jPanel1.add(jCheckBoxKaraoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. de habitación:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jButtonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(204, 204, 0));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buscar.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 40));

        jLabelFondo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoCheckOut.jpg"))); // NOI18N
        jLabelFondo.setPreferredSize(jPanel1.getPreferredSize());
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        int habitacion;
        String info [] = new String [19];
        baseDeDatos b = new baseDeDatos();
        String resultado;
        try{
            habitacion = Integer.parseInt(this.jTextFieldNumeroHab.getText().trim());
        }
        catch(NumberFormatException ex){
            habitacion = 0;
        }
        
        this.jTextFieldNumeroHab.setText("");
        resultado = b.consultaQuienHabita(habitacion);
        if (resultado != "Habitación no ocupada por nadie") {
            info = b.consultaCheckOut(habitacion);
            int diasAux = Integer.parseInt(info[7]);
            double costoAux = Double.parseDouble(info[9]);
            double pagarSinEx = diasAux * costoAux;
            info[11] = Double.toString(pagarSinEx);//Pago sin extras.
            double pagarConEx = pagarSinEx;
            //Spa = 500
            //Salon de usos multiples = 1200
            //Karaoke = 250
            //Paseo por ruinos = 50
            //Gimnasio 100
            //Iglesia eventos 3500
            if (this.jCheckBoxGimnasio.isSelected()) {
                pagarConEx+=100;
                info[13] = "1";
            }else{
                info[13] = "0";
            }
            if (this.jCheckBoxIglesia.isSelected()) {
                pagarConEx+=3500;
                info[14] = "1";
            }else{
                info[14] = "0";
            }
            if (this.jCheckBoxKaraoke.isSelected()) {
                pagarConEx+=250;
                info[15] = "1";
            }else{
                info[15] = "0";
            }
            if (this.jCheckBoxPaseoRuinas.isSelected()) {
                pagarConEx+=50;
                info[16] = "1";
            }else{
                info[16] = "0";
            }
            if (this.jCheckBoxSpa.isSelected()) {
                pagarConEx+=500;
                info[17] = "1";
            }else{
                info[17] = "0";
            }
            if (this.jCheckBoxSalonUsosMulti.isSelected()) {
                pagarConEx+= 1200;
                info[18] = "1";
            }else{
                info[18] = "0";
            }
            if (info[8].equals("Sencilla")) {
                int h = Integer.parseInt(info[6])-1;
                double cantExtra = Double.parseDouble(info[10]);
                pagarConEx+= h*cantExtra;
            }
            if (info[8].equals("Doble")) {
                int h = Integer.parseInt(info[6])-2;
                double cantExtra = Double.parseDouble(info[10]);
                pagarConEx+= h*cantExtra;
            }
            if (info[8].equals("Triple")) {
                int h = Integer.parseInt(info[6])-3;
                double cantExtra = Double.parseDouble(info[10]);
                pagarConEx+= h*cantExtra;
            }
            info[12] = Double.toString(pagarConEx);
            for (int i = 0; i < info.length; i++) {
                System.out.println(info[i]);
            }
            this.jCheckBoxGimnasio.setSelected(false);
            this.jCheckBoxIglesia.setSelected(false);
            this.jCheckBoxKaraoke.setSelected(false);
            this.jCheckBoxPaseoRuinas.setSelected(false);
            this.jCheckBoxSalonUsosMulti.setSelected(false);
            this.jCheckBoxSpa.setSelected(false);
            
            Recibo r = new Recibo();
            r.generar(info);
            
            float ingreso = Float.parseFloat(info[12]);
            b.actualizarIngresos(ingreso);
            
        }else{
            AlertaErrorNumeroDeHabitacion habDes = new AlertaErrorNumeroDeHabitacion();
            habDes.setVisible(true);
            habDes.setLocationRelativeTo(null);
            habDes.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed


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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoHab;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JCheckBox jCheckBoxGimnasio;
    private javax.swing.JCheckBox jCheckBoxIglesia;
    private javax.swing.JCheckBox jCheckBoxKaraoke;
    private javax.swing.JCheckBox jCheckBoxPaseoRuinas;
    private javax.swing.JCheckBox jCheckBoxSalonUsosMulti;
    private javax.swing.JCheckBox jCheckBoxSpa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNumeroHab;
    // End of variables declaration//GEN-END:variables
}
