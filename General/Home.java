/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


package General;

import Voters.*;
import Admin.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author welcome
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        JButton [] btns = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton7, jButton9, jButton10, jButton11, jButton12, jButton13};
        for (JButton btn : btns) {
            btn.setBackground(new Color(21,25,28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(54,81,207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(21,25,28));
                }
                
            });
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

        JPanel pnRoot = new JPanel();
        JPanel pnSide = new JPanel();
        JPanel jPanel1 = new JPanel();
        JButton jButton6 = new JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        JPanel jPanel5 = new JPanel();
        JPanel jPanel6 = new JPanel();
        jButton13 = new javax.swing.JButton();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JPanel pnCenter = new JPanel();
        JPanel pnCBottom = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JPanel pniCTop = new JPanel();
        JLabel jLabel2 = new JLabel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel pniCCenter = new JPanel();
        JButton jButton8 = new JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnRoot.setLayout(new java.awt.BorderLayout());

        pnSide.setBackground(new java.awt.Color(21, 25, 28));
        pnSide.setPreferredSize(new java.awt.Dimension(250, 0));

        jPanel1.setBackground(new java.awt.Color(21, 25, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 150));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("VOTE IS OUR RIGHT");
        jButton6.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel1.add(jButton6);

        pnSide.add(jPanel1);

        jButton1.setForeground(new java.awt.Color(0, 255, 204));
        jButton1.setText(" HOME");
        jButton1.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(this::jButton1ActionPerformed);
        pnSide.add(jButton1);

        jButton2.setForeground(new java.awt.Color(0, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-elections-25.png")); // NOI18N
        jButton2.setText("VOTERS");
        jButton2.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        pnSide.add(jButton2);

        jButton3.setForeground(new java.awt.Color(0, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-people-25.png")); // NOI18N
        jButton3.setText("ADMINISTRATOR");
        jButton3.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        pnSide.add(jButton3);

        jButton4.setForeground(new java.awt.Color(0, 255, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-leader-25.png")); // NOI18N
        jButton4.setText("CANDIDATES");
        jButton4.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton4.addActionListener(this::jButton4ActionPerformed);
        pnSide.add(jButton4);

        jButton5.setForeground(new java.awt.Color(0, 255, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-list-25.png")); // NOI18N
        jButton5.setText("VOTER LIST");
        jButton5.setPreferredSize(new java.awt.Dimension(200, 40));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        pnSide.add(jButton5);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnSide.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(34, 40, 44));
        jPanel6.setMinimumSize(new java.awt.Dimension(200, 280));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 280));

        jButton13.setIcon(new javax.swing.ImageIcon("D:\\File Code Java\\Voting-System-Application\\Image and Icon\\register.png")); // NOI18N
        jButton13.addActionListener(this::jButton13ActionPerformed);

        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("REGISTER NOW");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pnSide.add(jPanel6);

        pnRoot.add(pnSide, java.awt.BorderLayout.WEST);

        pnCenter.setBackground(new java.awt.Color(34, 40, 44));
        pnCenter.setLayout(new java.awt.BorderLayout());

        pnCBottom.setBackground(new java.awt.Color(30, 40, 44));
        pnCBottom.setPreferredSize(new java.awt.Dimension(734, 100));

        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("INTERNATIONAL UNIVERSITY");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Group 6 - PDM");

        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Copyright © 2021 PSG");

        javax.swing.GroupLayout pnCBottomLayout = new javax.swing.GroupLayout(pnCBottom);
        pnCBottom.setLayout(pnCBottomLayout);
        pnCBottomLayout.setHorizontalGroup(
            pnCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCBottomLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1127, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(176, 176, 176))
        );
        pnCBottomLayout.setVerticalGroup(
            pnCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCBottomLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnCBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23))
        );

        pnCenter.add(pnCBottom, java.awt.BorderLayout.SOUTH);

        pniCTop.setBackground(new java.awt.Color(34, 40, 44));
        pniCTop.setPreferredSize(new java.awt.Dimension(0, 150));

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", Font.BOLD, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("VOTING ONLINE SYSTEM");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pniCTopLayout = new javax.swing.GroupLayout(pniCTop);
        pniCTop.setLayout(pniCTopLayout);
        pniCTopLayout.setHorizontalGroup(
            pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pniCTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pniCTopLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1009, Short.MAX_VALUE)
                .addGroup(pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pniCTopLayout.setVerticalGroup(
            pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pniCTopLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pniCTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pniCTopLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(pniCTopLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnCenter.add(pniCTop, java.awt.BorderLayout.NORTH);

        pniCCenter.setBackground(new java.awt.Color(30, 40, 44));

        jButton8.setForeground(new java.awt.Color(240, 240, 240));
        jButton8.setIcon(new javax.swing.ImageIcon("D:\\File Code Java\\Voting-System-Application\\Image and Icon\\tải xuống.jpg")); // NOI18N
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setForeground(new java.awt.Color(51, 255, 204));
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-news-25.png")); // NOI18N
        jButton9.setText("NEWS UPDATES");
        jButton9.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton9.addActionListener(this::jButton9ActionPerformed);

        jButton10.setForeground(new java.awt.Color(0, 255, 204));
        jButton10.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-shouting-25.png")); // NOI18N
        jButton10.setText("ANNOUNCEMENTS");
        jButton10.setPreferredSize(new java.awt.Dimension(250, 40));

        jButton11.setForeground(new java.awt.Color(0, 255, 204));
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-previous-25.png")); // NOI18N
        jButton11.setText("PREVIOUS ELECTION");
        jButton11.setPreferredSize(new java.awt.Dimension(200, 40));

        jButton12.setForeground(new java.awt.Color(0, 255, 204));
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\icons hub\\icons8-next-25.png")); // NOI18N
        jButton12.setText("NEXT ELECTION");
        jButton12.setPreferredSize(new java.awt.Dimension(200, 40));

        javax.swing.GroupLayout pniCCenterLayout = new javax.swing.GroupLayout(pniCCenter);
        pniCCenter.setLayout(pniCCenterLayout);
        pniCCenterLayout.setHorizontalGroup(
            pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pniCCenterLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(995, Short.MAX_VALUE))
        );
        pniCCenterLayout.setVerticalGroup(
            pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pniCCenterLayout.createSequentialGroup()
                .addGroup(pniCCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pniCCenterLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pnCenter.add(pniCCenter, java.awt.BorderLayout.CENTER);

        pnRoot.add(pnCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        VotersList v = new VotersList();
        v.show();
        
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VotersLogin v = new VotersLogin();
        v.show();
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        NewVoterApplication n = new NewVoterApplication();
        n.show();
        
        dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AdminLogin a = new AdminLogin();
        a.show();
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Canditates c = new Canditates();
        c.show();
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
