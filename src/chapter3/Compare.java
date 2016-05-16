package chapter3;

import java.util.Arrays;
import java.util.List;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: Compare
 * Date: 2016-05-17
 * Time: 오전 1:37
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Compare {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));
    }
}
