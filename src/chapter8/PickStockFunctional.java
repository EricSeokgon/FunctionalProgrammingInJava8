package chapter8;

import java.util.stream.Stream;

/**
 * Created by redfo on 2016-07-17.
 */
public class PickStockFunctional {public static void findHighPriced(final Stream<String> symbols) {
    final StockInfo highPriced =
            symbols.map(StockUtil::getPrice)
                    .filter(StockUtil.isPriceLessThan(500))
                    .reduce(StockUtil::pickHigh)
                    .get();

    System.out.println("High priced under $500 is " + highPriced);
}

    public static void main(final String[] args) {
        findHighPriced(Tickers.symbols.stream());
    }
}
