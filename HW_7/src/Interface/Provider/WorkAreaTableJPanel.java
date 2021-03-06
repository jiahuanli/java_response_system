/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Provider;

import Interface.Manufacturer.*;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ManufacturerEnterprise;
import Business.Organization.Organization;
import Business.Staff.Person;
import Interface.List.*;
import Business.System.System;
import Business.System.Disease;
import Business.WorkArea.WorkArea;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jiahuanli
 */
public final class WorkAreaTableJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProviderTableJPanel
     */
    private JPanel basePanel;
    private Enterprise selectEnterprise;
    private Organization selectOrganization;


    WorkAreaTableJPanel(JPanel basePanel, Enterprise selectEnterprise, Organization organization) {
        initComponents();
        this.basePanel = basePanel;
        this.selectEnterprise = selectEnterprise;
        selectOrganization = organization;
        populateTable1();
    }
    
    public void populateTable1(){
        DefaultTableModel dtm = (DefaultTableModel)tblWorkArea.getModel();
        dtm.setRowCount(0);
        for(WorkArea workArea : selectOrganization.getWorkAreaDirectory().getWorkAreaDirectory()){
            Object row[] = new Object[3];
            row[0]=workArea;
            row[1]=workArea.getWorkAreaID();
            row[2]=workArea.getWorkAreaLocation();
            dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkArea = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnDetail = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Work Area");

        tblWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkArea);
        if (tblWorkArea.getColumnModel().getColumnCount() > 0) {
            tblWorkArea.getColumnModel().getColumn(0).setResizable(false);
            tblWorkArea.getColumnModel().getColumn(1).setResizable(false);
            tblWorkArea.getColumnModel().getColumn(2).setResizable(false);
        }

        btnSubmit.setText("submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Location");

        btnDetail.setText("Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDetail)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetail)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnBack))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        boolean equal = false;
        for(WorkArea workArea : selectOrganization.getWorkAreaDirectory().getWorkAreaDirectory()){
            if(workArea.getWorkAreaName().equals(txtName.getText())){
                 workArea.setWorkAreaLocation(txtLocation.getText());
                 equal = true;
            }
        }
        if(!equal){
        WorkArea workArea = selectOrganization.getWorkAreaDirectory().addWorkArea(txtName.getText());
        workArea.setWorkAreaLocation(txtLocation.getText());
        } 
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        basePanel.remove(this);
        CardLayout layout = (CardLayout)basePanel.getLayout();
        layout.previous(basePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkArea.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select!");
        }else{
            WorkArea workArea = (WorkArea)tblWorkArea.getValueAt(selectedRow, 0);
            txtLocation.setText(workArea.getWorkAreaLocation());
            txtName.setText(workArea.getWorkAreaName());
        }
    }//GEN-LAST:event_btnDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkArea;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
