package chapter3;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: IterateString
 * Date: 2016-05-12
 * Time: 오전 3:19
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class IterateString {
    private static void printChar(int aChar) {
        System.out.println((char) (aChar));
    }

    public static void main(String[] args) {
        final String str = "w00t";
        str.chars().forEach(ch -> System.out.println(ch));
        str.chars().forEach(System.out::println);
        str.chars().forEach(IterateString::printChar);
        str.chars()
                .mapToObj(ch -> Character.valueOf((char) ch))
                .forEach(System.out::println);
        str.chars()
                .filter(ch -> Character.isDigit(ch))
                .forEach(ch -> printChar(ch));
        str.chars().filter(Character::isDigit).forEach(IterateString::printChar);
    }
}
