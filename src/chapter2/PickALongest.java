package chapter2;

import static chapter2.Folks.friends;

/**
 * Created by hadeslee on 2016-05-09.
 */
public class PickALongest {
    public static void main(String[] args) {
        System.out.println("Total number of characters in all names: " +
                friends.stream()
                        .mapToInt(name -> name.length())
                        .sum());

        final String steveOrLonger =
                friends.stream()
                        .reduce("Steve", (name1, name2) ->
                                name1.length() >= name2.length() ? name1 : name2);
    }
}
