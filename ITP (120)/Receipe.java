import java.util.Scanner;
 public class Receipe 
 {
  public static void main(String[] args)
  {
   Scanner s=new Scanner(System.in); //Initializing variables
   
   float sugar=0,butter=0,flour=0;
   
   String no_of_cookie="";
   System.out.println("Please Enter no of cookies you want");
   no_of_cookie=s.next();
     
      /* Validating user input for less than 0 value(negative) and value with decimal point.
         Because it does not make any sense to enter 48.5 cookies to be made.
      */
         while(Integer.parseInt(no_of_cookie)<0 || no_of_cookie.indexOf(".")!=-1)
         {
             System.out.println("Invalid Input. Pleas Enter Again without decimal and greater than 0");
             no_of_cookie=s.next();
      
          }
      
         System.out.println("Sugar-> "+(1.5*Integer.parseInt(no_of_cookie))/48+ "cups");
         System.out.println("Butter-> "+(1.0*Integer.parseInt(no_of_cookie))/48+ "cups");
         System.out.println("Flour-> "+(2.75*Integer.parseInt(no_of_cookie))/48+ "cups");
      
       }// end of main
    }// end of class