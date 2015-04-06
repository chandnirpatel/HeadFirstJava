/**
 * Created by Chandni on 4/5/15.
 */

public class HFJProb6 {
    public static void  main(String[] args ){
        GameHelper helper = new GameHelper();
        String tries = " tires.";

        System.out.println("Let's play a game!");
        System.out.println("I'm thinking of an integer between 1 and 100.");
        System.out.println("Guess the number I'm thinking of.");
        System.out.println("If you're right, you win! If not, I'll tell you if my number is higher or lower.");
        String playGame = helper.getUserInput("Would you like to play?");

        while (playGame.equals("y") || playGame.equals("Y") || playGame.equals("yes") || playGame.equals("Yes")) {
            GuessNumberGame gng = new GuessNumberGame();
            gng.playGame();

            if (gng.guesses.size() == 1) tries = " try.";
            System.out.println("Excellent job, you guessed the number I was thinking of.  It took you " + gng.guesses.size() + tries);
            System.out.println("They were: ");
            for(Integer i : gng.guesses){
                System.out.println(i);
            }

            playGame = helper.getUserInput("Would you like to play again?");
        }
    }
}
