package chapter1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: DiscountImperative
 * Date: 2016-04-21
 * Time: 오전 12:30
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DiscountImperative {
    public static void main(String[] args) {
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12")
        );
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
        for (BigDecimal price : prices) {
            if(price.compareTo(BigDecimal.valueOf(20))>0)
                totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        System.out.println("total of discounted prices: "+ totalOfDiscountedPrices);
    }

}
