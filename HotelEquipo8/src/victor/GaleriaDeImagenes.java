/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class GaleriaDeImagenes extends javax.swing.JFrame {

    int contador =1;
    
    private ImageIcon imagenGaleria;
    private Icon iconoGaleria;
    
    
    public GaleriaDeImagenes() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.jLabelFondoPantallaGaleria, "src/imagenes/FondoPantallaGaleriaDeFotos.jpg");
        this.pintarImagen(this.jLabelMostrarImagenes, "src/imagenes/imagenesGaleria/imagenGaleria1.jpg");
        /*for (int i = 1; i <= 12; i++) {
            this.pintarImagen(this.jLabelMostrarImagenes, "src/imagenes/imagenesGaleria/imagenGaleria"+i+".jpg");
        }*/
        
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
        jButtonSiguienteImagen = new javax.swing.JButton();
        jButtonAnteriorImagen = new javax.swing.JButton();
        jButtonRegresarLogin = new javax.swing.JButton();
        jLabelMostrarImagenes = new javax.swing.JLabel();
        jLabelFondoPantallaGaleria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSiguienteImagen.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSiguienteImagen.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonSiguienteImagen.setForeground(new java.awt.Color(204, 204, 0));
        jButtonSiguienteImagen.setText("Siguiente");
        jButtonSiguienteImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteImagenActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSiguienteImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1680, 880, -1, -1));

        jButtonAnteriorImagen.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAnteriorImagen.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonAnteriorImagen.setForeground(new java.awt.Color(204, 204, 0));
        jButtonAnteriorImagen.setText("Anterior");
        jButtonAnteriorImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorImagenActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAnteriorImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 880, 160, -1));

        jButtonRegresarLogin.setBackground(new java.awt.Color(0, 0, 0));
        jButtonRegresarLogin.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonRegresarLogin.setForeground(new java.awt.Color(204, 204, 0));
        jButtonRegresarLogin.setText("Salir");
        jButtonRegresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegresarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 880, 160, -1));

        jLabelMostrarImagenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMostrarImagenes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));
        jPanel1.add(jLabelMostrarImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 1620, 800));
        jPanel1.add(jLabelFondoPantallaGaleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteImagenActionPerformed
        // TODO add your handling code here:
        contador++;
        if (contador >54) {
            contador = 1;
        }
        this.pintarImagen(this.jLabelMostrarImagenes, "src/imagenes/imagenesGaleria/imagenGaleria"+contador+".jpg");
    }//GEN-LAST:event_jButtonSiguienteImagenActionPerformed

    private void jButtonAnteriorImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorImagenActionPerformed
        // TODO add your handling code here:
        contador--;
        if (contador <1) {
            contador = 54;
        }
        this.pintarImagen(this.jLabelMostrarImagenes, "src/imagenes/imagenesGaleria/imagenGaleria"+contador+".jpg");
    }//GEN-LAST:event_jButtonAnteriorImagenActionPerformed

    private void jButtonRegresarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarLoginActionPerformed
        // TODO add your handling code here:
        System.out.println("Entre al boton");
        PantallaPrincipal pantallaPrinci = new PantallaPrincipal();
        pantallaPrinci.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(GaleriaDeImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GaleriaDeImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GaleriaDeImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GaleriaDeImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GaleriaDeImagenes().setVisible(true);
            }
        });
    }
    
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagenGaleria = new ImageIcon(ruta);
        this.iconoGaleria = new ImageIcon(
                this.imagenGaleria.getImage().getScaledInstance(
                    lbl.getWidth(), 
                    lbl.getHeight(), 
                    Image.SCALE_DEFAULT)
        );
        lbl.setIcon(this.iconoGaleria);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnteriorImagen;
    private javax.swing.JButton jButtonRegresarLogin;
    private javax.swing.JButton jButtonSiguienteImagen;
    private javax.swing.JLabel jLabelFondoPantallaGaleria;
    private javax.swing.JLabel jLabelMostrarImagenes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
