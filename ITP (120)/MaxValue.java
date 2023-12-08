import java.util.Scanner;

public class MaxCount {

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter numbers: ");
       int val;
       val = in.nextInt();
       int max = val, count = 1;
       while (true) {
           val = in.nextInt();
           if (val == 0) {
               break;
           } else if (val > max) {
               max = val;
               count = 1;
           } else if (val == max) {
               count += 1;
           }
       }
       System.out.println("The largest number is " + max);
       System.out.println("The occurances count of the largest number is " + count);
   }

}