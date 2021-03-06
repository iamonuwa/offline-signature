/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinesignature;

import helpers.Database;
import helpers.Utility;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Onuwa Nnachi Isaac <i_onuwa4u@outlook.com>
 */
public class Staff extends javax.swing.JFrame {
    private void retrieveData()
    {
        DefaultTableModel defaultTableModel = new Database().getData();
        jTable.setModel(defaultTableModel);
    }
    
    /**
     * Creates new form Staff
     */
    public Staff() {
        initComponents();  
        retrieveData();
        jSave.setEnabled(false);
        jUpdate.setEnabled(false);
        jDelete.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jIDNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jNew = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jPassword = new javax.swing.JTextField();
        jDesignation = new javax.swing.JTextField();
        jRole = new javax.swing.JTextField();
        jPasswordLabel = new javax.swing.JLabel();
        jMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("FULLNAME");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jName.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("DESIGNATION");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("ID NUMBER");

        jIDNumber.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("ROLE");

        jNew.setText("NEW");
        jNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNewMouseClicked(evt);
            }
        });

        jSave.setText("SAVE");
        jSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSaveMouseClicked(evt);
            }
        });

        jUpdate.setText("UPDATE");
        jUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUpdateMouseClicked(evt);
            }
        });

        jDelete.setText("DELETE");
        jDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDeleteMouseClicked(evt);
            }
        });

        jPassword.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N

        jDesignation.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N

        jRole.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N

        jPasswordLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jPasswordLabel.setText("PASSWORD");

        jMenu.setText("MAIN MENU");
        jMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDesignation)
                                    .addComponent(jName))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jPasswordLabel))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPassword)
                                    .addComponent(jIDNumber)
                                    .addComponent(jRole))))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jUpdate)
                                    .addComponent(jNew))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSave, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDelete, jNew, jSave, jUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jDesignation, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jIDNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRole, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jPasswordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNew)
                            .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUpdate)
                            .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDelete, jNew, jSave, jUpdate});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        String fullname = jTable.getValueAt(jTable.getSelectedRow(), 1).toString();
        String designation = jTable.getValueAt(jTable.getSelectedRow(), 2).toString();
        String idNumber = jTable.getValueAt(jTable.getSelectedRow(), 3).toString();
        String role = jTable.getValueAt(jTable.getSelectedRow(), 4).toString();
        jName.setText(fullname);
        jDesignation.setText(designation);
        jIDNumber.setText(idNumber);
        jRole.setText(role);
        jDelete.setEnabled(true);
        jUpdate.setEnabled(true);
        jPassword.setVisible(false);
        jPasswordLabel.setVisible(false);
        jSave.setEnabled(false);
    }//GEN-LAST:event_jTableMouseClicked

    private void jDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeleteMouseClicked
            String[] options = {"Yes", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Sure To Delete?", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (answer == 0) {
            int index = jTable.getSelectedRow();
            String id = jTable.getValueAt(index, 0).toString();
            if (new Database().deleteData(id)) {

                jName.setText("");
                jDesignation.setText("");
                jIDNumber.setText("");
                jRole.setText("");
                jPassword.setVisible(false);
                jPasswordLabel.setVisible(false);
                retrieveData();
            } else
            {
                JOptionPane.showMessageDialog(null, "Not Deleted");
            }
        }
    }//GEN-LAST:event_jDeleteMouseClicked

    private void jUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUpdateMouseClicked
        int index = jTable.getSelectedRow();
        String id = jTable.getValueAt(index, 0).toString();
        if (new Database().updateData(id, jName.getText(), jDesignation.getText(), jIDNumber.getText(), jRole.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");

                jName.setText("");
                jDesignation.setText("");
                jIDNumber.setText("");
                jRole.setText("");
                jPassword.setVisible(false);
                jPasswordLabel.setVisible(false);
            retrieveData();
        } else {
            JOptionPane.showMessageDialog(null, "Not Updated");
        }
    }//GEN-LAST:event_jUpdateMouseClicked

    private void jSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSaveMouseClicked
        if (new Database().addData(jName.getText(), jDesignation.getText(), jIDNumber.getText(), jRole.getText(), jPassword.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Inserted");

                jName.setText("");
                jDesignation.setText("");
                jIDNumber.setText("");
                jRole.setText("");
                jPassword.setVisible(false);
                jPasswordLabel.setVisible(false);
                

            retrieveData();
        } else {
            JOptionPane.showMessageDialog(null, "Not Saved");
        }

    }//GEN-LAST:event_jSaveMouseClicked

    private void jNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewMouseClicked
               jSave.setEnabled(true);
               jPassword.setVisible(true);
               jPasswordLabel.setVisible(true);
               jUpdate.setEnabled(false);
               jDelete.setEnabled(false);
               jName.setText("");
               jDesignation.setText("");
               jIDNumber.setText("");
               jRole.setText("");
    }//GEN-LAST:event_jNewMouseClicked

    private void jMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuMouseClicked
                Menu mMenu = new Menu();
                Utility.centreOnScreen(mMenu);
                mMenu.setVisible(true);
                dispose();
    }//GEN-LAST:event_jMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jDesignation;
    private javax.swing.JTextField jIDNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jMenu;
    private javax.swing.JTextField jName;
    private javax.swing.JButton jNew;
    private javax.swing.JTextField jPassword;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JTextField jRole;
    private javax.swing.JButton jSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}