/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Command;

import Business.Area.Area;
import Business.District.District;
import Business.MaterialList.Item;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huiwengan
 */
public class AdjustDistrictJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdjustDistrictJPanel
     */
    JPanel CommandContainer;
    District district;

    AdjustDistrictJPanel(JPanel CommandContainer, District district) {
        initComponents();
        this.CommandContainer = CommandContainer;
        this.district = district;

        populatetblRequest();
        populatetblMaterialD();
        populatecbxArea();
    }

    public void populatecbxArea() {
        cbxArea.removeAllItems();

        for (Area area : district.getAreaDirectory().getAreaList()) {
            cbxArea.addItem(String.valueOf(area));
        }
    }

    public void populatetblRequest() {
//        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
//        dtm.setRowCount(0);
//        for (WorkRequest workRequest : district.getWorkQueue().getWorkRequestList()) {
//         
//            if (workRequest.getSender().getRole().equals("Business.Role.PurchaseRole")) {
//                Object row[] = new Object[4];
//                row[0] = workRequest;
//                row[1] = workRequest.getId();               
//                row[2] = workRequest.getItem().getQuantity();
//            
//                dtm.addRow(row);
//            }
//        }
        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        dtm.setRowCount(0);
        for (WorkRequest workRequest : district.getWorkQueue().getWorkRequestList()) {
//            if (workRequest.getSender().getRole().getClass().getTypeName().equals("Business.Role.PurchaseRole")){
            Object row[] = new Object[3];
            row[0] = workRequest;
            row[1] = workRequest.getId();
            row[2] = workRequest.getItem().getQuantity();
            dtm.addRow(row);
//            }
        }
    }

    public void populatetblMaterialD() {
        DefaultTableModel dtm = (DefaultTableModel) tblMaterialD.getModel();
        dtm.setRowCount(0);

        for (Item item : district.getItemDirectory().getItemList()) {
            Object row[] = new Object[2];
            row[0] = item;
            row[1] = item.getQuantity();
            dtm.addRow(row);
        }

    }

    public void populatetblMaterialA() {
        DefaultTableModel dtm = (DefaultTableModel) tblMaterialA.getModel();
        dtm.setRowCount(0);
        for (Area area : district.getAreaDirectory().getAreaList()) {
            if (cbxArea.getSelectedItem().equals(area.getName())) {
                for (Item item : area.getItemDirectory().getItemList()) {
                    Object row[] = new Object[2];
                    row[0] = item;
                    row[1] = item.getQuantity();
                    dtm.addRow(row);
                }
            }
        }

    }

    public double distance(District d, Area b) {
        double distance = (d.getLocation_x() - b.getLocation_x()) * (d.getLocation_x() - b.getLocation_x()) + (d.getLocation_y() - b.getLocation_y()) * (d.getLocation_y() - b.getLocation_y());
        double n = Math.sqrt(distance);
        return n;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterialD = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMaterialA = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxArea = new javax.swing.JComboBox<>();
        btnTransferM = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "ID", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequest);
        if (tblRequest.getColumnModel().getColumnCount() > 0) {
            tblRequest.getColumnModel().getColumn(0).setResizable(false);
            tblRequest.getColumnModel().getColumn(1).setResizable(false);
            tblRequest.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel1.setText("Request from Purchase");

        tblMaterialD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMaterialD);

        tblMaterialA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMaterialA);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel2.setText("District");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel5.setText("Disaster area");

        cbxArea.setBackground(new java.awt.Color(255, 255, 255));
        cbxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAreaActionPerformed(evt);
            }
        });

        btnTransferM.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        btnTransferM.setText("Transfer");
        btnTransferM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferMActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel8.setText("Amount");

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        jLabel9.setText("Cost");

        txtCost.setEnabled(false);

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTransferM))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addComponent(jLabel8))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(34, 34, 34)
                                        .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransferM)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubmit))))))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAreaActionPerformed
        populatetblMaterialA();
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAreaActionPerformed

    private void btnTransferMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferMActionPerformed
        int selectedRow = tblMaterialD.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            Item item = (Item) tblMaterialD.getValueAt(selectedRow, 0);
            if (Integer.parseInt(txtAmount.getText()) <= item.getQuantity()) {
                for (Area area : district.getAreaDirectory().getAreaList()) {
                    if (cbxArea.getSelectedItem().equals(area)) {
                    }
                    txtCost.setText(String.valueOf(distance(district, area) * 500));
                }

            } else {
                JOptionPane.showMessageDialog(null, "there is no enough quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferMActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int selectedRow = tblMaterialD.getSelectedRow(); //the item quantity of area a -
        Item item1 = (Item) tblMaterialD.getValueAt(selectedRow, 0);

        for (Area area : district.getAreaDirectory().getAreaList()) {   //find the area b
            if (cbxArea.getSelectedItem().equals(area.getName())) {
                for (Item item3 : area.getItemDirectory().getItemList()) {
                    if (item3.getName().equals(item1.getName())) {/////////////If nor exist?
                        item3.setQuantity(item3.getQuantity() + Integer.parseInt(txtAmount.getText()));

                    }
                }
            }
        }
        item1.setQuantity(item1.getQuantity() - Integer.parseInt(txtAmount.getText()));
//        item2.setQuantity(item2.getQuantity() + Integer.parseInt(txtAmount.getText()));
//        district.setMoney((district.getMoney() - Double.valueOf(txtCost.getText())));//the district's money-
        populatetblMaterialD();
        populatetblMaterialA();
        JOptionPane.showMessageDialog(null, "Transfer successfully!", "Warning", JOptionPane.WARNING_MESSAGE);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnTransferM;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMaterialA;
    private javax.swing.JTable tblMaterialD;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCost;
    // End of variables declaration//GEN-END:variables
}
