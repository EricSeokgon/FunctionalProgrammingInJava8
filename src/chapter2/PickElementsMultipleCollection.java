package chapter2;

import java.util.Arrays;
import java.util.List;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: PickElementsMultipleCollection
 * Date: 2016-04-25
 * Time: 오후 10:12
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickElementsMultipleCollection {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");

        final long countFriendsStartN =
                friends.stream().filter(name -> name.startsWith("N")).count();
        final long countComradesStartN =
                comrades.stream().filter(name -> name.startsWith("N")).count();
        final long countEditorsStartN =
                editors.stream().filter(name -> name.startsWith("N")).count();
    }
}
