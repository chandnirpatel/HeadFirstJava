import java.io.PrintStream;

public abstract class Game {
    PrintStream printStream = new PrintStream(System.out);
    ReadUserInput readUserInput = new ReadUserInput();

    public void runGame(){
        displayInstructions();
        Boolean userWantsToPlay = wantToPlay(askUserToPlay());

        while (userWantsToPlay) {
            newGame();
            playGame();
            userWantsToPlay = wantToPlay(askUserToPlayAgain());
        }
    }

    protected abstract void newGame();

    protected abstract void  playGame();

    protected void displayInstructions(){
        printStream.println("Let's play a game!");
    }

    private String askUserToPlay(){
        return readUserInput.getUserInput("Would you like to play?");
    }

    private Boolean wantToPlay(String userResponse){
        userResponse = userResponse.toUpperCase();
        return userResponse.equals("YES") || userResponse.equals("Y");
    }

    private String askUserToPlayAgain() {
        return readUserInput.getUserInput("That was fun! Would you like to play again?");
    }
}
