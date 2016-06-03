package chapter4;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: CalculateNAV
 * Date: 2016-06-04
 * Time: 오전 12:59
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalculateNAV {
    private Function<String, BigDecimal> priceFinder;
    //... other methods that use the priceFinder ...

    public CalculateNAV(final Function<String, BigDecimal> aPriceFinder) {
        priceFinder = aPriceFinder;
    }

    public static void main(String[] args) {
        final CalculateNAV calculateNav = new CalculateNAV(YahooFinance::getPrice);

        System.out.println(String.format("100 shares of Google worth: $%.2f",
                calculateNav.computeStockWorth("GOOG", 100)));
    }

    public BigDecimal computeStockWorth(
            final String ticker, final int shares) {
        return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
    }
}
