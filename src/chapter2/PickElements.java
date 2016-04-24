package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: PickElements
 * Date: 2016-04-23
 * Time: 오전 1:15
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PickElements {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("SeokGon", "JuYeong", "DaYe", "SeungJun");
        final List<String> startsWithN = new ArrayList<String>();
        for (String name : friends) {
            if (name.startsWith("S")) {
                startsWithN.add(name);
            }
        }
        final List<String> startsWithN2 =
                friends.stream()
                        .filter(name -> name.startsWith("J"))
                        .collect(Collectors.toList());

        System.out.println(String.format("Found %d names", startsWithN.size()));
        System.out.println(String.format("Found %d names", startsWithN2.size()));
    }

}
