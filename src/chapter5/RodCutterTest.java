package chapter5;

import org.junit.Test;

import static chapter5.TestHelper.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class RodCutterTest {
    @Test public void VerboseExceptionTest(){
        rodCutter.setPrices(prices);
        try{
            rodCutter.maxProfit(0);
            fail("Excepted exception for zero length");
        }catch(RodCutterException ex){
            assertTrue("expected", true);
        }
    }
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
