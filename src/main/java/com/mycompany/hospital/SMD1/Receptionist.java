/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital.SMD1;

/**
 *
 * @author ADJI
 */
import javax.swing.JOptionPane;

public class Receptionist extends User {
 User re = new User();
 private int r_id;
 private String r_name;
 public String text;

 public int getR_id() {
  return r_id;
 }

 public void setR_id(int r_id) {
  this.r_id = r_id;
 }

 public String getR_name() {
  return r_name;
 }

 public void setR_name(String r_name) {
  this.r_name = r_name;
 }
 
 
 public void Choice(){
  JOptionPane.showMessageDialog(re, "Hello Receptionist!!");
  String choice;
  choice  = JOptionPane.showInputDialog(re, "Enter your choice: 1)GiveAppoint 2)GenerateBill 3)Exit");
        
        
   switch(choice){        
         case "1": GiveAppoint(); System.out.println();
          break;
         case "2": GenerateBill(); System.out.println();
       break;
         case "3":  main(null);
   }
 }

 public void GenerateBill(){

  Billing B = new Billing();
  int b_no =B.getB_no();
  String p_name =B.getP_name();
  int p_id = B.getP_id();
  int b_amt = B.getB_amt();
  this.text = "\nBillNO: "+b_no +"\nPatientID: "+p_id+"\nPatientName: "+p_name+"\nBillAmount: "+b_amt;
  System.out.println(text);
  
 }
 
 public void GiveAppoint(){

  Patient P = new Patient();
  String p_name =P.getP_name();
  int p_id = P.getP_id();
  Doctor D = new Doctor();
  int d_id = D.getD_id();
  String d_name = D.getD_name();
  this.text = "\nPatientID: "+p_id+"\nPatientName: "+p_name+"\nAppointment with Doctor \nDoctorID: "+d_id+
    "\nDoctorName : "+d_name;
  System.out.println(text);
  
 }
 
}