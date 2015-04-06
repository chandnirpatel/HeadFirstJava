import junit.framework.TestCase;

/**
 * Created by Chandni on 4/5/15.
 */
public class GuessNumberGameTest extends TestCase {

    public void testTargetExists(){
        GuessNumberGame g = new GuessNumberGame();
        assertTrue( g.setTarget() <= 100 && g.setTarget() >= 1);
    }
}