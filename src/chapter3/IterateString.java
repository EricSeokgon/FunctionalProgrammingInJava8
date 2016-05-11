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

    public static void main(String[] args) {
        final String str = "w00t";
        str.chars().forEach(ch -> System.out.println(ch));
    }
}
