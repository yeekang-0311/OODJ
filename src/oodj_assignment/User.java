/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
abstract public class User {
    protected String name;
    protected String email;
    protected String password;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    abstract public void login();

    public void editAccountDetails() {
        File oldFile = new File("txtfiles/Users.txt");
        File tempFile = new File("txtfiles/temp.txt");
        try {
            Scanner sc = new Scanner(oldFile);
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            while (sc.hasNext()) {
                String currLine = sc.nextLine();
                String currLineArray[] = currLine.split(",");
                String tempEmail = currLineArray[1];
                if (tempEmail.equals(this.email)) {
                    pw.println(this.name + "," + this.email + "," + this.password + "," + currLineArray[3]);
                }
                else {
                    pw.println(currLine);
                }
            }
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            sc.close();
            oldFile.delete();
            tempFile.renameTo(oldFile);
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
