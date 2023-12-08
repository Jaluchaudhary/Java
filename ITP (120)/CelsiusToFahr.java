// Convert Celsius to Fahrenheit

import java.util.Scanner;
class CelsiusToFahr  
{

  public static void main (String args[]) 
  {
  
      Scanner keyboard = new Scanner(System.in);

      int celsius = 0;
      //int fahr = 0; The result of a math equation involving division 
      // should be stored in a double or float in order to retain digits to right
      //of the decimal place
      double fahr = 0.0;
      
      
      System.out.println("Input the degrees in Celsius");
      celsius = keyboard.nextInt();
        
      fahr =(double) 9/5 * celsius + 32.0; // added (double) in front of 
      // the 9 in order to get a result of 1.8 when 9 is divided by 5 
      
      
      
      //System.out.println(celsius + "degrees in celsius  gives " + fahr + " degrees in fahrenheit ");
      // in order to control decimal places, use printf
      System.out.printf("%d degrees in celsius gives %.0f degrees in fahrenheit.", celsius, fahr);
     
     }// end of main 

}// end of class

