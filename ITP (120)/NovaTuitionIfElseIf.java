 /**
 * NovaTuitionIfElseIf.java - This is the name of your class.
 * @author Jalu Chaudhary
 * @version 1
 * @see
 */
 import java.util.Scanner;
 public class NovaTuitionIfElseIf
 {
   public static void main(String[] args)
    {
     Scanner keyboard = new Scanner (System.in);
     String studentName = " ";
     char studentType = ' ';
     int credits = 0;
     double tuitionPerCredit = 0.0;
     double capitalFee = 0.0;
     final double STUDENT_ACTIVITIES_FEE = 4.60;
     final double PARKING_FEE = 2.00;
     double totalTuitionAndFees = 0.0;
     double basicTuition = 0.0;

     System.out.println("Welcome to the NOVA Tuition and Fees Calculator.");

      //Getting user input
      System.out.println("Please enter your name.");
      studentName = keyboard.nextLine();

     System.out.println("Please enter the type of student that you are from the choices below:");
     System.out.println("R for Virginia Resident");
     System.out.println("M for Military Contract Out-ofState");
     System.out.println("V for Military Veterans and Dependents");
     System.out.println("D for Dual Enrolled");
     System.out.println("B for Business Contract Students");
     System.out.println("O for Out of State Students");
     studentType = keyboard.nextLine().charAt(0);
     studentType = Character.toUpperCase(studentType);

     System.out.println("Please enter the number of credits that you are taking:");
      credits = keyboard.nextInt();
     // determine basicTuition and capitalFee
     if (studentType == 'R')
     { 
     basicTuition = 180.40;
     capitalFee = 0.0;
     }
    else if (studentType == 'V')
 {
    basicTuition = 180.40;
    capitalFee = 0.0;
 }
  else if (studentType == 'D')
  {
  basicTuition = 180.40;
  capitalFee = 0.0;
  }
  else if (studentType == 'M')
  {
  basicTuition = 180.40;
  capitalFee = 21.00;
  }
  else if (studentType == 'B')
  {
  basicTuition = 240.40;
  capitalFee = 21.00;
  }
  else if (studentType == 'O')
  {
  basicTuition = 359.65;
  capitalFee = 21.00;
  }
  else
  {
  basicTuition = 0.0;
   capitalFee = 0.0;
  } //end of if else if to determine basicTuition and capitalFee

 //calculate tuition total
 tuitionPerCredit = basicTuition + capitalFee +
 STUDENT_ACTIVITIES_FEE + PARKING_FEE;
 totalTuitionAndFees = tuitionPerCredit * credits;

 //display results
 //System.out.println("Tuition and Fees Report for " + studentName);
 // % means start of printf cord,- means left align, 35 means column, widht, s means String
 //% means start a printf code, 25 means column width, s means String
 //\n means advance the line 
 
 
 System.out.printf("%-35s%25s\n", "Tuition and Fees Report", studentName);
 //System.out.println("Tuition: " + basicTuition);
 System.out.printf("%-35s%25.2f\n", "Tuition", basicTuition);
 //System.out.println("Capital Fee: " + capitalFee);
 System.out.printf("%-35s%25.2f\n", "Capital Fee", capitalFee);
 //System.out.println("Student Activities Fee: " + STUDENT_ACTIVITIES_FEE);
 System.out.printf("%-35s%25.2f\n", "Student Activities Fee", STUDENT_ACTIVITIES_FEE);
 //System.out.println("Parking Infrastructure Fee: " + PARKING_FEE);
 System.out.printf("%-35s%25.2f\n", "Parking Fee", PARKING_FEE);
 //System.out.println("Tuition & Fees Per Credit: " + tuitionPerCredit);
 System.out.printf("%-35s%25.2f\n", "Tuition & Fees Per Credit", tuitionPerCredit);
 //System.out.println("X Number of Credits: " + credits);
 System.out.printf("%-35s%25d\n", "X Number of Credits", credits);
 //System.out.println("Total Tuition and Fees: " + totalTuitionAndFees);
 System.out.printf("%-35s%,25.2f\n", "Total Tuition & Fees", totalTuitionAndFees);
 

 }// end of main
}// end of class
