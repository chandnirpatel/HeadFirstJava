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

}
