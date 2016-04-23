package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            if(name.startsWith("N")){
                startsWithN.add(name);
            }
        }
    }
}
