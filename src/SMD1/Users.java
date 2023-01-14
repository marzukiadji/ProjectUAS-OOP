package SMD1;

//import java.io.*;
import javax.swing.*;
import java.util.Scanner;

public class Users extends JFrame {
  static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {
  Gui myframeGui;
  myframeGui = new Gui();
  myframeGui.setVisible(true);
  JOptionPane.showMessageDialog(myframeGui, "Welcome to Primaya Hospital");
  JOptionPane.showMessageDialog(myframeGui, "Good Morning");

  System.out.print("Enter your choice: 1)Receptionist 2)Patient 3)Doctor \t: ");
  int choice = sc.nextInt();
        
    do{
   switch(choice){        
         case 1: Receptionist R = new Receptionist();
           R.Choice();
          break;
         case 2: Patient P = new Patient();
           P.Choice();
           break;
         case 3: Doctor D = new Doctor();
           D.Choice();
           break;        
   }
        }while(choice!=4);
 }
 
}