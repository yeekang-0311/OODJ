/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

/**
 *
 * @author wsc2010
 */
public class Dimension {
    private double length;
    private double width;
    private double height;

    public Dimension(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public Dimension(String s) {
        this.fromString(s);
    }
    
    public void fromString(String s) {
        String[] arr = s.split("x");
        
        this.length = Double.parseDouble(arr[0]);
        this.width = Double.parseDouble(arr[1]);
        this.height = Double.parseDouble(arr[2]);
    }
    
    @Override
    public String toString() {
        return(length + "x" + width + "x" + height);
    }
    
    public double dimProduct() {
        return(length*width*height);
    }
}
