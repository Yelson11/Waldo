/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Yelson
 */
public class GameWindow extends javax.swing.JFrame {

    private BufferedImage image;

    public GameWindow(){
        initComponents();
        this.setLocationRelativeTo(null);
        lblXwaldo.setVisible(false);
        lblXgandalf.setVisible(false);
        lblXodlaw.setVisible(false);
        lblXwoof.setVisible(false);
        lblXwenda.setVisible(false);       
        try {
            image = ImageIO.read(new File("/images/marvel.png"));
        } catch (IOException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblXwaldo = new javax.swing.JLabel();
        lblXwoof = new javax.swing.JLabel();
        lblXgandalf = new javax.swing.JLabel();
        lblXwenda = new javax.swing.JLabel();
        lblXodlaw = new javax.swing.JLabel();
        lblFrameWaldo = new javax.swing.JLabel();
        lblFrameWenda = new javax.swing.JLabel();
        lblFrameWoof = new javax.swing.JLabel();
        lblFrameGandalf = new javax.swing.JLabel();
        lblFrameOdlaw = new javax.swing.JLabel();
        panelStage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblXwaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(lblXwaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, -1, -1));

        lblXwoof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(lblXwoof, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, -1, -1));

        lblXgandalf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(lblXgandalf, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, -1, -1));

        lblXwenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(lblXwenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        lblXodlaw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        getContentPane().add(lblXodlaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, -1, -1));

        lblFrameWaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marco_waldo.png"))); // NOI18N
        lblFrameWaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFrameWaldoMouseClicked(evt);
            }
        });
        getContentPane().add(lblFrameWaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, -1, -1));

        lblFrameWenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marco_wenda.png"))); // NOI18N
        getContentPane().add(lblFrameWenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));

        lblFrameWoof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marco_woof.png"))); // NOI18N
        getContentPane().add(lblFrameWoof, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, -1, -1));

        lblFrameGandalf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marco_gandalf.png"))); // NOI18N
        getContentPane().add(lblFrameGandalf, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, -1, -1));

        lblFrameOdlaw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marco_odlaw.png"))); // NOI18N
        getContentPane().add(lblFrameOdlaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, -1, -1));
        getContentPane().add(panelStage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 870, 570));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marco.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        btnClose.setBackground(new java.awt.Color(1, 34, 66));
        btnClose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(204, 204, 204));
        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 100, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_btnCloseActionPerformed

//-------------------------------------ATENCION---------------------------------
    //Así se hace para que un label ejecute una acción cuando se le haga click
    private void lblFrameWaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFrameWaldoMouseClicked
        lblXwaldo.setVisible(true);
    }//GEN-LAST:event_lblFrameWaldoMouseClicked

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
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFrameGandalf;
    private javax.swing.JLabel lblFrameOdlaw;
    private javax.swing.JLabel lblFrameWaldo;
    private javax.swing.JLabel lblFrameWenda;
    private javax.swing.JLabel lblFrameWoof;
    private javax.swing.JLabel lblXgandalf;
    private javax.swing.JLabel lblXodlaw;
    private javax.swing.JLabel lblXwaldo;
    private javax.swing.JLabel lblXwenda;
    private javax.swing.JLabel lblXwoof;
    private javax.swing.JPanel panelStage;
    // End of variables declaration//GEN-END:variables
}
