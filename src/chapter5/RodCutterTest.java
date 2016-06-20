package chapter5;

import junit.framework.JUnit4TestAdapter;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static chapter5.TestHelper.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class RodCutterTest {
    private RodCutter rodCutter;
    private List<Integer> prices;

    protected RodCutter createCutter() {
        return new RodCutter(false);
    }

    @Before
    public void initialize() {
        rodCutter = createCutter();
        prices = Arrays.asList(1, 1, 2, 2, 3, 4, 5);
    }

    @Test public void VerboseExceptionTest() throws RodCutterException {
        rodCutter.setPrices(prices);
        try {
            rodCutter.maxProfit(0);
            fail("Expected exception for zero length");
        } catch(RodCutterException ex) {
            assertTrue("expected", true);
        }
    }

    @Test(expected = RodCutterException.class)
    public void TerseExceptionTest() throws RodCutterException {
        rodCutter.setPrices(prices);
        rodCutter.maxProfit(0);
    }

    @Test
    public void ConciseExceptionTest() throws RodCutterException {
        rodCutter.setPrices(prices);
        assertThrows(RodCutterException.class, () -> {
            try {
                rodCutter.maxProfit(0);
            } catch (RodCutterException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new JUnit4TestAdapter(RodCutterTest.class));
    }
}
