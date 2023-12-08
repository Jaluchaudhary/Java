/**
 * PizzaProblemWithMethods.java
 * @author Jalu Chaudhary
 * @version1
 * @see
 */
  import java.util.Scanner;
  public class PizzaProblemWithMethods
   {

       public static void main(String[] args)
       {
       Scanner keyboard = new Scanner(System.in);
       /* A pizza truck sells only cheese pizza and uses the following rules:
       * Pizza Slice: Small 1.50 per slice, Whole Pie 8.00 per pie
       *              Medium 1.75 per slice, Whole Pie 10.00 per pie
       *              Large 2.00 per slice, Whole Pie 12.00 per pie
       * Ask the user to input the size, then type, then quantity
       * They can buy only 1 pie at a time. 1-8 slices for slice
       * Age >= 62 get 10% discount
       */
             char size =' ';
             String type = " ";
             int quantity = 0;
             double price = 0.0;
             double discount = 0.0;
             double priceAfterDiscount = 0.0;
             int age = 0;
             String runProgram = " ";
            
             System.out.println("Welcome to the Pizza Truck.");
             //sentinel value while loop that allows the user to choose to run the program or not
             System.out.println("Please enter yummy to run the program or No to quit.");
             runProgram = keyboard.nextLine();
             runProgram = runProgram.toLowerCase();
             while (runProgram.equals("yummy"))
             {

             System.out.println("Please enter the size (S, M, L):");
             size = keyboard.nextLine().charAt(0);
             size = Character.toUpperCase(size);
             //while loop to validate size
             //while (size != 'S' || size != 'M' || size != 'L')
            //This does not work, bad logic 
             while (size != 'S' && size != 'M' && size != 'L')
            //This works
             {
             System.out.println("Invalid size. Please enter S, M, or L:");
             size = keyboard.nextLine().charAt(0);
             size = Character.toUpperCase(size);
             }// end of while loop
            
             System.out.println("Please enter the type (Slice or Pie):");
             type = keyboard.nextLine();
             type = type.toLowerCase();
             //while loop to validate type
             while ((!(type.equals("slice"))) && (!(type.equals("pie")))) //This works
             //while ((!(type.equals("slice"))) || yummy(!(type.equals("pie"))))
             //This does not work
             {
             System.out.println("Invalid type. Please enter Slice or Pie.");
             type = keyboard.nextLine();
             type = type.toLowerCase();
             }

          System.out.println("Please enter the quantity (1 for Pie, or 1 to 8 for slices:)");
          quantity = keyboard.nextInt();
          //if and while loop to validate quantity for pie
          if (type.equals("pie"))
          {
          while (quantity != 1)
          {
          System.out.println("Invalid quantity. Enter 1 for pie:");
          quantity = keyboard.nextInt();
          }
          }
          if (type.equals("slice"))
          {
          while (quantity < 1 || quantity > 8)
          {
          System.out.println("Invalid quantity. Enter between 1 and 8 slices:");
          quantity = keyboard.nextInt();
          }
          }
         
          System.out.println("Please enter your age. 62 and over get 10% discount.");
          age = keyboard.nextInt();
          //validate age between 0 and 150
          while (age < 0 || age > 150)
          {
          System.out.println("Invalid age. Enter between 0 and 150 years old:");
          age = keyboard.nextInt();
          }
          keyboard.nextLine(); //Decision structure with nested ifs to set the price
          if (size == 'S')
          {
          price = getPrice(1.50, 8.00, quantity, type); //run the getPrice method
          }
          else if (size == 'M') //if (size == 'M') for sequential ifs
          {
          price = getPrice(1.75, 10.00, quantity, type); //run the getPrice method
          }
          else //if (size == 'L') for sequential ifs
          {
          price = getPrice(2.00, 12.00, quantity, type); //run the getPrice method
          }
         
          //if structure to set the discount
          if (age >= 62)
          {
          discount = price * .10;
          }
          else
          {
          discount = 0;
          }
          //calculate price after discount
          priceAfterDiscount = price - discount;
         
          printLineOfChars('_', 50);
          //System.out.println("Size: " + size);
          System.out.printf("%-30s%20s\n", "Size: ", size);
          //System.out.println("Type: " + type);
          System.out.printf("%-30s%20s\n", "Type: ", type);
          //System.out.println("Price " + price);
          System.out.printf("%-30s%20.2f\n", "Price: ", price);
          //System.out.println("Discount " + discount);
          System.out.printf("%-30s%20.2f\n", "Discount: ", discount);
          //System.out.println("Price After Discount " + priceAfterDiscount);
          System.out.printf("%-30s%20.2f\n", "Price After Discount: ", priceAfterDiscount);
          printLineOfChars('=', 50);
         
          //code to end the runProgram loop is below
          System.out.println("Please enter yummy to run the program again or No to quit.");
          runProgram = keyboard.nextLine();
          runProgram = runProgram.toLowerCase();
          } //end of while runProgram sentinel value loop
         
         
          } //end of main
         
          //the getPrice() method returns the price based on type and size
          public static double getPrice(double slicePrice, double piePrice, int myQuantity, String myType)
          {
         
          double myPrice = 0.0;
         
          if (myType.equals("slice"))
          {
          myPrice = slicePrice * myQuantity;
          }
          else
          {
          myPrice = piePrice;
          }
         
          return myPrice;
         
          }//end of getPrice() method
         
          //the printLineOfChars() method prints a horizontal line for a char for as many times given
          public static void printLineOfChars(char myChar, int qtyToPrint)
          {
         
          for (int i = 0; i < qtyToPrint; i++)
          {
          System.out.printf("%-1s", myChar);
          }
          System.out.println();
         
      } //end of printLineOfChars() method
         
  } //end of class
         