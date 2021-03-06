/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.List;

import Business.System.System;
import Business.System.Disease;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jiahuanli
 */
public class DiseaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiseaseJPanel
     */
    private JPanel basePanel;
    private System system;
    
    DiseaseJPanel(JPanel basePanel, System system) {
        initComponents();
        this.basePanel = basePanel;
        this.system = system;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblDisease.getModel();
        dtm.setRowCount(0);
        for(Disease disease : system.getDiseaseCatalog().getDiseaseCatalog()){
            Object row[] = new Object[2];
            row[0]=disease;
            row[1]=disease.getDiseaseName();
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
        tblDisease = new javax.swing.JTable();
        txtCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtUpdate = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Disease");

        tblDisease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisease);
        if (tblDisease.getColumnModel().getColumnCount() > 0) {
            tblDisease.getColumnModel().getColumn(0).setResizable(false);
            tblDisease.getColumnModel().getColumn(1).setResizable(false);
        }

        txtCreate.setText("New Disease>>");
        txtCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtUpdate.setText("Update Disease>>");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUpdate, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateActionPerformed
        // TODO add your handling code here:
        DiseaseNewJPanel panel = new DiseaseNewJPanel(basePanel,system);
        basePanel.add("DiseaseNewJPanel",panel);
        CardLayout layout = (CardLayout)basePanel.getLayout();
        layout.next(basePanel);
    }//GEN-LAST:event_txtCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        basePanel.remove(this);
        CardLayout layout = (CardLayout)basePanel.getLayout();
        layout.previous(basePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDisease.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select!");
        }else{
            Disease disease = (Disease)tblDisease.getValueAt(selectedRow, 0);
            DiseaseUpdateJPanel panel = new DiseaseUpdateJPanel(basePanel,disease);
            basePanel.add("DiseaseUpdateJPanel",panel);
            CardLayout layout = (CardLayout)basePanel.getLayout();
            layout.next(basePanel);
        }
    }//GEN-LAST:event_txtUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisease;
    private javax.swing.JButton txtCreate;
    private javax.swing.JButton txtUpdate;
    // End of variables declaration//GEN-END:variables
}
