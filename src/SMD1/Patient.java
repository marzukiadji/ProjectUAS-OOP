package SMD1;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.*;

public class Patient extends Users{

 private static final Component jframe = null;
 private int p_id=101;
 private String p_name="Kuina Hikari";
 Scanner sc = new Scanner(System.in);
 
 public void Choice(){
      Gui jframe = new Gui();
      JOptionPane.showMessageDialog(jframe, "Hello Patient!!");
      String choice1;
      choice1  = JOptionPane.showInputDialog(jframe, "Enter 1 for paybill");
  System.out.print("Enter your choice: 1)PayBill \t: ");
  //Scanner sc = new Scanner(System.in);
  //int choice = sc.nextInt();
        
   switch(choice1){        
         case "1": PayBill(); System.out.println();
            break;
         case "2": main(null); System.out.println();
     
   }
   //sc.close();

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
  JOptionPane.showMessageDialog(jframe, "Thanks for Paying Your Bills!!");
  System.out.println("Thanks For Paying Bill");
 }

 
}