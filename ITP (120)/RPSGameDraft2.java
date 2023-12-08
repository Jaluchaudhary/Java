/**
* RPSGameDraft2
* @author Jalu
* @version1
* see
*/
 import java.util.Random ;  
 import java.util.Scanner; 
 
   
     public class RPSGameDraft2
        {
        public static void main(String[]args)
         {
                 
       Random generator = new Random();
       Scanner keyboard = new Scanner(System.in);
       
        char playerChoice = 0;  //Leave all letters as chars      
        int player2Value = 0;          
        int count = 0;            
        int outerCount = 0;       
        int player1Score = 0;     
        int player2Score = 0;     
        String player1Shot = " ";  //these will need to be chars
        char player2Shot = ' ';   //these will need to be chars  
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
              gameCounter = gameCounter  ;
              System.out.println ("Game" + gameCounter);
              System.out.println("Please enter the type of player that you are from the choices below:");
              System.out.println("R for Rock");
              System.out.println("P for Paper");
              System.out.println("S for Scissor");

            
            
              while (playerChoice != 'R' && playerChoice != 'P' && playerChoice != 'S') 
             {
                               
               if (playerChoice == 'R') //draw, no points given

               {
                 
                 System.out.println("Draw");
               }
                else if(playerChoice == 'P')
               {
                 //player one is paper, player two is rock, player one wins
                 player1Score = player1Score + 1;
               } 
               else 
               {
                 //player one is scissors, player two is rock, player two wins
                 player2Score = player2Score + 1;
               }
               
             
             if (player2Value == 1) 
             {
               player2Shot = 'P';
               /*Does nothing, sets score to itself without any change*/
               
             }
           
            if (player2Value == 2) 
            {
               player2Shot = 'S';
              
                          }
             System.out.println("Please enter play if you want to play the game again or anything else to Stop.");
             runProgram = keyboard.nextLine();
             runProgram = runProgram.toUpperCase();
         }// end of while loop
          
           if (player1Score > player2Score)
          {
              player1Score = player2Score;
              
           }
           else if (player2Score > player1Score)
           {
              
              player2Score = player1Score;
           }
           else
           {
                             
               
            }
             System.out.println( "The player is " + player1Score);
             System.out.println("Please enter PLAY to play the game or STOP to quit.");
             runProgram = keyboard.nextLine();
             runProgram = runProgram.toUpperCase();
         
      }// end of loop
                    
     }// end of main
   }// end of class
      
     