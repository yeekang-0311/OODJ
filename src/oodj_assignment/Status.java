/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

class Enums {
    
    enum Status {
        UNPAID("Unpaid"),
        AWAITING_CONFIRMATION("Awaiting Confirmation"), 
        AWAITING_PICK_UP("Awaiting Pick Up"),
        PICKED_UP("Picked Up"),
        OUT_FOR_DELIVERY("Out For Delivery"),
        DELIVERED("Delievered");
    
        private String text;
        private Status(String text) {
            this.text = text;
        }
    
        @Override
        public String toString() {
            return this.text;
        }
    
        public static Status fromString(String str) {
            for (Status st: values()) {
                if (st.text.equals(str)) {
                return st;
                }
            }
            throw new IllegalArgumentException("No constant with text " + str + " found");
        }
    }

}