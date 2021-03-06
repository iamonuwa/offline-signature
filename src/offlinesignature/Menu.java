/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinesignature;

import helpers.Accounts;
import helpers.Database;
import helpers.Users;
import helpers.Utility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Onuwa Nnachi Isaac <i_onuwa4u@outlook.com>
 */
public class Menu extends javax.swing.JFrame {

    public Users mUsers = new Users();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
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
        jStaff = new javax.swing.JButton();
        jEnrollment = new javax.swing.JButton();
        jAudit = new javax.swing.JButton();
        jVerification = new javax.swing.JButton();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jStaff.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jStaff.setText("Staff Management");
        jStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStaffMouseClicked(evt);
            }
        });

        jEnrollment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEnrollment.setText("Enrollment");
        jEnrollment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnrollmentMouseClicked(evt);
            }
        });

        jAudit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jAudit.setText("Audit");
        jAudit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAuditMouseClicked(evt);
            }
        });

        jVerification.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jVerification.setText("Verification");
        jVerification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVerificationMouseClicked(evt);
            }
        });

        jExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jExit.setText("Exit");
        jExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jEnrollment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAudit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jVerification, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jAudit, jEnrollment, jExit, jStaff, jVerification});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jVerification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAudit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAudit, jEnrollment, jStaff, jVerification});

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

    private void jEnrollmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnrollmentMouseClicked
        Enrollment mEnrollment = new Enrollment();
        mEnrollment.setVisible(true);
        Utility.centreOnScreen(mEnrollment);
        dispose();
    }//GEN-LAST:event_jEnrollmentMouseClicked

    private void jVerificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVerificationMouseClicked
        String acct_number = JOptionPane.showInputDialog(this, "Enter Account Number: ", null, WIDTH);
        if(acct_number.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please supply an account number", "Empty Search", HEIGHT);
        }
        else{
            try {
                ArrayList<Accounts> mResult = new Database().getAccount(acct_number);
                if(mResult == null){
                    JOptionPane.showMessageDialog(this, "Account Number not found", "Not found", HEIGHT);
                }
                else{
                    Verification mVerification = new Verification();
                    Utility.centreOnScreen(mVerification);
                    mVerification.setVisible(true);
                    mVerification.load(mResult);
                    dispose();
                }
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jVerificationMouseClicked

    private void jStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStaffMouseClicked
        Staff mStaff = new Staff();
        mStaff.setVisible(true);
        Utility.centreOnScreen(mStaff);
        dispose();
    }//GEN-LAST:event_jStaffMouseClicked

    private void jAuditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAuditMouseClicked
        Audit mAudit = new Audit();
        Utility.centreOnScreen(mAudit);
        mAudit.setVisible(true);
        dispose();
    }//GEN-LAST:event_jAuditMouseClicked

    private void jExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseClicked
         String[] options = {"Yes", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?", "Closing Application", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (answer == 0) {
            dispose();
        }
    }//GEN-LAST:event_jExitMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAudit;
    private javax.swing.JButton jEnrollment;
    private javax.swing.JButton jExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jStaff;
    private javax.swing.JButton jVerification;
    // End of variables declaration//GEN-END:variables

    void load(Users mUsers) {
//        fullname.setText("Welcome "+mUsers.getFullname());
    }
}
