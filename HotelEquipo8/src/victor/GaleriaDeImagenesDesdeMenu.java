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
import javax.swing.JOptionPane;
import java.applet.AudioClip;

/**
 *
 * @author victo
 */
public class GaleriaDeImagenesDesdeMenu extends javax.swing.JFrame {

    int contador =1;
    int auxiliarMusica = 1;
    private ImageIcon imagenGaleria;
    private Icon iconoGaleria;
    Toolkit tk;
    Dimension d;
    int ancho,alto;
    AudioClip cancion;
    public GaleriaDeImagenesDesdeMenu() {
        cancion = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/Kirameki.wav"));
        tk = Toolkit.getDefaultToolkit();
        d = tk.getScreenSize();
        ancho = (int)d.getWidth() ;
        alto = (int)d.getHeight() ;
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.jLabelFondoPantallaGaleria, "src/imagenes/FondoPantallaGaleriaDeFotos.jpg");
        this.pintarImagen(this.jLabelMostrarImagenes, "src/imagenes/imagenesGaleria/imagenGaleria1.jpg");
        cancion.play();
        cancion.loop();
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
        jLabelMostrarImagenes = new javax.swing.JLabel();
        jLabelFondoPantallaGaleria = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPlay = new javax.swing.JMenu();
        jMenuStop = new javax.swing.JMenu();
        jMenuAnterior = new javax.swing.JMenu();
        jMenuSiguiente = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1, 1));
        jPanel1.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMostrarImagenes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMostrarImagenes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));
        jLabelMostrarImagenes.setMaximumSize(new java.awt.Dimension(121212, 121212));
        jLabelMostrarImagenes.setPreferredSize(new Dimension(ancho-(ancho/4),alto-(alto/4)));
        jPanel1.add(jLabelMostrarImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabelFondoPantallaGaleria.setMaximumSize(new java.awt.Dimension(121212, 121212));
        jLabelFondoPantallaGaleria.setPreferredSize(new Dimension(ancho,alto));
        jPanel1.add(jLabelFondoPantallaGaleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenuPlay.setBackground(new java.awt.Color(0, 0, 0));
        jMenuPlay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuPlay.setForeground(new java.awt.Color(204, 204, 0));
        jMenuPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Play.png"))); // NOI18N
        jMenuPlay.setText("Play   ");
        jMenuPlay.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jMenuPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPlayMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuPlay);

        jMenuStop.setBackground(new java.awt.Color(0, 0, 0));
        jMenuStop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuStop.setForeground(new java.awt.Color(204, 204, 0));
        jMenuStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Stop.png"))); // NOI18N
        jMenuStop.setText("Stop   ");
        jMenuStop.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jMenuStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuStopMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuStop);

        jMenuAnterior.setBackground(new java.awt.Color(0, 0, 0));
        jMenuAnterior.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuAnterior.setForeground(new java.awt.Color(204, 204, 0));
        jMenuAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Anterior.png"))); // NOI18N
        jMenuAnterior.setText("Anterior   ");
        jMenuAnterior.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jMenuAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAnteriorMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAnterior);

        jMenuSiguiente.setBackground(new java.awt.Color(0, 0, 0));
        jMenuSiguiente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuSiguiente.setForeground(new java.awt.Color(204, 204, 0));
        jMenuSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Siguiente.png"))); // NOI18N
        jMenuSiguiente.setText("Siguiente   ");
        jMenuSiguiente.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jMenuSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSiguienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSiguiente);

        jMenuSalir.setBackground(new java.awt.Color(0, 0, 0));
        jMenuSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true));
        jMenuSalir.setForeground(new java.awt.Color(204, 204, 0));
        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.png"))); // NOI18N
        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPlayMouseClicked
        // TODO add your handling code here:
        if (auxiliarMusica != 1){
            cancion.play();
            auxiliarMusica = 1;
        }else{
            cancion.stop();
            cancion.play();
        }
    }//GEN-LAST:event_jMenuPlayMouseClicked

    private void jMenuStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuStopMouseClicked
        // TODO add your handling code here:
        auxiliarMusica = 0;
        cancion.stop();
    }//GEN-LAST:event_jMenuStopMouseClicked

    private void jMenuSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSiguienteMouseClicked
        // TODO add your handling code here:
        contador++;
        if (contador >54) {
            contador = 1;
        }
        this.pintarImagen(this.jLabelMostrarImagenes, "src/imagenes/imagenesGaleria/imagenGaleria"+contador+".jpg");
    }//GEN-LAST:event_jMenuSiguienteMouseClicked

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        cancion.stop();
        System.out.println("Entre al boton");
        MenuPrincipal menuPrinci = new MenuPrincipal();
        menuPrinci.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAnteriorMouseClicked
        // TODO add your handling code here:
        contador--;
        if (contador <1) {
            contador = 54;
        }
        this.pintarImagen(this.jLabelMostrarImagenes, "src/imagenes/imagenesGaleria/imagenGaleria"+contador+".jpg");
    }//GEN-LAST:event_jMenuAnteriorMouseClicked

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
            java.util.logging.Logger.getLogger(GaleriaDeImagenesDesdeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GaleriaDeImagenesDesdeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GaleriaDeImagenesDesdeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GaleriaDeImagenesDesdeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GaleriaDeImagenesDesdeMenu().setVisible(true);
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
    private javax.swing.JLabel jLabelFondoPantallaGaleria;
    private javax.swing.JLabel jLabelMostrarImagenes;
    private javax.swing.JMenu jMenuAnterior;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuPlay;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuSiguiente;
    private javax.swing.JMenu jMenuStop;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
