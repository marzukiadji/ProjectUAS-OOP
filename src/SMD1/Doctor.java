package SMD1;

import java.util.Scanner;

public class Doctor extends Users{
 
 private int d_id=301;
 private String d_name="Chisiya";
 Scanner sc = new Scanner(System.in);
 
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
  System.out.print("Enter your choice: 1)CheckPatient \t: ");
  //Scanner sc = new Scanner(System.in);
  int choice = sc.nextInt();
        
        
   switch(choice){        
         case 1: CheckPatient(); System.out.println();
          break;
         case 2: main(null); System.out.println();
     
   }
   //sc.close();
 }
 
 public void CheckPatient(){
  Patient P = new Patient();
  String p_name =P.getP_name();
  int p_id = P.getP_id();
  System.out.println("Doctor: "+d_name+" has check patient "+p_name+" with ID : "+p_id);
 }

}