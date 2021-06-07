/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor;

import consultas.MySqlConn;
import consultas.baseDeDatos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;
import victor.miniForms.AlertaErrorLogin;
import victor.miniForms.FormInicioDeSesion;

/**
 *
 * @author victo
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    Toolkit tk;
    Dimension d;
    int ancho,alto;
    MySqlConn conn;
    public PantallaPrincipal() {
        tk = Toolkit.getDefaultToolkit();
        d = tk.getScreenSize();
        ancho = (int)d.getWidth() ;
        alto = (int)d.getHeight() ;
        initComponents();
        
        System.out.println(""+ancho+" x "+alto);
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.jLabelImagenPrincipal, "src/imagenes/FondoPantallaPrincipal.jpg");
       
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
        jLabelImagenPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHabitacionesDisponibles = new javax.swing.JMenu();
        jMenuGaleriaDeImagenes = new javax.swing.JMenu();
        jMenuLogIn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new Dimension(ancho,alto));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImagenPrincipal.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabelImagenPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagenPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelImagenPrincipal.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.add(jLabelImagenPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenuHabitacionesDisponibles.setBackground(new java.awt.Color(0, 0, 0));
        jMenuHabitacionesDisponibles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        jMenuHabitacionesDisponibles.setForeground(new java.awt.Color(204, 204, 0));
        jMenuHabitacionesDisponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/HabDispo2.png"))); // NOI18N
        jMenuHabitacionesDisponibles.setText("Habitaciones disponibles   ");
        jMenuHabitacionesDisponibles.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuHabitacionesDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHabitacionesDisponiblesMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuHabitacionesDisponibles);

        jMenuGaleriaDeImagenes.setBackground(new java.awt.Color(0, 0, 0));
        jMenuGaleriaDeImagenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        jMenuGaleriaDeImagenes.setForeground(new java.awt.Color(204, 204, 0));
        jMenuGaleriaDeImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Galeria.png"))); // NOI18N
        jMenuGaleriaDeImagenes.setText("Galeria de imagenes   ");
        jMenuGaleriaDeImagenes.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuGaleriaDeImagenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuGaleriaDeImagenesMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuGaleriaDeImagenes);

        jMenuLogIn.setBackground(new java.awt.Color(0, 0, 0));
        jMenuLogIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        jMenuLogIn.setForeground(new java.awt.Color(204, 204, 0));
        jMenuLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Login.png"))); // NOI18N
        jMenuLogIn.setText("Log in");
        jMenuLogIn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jMenuLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogInMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLogIn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuHabitacionesDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHabitacionesDisponiblesMouseClicked
        // TODO add your handling code here:
        DisponibilidadHabitaciones habDispo = new DisponibilidadHabitaciones();
        habDispo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuHabitacionesDisponiblesMouseClicked

    private void jMenuGaleriaDeImagenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGaleriaDeImagenesMouseClicked
        // TODO add your handling code here:
        GaleriaDeImagenesDesdePantallaPrinci galeria = new GaleriaDeImagenesDesdePantallaPrinci();
        galeria.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuGaleriaDeImagenesMouseClicked

    private void jMenuLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogInMouseClicked
        // TODO add your handling code here:
        FormInicioDeSesion login = new FormInicioDeSesion();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuLogInMouseClicked

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
    private javax.swing.JLabel jLabelImagenPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGaleriaDeImagenes;
    private javax.swing.JMenu jMenuHabitacionesDisponibles;
    private javax.swing.JMenu jMenuLogIn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
