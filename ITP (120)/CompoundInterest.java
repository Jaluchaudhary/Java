import java.util.Scanner;
 
  public class CompoundInterest
    {
     public static void main (String[] args)
     {
      Scanner input = new Scanner(System.in);
      System.out.println ("Enter amount of principle:");
      double principle = input.nextDouble();
      
      System.out.println ("Enter annual interest rate :");
      double interestRate = input.nextDouble();
      
      System.out.println ("Enter times per year:");
      double timesPerYear = input.nextInt();
      
      System.out.println("Enter number of years:");
      int numberOfYears = input.nextInt();
      
      double amount = principle * Math.pow((1+interestRate/timesPerYear),timesPerYear* numberOfYears);
      System.out.printf("The amount is %.2f",amount);
      
     }// end of main
  }// end of class
      
      
      