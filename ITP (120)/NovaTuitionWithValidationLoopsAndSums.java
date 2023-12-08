 /**
  * NovaTuitionWithValidationLoopsAndSums.java - This is the name of your class.
  * @author Jalu Chaudhary
  * @version 1
  * @see
  */
 import java.util.Scanner;
 public class NovaTuitionWithValidationLoopsAndSums 
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
      String runProgram = " ";
      int numStudents = 0;
      double grandTotalTuitionAndFees = 0.0;

      System.out.println("Welcome to the NOVA Tuition and Fees Calculator.");
      System.out.println("Please enter Yes to run the program or No to quit.");
      runProgram = keyboard.nextLine();
      runProgram = runProgram.toUpperCase();

      while (runProgram.equals("YES"))
   {
   
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


    //while (studentType != 'R' || studentType != 'M' || studentType != 'V' || studentType != 'D' || studentType != 'B' || studentType != 'O') //doesn't work
    while (studentType != 'R' && studentType != 'M' && studentType != 'V' && studentType != 'D' && studentType != 'B' && studentType != 'O')
    {
    System.out.println("Invalid student type.");
    System.out.println("Please enter one of the following letters: R, M, V, D, B, O:");
   studentType = keyboard.nextLine().charAt(0);
   studentType = Character.toUpperCase(studentType);

 }

   System.out.println("Please enter the number of credits that you are taking:");
   credits = keyboard.nextInt();
   keyboard.nextLine(); //needed anytime you input a int or double before a string or char
   while (credits < 0 || credits > 23)
  
  
   //while (credits < 0 && credits > 23) doesn't work
   //while (!(credits < 0 && credits > 23)) doesn't work
  {
 
  System.out.println("Invalid number of credits.");
  System.out.println("Please enter a value between 0 and 23");
  credits = keyboard.nextInt();
  }
   switch (studentType)
  {
  case 'R':
  case 'V':
  case 'D':
  basicTuition = 180.40;
  capitalFee = 0.0;
  break;

  case 'M':
  basicTuition = 180.40;
  capitalFee = 21.00;
  break;

  case 'B':
  basicTuition = 240.40;
  capitalFee = 21.00;
  break;
 
  case 'O':
  basicTuition = 359.65;
  capitalFee = 21.00;
  break;

  default:
  basicTuition = 0.0;
  capitalFee = 0.0;
 
 } //end of switch to determine basicTuition and capitalFee

  //calculate tuition total
  tuitionPerCredit = basicTuition + capitalFee + STUDENT_ACTIVITIES_FEE + PARKING_FEE;
  totalTuitionAndFees = tuitionPerCredit * credits;
  numStudents = numStudents + 1;
  grandTotalTuitionAndFees = grandTotalTuitionAndFees + totalTuitionAndFees;

 //display results
 //System.out.println("Tuition and Fees Report for " + studentName);

   System.out.printf("%-35s%25s\n", "Tuition and Fees Report", studentName);
   //System.out.println("Tuition: " + basicTuition);
   System.out.printf("%-35s%25.2f\n", "Tuition", basicTuition);
  //System.out.println("Capital Fee: " + capitalFee);
   System.out.printf("%-35s%25.2f\n", "Capital Fee", capitalFee);
 //System.out.println("Student Activities Fee: " + STUDENT_ACTIVITIES_FEE);
 
  //System.out.printf("%-35s%25.2f\n", "Student Activities Fee", STUDENT_ACTIVITIES_FEE); + PARKING_FEE);
  System.out.printf("%-35s%25.2f\n", "Parking Infrastructure Fee", PARKING_FEE);
  //System.out.println("Tuition & Fees Per Credit: " + tuitionPerCredit);
  System.out.printf("%-35s%25.2f\n", "Tuition & Fees Per Credit", tuitionPerCredit);
  //System.out.println("X Number of Credits: " + credits);
  System.out.printf("%-35s%25d\n", "X Number of Credits", credits);
  //System.out.println("Total Tuition and Fees: " + totalTuitionAndFees);
  System.out.printf("%-35s%,25.2f\n", "Total Tuition & Fees", totalTuitionAndFees);
  System.out.println("Boldly NOVA ");

   System.out.println("Please enter Yes to run the program again or No to quit.");
   runProgram = keyboard.nextLine();
   runProgram = runProgram.toUpperCase();
   } //end of runProgram while loop

   System.out.printf("%-35s%25d\n", "Total Number Of Students", numStudents);
   System.out.printf("%-35s%,25.2f\n", "Grand Total Tuition & Fees", grandTotalTuitionAndFees);

    }// end of main
 } //end of class