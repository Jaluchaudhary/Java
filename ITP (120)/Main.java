import java.util.*;
public class Main
{
//driver main function
   public static void main(String[] args) {
       int computerWins,userWins,temp1,temp2; //these variables will store the win data of user and computer.
       Random rand = new Random(); //This will generate the random number between 1->6
       userWins=0;
       computerWins=0;
      
       //This loop will run 10 times and will play game on each iteration.
       for(int i=0;i<10;i++)
       {
       temp1 = rand.nextInt(6)+1;//The dice throw of user
       temp2 = rand.nextInt(6)+1;//The dice throw of computer
       System.out.println("User throws "+temp1+", Computer throws "+temp2+".");
       //condition if user wins.
       if(temp1 > temp2)
       {
       userWins++;
       System.out.println("User Wins this round.");
       }
       else if(temp1 < temp2) //Condition if computer wins
       {
       computerWins++;
       System.out.println("Computer Wins this round.");
       }
       else System.out.println("Its a tie."); //Condition if it is a tie.
      
       System.out.println("*****************End of round "+(i+1)+"******************");
       }
       System.out.println();
       System.out.println("Total user Wins: "+userWins);
       System.out.println("Total computer Wins: "+computerWins);
      
       //If else ladder to print who is the grand winner.
       if(userWins>computerWins) System.out.println("The Grand Winner is User.");
       else if(userWins<computerWins) System.out.println("The Grand Winner is Computer.");
       else System.out.println("Its a grand tie.");
   }// end of main
}// end of class