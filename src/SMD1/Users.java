package SMD1;

//import java.io.*;
import javax.swing.*;
import java.util.Scanner;

public class Users extends JFrame {
  static Scanner sc = new Scanner(System.in);
  static JLabel welcome ;
  static JPanel totalGUI;

 public static void main(String[] args) {
  //GUI
  Gui myframeGui;
  myframeGui = new Gui();
  totalGUI = new JPanel();
  welcome = new JLabel("Welcome, please start your session");
  welcome.setLocation(0,0);
  welcome.setSize(290,30);
  welcome.setHorizontalAlignment(0);
  totalGUI.add(welcome);

  myframeGui.setVisible(true);
  JOptionPane.showMessageDialog(myframeGui, "Welcome to Primaya Hospital");
  JOptionPane.showMessageDialog(myframeGui, "Good Morning");

  String choice1;
  choice1  = JOptionPane.showInputDialog(myframeGui, "Enter your user : 1. Receptionist 2.Patient 3.Doctor?");

  System.out.print("Enter your choice: 1)Receptionist 2)Patient 3)Doctor \t: ");
  //int choice = sc.nextInt();
        
    do{
   switch(choice1){        
         case "1": Receptionist R = new Receptionist();
           R.Choice();
          break;
         case "2": Patient P = new Patient();
           P.Choice();
           break;
         case "3": Doctor D = new Doctor();
           D.Choice();
           break;        
   }
        }while(choice1!="4");
 }
 
}
