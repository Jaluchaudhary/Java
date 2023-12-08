/**
* payrollProjectWithDialogs.java
*@author Jalu
*@version1
*@see
*/
import javax.swing.JOptionPane;
public class payrollprojectWithDialogs
 {
   public static void main (String[] args)
    {
     String inputString; //for reading input
     String name = " "; // The employee name
     int hours = 0;      //number of hours worked
     double grossPay = 0.0; // employee gross pay
     double payRate = 0.0; // employee pay rate
     // get the user's name
     
     name =JOptionPane.showInputDialog("What is your name?");
     //get the user's hours worked
     inputString = JOptionPane.showInputDialog("How many hours did you work?");
     hours = Integer.parseInt(inputString);
     
     // get the user's hourly rate
     inputString =JOptionPane.showInputDialog(" Enter your hourly rate:");
     payRate = Double.parseDouble(inputString);
     
     // Calculate the grosspay
     grossPay = hours * payRate;
      
     JOptionPane.showMessageDialog (null, "The name is"+ name);
}//end of main
}//end of class