package chapter2;

import java.util.List;

/**
 * Created by hadeslee on 2016-05-04.
 */
public class PickAnElement {
    public static void pickName(
            final List<String> names, final String startingLetter) {
        String foundName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                foundName = name;
                break;
            }
        }
        System.out.print(String.format("A name starting with %s: ", startingLetter));
        if (foundName != null) {
            System.out.println(foundName);
        } else {
            System.out.println("No name found");
        }
    }
}
