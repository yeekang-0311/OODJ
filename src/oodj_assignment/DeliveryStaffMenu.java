/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import oodj_assignment.Enums.Status;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wsc2010
 */
public class DeliveryStaffMenu extends javax.swing.JFrame {
    DeliveryStaff delStaff = null;
    
    boolean filterOwn = false;
    
    boolean search = false;
    
    private ArrayList<String[]> orderList2;
    private ArrayList<String[]> filterOrderList;
    
    private String[] colHeaders = {"Order ID", "Customer Email", "Order Date Time", "Price",
        "Sender Name", "Sender Address", "Recipient Name", "Recipient Address",
        "Dimensions", "Weight", "Pickup Date", "Status", "Pickup Staff", "Delivery Staff"};
    /**
     * Creates new form DeliveryStaffMenu
     */
    public DeliveryStaffMenu(DeliveryStaff currentUser) {
        delStaff = currentUser;
        
        initComponents();
        
        Status[] staVal = Status.values();
        
        for (Status stat : Status.values()) {
            cmbStatus.addItem(stat.toString());
        }
        
        lblStaffName.setText(delStaff.getName());
        
        Date tdy = new Date();
        dtPickupDate.setDate(tdy);
        
        cmbStatus.setSelectedIndex(0);
        
        dtPickupDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dtPickupDatePropertyChange(evt);
            }
        });
        
        // Set icon jframe icon
        URL iconURL = getClass().getResource("/img/main_icon.jpg");
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStaffName = new javax.swing.JLabel();
        btnEditProfile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtSenderName = new javax.swing.JTextField();
        txtOrderId = new javax.swing.JTextField();
        txtRecipientName = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtDimensions = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtPickupStaff = new javax.swing.JTextField();
        txtDeliveryStaff = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSenderAddress = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRecipientAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dtPickupDate = new com.toedter.calendar.JDateChooser();
        chkFilterOwn = new javax.swing.JCheckBox();
        chkFilterDate = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        txtPickupDate = new javax.swing.JTextField();
        txtSearchOrder = new javax.swing.JTextField();
        btnSearchOrder = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delivery Staff Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblStaffName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStaffName.setText("StaffName");

        btnEditProfile.setText("Edit Profile");
        btnEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProfileActionPerformed(evt);
            }
        });

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    tblOrders.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblOrdersMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tblOrders);

    cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
    cmbStatus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbStatusActionPerformed(evt);
        }
    });

    jLabel1.setText("Pickup Date :");

    jLabel2.setText("Status :");

    btnUpdate.setText("Update Order");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
        }
    });

    txtSenderName.setText("SenderName");
    txtSenderName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtSenderName.setEnabled(false);

    txtOrderId.setText("OrderID");
    txtOrderId.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtOrderId.setEnabled(false);

    txtRecipientName.setText("RecipientName");
    txtRecipientName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtRecipientName.setEnabled(false);

    txtStatus.setText("Status");
    txtStatus.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtStatus.setEnabled(false);

    txtWeight.setText("Weight");
    txtWeight.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtWeight.setEnabled(false);

    txtDimensions.setText("Dimensions");
    txtDimensions.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtDimensions.setEnabled(false);

    txtPrice.setText("Price");
    txtPrice.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtPrice.setEnabled(false);

    txtPickupStaff.setText("PickupStaff");
    txtPickupStaff.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtPickupStaff.setEnabled(false);

    txtDeliveryStaff.setText("DeliveryStaff");
    txtDeliveryStaff.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtDeliveryStaff.setEnabled(false);

    txtSenderAddress.setColumns(20);
    txtSenderAddress.setLineWrap(true);
    txtSenderAddress.setRows(5);
    txtSenderAddress.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtSenderAddress.setEnabled(false);
    jScrollPane2.setViewportView(txtSenderAddress);

    txtRecipientAddress.setColumns(20);
    txtRecipientAddress.setLineWrap(true);
    txtRecipientAddress.setRows(5);
    txtRecipientAddress.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtRecipientAddress.setEnabled(false);
    jScrollPane3.setViewportView(txtRecipientAddress);

    jLabel3.setText("Order ID :");

    jLabel4.setText("Sender Name :");

    jLabel5.setText("Sender Address :");

    jLabel6.setText("Recipient Address :");

    jLabel7.setText("Recipient Name :");

    jLabel8.setText("Status :");

    jLabel9.setText("Weight :");

    jLabel10.setText("Dimensions");

    jLabel11.setText("Price :");

    jLabel12.setText("Pickup Staff :");

    jLabel13.setText("Delivery Staff :");

    dtPickupDate.setDateFormatString("dd/MM/yyyy");

    chkFilterOwn.setText("Show Mine Only");
    chkFilterOwn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkFilterOwnActionPerformed(evt);
        }
    });

    chkFilterDate.setText("Filter Date");
    chkFilterDate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkFilterDateActionPerformed(evt);
        }
    });

    jLabel14.setText("Pickup Date :");

    txtPickupDate.setText("PickupDate");
    txtPickupDate.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    txtPickupDate.setEnabled(false);

    txtSearchOrder.setToolTipText("");

    btnSearchOrder.setText("Search Order");
    btnSearchOrder.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSearchOrderActionPerformed(evt);
        }
    });

    btnClear.setText("Clear Search");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnEditProfile)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(593, 620, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(dtPickupDate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(chkFilterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chkFilterOwn)
                                    .addGap(171, 171, 171)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(85, 85, 85))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSearchOrder)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClear))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtSenderName)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtRecipientName)
                        .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(64, 64, 64)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel8)
                        .addComponent(jLabel14)
                        .addComponent(txtPickupStaff)
                        .addComponent(txtPrice)
                        .addComponent(txtWeight)
                        .addComponent(txtDimensions)
                        .addComponent(txtPickupDate)
                        .addComponent(txtStatus)
                        .addComponent(txtDeliveryStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(42, 42, 42))))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUpdate)
            .addGap(437, 437, 437))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnEditProfile)
                .addComponent(lblStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchOrder)
                        .addComponent(btnClear))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkFilterDate)
                                .addComponent(dtPickupDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkFilterOwn))))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(3, 3, 3)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtSenderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addGap(0, 0, 0)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtRecipientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel6)
                    .addGap(1, 1, 1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addGap(3, 3, 3)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPickupDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtDimensions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPickupStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtDeliveryStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(btnUpdate)
            .addContainerGap(107, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        LoginForm form = new LoginForm();
    }//GEN-LAST:event_formWindowClosed

    private void btnEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProfileActionPerformed
        // TODO add your handling code here:
        delStaff.editProfile();
        lblStaffName.setText(delStaff.getName());
    }//GEN-LAST:event_btnEditProfileActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
        refreshTable();
        refreshText(tblOrders.getSelectedRow());
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int row = tblOrders.getSelectedRow();
        int orderId = Integer.parseInt(tblOrders.getModel().getValueAt(row, 0).toString());
        Status stat = Status.fromString(tblOrders.getModel().getValueAt(row, 11).toString());
        
        int reply;
        switch(stat) {
            case AWAITING_CONFIRMATION:
                reply = JOptionPane.showConfirmDialog(null, "Confirm Order?", "ConfirmationS", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    Order ord = new Order(orderId, Status.AWAITING_PICK_UP);
                    ord.setPickupStaff(delStaff.getEmail());
                    delStaff.updateOrder(ord);
                    JOptionPane.showMessageDialog(null, "Updated Succesfully", "Update Order", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case AWAITING_PICK_UP:
                reply = JOptionPane.showConfirmDialog(null, "Confirm Order Picked Up?", "Confirm Pickup", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    Order ord = new Order(orderId, Status.PICKED_UP);
                    delStaff.updateOrder(ord);
                    JOptionPane.showMessageDialog(null, "Updated Succesfully", "Update Order", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case PICKED_UP:
                reply = JOptionPane.showConfirmDialog(null, "Confirm Out for Delivery?", "Out for Delivery", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    Order ord = new Order(orderId, Status.OUT_FOR_DELIVERY);
                    ord.setDeliveryStaff(delStaff.getEmail());
                    delStaff.updateOrder(ord);
                    JOptionPane.showMessageDialog(null, "Updated Succesfully", "Update Order", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case OUT_FOR_DELIVERY:
                reply = JOptionPane.showConfirmDialog(null, "Confirm Order Delivered?", "Confirm Delivery", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    Order ord = new Order(orderId, Status.DELIVERED);
                    delStaff.updateOrder(ord);
                    JOptionPane.showMessageDialog(null, "Updated Succesfully", "Update Order", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case DELIVERED:
                JOptionPane.showMessageDialog(null, "Already Delivered", "Delivered", JOptionPane.ERROR_MESSAGE);
                break;
        }
        refreshTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdersMouseClicked
        // TODO add your handling code here:
        refreshText(tblOrders.getSelectedRow());
    }//GEN-LAST:event_tblOrdersMouseClicked

    private void chkFilterOwnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFilterOwnActionPerformed
        // TODO add your handling code here:
//        updateTable();
        refreshTable();
        refreshText(tblOrders.getSelectedRow());
    }//GEN-LAST:event_chkFilterOwnActionPerformed

    private void chkFilterDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFilterDateActionPerformed
        // TODO add your handling code here:
        refreshTable();
        refreshText(tblOrders.getSelectedRow());
    }//GEN-LAST:event_chkFilterDateActionPerformed

    private void btnSearchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchOrderActionPerformed
        // TODO add your handling code here:
        search = true;
        dtPickupDate.setEnabled(false);
        chkFilterDate.setEnabled(false);
        cmbStatus.setEnabled(false);
        chkFilterOwn.setEnabled(false);
        if (filterOrderList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Order Not Found", "Search Order", JOptionPane.INFORMATION_MESSAGE);
            clearSearch();
        } else {
            refreshTable();
            tblOrders.selectAll();
        }

    }//GEN-LAST:event_btnSearchOrderActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearSearch();
    }//GEN-LAST:event_btnClearActionPerformed

    private void dtPickupDatePropertyChange(java.beans.PropertyChangeEvent evt) {                                            
        // not Generated
        refreshTable();
        refreshText(tblOrders.getSelectedRow());
    }  
  
    private void refreshText(int row) {
        if (row != -1) {
            txtOrderId.setText(tblOrders.getModel().getValueAt(row, 0).toString());
            txtPrice.setText(tblOrders.getModel().getValueAt(row, 3).toString());
            txtSenderName.setText(tblOrders.getModel().getValueAt(row, 4).toString());
            txtSenderAddress.setText(tblOrders.getModel().getValueAt(row,5).toString());
            txtRecipientName.setText(tblOrders.getModel().getValueAt(row, 6).toString());
            txtRecipientAddress.setText(tblOrders.getModel().getValueAt(row, 7).toString());
            txtDimensions.setText(tblOrders.getModel().getValueAt(row, 8).toString());
            txtWeight.setText(tblOrders.getModel().getValueAt(row, 9).toString());
            txtPickupDate.setText(tblOrders.getModel().getValueAt(row, 10).toString());
            txtStatus.setText(tblOrders.getModel().getValueAt(row, 11).toString());
            txtPickupStaff.setText(tblOrders.getModel().getValueAt(row, 12).toString());
            txtDeliveryStaff.setText(tblOrders.getModel().getValueAt(row, 13).toString());
        }
        else {
            txtOrderId.setText("");
            txtPrice.setText("");
            txtSenderName.setText("");
            txtSenderAddress.setText("");
            txtRecipientName.setText("");
            txtRecipientAddress.setText("");
            txtDimensions.setText("");
            txtWeight.setText("");
            txtPickupDate.setText("");
            txtStatus.setText("");
            txtPickupStaff.setText("");
            txtDeliveryStaff.setText("");
        }
    }
    
    private void refreshTable() {
        orderList2 = GlobalMethods.readFileIntoArrList("txtfiles/Orders.txt");
        filterOrderList = new ArrayList<String[]>();
        
        Status status = null;
        boolean selectAll = false;
        if (cmbStatus.getSelectedItem().toString().equals("Select...")) {
            selectAll = true;
        } else {
            status = Status.fromString(cmbStatus.getSelectedItem().toString());
        }
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String filterPickupDate = df.format(dtPickupDate.getDate());
        
        for (String[] orderRow : orderList2) {
            if (!search) {
                if (!selectAll && chkFilterOwn.isSelected() && chkFilterDate.isSelected()) {
                    if (orderRow[11].equals(status.toString()) && (orderRow[12].equals(delStaff.getEmail()) || orderRow[13].equals(delStaff.getEmail())) && orderRow[10].equals(filterPickupDate)) {
                        filterOrderList.add(orderRow);
                    }
                }
                else if (!selectAll && chkFilterOwn.isSelected() && !chkFilterDate.isSelected()) {
                    if (orderRow[11].equals(status.toString()) && (orderRow[12].equals(delStaff.getEmail()) || orderRow[13].equals(delStaff.getEmail()))) {
                        filterOrderList.add(orderRow);
                    }
                }
                else if (!selectAll && !chkFilterOwn.isSelected() && chkFilterDate.isSelected()) {
                    if (orderRow[11].equals(status.toString()) && orderRow[10].equals(filterPickupDate)) {
                        filterOrderList.add(orderRow);
                    }
                }
                else if (!selectAll && !chkFilterOwn.isSelected() && !chkFilterDate.isSelected()) {
                    if (orderRow[11].equals(status.toString())) {
                        filterOrderList.add(orderRow);
                    }
                }
                else if (selectAll && chkFilterOwn.isSelected() && chkFilterDate.isSelected()) {
                    if ((orderRow[12].equals(delStaff.getEmail()) || orderRow[13].equals(delStaff.getEmail())) && orderRow[10].equals(filterPickupDate)) {
                        filterOrderList.add(orderRow);
                    }
                }
                else if (selectAll && chkFilterOwn.isSelected() && !chkFilterDate.isSelected()) {
                    if ((orderRow[12].equals(delStaff.getEmail()) || orderRow[13].equals(delStaff.getEmail()))) {
                        filterOrderList.add(orderRow);
                    }
            }
                else if (selectAll && !chkFilterOwn.isSelected() && chkFilterDate.isSelected()) {
                    if (orderRow[10].equals(filterPickupDate)) {
                        filterOrderList.add(orderRow);
                    }
                }
                else {
                    filterOrderList.add(orderRow);
                }
            }
            else {
                if (orderRow[0].equals(txtSearchOrder.getText())) {
                    filterOrderList.add(orderRow);
                }
            }
        }
        
        String[][] rows = GlobalMethods.convertTo2dArray(filterOrderList);
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setDataVector(rows, colHeaders);
    }
    
    private void clearSearch () {
        search=false;
        txtSearchOrder.setText("");
        refreshTable();
        refreshText(tblOrders.getSelectedRow());
        dtPickupDate.setEnabled(true);
        chkFilterDate.setEnabled(true);
        cmbStatus.setEnabled(true);
        chkFilterOwn.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEditProfile;
    private javax.swing.JButton btnSearchOrder;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkFilterDate;
    private javax.swing.JCheckBox chkFilterOwn;
    private javax.swing.JComboBox<String> cmbStatus;
    private com.toedter.calendar.JDateChooser dtPickupDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblStaffName;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtDeliveryStaff;
    private javax.swing.JTextField txtDimensions;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtPickupDate;
    private javax.swing.JTextField txtPickupStaff;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextArea txtRecipientAddress;
    private javax.swing.JTextField txtRecipientName;
    private javax.swing.JTextField txtSearchOrder;
    private javax.swing.JTextArea txtSenderAddress;
    private javax.swing.JTextField txtSenderName;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
