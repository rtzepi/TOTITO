
package com.totito;

import com.logica.jugador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.logica.juego;
import com.logica.turno;


/**
 *
 * @author Alex_Pablo
 */
public class Dialog extends javax.swing.JFrame {
    jugador jugadorX;
    jugador jugadorO;
    public Dialog( String ganador, int puntos, jugador jugadorX, jugador jugadorO  ) {
        this.jugadorX = jugadorX;
        this.jugadorO = jugadorO;
        initComponents();
        setBackground(new java.awt.Color(1.0f, 1.0f, 1.0f,0.0f));
        this.lbNombreGanador.setText(ganador);
        this.lbPuntos.setText( "" + puntos);
    }
    

    private Dialog() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPuntos = new javax.swing.JLabel();
        lbNombreGanador = new javax.swing.JLabel();
        lbTxtPuntos = new javax.swing.JLabel();
        BtnContinuar = new javax.swing.JButton();
        BtnNuevaPar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(450, 472));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPuntos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbPuntos.setForeground(new java.awt.Color(90, 75, 75));
        lbPuntos.setText("0");
        getContentPane().add(lbPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        lbNombreGanador.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbNombreGanador.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreGanador.setText("Jugador");
        getContentPane().add(lbNombreGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 100, 220, -1));

        lbTxtPuntos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTxtPuntos.setForeground(new java.awt.Color(202, 149, 218));
        lbTxtPuntos.setText("puntos");
        getContentPane().add(lbTxtPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        BtnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/tablaGandadorCon.png"))); // NOI18N
        BtnContinuar.setContentAreaFilled(false);
        BtnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnContinuar.setDefaultCapable(false);
        BtnContinuar.setFocusPainted(false);
        BtnContinuar.setFocusable(false);
        BtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 180, 40));

        BtnNuevaPar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/tablaGandadorNueva.png"))); // NOI18N
        BtnNuevaPar.setBorderPainted(false);
        BtnNuevaPar.setContentAreaFilled(false);
        BtnNuevaPar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNuevaPar.setDefaultCapable(false);
        BtnNuevaPar.setFocusPainted(false);
        BtnNuevaPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevaParActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNuevaPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/tablaGandador1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 460));

        setSize(new java.awt.Dimension(434, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
        // TODO add your handling code here:
        for(int i = 1; i < 10; i++){
            totito.btn[i].setIcon(null);
            totito.btn[i].setName(null);
        }
        dispose();
    }//GEN-LAST:event_BtnContinuarActionPerformed

    private void BtnNuevaParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevaParActionPerformed
        // TODO add your handling code here:
        for(int i = 1; i < 10; i++){
            totito.btn[i].setIcon(null);
            totito.btn[i].setName(null);
        }
        jugadorX.resetPuntos();
        jugadorO.resetPuntos();
        totito.puntosJugaO.setText( "" +jugadorO.getPuntos() );
        totito.puntosJugaX.setText("" +jugadorX.getPuntos());
        dispose();
    }//GEN-LAST:event_BtnNuevaParActionPerformed


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
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dialog().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JButton BtnNuevaPar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbNombreGanador;
    private javax.swing.JLabel lbPuntos;
    private javax.swing.JLabel lbTxtPuntos;
    // End of variables declaration//GEN-END:variables
}
