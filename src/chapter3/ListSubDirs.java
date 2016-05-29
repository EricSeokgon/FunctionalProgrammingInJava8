package chapter3;

import java.io.File;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: ListSubDirs
 * Date: 2016-05-29
 * Time: 오전 12:36
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ListSubDirs {
    public static void betterWay() {
        List<File> files =
                Stream.of(new File(".").listFiles())
                        .flatMap(file -> file.listFiles() == null ?
                                Stream.of(file) : Stream.of(file.listFiles()))
                        .collect(toList());
        System.out.println("Count: " + files.size());
    }
}
