/**
* LateChargesUtilityBill
* @author Jalu
* @version1
* see
*/
 import java.util.Scanner;
 class LateChargesUtilityBill
   {
    public static void main (String args[])
       {     
                      
             Scanner keyboard = new Scanner(System.in);
             int LateChargesUtilityBill = 0;               //Late charges utility bill they charge
             String LatedaysNumber = " ";                 // number of late days number
             int counter = 0;                                 // this is number of counter
             int LatedayNumer = 0;
             int numberofCustomer = 0;                          
             int Dayspayment  = 0;
             
             
             System.out.println("Please enter the number of customers that will be calculated for that day.");
             int LateChargesUtiliBill = keyboard.nextInt();
             keyboard.nextLine(); 
             
             
             while (counter > LatedayNumer)
             {                                
               System.out.println("Please enter the number lateday."); 
               LatedayNumer = keyboard.nextInt();
             
             System.out.println("Please enter the name of customer of late bill charge ");
             numberofCustomer = keyboard.nextInt();
            
            while (Days < 0 )
 
             {
             System.out.println("Please enter a days payment that is at least 0.");
             Dayspayment = keyboard.nextint();
             }
            
             keyboard.nextLine();        
                if (Days <= 31 )
                {
                payment = 20;
                }
                else if (Days <= 60)
                {
                Payment = 30;
                else
                {
                Days = payment * 1.00; 
                }

                
              System.out.printf("%-31s%-20s\n", "numberofdays: ", DaysNumber);
              System.out.printf("%-60s%-30.1f\n", "Days:", Days);
              System.out.printf("%-90s%-30.2f\n", "payment:", Payment);
            
              counter = counter + 1; 
 
 
 
 
           } // while loop
       } // while loop
 
    } // end of main
 } //end of class  
