package NumberGuessingGame.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {

    public static void creatingNumberGuessingGame() throws IOException
    {
        //using inputstreamreader which is located in java.io package....

        //using Bufferreader which is located in java.io package....

        BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));

        //using random() to generate a random number for the game....

        Random random=new Random();

        boolean playGameAgain=true;
        int totalOfAttempts=0;
        int roundPlayed=0;


        while (playGameAgain) {
            
            roundPlayed++;YES

            int attempts=0;

            int guessNumber=random.nextInt(10)+1;
            System.out.println("Round "+ roundPlayed + ": I choose a number guess If you can:");

            while (true) {
                attempts++;
                totalOfAttempts++;
                System.out.println("Enter your number between (1 to 10)");

                String str=bReader.readLine();
                int userGuessNumber=Integer.parseInt(str);

                if(userGuessNumber < 1 || userGuessNumber > 200)
                {
                    System.out.println("Please choose the number between 1 to 200");
                    continue;
                }

                if(userGuessNumber == guessNumber)
                {
                    System.out.println("Congratulations you have guessed the right numbe: "+guessNumber);
                    break;
                }
                else if(userGuessNumber < guessNumber)
                {
                    System.out.println("Guessed number is Smaller then the Orignal number! Try Again:");
                }
                else
                {
                    System.out.println("Guessed number is Bigger then the Orignal number! Try Again:");
                }

                if(attempts == 5)
                {
                    if(userGuessNumber == guessNumber)
                {
                    System.out.println("Congratulations you have guessed the right numbe: "+guessNumber);
                    break;
                }
                else{
                    System.out.println("You just used your all attempts ! The correct number is :"+guessNumber);
                    break;
                }
                    
                }
                
            } 
            System.out.println("Press YES if you want to play the game:");
                String playAgain=bReader.readLine();
                playGameAgain=playAgain.equalsIgnoreCase("YES"); 
        }
       
        System.out.println("Thank you for Playing:");
        System.out.println("Rounds Played: "+ roundPlayed);
        System.out.println("Attempts made: "+ totalOfAttempts);
        bReader.close();
    }
    public static void main(String[] args) throws IOException {
        creatingNumberGuessingGame();
    }
}
