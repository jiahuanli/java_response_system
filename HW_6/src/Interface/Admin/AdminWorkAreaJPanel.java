/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admin;

import Business.Admin.UserAccountDirectory;
import Business.Admin.UserAccount;
import Business.Admin.PersonDirectory;
import Business.Market.MarketOfferCatalog;
import Business.SalesPerson.*;
import Business.Supplier.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author liuch
 */

public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
     private UserAccountDirectory ud;
    private SupplierDirectory sd;
    private SalesPersonDirectory spd;
    private MarketOfferCatalog moc;
    UserAccount account;
    PersonDirectory pd;
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccountDirectory ud, UserAccount account,PersonDirectory pd,SupplierDirectory sd,MarketOfferCatalog moc) {
        initComponents();
        this.sd = sd;
        spd = new SalesPersonDirectory();
        this.userProcessContainer=userProcessContainer;
        this.ud=ud;
        this.pd=pd;
        this.account=account;
        this.moc = moc;
        txtid.setText("ID:"+String.valueOf(account.getUserAccountID()));
        txtname.setText("User Name"+account.getUserName());
        txtRole.setText("Role:"+String.valueOf(account.getRole()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtid = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        txtRole = new javax.swing.JLabel();
        btnUserAccount = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnSalesPerson = new javax.swing.JButton();

        txtid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 102, 255));

        txtname.setDisplayedMnemonic('N');
        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 0, 255));

        txtRole.setDisplayedMnemonic('n');
        txtRole.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRole.setForeground(new java.awt.Color(255, 0, 255));

        btnUserAccount.setText("Manage User Account>>");
        btnUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAccountActionPerformed(evt);
            }
        });

        btnSupplier.setText("Manage Supplier>>");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        btnSalesPerson.setText("Monitor Sales>>");
        btnSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRole, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 285, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalesPerson)
                    .addComponent(btnSupplier)
                    .addComponent(btnUserAccount))
                .addGap(54, 54, 54))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSalesPerson, btnSupplier, btnUserAccount});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(btnUserAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalesPerson)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAccountActionPerformed

      ManageUserAccountJPanel mujp = new ManageUserAccountJPanel(userProcessContainer, ud, account,pd,sd);
     userProcessContainer.add("ManageUserAccountJPanel",mujp);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserAccountActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        // TODO add your handling code here:
         ManageSupplierJPanel msp = new ManageSupplierJPanel(userProcessContainer, sd, account,pd);
         userProcessContainer.add("ManageSupplierJPanel",msp);
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesPersonActionPerformed
        // TODO add your handling code here:
        ManageSalesJPanel mspp = new ManageSalesJPanel(userProcessContainer, spd, sd, account,pd,moc);
         userProcessContainer.add("ManageSalesJPanel",mspp);
         CardLayout layout = (CardLayout)userProcessContainer.getLayout();
         layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSalesPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalesPerson;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnUserAccount;
    private javax.swing.JLabel txtRole;
    private javax.swing.JLabel txtid;
    private javax.swing.JLabel txtname;
    // End of variables declaration//GEN-END:variables
}
