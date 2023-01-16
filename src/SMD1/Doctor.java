package SMD1;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.*;

public class Doctor extends Users{
 
 private int d_id=301;
 private String d_name="Chisiya";
 Scanner sc = new Scanner(System.in);
 private static final Component jframe = null;
 
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
      Gui jframe = new Gui();
      JOptionPane.showMessageDialog(jframe, "Hello Doctor "+d_name+"!!");
      String choice1;
      choice1  = JOptionPane.showInputDialog(jframe, "Enter 1 for Check Patient");
  System.out.print("Enter your choice: 1)CheckPatient \t: ");
  //Scanner sc = new Scanner(System.in);
  //int choice = sc.nextInt();
        
        
   switch(choice1){        
         case "1": CheckPatient(); System.out.println();
          break;
         case "2": main(null); System.out.println();
     
   }
   //sc.close();
 }
 
 public void CheckPatient(){
  Patient P = new Patient();
  String p_name = P.getP_name();
  int p_id = P.getP_id();
  JOptionPane.showMessageDialog(jframe, "Doctor: "+d_name+" has check patient "+p_name+" with ID : "+p_id);
  System.out.println("Doctor: "+d_name+" has check patient "+p_name+" with ID : "+p_id);
 }

}
