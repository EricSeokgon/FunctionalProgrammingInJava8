package chapter5;

import org.junit.Test;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class RodCutterTest {
    @Test(expected = RodCutterException.class)
    public void TerseExceptionTest() {
        rodCutter.setPrices(prices);
        rodCutter.maxProfit(0);
    }
}
