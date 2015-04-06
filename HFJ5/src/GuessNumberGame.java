/**
 * Created by Chandni on 4/5/15.
 */

public class GuessNumberGame {
    int target;
    int guess;
    public int guessCount = 0;
    boolean correctGuess = false;
    GameHelper helper = new GameHelper();

    public void playGame() {
        setTarget();
        while (!correctGuess) {
            getguess();
            guessCount++;
            checkGuess();
        }
    }

    public int setTarget() {
        target = (int) (Math.random()* 100 + 0.5);
        return target;
    }

    private void checkGuess() {
        if (guess == target) {
            correctGuess = true;
        } else if (guess > target) {
            System.out.println("Your guess is greater than what I had in mind. Guess again.");
        } else {
            System.out.println("Your guess is less than what I had in mind. Guess again.");
        }
    }

    public void getguess() {
        guess = Integer.parseInt(helper.getUserInput("What's your best guess?"));
    }
}
