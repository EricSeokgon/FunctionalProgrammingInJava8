package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: OlderThan20
 * Date: 2016-05-22
 * Time: 오전 12:40
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class OlderThan20 {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));

        List<Person> olderThan20 = new ArrayList<>();
        people.stream()
                .filter(person -> person.getAge() > 20)
                .forEach(person -> olderThan20.add(person));
        System.out.println("People older than 20: " + olderThan20);
    }
}
