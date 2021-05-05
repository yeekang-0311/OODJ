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
public class DeliveryStaff extends User{
    
    public DeliveryStaff(String name, String email, String password) {
        super.name = name;
        super.email = email;
        super.password = password;
    }
    
    public void updateOrder(Order ord) {
        ord.update();
    }
    
    public void editProfile() {
        UserEditOwnAccount dsea = new UserEditOwnAccount(new Frame(), true, this);
        dsea.setVisible(true);
    }
    
            
    @Override
    public String toString() {
        return "Name: " + this.name + "\nEmail: " + this.email + "\nRole: Delivery Staff ";
    }
    
    @Override
    public void login() {
        new DeliveryStaffMenu(this).setVisible(true);
    }
}
