/**
 * Created by Chandni on 4/5/15.
 */

public class HFJProb5 {
    public static void  main(String[] args ){
        int numberOfGuesses = 0;
        GameHelper helper = new GameHelper();

        System.out.println("Let's play a game!");
        System.out.println("I'm thinking of an integer between 1 and 100.");
        System.out.println("Guess the number I'm thinking of.");
        System.out.println("If you're right, you win! If not, I'll tell you if my number is higher or lower.");
        String playGame = helper.getUserInput("Would you like to play?");

        while (playGame.equals("y") || playGame.equals("Y") || playGame.equals("yes") || playGame.equals("Yes")) {
            GuessNumberGame gng = new GuessNumberGame();
            gng.playGame();
            String tries = " tires.";

            if (gng.guessCount == 1) tries = " try.";
            System.out.print("Excellent job, you guessed the number I was thinking of.  It took you " + gng.guessCount + tries);

            playGame = helper.getUserInput("Would you like to play again?");
        }

    }
}
