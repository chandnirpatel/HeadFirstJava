/**
 * Created by Chandni
 */

import junit.framework.TestCase;


public class CalcTest extends TestCase {


    public void testIsOdd(){
        Calc calc = new Calc();
        assertTrue(calc.isOdd(7));
        assertFalse(calc.isOdd(8));
    }

    public void testSum(){
        Calc calc = new Calc();
        assertEquals(2500, calc.sumOdd());
    }

    public void testClosedFormSum(){
        Calc calc = new Calc();
        assertEquals(2500, calc.sumClosedForm());
    }

}