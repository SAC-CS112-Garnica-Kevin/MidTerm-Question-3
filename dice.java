import java.util.Scanner;
import java.util.Random; 

public class dice {

   
    public static void main(String args[])
	{
	
		
		Scanner input = new Scanner( System.in );	
		Random generator = new Random();

		int diceNumber;
		int numberOfGames = 0;
		String userGuess;
		String userGuessCaps;
		String userAnswer;
		String userAnswerCaps;
		boolean repeat = true;
		
		
		while (repeat)
		{
			
			diceNumber = generator.nextInt(5)+1;
			System.out.println();
			System.out.println("A Dice Has Been Rolled!");
			System.out.println();
			System.out.println("Did The Dice Land on An Even or Odd Number?");
			userGuess = input.next();
			userGuessCaps= userGuess.toUpperCase();

			if (userGuessCaps.equals("EVEN") && diceNumber == 2 || userGuessCaps.equals("EVEN") && diceNumber == 4 
							|| userGuessCaps.equals("EVEN") && diceNumber == 6)
			{
				System.out.println("The Dice Landed on " + diceNumber + " You Guessed Correctly");
				numberOfGames++; 
			}

			else if (userGuessCaps.equals("EVEN") && diceNumber == 1 || userGuessCaps.equals("EVEN") && diceNumber == 3 
							|| userGuessCaps.equals("EVEN") && diceNumber == 5)
			{
				System.out.println ("The Dice Landed on " + diceNumber + " You Guessed Incorrectly");
				numberOfGames++;
			}

			else if (userGuessCaps.equals("ODD") && diceNumber == 2 || userGuessCaps.equals("ODD") && diceNumber == 4 
							|| userGuessCaps.equals("ODD") && diceNumber == 6)
			{
				System.out.println("The Dice Landed on " + diceNumber + " You Guessed Incorrectly");
				numberOfGames++;
			}

			else if (userGuessCaps.equals("ODD") && diceNumber == 1 || userGuessCaps.equals("ODD") && diceNumber == 3 
							|| userGuessCaps.equals("ODD") && diceNumber == 5)
			{
				System.out.println ("The Dice Landed on " + diceNumber + " You Guessed Correctly");
				numberOfGames++;
			}

			System.out.println();
			System.out.println("Would You Like to Play Again? ENTER Yes or No");
			userAnswer = input.next();
			userAnswerCaps= userAnswer.toUpperCase();

			if(userAnswerCaps.equals("YES"))
			{
				repeat = true;
			}
			else 
			{
				repeat = false; 
			}
		}
		System.out.println("You have Played " + numberOfGames + " Games");

       }
}
