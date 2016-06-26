package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by hadeslee on 2016-06-24.
 */
public class LazyStreams {
    private static int length(final String name) {
        System.out.println("getting length for " + name);
        return name.length();
    }
    private static String toUpper(final String name ) {
        System.out.println("converting to uppercase: " + name);
        return name.toUpperCase();
    }
    //...

    public static void main(final String[] args) {
        List<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe",
                "Mike", "Susan", "George", "Robert", "Julia", "Parker", "Benson");
        System.out.println("//" + "START:CHAIN_OUTPUT");
        {

            final String firstNameWith3Letters =
                    names.stream()
                            .filter(name -> length(name) == 3)
                            .map(name -> toUpper(name))
                            .findFirst()
                            .get();

            System.out.println(firstNameWith3Letters);
        }
        System.out.println("//" + "END:CHAIN_OUTPUT");

        System.out.println("//" + "START:SPLIT_OUTPUT");
        {
            Stream<String> namesWith3Letters =
                    names.stream()
                            .filter(name -> length(name) == 3)
                            .map(name -> toUpper(name));

            System.out.println("Stream created, filtered, mapped...");
            System.out.println("ready to call findFirst...");

            final String firstNameWith3Letters =
                    namesWith3Letters.findFirst()
                            .get();

            System.out.println(firstNameWith3Letters);
        }
        System.out.println("//" + "END:SPLIT_OUTPUT");


    }

}