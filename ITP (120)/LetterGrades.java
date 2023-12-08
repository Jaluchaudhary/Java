/**
*LetterGrades.java
*@author Jalu Chaudhary
*@version
*@see
*/
import java.util.Scanner;
public class LetterGrades
 {
     public static void main(String[] args)
     
     {
        
        Scanner keyborad = new Scanner(System.in);
        double test1 = 0; //
        double test2 = 0;
        double test3 = 0;
        double average = 0;
        String letterGrades = " ";
        
        
        System.out.println("please enter the test1 score:");
        test1 = keyborad.nextDouble();
        
        System.out.println(" please enter the test2 score:");
        test2 = keyborad.nextDouble();
        
        System.out.println(" please enter the test3 score:");
        test3 = keyborad.nextDouble();
        
        average = (test1 + test2 + test3)/ 3;
        System.out.println ("Your average is " + average);
        
        // if else if to assign letter grade
        if (average >= 90)
           letterGrades = "A";
        else if (average >= 80)
           letterGrades = "B";
        else if (average >= 70)
           letterGrades = "C";
        else if (average >= 60)
           letterGrades = "D";
        else
           letterGrades = "F";
        System.out.println("Your letter grade is" + letterGrades);
        
     }//end of main
  }// end of class



        
        
        