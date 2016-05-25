package chapter3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: ListDirs
 * Date: 2016-05-26
 * Time: 오전 2:52
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ListDirs {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
