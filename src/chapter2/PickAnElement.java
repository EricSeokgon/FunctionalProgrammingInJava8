package chapter2;

import java.util.List;

/**
 * Created by hadeslee on 2016-05-04.
 */
public class PickAnElement {
    public static void pickName(
            final List<String> names, final String stringLetter) {
        String foundName = null;
        for (String name : names) {
            if (name.startsWith((stringLetter))) {
                foundName = name;
                break;
            }
        }

    }
}
