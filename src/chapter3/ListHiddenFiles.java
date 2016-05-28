package chapter3;

import java.io.File;
import java.util.Arrays;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: ListHiddenFiles
 * Date: 2016-05-28
 * Time: 오전 12:10
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ListHiddenFiles {
    public static void main(String[] args) {
        final File[] files = new File(".").listFiles(file -> file.isHidden());

        new File(".").listFiles(File::isHidden);

        Arrays.stream(files).forEach(System.out::println);
    }
}
