package chapter2;

import java.util.List;
import java.util.Optional;

import static chapter2.Folks.friends;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: PickAnElementElegant
 * Date: 2016-05-07
 * Time: 오전 12:38
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickAnElementElegant {
    public static void pickName(
            final List<String> names, final String startingLetter) {
        final Optional<String> foundName =
                names.stream()
                        .filter(name ->name.startsWith(startingLetter))
                        .findFirst();
        System.out.println(String.format("A name starting with %s: %s",
                startingLetter, foundName.orElse("No name found")));
    }

    public static void main(String[] args) {
        pickName(friends, "N");
        pickName(friends, "Z");
    }
}
