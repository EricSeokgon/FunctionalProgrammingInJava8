package chapter8;

import java.math.BigDecimal;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: StockInfo
 * Date: 2016-07-11
 * Time: 오전 8:34
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StockInfo {
    public final String ticker;
    public final BigDecimal price;
    public StockInfo(final String symbol, final BigDecimal thePrice) {
        ticker = symbol;
        price = thePrice;
    }
    public String toString() {
        return String.format("ticker: %s price: %g", ticker, price);
    }
}
