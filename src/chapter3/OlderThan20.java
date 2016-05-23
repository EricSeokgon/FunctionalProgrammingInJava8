package chapter3;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;

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

        List<Person> olderThan21 =
                people.stream()
                        .filter(person -> person.getAge() > 21)
                        .collect(Collectors.toList());
        System.out.println("People older than 21: " + olderThan21);

        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> oldestPersonInEachAlphabet =
                people.stream()
                        .collect(groupingBy(person -> person.getName().charAt(0),
                                reducing(BinaryOperator.maxBy(byAge))));
        System.out.println("Oldest person in each alphabet:");
        System.out.println(oldestPersonInEachAlphabet);

    }
}
