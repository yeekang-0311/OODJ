/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Feedback {
    private String name;
    private String email;
    private String feedback;
    private String role;

    public Feedback(String name, String email, String feedback, String role) {
        this.name = name;
        this.email = email;
        this.feedback = feedback;
        this.role = role;
    }
    
    
    public void createFeedback() {
        File file = new File("txtfiles/Feedbacks.txt");
        try (FileWriter fw = new FileWriter(file, true);
                PrintWriter pw = new PrintWriter(fw)) {
            pw.println(String.format("%s,%s,%s,%s", 
                    this.name,
                    this.email,
                    this.feedback,
                    this.role));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
