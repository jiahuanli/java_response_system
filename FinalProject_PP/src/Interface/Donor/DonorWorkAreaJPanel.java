/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Donor;

import Business.Area.Area;
import Business.District.District;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author jiahuanli
 */
public class DonorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BtnJPanel
     */
    JPanel container;
    UserAccount account;
    Area area;
    District district;
    EcoSystem system;
    
    public DonorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Area area, District district,EcoSystem system) {
        
        this.container=container;
        this.account=account;
        this.area=area;
        this.district=district;
        this.system=system;
        
        initComponents();
        
//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnDonate = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnOthers = new javax.swing.JButton();
        donorContainer = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        btnDonate.setText("donate");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        btnSetting.setText("setting");
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnHistory.setText("history");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnOthers.setText("Others");
        btnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOthersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnOthers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDonate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistory)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnDonate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOthers)
                .addGap(3, 3, 3)
                .addComponent(btnSetting)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        donorContainer.setLayout(new java.awt.CardLayout());

        lbl.setBackground(new java.awt.Color(255, 255, 255));
        donorContainer.add(lbl, "card2");

        jSplitPane1.setRightComponent(donorContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        DonateBtnJPanel dbjpl = new DonateBtnJPanel(donorContainer,account,system);
        donorContainer.add("DonateBtnJPanel", dbjpl);
        ((java.awt.CardLayout) donorContainer.getLayout()).next(donorContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        HistoryJPanel hjp = new HistoryJPanel(donorContainer,account,system);
        donorContainer.add("HistoryJPanel", hjp);
        ((java.awt.CardLayout) donorContainer.getLayout()).next(donorContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOthersActionPerformed
        OthersJPanel ojp = new OthersJPanel(donorContainer,system);
        donorContainer.add("OthersJPanel", ojp);
        ((java.awt.CardLayout) donorContainer.getLayout()).next(donorContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOthersActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        SettingJPanel sjp = new SettingJPanel(donorContainer,account, system);
        donorContainer.add("SettingJPanel", sjp);
        ((java.awt.CardLayout) donorContainer.getLayout()).next(donorContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnOthers;
    private javax.swing.JButton btnSetting;
    private javax.swing.JPanel donorContainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}
