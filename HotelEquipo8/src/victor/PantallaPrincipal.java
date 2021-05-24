/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author victo
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    
    public PantallaPrincipal() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int)d.getWidth() / 2;
        int alto = (int)d.getHeight() / 2;
        
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.jLabelImagenPrincipal, "src/imagenes/FondoPantallaPrincipal.jpg");
        this.jLabelImagenPrincipal.setSize(ancho, alto);
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
        jTextFieldNombreDeUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseniasuario = new javax.swing.JPasswordField();
        jButtonGaleriaImagenes = new javax.swing.JButton();
        jButtonIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelImagenPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNombreDeUsuario.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel1.add(jTextFieldNombreDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 740, 520, -1));

        jPasswordFieldContraseniasuario.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel1.add(jPasswordFieldContraseniasuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 820, 520, -1));

        jButtonGaleriaImagenes.setBackground(new java.awt.Color(0, 0, 0));
        jButtonGaleriaImagenes.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonGaleriaImagenes.setForeground(new java.awt.Color(204, 204, 0));
        jButtonGaleriaImagenes.setText("Galeria de imagenes");
        jButtonGaleriaImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGaleriaImagenesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGaleriaImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 890, -1, -1));

        jButtonIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIniciarSesion.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(204, 204, 0));
        jButtonIniciarSesion.setText("Iniciar sesión");
        jPanel1.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 890, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Nombre de usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 740, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 820, -1, -1));

        jLabelImagenPrincipal.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabelImagenPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelImagenPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

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

    private void jButtonGaleriaImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGaleriaImagenesActionPerformed
        // TODO add your handling code here:
        GaleriaDeImagenes galeria = new GaleriaDeImagenes();
        galeria.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGaleriaImagenesActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
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
    private javax.swing.JButton jButtonGaleriaImagenes;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImagenPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldContraseniasuario;
    private javax.swing.JTextField jTextFieldNombreDeUsuario;
    // End of variables declaration//GEN-END:variables
}
