package com.totito;
import javax.swing.JOptionPane;
import com.logica.turno;
import com.logica.jugador;
import javax.swing.JButton;
import com.logica.juego;
import javax.swing.JLabel;

/**** @author Alex_Pablo*/

public class totito extends javax.swing.JFrame {
    
    juego logica;
    /*** Creates new form totito*/  
    public static JButton btn[] = new JButton[10];
    
    public totito() {
        initComponents();
        btn[1]=btn1;
        btn[2]=btn2;
        btn[3]=btn3;
        btn[4]=btn4;
        btn[5]=btn5;
        btn[6]=btn6;
        btn[7]=btn7;
        btn[8]=btn8;
        btn[9]=btn9;
        logica = new juego();
        logica.turnoTablero();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        xSalir = new javax.swing.JButton();
        puntosJugaO = new javax.swing.JLabel();
        puntosJugaX = new javax.swing.JLabel();
        tableroX = new javax.swing.JLabel();
        tableroO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(560, 780));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setDefaultCapable(false);
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 110));

        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setDefaultCapable(false);
        btn2.setFocusPainted(false);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 110));

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setDefaultCapable(false);
        btn3.setFocusPainted(false);
        btn3.setName(""); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 130, 110));

        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setDefaultCapable(false);
        btn4.setFocusPainted(false);
        btn4.setFocusable(false);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 130, 120));

        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setDefaultCapable(false);
        btn5.setFocusPainted(false);
        btn5.setFocusable(false);
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 140, 120));

        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setDefaultCapable(false);
        btn6.setFocusPainted(false);
        btn6.setFocusable(false);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 438, 130, 120));

        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setDefaultCapable(false);
        btn7.setFocusPainted(false);
        btn7.setFocusable(false);
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 556, 140, 130));

        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setDefaultCapable(false);
        btn8.setFocusPainted(false);
        btn8.setFocusable(false);
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 556, 130, 130));

        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setDefaultCapable(false);
        btn9.setFocusPainted(false);
        btn9.setFocusable(false);
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 150, 120));

        xSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/xSalir.png"))); // NOI18N
        xSalir.setBorderPainted(false);
        xSalir.setContentAreaFilled(false);
        xSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xSalir.setDefaultCapable(false);
        xSalir.setFocusPainted(false);
        xSalir.setFocusable(false);
        xSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xSalirActionPerformed(evt);
            }
        });
        getContentPane().add(xSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, -1));

        puntosJugaO.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        puntosJugaO.setForeground(new java.awt.Color(60, 56, 65));
        puntosJugaO.setText("0");
        getContentPane().add(puntosJugaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 70, -1));

        puntosJugaX.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        puntosJugaX.setForeground(new java.awt.Color(60, 56, 65));
        puntosJugaX.setText("0");
        getContentPane().add(puntosJugaX, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 70, -1));

        tableroX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/jugadorx.png"))); // NOI18N
        getContentPane().add(tableroX, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        tableroO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/jugadorO.png"))); // NOI18N
        getContentPane().add(tableroO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/totio/fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 560, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(1);
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(2);
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(3);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(4);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(5);
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(6);
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(7);
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(8);
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        // TODO add your handling code here:
        logica.VerificacionTurno(9);
    }//GEN-LAST:event_btn9MouseClicked

    private void xSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_xSalirActionPerformed


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
            java.util.logging.Logger.getLogger(totito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(totito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(totito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(totito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new totito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn1;
    public static javax.swing.JButton btn2;
    public static javax.swing.JButton btn3;
    public static javax.swing.JButton btn4;
    public static javax.swing.JButton btn5;
    public static javax.swing.JButton btn6;
    public static javax.swing.JButton btn7;
    public static javax.swing.JButton btn8;
    public static javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel puntosJugaO;
    public static javax.swing.JLabel puntosJugaX;
    public static javax.swing.JLabel tableroO;
    public static javax.swing.JLabel tableroX;
    private javax.swing.JButton xSalir;
    // End of variables declaration//GEN-END:variables
}
