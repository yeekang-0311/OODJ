/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ManageUserAccountForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageDeliveryStaff
     */
    public ManageUserAccountForm() {
        initComponents();
        setVisible(true);
        disableText();
        disableBtn();
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setTitle("Manage User Accounts");
        // Set icon jframe icon
        URL iconURL = getClass().getResource("/img/main_icon.jpg");
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        
        /* center the jframe form */
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        Jpanel = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
        });
        txtSearch.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtSearchInputMethodTextChanged(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSearchPropertyChange(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        Jpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPassword.setText("Password");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword))
                .addGap(38, 38, 38)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Manage User Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        searchUsers();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void searchUsers() {
        boolean dataFound = false;
        
        try(BufferedReader br = new BufferedReader(new FileReader("txtfiles/Users.txt"))){
            
            Object records[] = br.lines().toArray();
            for(int index=0; index<records.length; index++){
                String eachline = records[index].toString();
                String DataRow[] = eachline.split(",");
                
                if(txtSearch.getText().equals(DataRow[0]) 
                        || txtSearch.getText().equals(DataRow[1])) {
                    
                    txtName.setText(DataRow[0]);
                    txtEmail.setText(DataRow[1]);
                    enableText();
                    txtName.requestFocus();
                    
                    JOptionPane.showMessageDialog(rootPane, "Result Found !!", "Result", JOptionPane.INFORMATION_MESSAGE);
                    dataFound = true;
                    enableBtn();
                    break;  
                } 

            }
            
            if(dataFound == false) {
                JOptionPane.showMessageDialog(rootPane, "Result Not Found !!", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch(Exception ex) {
            System.out.print(ex);
        }
    }
    
    private void disableText(){
        txtName.setEditable(false);
        txtEmail.setEditable(false);
    }
    
    private void disableBtn() {
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    private void enableBtn() {
        btnSave.setEnabled(true);
        btnDelete.setEnabled(true);
    }
    
    private void enableText(){
        txtName.setEditable(true);
        txtEmail.setEditable(true);
    }
    
    private void updateData() {
        String tempFile = "temp.txt";
        String filepath = "txtfiles/Users.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        FileWriter fw = null;
        PrintWriter pws = null;
        
        try(BufferedReader br = new BufferedReader(new FileReader("txtfiles/Users.txt")))
        {
            fw = new FileWriter(tempFile,true);
            pws = new PrintWriter(fw);      
           
            Object records[] = br.lines().toArray();
            for(int index=0; index < records.length; index++){
                String eachline = records[index].toString();
                String DataRow[] = eachline.split(",");
                if(txtSearch.getText().equals(DataRow[0]) 
                        || txtSearch.getText().equals(DataRow[1])) {

                    if (txtPassword.getText().equals("")){
                        pws.println(txtName.getText() + "," + txtEmail.getText() + "," 
                            + DataRow[2] + "," + DataRow[3]);
                    }else {
                        pws.println(txtName.getText() + "," + txtEmail.getText() + "," 
                            + GlobalMethods.hashString(txtPassword.getText()) + "," + DataRow[3]);
                        
                    }
                    
                }    
                else {
                    pws.println(DataRow[0] + "," + DataRow[1] + "," 
                            + DataRow[2] + "," + DataRow[3]);
                }
            }

            JOptionPane.showMessageDialog(rootPane, "User Account File Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearText();
            disableText();
            disableBtn();

            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(rootPane, ex , "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if (pws != null) {
                pws.flush();
                pws.close(); 
            }
            
            if (oldFile.exists()){oldFile.delete();}    //Delete old file if exist
            File dump = new File(filepath);
            newFile.renameTo(dump);
            
        }
    }
      
    private void deleteData() {
        String tempFile = "temp.txt";
        String filepath = "txtfiles/Users.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        FileWriter fw = null;
        PrintWriter pws = null;
        
        try(BufferedReader br = new BufferedReader(new FileReader("txtfiles/Users.txt")))
        {
            fw = new FileWriter(tempFile,true);
            pws = new PrintWriter(fw);      
           
            Object records[] = br.lines().toArray();
            for(int index=0; index < records.length; index++){
                String eachline = records[index].toString();
                String DataRow[] = eachline.split(",");
                
                if(txtSearch.getText().equals(DataRow[0]) 
                        || txtSearch.getText().equals(DataRow[1])) {
                    
                }
                else {
                    pws.println(DataRow[0] + "," + DataRow[1] + "," 
                            + DataRow[2] + "," + DataRow[3]);
                }
            }

            JOptionPane.showMessageDialog(rootPane, "User Account Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearText();
            disableText();
            disableBtn();


        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(rootPane, ex , "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            if (pws != null) {
                pws.flush();
                pws.close(); 
            }
            
            if (oldFile.exists()){oldFile.delete();}    //Delete old file if exist
            File dump = new File(filepath);
            newFile.renameTo(dump);
            
        }
    }
    
    private void clearText() {
        txtName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtSearch.setText("");
    }
    
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

        /* Run search function after hitting enter in searchbox */
        if(evt.getKeyCode() == 10){
            searchUsers();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        InputValidator iv = new InputValidator();
        if(iv.isEmpty(txtName.getText()) || iv.isEmpty(txtEmail.getText())){
            JOptionPane.showMessageDialog(rootPane, "Name or Email cannot be blank" , "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            updateData();
        }
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(
                rootPane,
                "Are you sure you want to delete " + txtSearch.getText() + " account"
        );  
        if(option == JOptionPane.YES_OPTION){  
            deleteData();
        } 

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtSearchInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSearchInputMethodTextChanged

    private void txtSearchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtSearchPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPropertyChange

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        // TODO add your handling code here:
        clearText();
        disableText();
        disableBtn();
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        GlobalMethods.noCommaText(txtName, evt);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        GlobalMethods.noCommaText(txtEmail, evt);
    }//GEN-LAST:event_txtEmailKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
