/**
* surprisessWithDoublesAndIntegers
*@ author Jalu
*@ version 1
*@see
*/
import java.util.Scanner;
public class surprisesWithDoublesAndIntegers
{
   public static void main (String [] args)
   {
   Scanner keyboard = new Scanner(System.in);
   double startingValue = 0.0;
   int dividend = 0;
   int divisor =2;
  // int result =0;
   double result = 0;
   String name = " ";
    System.out.println ( " Please enter your name:");
    
    name =keyboard.nextLine();
   
    System.out.println ( " Please enter a starting value (ex.1.0:");
    startingValue = keyboard.nextDouble();
    
    System.out.println(startingValue -.1);
    System.out.println(startingValue - .1 -.1);
    System.out.println(startingValue - .1 - .1 - .1); //Expect .7
    // What you get if starting out with 1.0 -.1 -.1 gave 0.700000000000001
    
    //How to in put an integer
    System.out.println ("please enter a value to divide by 2:");
    dividend = keyboard.nextInt();
    
    // result =divident/divisor; // This takes 5 / 2 and gives 2 ... which is incurrect
    result = (double) dividend / divisor;
     System.out.println ( result);
     System.out.println (" Thanks for using our program.");
  }// end of main
}// end of class
    
    
    
    