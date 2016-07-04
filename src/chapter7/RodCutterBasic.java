package chapter7;

import java.util.Arrays;
import java.util.List;

/**
 * Created by redfo on 2016-07-03.
 */
public class RodCutterBasic {
    final List<Integer> prices;
    public RodCutterBasic(final List<Integer> pricesForLength) {
        prices = pricesForLength;
    }
//...
final List<Integer> priceValues =
        Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);
    final RodCutterBasic rodCutter = new RodCutterBasic(priceValues);
}
