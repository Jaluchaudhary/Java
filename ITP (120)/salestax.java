import java.util.*;
public class salestax
 
  {
   public static void main (String[] args)
    { 
     final double State_rate = 0.04;    // state tax rate
     final double County_rate = 0.02;  //  county tax rate
      
     double purchase;
     double StateTax;
     double CountyTax;
     double totalTax;
     double totalCost;
     
     Scanner keyboard = new Scanner(System.in); // get amount the purchase
     System.out.print(" Enter the purchase amount:");
     purchase =keyboard.nextDouble(); // calculate the state tax.
     
     StateTax= purchase* State_rate;
     
     CountyTax = purchase * County_rate;
     totalTax = StateTax + CountyTax;
     totalCost= purchase + totalTax;
       // result
      System.out.println("Purchase amount: $" + purchase);
      System.out.println("State tax : $" + StateTax);
      System.out.println("County tax: $" + CountyTax);
      System.out.println("Total tax: $" + totalTax);
      System.out.println("Total cost: $" + totalCost);
      
      }// end of main
    } // end of class
      
     
     
      
     