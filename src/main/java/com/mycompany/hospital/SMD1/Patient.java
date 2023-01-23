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

public class Patient extends User{
 User pa = new User();
 private int p_id=101;
 private String p_name="Kuina Hikari";
 public String text;
 
 public void Choice(){
  JOptionPane.showMessageDialog(pa, "Hello "+p_name+"!!");
  String choice;
  choice  = JOptionPane.showInputDialog(pa, "Type 'yes' for pay your bills or type 'no' to exit");
        
   switch(choice){        
         case "yes": PayBill(); System.out.println();
            break;
         case "no": main(null); System.out.println();
     
   }

 }
 
 public int getP_id() {
  return p_id;
 }

 public void setP_id(int p_id) {
  this.p_id = p_id;
 }

 public String getP_name() {
  return p_name;
 }

 public void setP_name(String p_name) {
  this.p_name = p_name;
 }
 
 public void PayBill(){
  this.text = "\n Thanks For Paying Bill";
  System.out.println(text);
 }

 
}