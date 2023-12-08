/**
 * PenniesForPay.java
 * @author Jalu Chaudhary
 * @version 1
 * @see
 */
 import java.util.Scanner;
 public class PenniesForPay
      {
             public static void main(String[] args)
             {
            
             Scanner keyboard = new Scanner(System.in);
            
             long pennies; //penny accumulator
             long totalPay; //total pay accumulator
             int maxDays; //max number of days to be employed
             int day; //day counter
            
            //Get maximum number of days
             System.out.println("The number of days must be at least.");
            
             System.out.println("For how many days will you work?");
             maxDays = keyboard.nextInt();
            
            while (maxDays < 30)
             {
             System.out.println("The number of days must be at least 30. Please re-enter.");
             maxDays = keyboard.nextInt();
            
             }
            
             //initialize the day counter to 1
             day = 1;
            
             //initialize the penny accumulator for hte first day at work
             pennies = 1;
            
             //initialize the total pay accumulator
             totalPay = 0;
            
             //Display the report header
            //System.out.println("Day\t\tPennies Earned\t\tDollars Earned");
            System.out.printf("%-5s%20s%20s\n", "Day", "Pennies Earned", "Dollars Earned");
            
             //display the report
             while (day <= maxDays)
             {
            
             //Display the day number and pennies and dollars earned.
             //System.out.println(day + "\t\t" + pennies + "\t\t" + ((double)pennies/100));
             System.out.printf("%-5d%,20d%,20.2f\n", day, pennies, ((double)pennies/100));
            
             //Accumulate the total pay
             totalPay = totalPay + pennies;
            
             //Increment for the next day
             day = day + 1;
            
             //double the pennies
             pennies *= 2; //pennies = pennies * 2
            
             }//end of while
            
             System.out.printf("Total pay: $%,10.2f\n", (totalPay / 100.0));
             System.out.printf("%-11s%,10.2f\n", "Total Pay: $", (totalPay/100.0));
            
       }//end of main
   }//end of class