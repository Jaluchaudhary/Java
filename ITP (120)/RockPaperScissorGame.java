/**
* RockPaperScissorGame
* @author Jalu
* @version1
* see
*/
 import java.util.Random ;  
 import java.util.Scanner; 
 
   
public class RockPaperScissorGame
{
   public static void main(String[]args)
   {
                 
       Random generator = new Random();
       Scanner keyboard = new Scanner(System.in);
       
        int player1Value;           
        int player2Value;          
        int count = 0;            
        int outerCount = 0;       
        int player1Score = 0;     
        int player2Score = 0;     
        String player1Shot = " "; //will print out "R","P","S"  
        String player2Shot = " "; //will print out "R","P","S"    
        int shot = 0;               
        String runProgram = " ";
        
        int gameCounter = 0;
        gameCounter = gameCounter + 1;
              
        System.out.println ("Game" + gameCounter);
        System.out.println("Please enter play if you want to play the game or anything else to Stop.");
        runProgram = keyboard.nextLine();
        runProgram = runProgram.toUpperCase();
        while(runProgram.equals("PLAY"))
        {           
                          
           
              gameCounter = gameCounter + 1;
              System.out.println ("Game" + gameCounter);
              System.out.println("Please enter play if you want to play the game again or anything else to Stop.");
              System.out.println("Please enter the type of player that you are from the choices below:");
              System.out.println("R for Rock");
              System.out.println("P for Paper");
              System.out.println("S for Scissor");
              runProgram = keyboard.nextLine();
              runProgram = runProgram.toUpperCase();
              

            
             player1Value = generator.nextInt(3); // will generate 0,1,2,
             player2Value = generator.nextInt(3); // will generate 0,1,2,
             shot = shot + 1;
             
             // This beings the structure for the player 1 and player 2 shots and scores
             
             if (player1Value == 0)
             { 
               player1Shot = "R";
               player1Score = player1Score + 0;
               
             }
            
             if (player1Value == 1) 
             {
               player1Shot = "P";
               player1Score = player1Score + 1;
               
             }
             
             if (player1Value == 2)      
             {
               player1Shot = "S";
               player1Score = player1Score + 2;
             }
               
                      
             // This begins the if structure for the player1 and player 2 shots and score
             if (player2Value == 0) 
             {
               player2Shot = "R";
               player2Score = player2Score + 0;
               
             }
             if (player2Value == 1) 
             {
               player2Shot = "P";
               player2Score = player2Score + 1;
               
             }
           
            if (player2Value == 2) 
            {
               player2Shot = "S";
               player2Score = player2Score + 2;
              
             }
         }// end of while loop
                 
     }// end of main
   }// end of class
      
     
       
       
       
       
    
