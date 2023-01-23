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

public class Doctor extends User{
 User doc = new User();
 private int d_id=301;
 private String d_name="Chisiya";
 public String text;
 
 
 
 public int getD_id() {
  return d_id;
 }

 public void setD_id(int d_id) {
  this.d_id = d_id;
 }

 public String getD_name() {
  return d_name;
 }

 public void setD_name(String d_name) {
  this.d_name = d_name;
 }

 public void Choice(){
  JOptionPane.showMessageDialog(doc, "Hello Doctor "+d_name+"!!");
  String choice1;
  choice1  = JOptionPane.showInputDialog(doc, "Enter 1 for Check Patient");
//  String text = "Enter your choice: 1)CheckPatient \t: ";
//  System.out.print(text);
//  int choice = sc.nextInt();
        
   switch(choice1){        
         case "1": CheckPatient(); System.out.println();
          break;
         case "2": main(null); System.out.println();
     
   }
 }
 
 public void CheckPatient(){
  Patient P = new Patient();
  String p_name = P.getP_name();
  int p_id = P.getP_id();
  this.text = "\nDoctor: "+d_name+" has check patient "+p_name+" with ID : "+p_id;
  System.out.println(text);
 }

}