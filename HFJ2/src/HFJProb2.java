/**
 * Created by Chandni on 4/4/15.
 */

public class HFJProb2 {
    public static void main(String[] args){

        Counter counterA = new Counter();
        Counter counterB = new Counter();

        Counter.increment();  //count = 1

        counterA.increment(); //count = 2

        counterB.increment(); //count = 3

        Counter.increment();  //count = 4

        counterA.increment(); //count = 5

        counterB.increment(); //count = 6

        Counter.increment();  //count = 7

        Counter.total();


    }
}
