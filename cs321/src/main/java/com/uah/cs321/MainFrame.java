/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uah.cs321;

import javax.swing.DefaultListModel;
/**
 *
 * @author colin, david
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        composeEmailButton = new javax.swing.JButton();
        emailBoxesLabel = new javax.swing.JLabel();
        inboxButton = new javax.swing.JButton();
        sentButton = new javax.swing.JButton();
        trashButton = new javax.swing.JButton();
        settingsLabel = new javax.swing.JLabel();
        manageSitesButton = new javax.swing.JButton();
        manageUsersButton = new javax.swing.JButton();
        switchUserSiteButton = new javax.swing.JButton();
        emailListPanel = new javax.swing.JPanel();
        emailListScrollPanel = new javax.swing.JScrollPane();
        model = new DefaultListModel();
        emailList = new javax.swing.JList<>();
        inboxLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        composeEmailButton.setBackground(new java.awt.Color(153, 204, 255));
        composeEmailButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        composeEmailButton.setForeground(new java.awt.Color(0, 0, 0));
        composeEmailButton.setText("Compose Email");
        composeEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                composeEmailButtonActionPerformed(evt);
            }
        });

        emailBoxesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailBoxesLabel.setText("Email Boxes");

        inboxButton.setBackground(new java.awt.Color(153, 204, 255));
        inboxButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inboxButton.setForeground(new java.awt.Color(0, 0, 0));
        inboxButton.setText("Inbox");
        inboxButton.setToolTipText("");
        inboxButton.setMaximumSize(new java.awt.Dimension(72, 22));
        inboxButton.setMinimumSize(new java.awt.Dimension(72, 22));
        inboxButton.setPreferredSize(new java.awt.Dimension(72, 22));
        inboxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inboxButtonActionPerformed(evt);
            }
        });

        sentButton.setBackground(new java.awt.Color(153, 204, 255));
        sentButton.setForeground(new java.awt.Color(0, 0, 0));
        sentButton.setText("Sent");
        sentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentButtonActionPerformed(evt);
            }
        });

        trashButton.setBackground(new java.awt.Color(153, 204, 255));
        trashButton.setForeground(new java.awt.Color(0, 0, 0));
        trashButton.setText("Trash");
        trashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trashButtonActionPerformed(evt);
            }
        });

        settingsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        settingsLabel.setText("Settings");

        manageSitesButton.setBackground(new java.awt.Color(153, 204, 255));
        manageSitesButton.setForeground(new java.awt.Color(0, 0, 0));
        manageSitesButton.setText("Manage Sites");
        manageSitesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSitesButtonActionPerformed(evt);
            }
        });

        manageUsersButton.setBackground(new java.awt.Color(153, 204, 255));
        manageUsersButton.setForeground(new java.awt.Color(0, 0, 0));
        manageUsersButton.setText("Manage Users");
        manageUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUsersButtonActionPerformed(evt);
            }
        });

        switchUserSiteButton.setBackground(new java.awt.Color(153, 204, 255));
        switchUserSiteButton.setForeground(new java.awt.Color(0, 0, 0));
        switchUserSiteButton.setText("<html>&nbsp Switch <br> User/Site </html>");
        switchUserSiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchUserSiteButtonActionPerformed(evt);
            }
        });

        emailListPanel.setBackground(new java.awt.Color(153, 153, 153));
        emailListPanel.setForeground(new java.awt.Color(204, 204, 204));

        emailList.setModel(model);
        emailListScrollPanel.setViewportView(emailList);

        javax.swing.GroupLayout emailListPanelLayout = new javax.swing.GroupLayout(emailListPanel);
        emailListPanel.setLayout(emailListPanelLayout);
        emailListPanelLayout.setHorizontalGroup(
            emailListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailListScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                .addContainerGap())
        );
        emailListPanelLayout.setVerticalGroup(
            emailListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailListScrollPanel)
                .addContainerGap())
        );

        inboxLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inboxLabel.setText("Inbox");

        accountLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        accountLabel.setText("sample@test.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(switchUserSiteButton)
                    .addComponent(settingsLabel)
                    .addComponent(composeEmailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailBoxesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inboxButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageSitesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageUsersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(emailListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inboxLabel)
                        .addGap(576, 576, 576))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inboxLabel)
                    .addComponent(accountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(composeEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(emailBoxesLabel)
                        .addGap(27, 27, 27)
                        .addComponent(inboxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(settingsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(manageSitesButton)
                        .addGap(18, 18, 18)
                        .addComponent(manageUsersButton)
                        .addGap(46, 46, 46)
                        .addComponent(switchUserSiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void composeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_composeEmailButtonActionPerformed
        // TODO add your handling code here:
	new ComposeEmailDialog(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_composeEmailButtonActionPerformed

    private void inboxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inboxButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inboxButtonActionPerformed

    private void sentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sentButtonActionPerformed

    private void trashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trashButtonActionPerformed

    private void manageSitesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSitesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSitesButtonActionPerformed

    private void manageUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUsersButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageUsersButtonActionPerformed

    private void switchUserSiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchUserSiteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchUserSiteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public void openWindow() {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    public void AddItemToList(String item){  
        model.addElement(item);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton composeEmailButton;
    private javax.swing.JLabel emailBoxesLabel;
    private javax.swing.JList<String> emailList;
    private javax.swing.JPanel emailListPanel;
    private javax.swing.JScrollPane emailListScrollPanel;
    private javax.swing.JButton inboxButton;
    private javax.swing.JLabel inboxLabel;
    private javax.swing.JButton manageSitesButton;
    private javax.swing.JButton manageUsersButton;
    private javax.swing.JButton sentButton;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JButton switchUserSiteButton;
    private javax.swing.JButton trashButton;
    // End of variables declaration//GEN-END:variables
    private javax.swing.DefaultListModel model;
}
