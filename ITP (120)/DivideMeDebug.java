 /**
   * DivideMeDebug.java
   * @author JaluChaudhary
   * @version 1
   * @see
   */
  /**
  This program should display the following output when debugged and you must use the for loop and 
  mathematical equations in your solution:
     Sum: 1
     Sum: 3
     Sum: 6
     Sum: 10
     Sum: 15
     Divided By The Number of Loops: 3.0
 
*/
  import java.util.Scanner;
  class DivideMeDebug
 {
     public static void main(String args[]) 
     { 
       Scanner keyboard = new Scanner(System.in);

       
         int sum = 0; 
         int divided = 0;
         int x = 0;
        
         for (x = 0; x <= 5; x++) 
         { 
             sum = sum + x;
             System.out.println("Sum: " + sum); 
             divided = sum / 3;
            // System.out.print("Divided By The Number of Loops: " divided);
             System.out.printf("%d sum in %.0f divided by in number of loop.");

             
         }         
     } 
 }
