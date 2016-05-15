package chapter3;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: Person
 * Date: 2016-05-14
 * Time: 오전 12:10
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    final private String name;
    final private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int ageDifference(final Person other) {
        return age - other.age;
    }

    public String toString() {
        return String.format("%s - %d", name, age);
    }

}
