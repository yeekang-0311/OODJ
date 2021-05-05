/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

/**
 *
 * @author Admin
 */
public class ManagingStaff extends User{
    
    public ManagingStaff(String name, String email, String password) {
        super.name = name;
        super.email = email;
        super.password = password;
    }
    
    public void manageOrder() {
        new ManageOrderForm();
    }
    
    public void manageUser() {
        new ManageUserAccountForm();
    }
    
    public void addUserAccount() {
        new AddUserAccountForm();
    }
    
    public void manageFeedback() {
        new ManageFeedbackForm();
    }
    
    public void manageReport() {
        new ManageReportForm();
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + "\nEmail: " + this.email + "\nRole: Managing Staff ";
    }
    
    @Override
    public void login() {
        new ManagingStaffMainMenuForm(this).setVisible(true);
    }

}
