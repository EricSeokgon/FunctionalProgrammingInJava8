package chapter6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by user on 2016-06-29.
 */
public class Primes {
    private static int primeAfter(final int number) {
        if(isPrime(number + 1))
            return number + 1;
        else
            return primeAfter(number + 1);
    }
    public static List<Integer> primes(final int fromNumber, final int count) {
        return Stream.iterate(primeAfter(fromNumber - 1), Primes::primeAfter)
                .limit(count).collect(Collectors.<Integer>toList());
    }
//...
}
