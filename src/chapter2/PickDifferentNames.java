package chapter2;

import java.util.Arrays;
import java.util.List;
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
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> startsWithB = name -> name.startsWith("B");
        final long countFriendsStartN =
                friends.stream().filter(startsWithN).count();
        final long countFriendsStartB =
                friends.stream().filter(startsWithB).count();
    }
}
