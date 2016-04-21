package chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: Iteration
 * Date: 2016-04-21
 * Time: 오후 11:58
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Iteration {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("SeokGon", "JuYeong", "DaYe", "SeungJun");

        for (int i = 0; i < friends.size(); i++) {
            System.out.println("Iterating through a List : " + friends.get(i));
        }

        for (String name : friends) {
            System.out.println("external iterators : " + name);
        }

        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(final String name) {
                System.out.println("special method named forEach : " + name);
            }
        });

        friends.forEach((final String name) -> System.out.println("The forEach() is a higher-order function that accepts a lambda expression : " + name));

        friends.forEach((name) -> System.out.println("single-parameter lambda expressions as special : " + name));

        friends.forEach(name -> System.out.println("inferred parameters are non-final. : " + name));

        friends.forEach(System.out::println);

    }
}
