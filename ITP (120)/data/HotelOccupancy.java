package data;

import java.util.Scanner;

    public class HotelOccupancy
        { 
        public static void main(String args[])
         { 
         Scanner input = new Scanner(System.in);
         System.out.println(" Enter number of floors");
         int numberOfFloors = input.nextInt();
         while(numberOfFloors < 1)
            {
            System.out.println("Enter number of floors greater than 1:");
            numberOfFloors = input.nextInt();
            }
             
            int numberOfRooms = 0, numberOfOccupied = 0,
            totalNumberOfRooms = 0, totalNumberOfOccupied = 0;
       for (int i=0;i<numberOfFloors;i++)
       {
         System.out.println("Enter number" + (i+1) + "s number of rooms:");
         numberOfRooms = input.nextInt();
         while(numberOfRooms < 10) 
         {
         System.out.println("Enter number of rooms greater than or equils 10:");
         numberOfRooms =input.nextInt();
         }
         System.out.println("Enter floors" + (i+1) + "s number of rooms being occupied:");
         numberOfOccupied =input.nextInt();
         
         totalNumberOfRooms += numberOfRooms;
         totalNumberOfOccupied += numberOfOccupied;
         }
         
         System.out.println("Total number of rooms" + totalNumberOfRooms);
         System.out.println("Total number of rooms occupied" + totalNumberOfOccupied);
         System.out.println("Number of rooms vacant"+
                           (totalNumberOfRooms-totalNumberOfOccupied));
         System.out.printf("Occupacy rate is %.2f%%",
                          (double)totalNumberOfOccupied/totalNumberOfRooms*100);
                          
     }// end of main
   }// end of class

