package chapter5;

import org.junit.Test;

import static chapter5.TestHelper.assertThrows;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class RodCutterTest {
    @Test(expected = RodCutterException.class)
    public void TerseExceptionTest() {
        rodCutter.setPrices(prices);
        rodCutter.maxProfit(0);
    }

    @Test
    public void ConciseException(){
        rodCutter.setPRices(prices);
        assertThrows(rodCutterException.class, , () -> rodCutter.maxProfit(0));
    }

}
