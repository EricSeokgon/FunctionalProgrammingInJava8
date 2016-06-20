package chapter5;

import java.util.List;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class RodCutter {
    private boolean mustFail;

    public RodCutter(final boolean fail) { mustFail = fail; }

    public void setPrices(final List<Integer> prices) throws RodCutterException {
        //...
        if(mustFail)
            throw new RodCutterException();
    }

    public int maxProfit(final int length) throws RodCutterException {
        if (length == 0) throw new RodCutterException();

        return 0;
    }
}

