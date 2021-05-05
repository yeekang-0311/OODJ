/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodj_assignment;

import oodj_assignment.Enums.Status;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author wsc2010
 */

public class Order implements CalculatablePrice {
    private int orderId;
    private String customer;
    private Date orderDateTime;
    private double price;
    private String senderName;
    private String senderAddress;
    private String recipientName;
    private String recipientAddress;
    private Dimension dimensions;
    private double weight;
    private Date pickupDate;
    private Status status;
    private String pickupStaff;
    private String deliveryStaff;
    
    public Order() {
    }
    
    public Order(int orderId, Status status) {
        this.orderId = orderId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }
    
    public String getCustomer() {
        return customer;
    }

    public Date getOrderDateTime() {
        return orderDateTime;
    }

    public double getPrice() {
        return price;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public Status getStatus() {
        return status;
    }

    public String getPickupStaff() {
        return pickupStaff;
    }

    public String getDeliveryStaff() {
        return deliveryStaff;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setOrderDateTime(Date orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public void setDimensions(Dimension Dimensions) {
        this.dimensions = Dimensions;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPickupStaff(String pickupStaff) {
        this.pickupStaff = pickupStaff;
    }

    public void setDeliveryStaff(String deliveryStaff) {
        this.deliveryStaff = deliveryStaff;
    }
    
    private void generateOrderId() {
        File file = new File("txtfiles/Orders.txt");
        try (Scanner sc = new Scanner(file)) {
            String orderId;
            int newOrderId = 0;
            while (sc.hasNextLine()) {
                orderId = sc.nextLine().split("\\|", -1)[0];
                newOrderId = Integer.parseInt(orderId) + 1;
            }
            this.orderId = newOrderId;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(this.orderId);
    }
    
    
    public void update() {
        File oldFile = new File("txtfiles/Orders.txt");
        File tempFile = new File("txtfiles/temp.txt");
        try {
            Scanner sc = new Scanner(oldFile);
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            while (sc.hasNext()) {
                String currLine = sc.nextLine();
                String currLineArray[] = currLine.split("\\|", -1);
                String tempOrderId = currLineArray[0];
                switch (this.status) {
                    case AWAITING_PICK_UP:
                        this.deliveryStaff = currLineArray[13];
                        break;
                    case OUT_FOR_DELIVERY:
                        this.pickupStaff = currLineArray[12];
                        break;
                    default:
                        this.pickupStaff = currLineArray[12];
                        this.deliveryStaff = currLineArray[13];
                }
                if (tempOrderId.equals(String.format("%09d", this.orderId))) {
                    pw.println(String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s",
                            currLineArray[0],
                            currLineArray[1],
                            currLineArray[2],
                            currLineArray[3],
                            currLineArray[4],
                            currLineArray[5],
                            currLineArray[6],
                            currLineArray[7],
                            currLineArray[8],
                            currLineArray[9],
                            currLineArray[10],
                            this.status.toString(),
                            this.pickupStaff,
                            this.deliveryStaff));
                }
                else {
                    pw.println(currLine);
                }
            }
            pw.flush();
            pw.close();
            pw = null;
            bw.close();
            bw = null;
            fw.close();
            fw = null;
            sc.close();
            sc = null;
            System.gc();
            
            oldFile.delete();
            tempFile.renameTo(oldFile);
        }
        catch (IOException e){
            System.out.print(e);
        }
    }
    
    public void deleteOrder(String ordId) {
        File oldFile = new File("txtfiles/Orders.txt");
        File tempFile = new File("txtfiles/temp.txt");
        try {
            Scanner sc = new Scanner(oldFile);
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            while (sc.hasNext()) {
                String currLine = sc.nextLine();
                String currLineArray[] = currLine.split("\\|", -1);
                if (ordId.equals(currLineArray[0])) {
                    
                }
                else {
                    pw.println(currLine);
                }
            }
            pw.flush();
            pw.close();
            pw = null;
            bw.close();
            bw = null;
            fw.close();
            fw = null;
            sc.close();
            sc = null;
            System.gc();
            
            oldFile.delete();
            tempFile.renameTo(oldFile);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    

    @Override
    public String toString() {
        DateFormat dtf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        return(String.format("%09d|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s", 
                this.orderId,
                this.customer,
                dtf.format(this.orderDateTime),
                this.price,
                this.senderName,
                this.senderAddress,
                this.recipientName,
                this.recipientAddress,
                this.dimensions,
                this.weight,
                df.format(this.pickupDate),
                this.status,
                this.pickupStaff,
                this.deliveryStaff));
    }
    
    public void create() {
        this.generateOrderId();
        System.out.println(this.toString());
        File file = new File("txtfiles/Orders.txt");
        try (FileWriter fw = new FileWriter(file, true);
                PrintWriter pw = new PrintWriter(fw)) {
            pw.println(this.toString());
            pw.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void readOrder() {
        File file = new File("txtfiles/Orders.txt");
        try {
            Scanner sc = new Scanner(file);
            String currLine;
            while (sc.hasNext()) {
                currLine = sc.nextLine();
                String[] arr = currLine.split("\\|", -1);
                if (arr[0].equals(String.format("%09d", this.orderId))) {
                    this.customer = arr[1];
                    this.senderName = arr[4];
                    this.senderAddress = arr[5];
                    this.recipientName = arr[6];
                    this.recipientAddress = arr[7];
                    Dimension dim = new Dimension(arr[8]);
                    this.dimensions = dim;
                    this.weight = Double.parseDouble(arr[9]);
                    this.status = Status.fromString(arr[11]);
                    this.pickupStaff = arr[12];
                    this.deliveryStaff = arr[13];
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void editOrder() {
        File oldFile = new File("txtfiles/Orders.txt");
        File tempFile = new File ("txtfiles/temp.txt");
        try {
            Scanner sc = new Scanner(oldFile);
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String currLine;
            while (sc.hasNext()) {
                currLine = sc.nextLine();
                String[] arr = currLine.split("\\|", -1);
                if (arr[0].equals(String.format("%09d", this.orderId))) {
                    pw.println(this.toString());
                }
                else {
                    pw.println(currLine);
                }
            }
            pw.flush();
            pw.close();
            pw = null;
            bw.close();
            bw = null;
            fw.close();
            fw = null;
            sc.close();
            sc = null;
            System.gc();
            
            oldFile.delete();
            tempFile.renameTo(oldFile);
        }
        catch (Exception e) {
            System.out.println("fail to edit Order : " + e);
        }
    }

    @Override
    public double calcPrice(Dimension dim, double weight) {
        double basePrice = 5;
        return(dim.dimProduct() * weight * DIVISOR + basePrice);
    }
    
}
