import java.util.Scanner;
import java.io.*; //This imports input and output (io) classes that we use
                 //to read and write to files. The * is the wildcard that will
                 //make all of the io classes available if I need them
                 //It saves me from having to import each io class separately.
                 /**
                 This program reads numbers from a file, calculates the
                 mean (average) and standard deviation, and writes the results to a file.
                */

 public class StatsDemo
    {
       public static void main(String[] args) throws IOException
       {
       //the throws IOException means that if we are unable to read from or write
       //to our files, we need to throw an exception which means the program can
       //not continue until we fix the problem causing the exception to throw.
      
       double sum = 0; //The sum of the numbers
       int count = 0; //The count of numbers added
       double mean = 0; //The average of the numbers
       double stdDev = 0; //The standard deviation - a measure of how widely dispersed the numbers are
       String line; //To hold a line from the file
       double difference = 0; //The value and mean difference
       String filename; //Store the name of the file that is being read
      
       Scanner keyboard = new Scanner (System.in);
      
          //Prompt the user and read in the file name
          System.out.println("This program calculates statistics on a file containing numbers.");
          System.out.println("Enter the file name: ");
          filename = keyboard.nextLine();
         
          FileReader freader = new FileReader(filename);
          //FileReader is meant for reading streams of characters from a file
          //For reading streams of raw bytes, use FileInputStream
         
          BufferedReader input = new BufferedReader(freader);
          //Creates a BufferedReader object passing it to the FileReader object
          //Java.io.BufferedReader class reads from a characterinput stream
          //buffering characters so as to provide for the efficient reading
          //of a sequence of characters
         
          //Priming read to read the first line of the file
          line = input.readLine(); //readLine is a method to read a line of text.
          System.out.println("Printing the line just read to the monitor " + line);
         
          //Loop continues reading the Numbers.txt until it hits the end of the file
          //This loop is summing the numbers as it reads them in so that we can calc. the mean/avg
             //This loop is counting how many numbers it has read in from the file
             while (line != null) //null is nothing. We are reading until we find nothing
             {
             //convert the line into a double value
             //add the value to the sum.
             sum = sum + Double.parseDouble(line);
            
             //Increment the counter
             count++; //count = count + 1
            
             line = input.readLine();
             System.out.println("Printing the line just read to the monitor " + line);
             }
             
             //Close the input file
             input.close();
            
             //Store the calculated mean
             mean = sum / count;
            
             //Reconnect to the FileReader object passing the filename
             freader = new FileReader(filename);
            
             //Reconnect to the BufferedReader object passing it
             //the FileReader object
             input = new BufferedReader(freader);
            
             sum = 0; //Reinitialize the sum
             count = 0 ; //Reinitialize the count
            
             //Priming read to read the first line of the file
             line = input.readLine(); //readLine is a method to read a line of text.
             System.out.println("Printing the line just read to the monitor " + line);
            
             while (line != null) //null is nothing. We are reading until we find nothing
             {
             //convert the line into a double
             difference = Double.parseDouble(line) - mean;
            
             //Add the square of the difference to the mean
             sum = sum + Math.pow(difference, 2);
            
             //Increment the counter
             count++; //count = count + 1
            
             line = input.readLine(); //readLine is a method to read a line of text.
             System.out.println("Printing the line just read to the monitor " + line);
            
             } //end of 2nd while loop
            
             //Close the input file
             input.close();
            
             //Store the calculated standard deviation
             stdDev = Math.sqrt(sum / count);
            
             //Create the object of type FileWriter using MyResults.txt
             FileWriter fwriter = new FileWriter("MyResults.txt");
            
             //Create an object of PrintWriter passing it to the FileWriter object
             PrintWriter output = new PrintWriter(fwriter);
            
             //Print the results to the output file
             output.printf("mean = %.3f\r\n", mean);
             output.printf("standard deviation = %.3f", stdDev);
            
             //close the output file
             output.close();
            
     }// end of main
 } //end of class 
