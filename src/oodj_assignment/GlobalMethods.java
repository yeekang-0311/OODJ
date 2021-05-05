/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GlobalMethods {
    public static String hashString(String s) {
        
        try {
            /* Uses MD5 hashing */
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(s.getBytes()); 
            
            /* Convert byte array into signum representation */
            BigInteger no = new BigInteger(1, messageDigest); 
  
            /* Convert message digest into hex value */
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            return hashtext;
            
        } catch (NoSuchAlgorithmException e){        
            
            System.out.print(e);
            return null;
        }
    }
    
    public static String[][] convertTo2dArray(ArrayList<String[]> list) {
        String[][] data = new String[list.size()][];
        for (int i=0; i < list.size(); i++) {
            String[] row = list.get(i);
            data[i] = row;
            
        }
        return data;
    }
    
 
    public static void numericOnlyText(JTextField txt, KeyEvent evt) {
        if (txt.getText().equals("")) {
            txt.setText("0");
            txt.requestFocus();
            txt.selectAll();
        }
        char c = evt.getKeyChar();
        if (c >= KeyEvent.VK_0 && c <= KeyEvent.VK_9 || c == KeyEvent.VK_PERIOD) {
        }
        else{
            txt.repaint();
            evt.consume();
        }
    }
    
    public static void noCommaText(JTextField txt, KeyEvent evt) {                                         
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_COMMA) {
            txt.repaint();
            evt.consume();
        }  
    }
    
    public static void noPipeText(JTextField txt, KeyEvent evt) {
        if (evt.getKeyChar() == '|') {
            txt.repaint();
            evt.consume();
        }  
    }
    
    public static void noPipeText(JTextArea txt, KeyEvent evt) {
        if (evt.getKeyChar() == '|') {
            txt.repaint();
            evt.consume();
        }  
    }
    
    public static boolean isEmpty(String s) {
        if (s.strip().equals("")) {
            return true;
        }
        return false;
    }
    
    public static boolean isZero(String s) {
        if (Double.parseDouble(s) == 0) {
            return true;
        }
        return false;
    }
    
    public static ArrayList<String[]> readFileIntoArrList(String textFile) {
        ArrayList<String[]> orderList = new ArrayList<>();
        File file = new File(textFile);
        try {
            Scanner sc = new Scanner(file);
            String currLine;
            while (sc.hasNext()) {
                currLine = sc.nextLine();
                String[] currLineArray = currLine.split("\\|", -1);
                orderList.add(currLineArray);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.print(e);
        }
        return(orderList);
    }
    
}
