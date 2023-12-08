/**
* NovaTuitionFee
* @author Jalu
* @version1
* see
*/
import java.util.Scanner;
public class NovaTuitionFee
{
  public static void main(String []args)
   {
   
    Scanner keyboard = new Scanner(System.in);
    String studentName = " ";
    char studentType= ' ';
    int credits = 0;
    double tuitionPerCredit =0.0;
    double basicTuition = 0.0;
    double capitalFee = 0.0;
    final double STUDENT_ACTIVITIES_FEE = 3.10;
    final double PARKING_FEE = 2.00;
    double totalTuitionAndFees = 0.0;
        
    System.out.println("Welcome to the NOVA Tuition and fees Calculator.");
    
    // Getting user input
    System.out.println("please enter your name:");
    studentName = keyboard.nextLine();
    
    System.out.println("Please enter the type ot student that you are from the choices below:"); 
    System.out.println("R for Virginia Resident");
    System.out.println("M for Military Contract Out-of-State");
    System.out.println("V for Military Veterans and Dependents");
    System.out.println("D for Dual Enrolled");
    System.out.println("B for Business Contract");
    System.out.println("O for Out of State Students");
    studentType = keyboard.nextLine().charAt(0);
    studentType = Character.toUpperCase(studentType);
    
    System.out.println(" Please enter the number of credits:");
    credits = keyboard.nextInt();
    /*
    //determine Tuition and Capital Fee based on studentType
    switch(studentType)
    {
       case 'R':
          basicTuition = 180.40;
          capitalFee = 0.0;
          break;
       case 'M':
          basicTuition = 180.40;
          capitalFee = 23.50;
          break;
        case 'V':
          basicTuition = 180.40;
          capitalFee = 0.0;
          break;
        case 'D':
          basicTuition = 180.40;
          capitalFee = 0.0;
          break;

        case 'B':
          basicTuition = 240.40;
          capitalFee = 23.50;
          break;
         case 'O':
          basicTuition = 180.40;
          capitalFee = 23.50;
          break;
         
         default:
          basicTuition = 0;
          capitalFee = 0;
          System.out.println("invalid Student Type Entered");
          
    
    }// end of switch to determine basicTuition and capitalFee
     */
    // Dedisplay results
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
   capitalFee = 23.50;
   break;

   case 'B':
   basicTuition = 240.40;
   capitalFee = 23.50;
   break;

   case 'O':
   basicTuition = 359.65;
   capitalFee = 23.50;
   break;

  default:
  basicTuition = 0.0;
  capitalFee = 0.0;

 } 
   //end of switch to determine basicTuition and capitalFee

   //calculate tuition total
  
   tuitionPerCredit = basicTuition + capitalFee + STUDENT_ACTIVITIES_FEE + PARKING_FEE;
   totalTuitionAndFees = tuitionPerCredit * credits;
   
   //display results
   System.out.println("Tuition and Fees Report for " + studentName);
   System.out.println("Tuition: " + basicTuition);
   System.out.println("Capital Fee: " + capitalFee);
   System.out.println("Student Activities Fee: " + STUDENT_ACTIVITIES_FEE);
   System.out.println("Parking Infrastructure Fee: " + PARKING_FEE);
   System.out.println("Tuition & Fees Per Credit: " + tuitionPerCredit);
   System.out.println("X Number of Credits: " + credits);
   System.out.println("Total Tuition and Fees: " + totalTuitionAndFees);
   System.out.println("Boldly NOVA ");
    
        
      
   }// end of main
} // end of class