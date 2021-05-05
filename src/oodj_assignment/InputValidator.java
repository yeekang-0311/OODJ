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
public class InputValidator {
    
    public boolean isNumericOnly(String input){
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    
    public boolean isEmpty(String input){
        if (input.equals("") || input.equals(" ")){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean isLettersOnly(String input){
        if (!input.matches("[a-zA-Z_ ]+")) {
            return false;
        }else {
            return true;
        }
    }
    
}
