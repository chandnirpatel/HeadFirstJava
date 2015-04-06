/**
 * Created by Chandni on 4/4/15.
 */

import junit.framework.TestCase;


public class CounterTest extends TestCase {

    public void testCounterIncrementOnce(){

        Counter.increment();
        assertEquals(1, Counter.getCount());

        Counter counter = new Counter();
        counter.increment();
        assertEquals(2, Counter.getCount());

        Counter counter1 = new Counter();
        counter1.increment();
        assertEquals(3, Counter.getCount());
    }
}