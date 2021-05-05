/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.StringJoiner;
import static javax.swing.GroupLayout.Alignment.values;


/**
 *
 * @author Admin
 */
public class Report {
    
    final String reportDate;
    private String startDate;
    private String endDate;
    
    public Report() {
        this.reportDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
    }
    
    /* ======================
    * Remove the try blocks after cleaning order txt files
    * =======================
    */

    public void setStartDate(String startDate) {
        this.startDate = startDate; 
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    private Object[] readOrderFile(){
        try (BufferedReader br = new BufferedReader(new FileReader("txtfiles/Orders.txt"))) 
        {
            Object[] datas = br.lines().toArray();
            ArrayList<String> contents = new ArrayList<String>();
            SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat dtformat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            
            for(int index=0;index<datas.length;index++){
                String eachline = datas[index].toString();
                String[] row = eachline.split("\\|");

                if (!row[11].equals("Unpaid")){
                    if (this.startDate == null && this.endDate == null){
                        // For date range null
                        contents.add(eachline);
                    }else if (this.startDate == null){
                        // Filter the end date range  
                            Date parsedEndDate = dformat.parse(endDate);                         
                            Date orderDate = dtformat.parse(row[2]);  
                            if (orderDate.before(parsedEndDate)){
                                contents.add(eachline);
                            }

                    }else if (this.endDate == null) {
                        // Filter the start date range    
                            Date parsedStartDate = dformat.parse(startDate);                          
                        Date orderDate = dtformat.parse(row[2]);  
                        if (parsedStartDate.before(orderDate)){
                            contents.add(eachline);;
                            }

                    }else {
                        Date parsedStartDate = dformat.parse(startDate);    
                        Date parsedEndDate = dformat.parse(endDate);
                        Date orderDate = dtformat.parse(row[2]);  
                        if (parsedStartDate.before(orderDate) && orderDate.before(parsedEndDate)){
                            contents.add(eachline);
                        }

                    }
                    
                                      
                }
            }
            return contents.toArray(); 

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
    
    public Object[] generateDeliveryStaffReport(){
        ArrayList<String> deliveryStaff = new ArrayList<String>();
        Object ordersRow[] = this.readOrderFile();
            
            // Get all delievry staff names
            for(int index=0;index<ordersRow.length;index++){
                String eachline = ordersRow[index].toString();
                String []row = eachline.split("\\|");
                
                // Exclude null value
                if (!row[12].equals("null")){
                    deliveryStaff.add(row[12]);
                }
                if (!row[13].equals("null")){
                    deliveryStaff.add(row[13]);
                }
                        
            }
            HashSet<String> uniqueStaff = new HashSet<>(deliveryStaff);
            
            ArrayList<String> reportRow = new ArrayList<String>();
            for(String staff : uniqueStaff){
                int totalDelivered = 0;
                int totalPickup = 0;
                
                for(int index=0;index<ordersRow.length;index++){
                    String eachline = ordersRow[index].toString();
                    String []row = eachline.split("\\|");
                    if(staff.equals(row[12])){
                        totalPickup += 1;
                    }
                    if(staff.equals(row[13])){
                        totalDelivered += 1;
                    }

                }
                reportRow.add(staff+","+totalPickup+","+totalDelivered);
            }
            
            return reportRow.toArray();
    }
    
    public Object[] generateSalesReport() {
        ArrayList<String> salesReport = new ArrayList<String>();
        Object[] records = readOrderFile();
        for(int index=0;index<records.length;index++){
                String eachline = records[index].toString();
                String []row = eachline.split("\\|");
                
                salesReport.add(row[0]+"|"+row[2]+"|"+row[3]+"|"+row[4]+"|"+row[8]+"|"+row[9]);
            }
        return salesReport.toArray();
    }
}
