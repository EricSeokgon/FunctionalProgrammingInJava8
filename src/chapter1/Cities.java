package chapter1;

import java.util.Arrays;
import java.util.List;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: Cities
 * Date: 2016-04-20
 * Time: 오전 12:23
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Cities {
    public static void main(String[] args) {
        final List<String> cities = Arrays.asList("Seoul", "Busan");
        boolean found = false;
        for (String city : cities) {
            if (city.equals("Busan")) {
                found = true;
                break;
            }
        }
        System.out.println("Found Busan? :" + found);
    }


}
