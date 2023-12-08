/**
* ShippingCharges
* @author Jalu
* @version1
* see
*/
 import java.util.Scanner;
 class ShippingCharges
   {
    public static void main (String args[])
       {     
            
             Scanner keyboard = new Scanner(System.in);
             int numPackages = 0;               //number of packages the user will ship
             String packageNumber = " ";        //the package number
             double weight = 0.0;               //the weight of the package
             double shippingCosts = 0.0;        //the shipping costs
             int counter = 0;                   //loop control counter
                          
             
             System.out.println("Please enter the number of packages you want to ship.");
             numPackages = keyboard.nextInt();
             keyboard.nextLine();                //needed anytime you input a string or char after a double or int
            
             while (counter < numPackages)
             {
            
             System.out.println("Please enter the package number."); //ID used to track the package
             packageNumber = keyboard.nextLine();
            
             System.out.println("Please enter the weight for package number " + packageNumber);
             weight = keyboard.nextDouble();
            
             //Validate the input.
             while (weight < 0)
             {
             System.out.println("Please enter a weight that is at least 0.");
             weight = keyboard.nextDouble();
             }
            
             keyboard.nextLine();        //needed any time you input a string or char after a double or int
                if (weight <= 15 )
                {
                shippingCosts = 10.00;
                }
                else if (weight <= 35)
                {
                shippingCosts = 35.00;
                }
                else if (weight <= 75)
                {
                shippingCosts = 75.00;
                }
                else
                {
                shippingCosts = weight * 1.00; //shippingCosts = weight;
                }
               
             System.out.printf("%-40s%-30s\n", "Package Number: ", packageNumber);
             System.out.printf("%-40s%-30.1f\n", "Weight:", weight);
             System.out.printf("%-40s%-30.2f\n", "Shipping Costs:", shippingCosts);
            
             counter = counter + 1; //needed to avoid infinite loop
         }// end of while loop

      } //end of main

 } //end of class