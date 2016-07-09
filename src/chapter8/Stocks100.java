package chapter8;

import java.math.BigDecimal;

import static java.util.stream.Collectors.joining;

/**
 * Created by redfo on 2016-07-10.
 */
public class Stocks100 {
    public static void main(final String[] args) {
        final BigDecimal HUNDRED = new BigDecimal("100");
        System.out.println("Stocks priced over $100 are " +
                Tickers.symbols
                        .stream()
                        .filter(
                                symbol -> YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0)
                        .sorted()
                        .collect(joining(", ")));
    }
}
