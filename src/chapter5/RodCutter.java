package chapter5;

import java.util.List;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class RodCutter {
    public void setPrices(final List<Integer> prices){
        throw new RodCutterException();
    }
    public int maxProfit(final int length){
        if(length == 0) throw new RodCutterException();

        return 0;
    }
}
