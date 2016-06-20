package chapter5;

import org.junit.Test;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class RodCutterTest {
    @Test
    public void VerboseExceptionTest() {
        rodCutter.setPrices(prices);
        try {
            rodCutter.maxProfit(0);
            fail("Expected exception for zero length");
        } catch (RodCutterException ex) {
            assertTure("expected", ture);
        }
    }
}
