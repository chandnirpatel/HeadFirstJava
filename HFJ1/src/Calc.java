/**
 * Created by Chandni on 4/4/15.
 */

public class Calc {

    public boolean isOdd(int i) {
        return i % 2 == 1;
    }


    public int sumOdd() {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if(isOdd(i)) sum += i;
        }

        return sum;
    }

    public int sumClosedForm() {
        int sumOfPair = (1 + 99); // a(first) + a(last) = 100, a(second) + a(second to last) = 100  and so on ...
        int numOfPairs = 100/4; //There would normally be n/2 pairs if sum even and odds. n/4 sums if we only use odd pairs.
        int sum = sumOfPair * numOfPairs;
        return sum;
    }
}
