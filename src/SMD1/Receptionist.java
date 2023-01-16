package SMD1;

//import java.io.*;
import java.awt.Component;
import java.util.Scanner;
import javax.swing.*;

public class Receptionist extends Users {
 private int r_id;
 private String r_name;
 Scanner sc = new Scanner(System.in);
 private static final Component jframe = null;

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
  Gui jframe = new Gui();
  JOptionPane.showMessageDialog(jframe, "Hello Receptionist!");
  String choice1;
  choice1  = JOptionPane.showInputDialog(jframe, "Enter your choice: 1)GiveAppoint 2)GenerateBill : ");
  System.out.println();
  System.out.print("Enter your choice: 1)GiveAppoint 2)GenerateBill \t: ");
  //int choice = sc.nextInt();
        
        
   switch(choice1){        
         case "1": GiveAppoint(); System.out.println();
          break;
         case "2": GenerateBill(); System.out.println();
       break;
         case "3":  main(null);
   }
  //sc.close();  
 }

 public void GenerateBill(){

  Billing B = new Billing();
  int b_no =B.getB_no();
  String p_name =B.getP_name();
  int p_id = B.getP_id();
  int b_amt = B.getB_amt();
  JOptionPane.showMessageDialog(jframe, "BillNO: "+b_no +"\nPatientID: "+p_id+"\nPatientName: "+p_name+"\nBillAmount: "+b_amt);
  System.out.println("BillNO: "+b_no +"\nPatientID: "+p_id+"\nPatientName: "+p_name+"\nBillAmount: "+b_amt);
  
 }
 
 public void GiveAppoint(){

  Patient P = new Patient();
  String p_name =P.getP_name();
  int p_id = P.getP_id();
  Doctor D = new Doctor();
  int d_id = D.getD_id();
  String d_name = D.getD_name();
  JOptionPane.showMessageDialog(jframe, "PatientID: "+p_id+"\nPatientName: "+p_name+"\nAppointment with Doctor \nDoctorID: "+d_id+
  "\nDoctorName : "+d_name);
  System.out.println("\nPatientID: "+p_id+"\nPatientName: "+p_name+"\nAppointment with Doctor \nDoctorID: "+d_id+
    "\nDoctorName : "+d_name);
  
 }
 
}
