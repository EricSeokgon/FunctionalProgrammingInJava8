package chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public static void printPeople(
            final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    };

    public static void main(String[] args) {

        final List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Sara", 21),
                new Person("Jane", 21),
                new Person("Greg", 35));

        List<Person> ascendingAge =
                people.stream()
                .sorted((person1, person2)->person1.ageDifference(person2))
                .collect(Collectors.toList());
        printPeople("sorted in ascending order of age : ", ascendingAge);

        printPeople("Sorted in descending order of age: ",
                people.stream()
                        .sorted((person1, person2) -> person2.ageDifference(person1))
                        .collect(Collectors.toList()));
    }
}
