/**
 * IGetARaiseWhileLoopCounterControlled.java
 * @author Jalu Chaudhary
 * @version 1
 * @see
 */
 import java.util.Scanner;

   public class IGetARaiseWhileLoopCounterControlled
    {
      public static void main(String[] args)
      {
      
         Scanner keyboard = new Scanner(System.in);
         double beginningSalary = 0.0;
         double endingSalary = 0.0;
         double percentRaise = 0.0;
         double raiseAmount = 0.0;
         int years = 0;
         double sumOfSalaries = 0.0;
         int counter = 0;

        //This program calculates salaries with raises over a period of years
        System.out.println("This program calculates my raise.");

        //Getting input from the user
        System.out.println("Please enter your beginning salary:");
        beginningSalary = keyboard.nextDouble();
        System.out.println("Please enter your raise in percent. Ex: 2 for 2% raise:");
        percentRaise = keyboard.nextDouble();
        System.out.println("For how many years shall we calculate your raise?");
        years = keyboard.nextInt();
        keyboard.nextLine(); //needed anytime you input a string or char after an int or double

      //Display the report headings
      System.out.printf("%-5s%20s%20s%20s\n", "Year", "Beginning Salary", "Raise Amount", "Ending Salary");
 
        while (counter < years)
      {
      raiseAmount = beginningSalary * percentRaise /100;
      endingSalary = beginningSalary + raiseAmount;
      System.out.printf("%5d%20.2f%20.2f%20.2f\n",(counter + 1), beginningSalary, raiseAmount, endingSalary);
      beginningSalary = endingSalary;
      sumOfSalaries = sumOfSalaries + beginningSalary;
      //sums the beginning salaries each year
      counter = counter + 1;
    }

     //prints the sum of salaries over the number of years calculated
    System.out.printf("\nThe sum of beginning salaries over %2d years is $%,12.2f\n\n", years, sumOfSalaries);
    sumOfSalaries = 0;

   }//end of main
 }// end of class
