
public class GuessNumberGame extends Game{
    private int target;
    private int guess;
    private int guessCount = 0;
    private boolean correctGuess = false;

    protected void newGame(){
        setTarget();
        guess = 0;
        guessCount = 0;
        correctGuess = false;
    }

    protected void playGame(){
        while (!correctGuess) {
            playOneRound();
        }
        displayVictory();
    }

    private void playOneRound() {
            guessFromUser();
            guessCount++;
            checkGuess();
    }

    private void setTarget() {
        target = (int) (Math.random()* 100 + 0.5);
    }

    private void guessFromUser() {
        guess = Integer.parseInt(readUserInput.getUserInput("What's your best guess?"));
    }

    private void checkGuess() {
        if (guess == target) {
            correctGuess = true;
        } else if (guess > target) {
            printStream.println("You guessed too high. Guess again.");
        } else {
            printStream.println("You guessed too low. Guess again.");
        }
    }

    private void displayVictory() {
        String tries = " tries.";
        if (guessCount == 1) tries = " try.";
        printStream.println("Excellent job, you guessed the number I was thinking of.  It took you " + guessCount + tries);
    }

    protected void displayInstructions(){
        super.displayInstructions();
        printStream.println("I'm thinking of an integer between 1 and 100.");
        printStream.println("Guess the number I'm thinking of.");
        printStream.println("If you're right, you win! If not, I'll tell you if you guessed too high or low.");
    }
}
