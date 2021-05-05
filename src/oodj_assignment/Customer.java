/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import java.awt.Frame;

/**
 *
 * @author Admin
 */
public class Customer extends User{
    
    public Customer(String name, String email, String password) {
        super.name = name;
        super.email = email;
        super.password = password;
    }
    
    public void provideFeedback() {
        CreateFeedback cff = new CreateFeedback(new Frame(), true);
        cff.txtName.setText(this.getName());
        cff.txtEmail.setText(this.getEmail());
        cff.txtRole.setText("Customer");
        cff.setVisible(true);
    }
    
    public void editProfile() {
        UserEditOwnAccount dsea = new UserEditOwnAccount(new Frame(), true, this);
        dsea.setVisible(true);
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + "\nEmail: " + this.email + "\nRole: Customer ";
    }
    
    @Override
    public void login() {
    new CustomerMenu(this).setVisible(true);
    }
       
}
