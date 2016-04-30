package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: PickDifferentNames
 * Date: 2016-04-28
 * Time: 오전 2:54
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickDifferentNames {
    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }

    final Function<String, Predicate<String>> startsWithLetter =
            (String letter) -> {
                Predicate<String> checkStartsWith =
                        (String name) -> name.startsWith(letter);
                return checkStartsWith;
            };

    final Function<String, Predicate<String>> startsWithLetter2 =
            (String letter) -> (String name) -> name.startsWith(letter);

    static final Function<String, Predicate<String>> startsWithLetter3 =
            letter -> name -> name.startsWith(letter);

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> startsWithB = name -> name.startsWith("B");

        long countFriendsStartN =
                friends.stream().filter(startsWithN).count();
        long countFriendsStartB =
                friends.stream().filter(startsWithB).count();

        countFriendsStartN = friends.stream().filter(checkIfStartsWith("N")).count();
        countFriendsStartB = friends.stream().filter(checkIfStartsWith("B")).count();

        final long countFriendsStartN1 =
                friends.stream().filter(startsWithLetter3.apply("N")).count();
        final long countFriendsStartB2 =
                friends.stream().filter(startsWithLetter3.apply("B")).count();

    }
}
