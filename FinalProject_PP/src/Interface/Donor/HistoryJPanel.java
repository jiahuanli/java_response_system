/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Donor;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jiahuanli
 */
public class HistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HistoryJPanel
     */
    JPanel donorContainer;
    EcoSystem system;
    UserAccount account;
    Double totalMoney = 0.0;

    public HistoryJPanel(JPanel donorContainer, UserAccount account, EcoSystem system) {
        initComponents();

        this.donorContainer = donorContainer;
        this.account = account;
        this.system = system;

        populateDonateItemTable();
        populateDonateMoneyTable();
        populateTxtTotalMoney();

        txtTotalMoney.setText(String.valueOf(totalMoney));

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonateItem = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonateMoney = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalMoney = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("History");

        tblDonateItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Destination", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDonateItem);
        if (tblDonateItem.getColumnModel().getColumnCount() > 0) {
            tblDonateItem.getColumnModel().getColumn(0).setResizable(false);
            tblDonateItem.getColumnModel().getColumn(1).setResizable(false);
            tblDonateItem.getColumnModel().getColumn(2).setResizable(false);
            tblDonateItem.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("In-kind Items");

        tblDonateMoney.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Amount", "Destination", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDonateMoney);
        if (tblDonateMoney.getColumnModel().getColumnCount() > 0) {
            tblDonateMoney.getColumnModel().getColumn(0).setResizable(false);
            tblDonateMoney.getColumnModel().getColumn(1).setResizable(false);
            tblDonateMoney.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Money");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Total Money:");

        txtTotalMoney.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(371, 371, 371)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(496, 496, 496)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateDonateItemTable() {

        int rc = tblDonateItem.getModel().getRowCount() - 1;
        while (rc >= 0) {
            ((DefaultTableModel) tblDonateItem.getModel()).removeRow(rc);
            rc = rc - 1;
        }

        for (WorkRequest workRequest : system.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getSender().getUsername().equals(account.getUsername())) {
                Object[] row = new Object[4];
                if (workRequest.getMoney() == null) {
                    row[0] = workRequest.getItem().getName();
                    row[1] = workRequest.getItem().getQuantity();
                    row[2] = workRequest.getDestination();
                    row[3] = workRequest.getRequestDate();
                    ((DefaultTableModel) tblDonateItem.getModel()).addRow(row);
                }
            }
        }
    }

    public void populateDonateMoneyTable() {
        int rc = tblDonateMoney.getModel().getRowCount() - 1;
        while (rc >= 0) {
            ((DefaultTableModel) tblDonateMoney.getModel()).removeRow(rc);
            rc = rc - 1;
        }

        for (WorkRequest workRequest : system.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getSender().getUsername().equals(account.getUsername())) {
                Object[] row = new Object[3];
                if (workRequest.getMoney() != null) {

                    row[0] = workRequest.getMoney();
                    row[1] = workRequest.getDestination();
                    row[2] = workRequest.getRequestDate();
                    ((DefaultTableModel) tblDonateMoney.getModel()).addRow(row);

                }
            }
        }
    }

    public void populateTxtTotalMoney() {
        for (WorkRequest workRequest : system.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getSender().getUsername().equals(account.getUsername())) {
                
                if (workRequest.getMoney() != null) {

                   totalMoney += workRequest.getMoney();

                }
            }
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDonateItem;
    private javax.swing.JTable tblDonateMoney;
    private javax.swing.JTextField txtTotalMoney;
    // End of variables declaration//GEN-END:variables
}