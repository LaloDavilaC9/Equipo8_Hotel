/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor.miniForms;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ReciboDeCheckIn extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;  
    String datosHuesped[] = new String[9];
    public ReciboDeCheckIn(String datos[]) {
        datosHuesped = datos;
        int piso = Integer.parseInt(datosHuesped[7]);
        piso = piso/100;        
        initComponents();
        this.jLabelNombreHuesped.setText("Nombre del huésped: "+datosHuesped[1]+" "+datosHuesped[2]+" "+datosHuesped[3]);
        this.jLabelCiudadDeOrigen.setText("Ciudad de origen: "+datosHuesped[4]);
        this.jLabelFechaIngreso.setText("Fecha de ingreso: "+datosHuesped[5]);
        this.jLabelFechaSalida.setText("Fecha de salida: "+datosHuesped[6]);
        this.jLabelNumeroDeHabitacion.setText("Numero de habitación: "+datosHuesped[7]);
        this.jLabelPiso.setText("Piso: " + piso);
        String tipo = "";
        int tipoNumero = 0;
        int aux2 = Integer.parseInt(datosHuesped[7]);
        if (aux2 >= 101 && aux2 <= 105 || aux2 >= 201 && aux2 <= 203 || aux2 >= 301 && aux2 <= 306) {//Para el tipo 1
            tipo = "Osaka (Sencilla)";
            tipoNumero = 1;
        }
        if (aux2 >= 106 && aux2 <= 111 || aux2 >= 204 && aux2 <= 210 || aux2 >= 307 && aux2 <= 309) {//Para el tipo 2
            tipo = "Tokio (Doble)";
            tipoNumero = 2;
        }
        if (aux2 >= 112 && aux2 <= 115 || aux2 >= 211 && aux2 <= 215 || aux2 >= 310 && aux2 <= 315) {//Para el tipo 3
            tipo = "Kyoto (Triple)";
            tipoNumero = 3;
        }
        int limite = tipoNumero+2;
        this.jLabelTipoDeHab.setText("Tipo de habitación: "+tipo);
        this.jLabelLimiteHuesped.setText("Límite "+limite+" huésped");
        this.jLabelTotalOcupantes.setText("Total de ocupantes de la habitación: "+datosHuesped[8]);
        int personasExtras = 0;
        int hospedados = Integer.parseInt(datosHuesped[8]);
        personasExtras = hospedados - tipoNumero;

        switch (personasExtras) {
            case 1:
                this.jCheckBox1PersonaExt.setSelected(true);
                break;
            case 2:
                this.jCheckBox2PersonaExt.setSelected(true);
                break;
            default:
                this.jCheckBox2PersonaExt.setSelected(false);
                this.jCheckBox1PersonaExt.setSelected(false);
                break;

        }
        this.pintarImagen(this.jLabelFondoRecibo, "src/imagenes/FondoRecibo.jpg");
    }

    private ReciboDeCheckIn() {
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
        jLabelNombreHuesped = new javax.swing.JLabel();
        jLabelCiudadDeOrigen = new javax.swing.JLabel();
        jLabelFechaIngreso = new javax.swing.JLabel();
        jLabelFechaSalida = new javax.swing.JLabel();
        jLabelNumeroDeHabitacion = new javax.swing.JLabel();
        jLabelPiso = new javax.swing.JLabel();
        jLabelTipoDeHab = new javax.swing.JLabel();
        jLabelLimiteHuesped = new javax.swing.JLabel();
        jLabelTotalOcupantes = new javax.swing.JLabel();
        jCheckBox1PersonaExt = new javax.swing.JCheckBox();
        jCheckBox2PersonaExt = new javax.swing.JCheckBox();
        jLabelFondoRecibo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreHuesped.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelNombreHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 480, 20));

        jLabelCiudadDeOrigen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelCiudadDeOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, 20));

        jLabelFechaIngreso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 20));

        jLabelFechaSalida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 290, 20));

        jLabelNumeroDeHabitacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelNumeroDeHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 20));

        jLabelPiso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 160, 20));

        jLabelTipoDeHab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelTipoDeHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 280, 20));

        jLabelLimiteHuesped.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelLimiteHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 200, 20));

        jLabelTotalOcupantes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(jLabelTotalOcupantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 420, 20));

        jCheckBox1PersonaExt.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1PersonaExt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox1PersonaExt.setText("1 persona extra");
        jCheckBox1PersonaExt.setEnabled(false);
        jPanel1.add(jCheckBox1PersonaExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jCheckBox2PersonaExt.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2PersonaExt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox2PersonaExt.setText("2 personas extras");
        jCheckBox2PersonaExt.setEnabled(false);
        jCheckBox2PersonaExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2PersonaExtActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2PersonaExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));
        jPanel1.add(jLabelFondoRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 541, 476));

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

    private void jCheckBox2PersonaExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2PersonaExtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2PersonaExtActionPerformed

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
            java.util.logging.Logger.getLogger(ReciboDeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReciboDeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReciboDeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReciboDeCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReciboDeCheckIn().setVisible(true);
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
    private javax.swing.JCheckBox jCheckBox1PersonaExt;
    private javax.swing.JCheckBox jCheckBox2PersonaExt;
    private javax.swing.JLabel jLabelCiudadDeOrigen;
    private javax.swing.JLabel jLabelFechaIngreso;
    private javax.swing.JLabel jLabelFechaSalida;
    private javax.swing.JLabel jLabelFondoRecibo;
    private javax.swing.JLabel jLabelLimiteHuesped;
    private javax.swing.JLabel jLabelNombreHuesped;
    private javax.swing.JLabel jLabelNumeroDeHabitacion;
    private javax.swing.JLabel jLabelPiso;
    private javax.swing.JLabel jLabelTipoDeHab;
    private javax.swing.JLabel jLabelTotalOcupantes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
