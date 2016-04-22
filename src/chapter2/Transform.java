package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: Transform
 * Date: 2016-04-23
 * Time: 오전 1:03
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Transform {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("SeokGon", "JuYeong", "DaYe", "SeungJun");
        final List<String> uppercaseNames = new ArrayList<String>();
        final List<String> uppercaseNames2 = new ArrayList<String>();
        for (String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }
        System.out.println(uppercaseNames);

        friends.forEach(name -> uppercaseNames2.add(name.toUpperCase()));
        System.out.println(uppercaseNames2);

        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));
        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name));
    }


}


