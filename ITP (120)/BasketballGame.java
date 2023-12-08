/**
* BasketballGame
* @author Jalu
* @version1
* see
*/
  import java.util.Random ;  // needed to genetare ramdom numbers
  import java.util.Scanner; // needed for keybord input
/**
 This program simulates a one-on-one basketball game. The random() function will generate a random number from 0 to 3
  representing 4 kinds of shots, 0 for Air Ball, 1 for FreeThrow Made 2 for 2 Points!, 3 for 3 Pointer!
  We keep track of each player's score over 4 quarters of the game Each quarter lasts for 12 minutes * 60 seconds thus 720
 seconds We are assuming that each player takes a shot within a 30
 second interval We keep score of which shot the player made and a running total of the player's score and display them
 At the end, of the game, we print out the name of the winner or a tie if that occurs 
*/
public class BasketballGame
{
  public static void main(String[]args)
   {
    final int QUARTERS = 4; //You will need a constant to keep track of the number of quarters which is 4
    final int SECONDS = 720; // You will need a constant to keep track of the number of seconds 720

    // A random number generator used in
   // simulating the shot that the player has taken
     Random generator = new Random();
     Scanner keyboard = new Scanner(System.in);

     int player1Value;           // Do not call this die1Value because we aren't rolling dice, call it player1Value
     int player2Value;          // Do not call this die2Value because we aren't rolling dice, call it player2Value
     int count = 0;            // Inner loop counter
     int shot = 0; 
     String winner = " ";
     int player1Score = 0;     // Do not call this snakeEyes, call it player1Score
     int player2Score = 0;      // Do not call this twos, call it player2Score
     String player1Shot = " ";   // Declare a string here to represent player1Shot which will print out "Air Ball", "Free Throw Made", "2 Points!", "3 Pointer!"
     String player2Shot = " ";   // Declare a string here to represent player2Shot which will print out "Air Ball", "Free Throw Made", "2 Points!", "3 Pointer!"
     String player1Name = " ";    // Declare a string here for the player1Name
     String player2Name = " ";    // Declare a string here for the player2Name
     String runProgram = " ";
     
     
     System.out.println("It's March Madness (almost). Let's play a one-on-one game with your 2 favorite players.");
     System.out.println("Please enter your fevorite Players."); 
     System.out.println("Please enter DRIBBLE to play the game or STOP to quit.");
     runProgram = keyboard.nextLine();
     runProgram = runProgram.toUpperCase();
     while (runProgram.equals("DRIBBLE"))
     {
        System.out.println("Please enter the nam,e for player1:");
        player1Name = keyboard.nextLine();
        System.out.println("Please enter the name for Player 2:"); //input player1Name
        player2Name = keyboard.nextLine();
        
        // You will need an outer for or while loop here that counts the quarters from 1 to 4.
        for (int i = 1; i <= 4; i++)
        {
   
        //You will need a print statement to print out the quarter and the number of the quarter that you are on
         System.out.printf("%-40s%-10s%40s\n","****************************************", ("QUARTER " + i),"****************************************"); //You will need a printf statement to print 5 column headings
         System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", "Shot#", (player1Name + " Shot"), (player1Name + " Score"), (player2Name + " Shot"), (player2Name + " Score"));
         for (count = 0; count < SECONDS; count+=30)
         {
          player1Value = generator.nextInt(4); // will generate 0,1,2,3, to represent the player 1 shot taken
          player2Value = generator.nextInt(4); // will generate 0,1,2,3, to represent the player 1 shot taken
          shot = shot + 1;
          
          // This beings the structure for the player 1 and player 2 shots and scores
          
          if (player1Value == 0)
          { 
            player1Shot = "Air Ball";
            player1Score = player1Score + 0;
            
          }
          if (player1Value == 1) 
          {
            player1Shot = "Free Throw Made";
            player1Score = player1Score + 1;
            
          }
          if (player1Value == 2)      
          {
            player1Shot = "Two Points!";
            player1Score = player1Score + 2;
            
          }
          if (player1Value == 3) 
          {
            player1Shot = "Three Pointer!";
            player1Score = player1Score + 3; 
            
          }
          
          // This begins the if structure for the player1 and player 2 shots and score
          if (player2Value == 0) 
          {
            player2Shot = "Air Ball";
            player2Score = player2Score + 0;
            
          }
          if (player2Value == 1) 
          {
            player2Shot = "Free Throw Made";
            player2Score = player2Score + 1;
            
         }
         if (player2Value == 2) 
         {
            player2Shot = "Two Points!";
            player2Score = player2Score + 2;
            
         }
         if (player2Value == 3) 
         {
            player2Shot = "Three Pointer!";
            player2Score = player2Score + 3;
            
         } 
         
         System.out.printf("%-10d%-20s%-20d%-20s%-20d\n", shot, player1Shot, player1Score, player2Shot, player2Score);
      
      
       }  // end of for loop for each quarter
      }  // end of for loop for all quarter
    
         
         if (player1Score > player2Score)
          {
              winner = player1Name;
              
           }
           else if (player2Score > player1Score)
           {
              
              winner = player2Name;
           }
           else
           {
               winner = "Tie Game... Play Again Later.";
               
            }
             System.out.println( "The winner is " + winner);
             System.out.println("Please enter DRIBBLE to play the game or STOP to quit.");
             runProgram = keyboard.nextLine();
             runProgram = runProgram.toUpperCase();
         
         }// end of while loop

             
          

       }//end of main 
    } // end of class
 